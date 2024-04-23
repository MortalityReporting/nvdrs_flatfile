package edu.gatech.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Base Serialized Format to collect SerialFields and create a serial format from the fields
 */
@SuppressWarnings("rawtypes")
public abstract class BaseSerializedFormat {
    protected List<SerialField> orderedSerialFieldList;
    protected Boolean ordered = false;

    /**
     * Internal structure for organzing fields once the class has been declared and ready
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    protected List<SerialField> organizeFields() throws IllegalArgumentException, IllegalAccessException{
        for (Field f: this.getClass().getFields()){
            if(f.getType().equals(SerialField.class)){
                orderedSerialFieldList.add((SerialField)f.get(this));
            }
        }
        Collections.sort(orderedSerialFieldList);
        ordered = true;
        return orderedSerialFieldList;
    }

    public Writer writeSerializedFormat(Writer writer) throws IOException{
        for(SerialField sf:orderedSerialFieldList){
            writer.write(sf.getValue().toString());
        }
        return writer;
    }

    public ObjectNode mapToJson() {
        ObjectNode returnNode = JsonNodeFactory.instance.objectNode();
        ArrayNode schemaReport = JsonNodeFactory.instance.arrayNode();
        ArrayNode errors = JsonNodeFactory.instance.arrayNode();
        if(!ordered){
            try{
                organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
            }
        }
        for(SerialField sf:orderedSerialFieldList){
            ObjectNode fieldNode = JsonNodeFactory.instance.objectNode();
            fieldNode.put("name", sf.getName());
            fieldNode.put("firstColumn", sf.getFirstColumn());
            fieldNode.put("lastColumn", sf.getLastColumn());
            fieldNode.put("value", sf.getValue() != null ? sf.getValue().toString() : "");
            schemaReport.add(fieldNode);
        }
        returnNode.put("schemaReport", schemaReport);
        try{
            StringWriter stringWriter = new StringWriter();
            writeSerializedFormat(stringWriter);
            returnNode.put("serializedFormat", stringWriter.toString());
        }
        catch(IOException e){
            errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
        }
        returnNode.put("errors", errors);
        return returnNode;
    }
}
