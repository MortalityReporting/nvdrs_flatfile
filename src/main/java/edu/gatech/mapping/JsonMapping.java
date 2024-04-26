package edu.gatech.mapping;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import edu.gatech.model.BaseSerializedFormat;
import edu.gatech.model.SerialField;

public class JsonMapping {

    public static ObjectNode mapToJson(BaseSerializedFormat baseModel) {
        ObjectNode returnNode = JsonNodeFactory.instance.objectNode();
        ArrayNode schemaReport = JsonNodeFactory.instance.arrayNode();
        ArrayNode errors = JsonNodeFactory.instance.arrayNode();
        if(!baseModel.ordered){
            try{
                baseModel.organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
            }
        }
        for(SerialField sf:baseModel.orderedSerialFieldList){
            ObjectNode fieldNode = JsonNodeFactory.instance.objectNode();
            fieldNode.put("name", sf.getName());
            fieldNode.put("firstColumn", sf.getFirstColumn());
            fieldNode.put("lastColumn", sf.getLastColumn());
            fieldNode.put("value", sf.getValue() != null ? sf.getValue().toString() : "");
            schemaReport.add(fieldNode);
        }
        returnNode.set("schemaReport", schemaReport);
        try{
            StringWriter stringWriter = new StringWriter();
            baseModel.writeSerializedFormat(stringWriter);
            returnNode.put("serializedFormat", stringWriter.toString());
        }
        catch(IOException e){
            errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
        }
        returnNode.set("errors", errors);
        return returnNode;
    }
}
