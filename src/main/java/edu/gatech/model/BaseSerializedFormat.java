package edu.gatech.model;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import edu.gatech.model.enumvalueset.BaseSerialEnum;

/**
 * Base Serialized Format to collect SerialFields and create a serial format from the fields
 * Adds the write and read action to the model formats. Using the GoF Fascade pattern.
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
    @SuppressWarnings("unchecked")
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

    /**
     * 
     * @param reader
     * @return
     * @throws IOException if there's an issue with the reader.
     * @throws RuntimeException if there's a data model issue; major development issue here.
     */

    protected BaseSerializedFormat readSerializedFormat(Reader reader) throws IOException, RuntimeException{
        if(!ordered){
            try{
                organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                throw new RuntimeException("Something is wrong with the data model when trying to organize fields" + e.getMessage());
            }
        }
        for(SerialField sf:orderedSerialFieldList){
            char[] characterBuffer = new char[sf.getLength()];
            int readReturnChar = reader.read(characterBuffer);
            if(readReturnChar == -1){
                String range = String.format("[%d-%d]", sf.getFirstColumn(),sf.getLastColumn());
                throw new IOException("Tried to read up to field " + sf.getName() + "in range "+range+" but found the end of file (EOF) instead.");
            }
            String inputString = new String(characterBuffer);
            //Work with the enumerated values
            Object value = sf.getValue();
            if(value instanceof Enum<?> && value instanceof BaseSerialEnum){
                @SuppressWarnings("unchecked") //This should be safe with the check before
                SerialField<? super BaseSerialEnum> typedSerialField = (SerialField<? super BaseSerialEnum>) sf;
                Enum<?> thisEnum = (Enum<?>) value;
                Class enumClass = value.getClass();
                enumClass.getEnumConstants()
                Object[] values = enumClass.getEnumConstants(); //get the constants
                for(Object enumValue:values){
                    BaseSerialEnum typedEnum = (BaseSerialEnum)enumValue; //This seems unsafe...
                    if(typedEnum.getCode().equalsIgnoreCase(inputString)){
                        typedSerialField.setValue(typedEnum);
                    }
                }
            }
            else if (value instanceof CharLimitedInteger){
                @SuppressWarnings("unchecked")
                SerialField<CharLimitedInteger> typedSerialField = (SerialField<CharLimitedInteger>) sf;
                Integer intValue = Integer.valueOf(inputString);
                typedSerialField.setValue(new CharLimitedInteger(intValue, typedSerialField.getLength()));
            }
            else if (value instanceof String){
                @SuppressWarnings("unchecked")
                SerialField<String> typedSerialField = (SerialField<String>) sf;
                typedSerialField.setValue(inputString);
            }
        }
        return this;
    }

    /**
     * Writes the serialized "flat file" format from the list of serialized field.
     * @param writer
     * @return
     * @throws IOException if there's an issue with the writer.
     * @throws RuntimeException if there's a data model issue; major development issue here.
     */
    public Writer writeSerializedFormat(Writer writer) throws IOException, RuntimeException{
        if(!ordered){
            try{
                organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                throw new RuntimeException("Something is wrong with the data model when trying to organize fields" + e.getMessage());
            }
        }
        for(SerialField sf:orderedSerialFieldList){
            String serializedString = sf.getValue().toString();
            //Check for length and padding
            if(serializedString.length() < sf.getLength()){
                String formatString = "%"+sf.getLength()+"s"; //Should look like '%4s' or "4 length of string". Left padding happens automatically
                serializedString = String.format(formatString, serializedString);
            }
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
