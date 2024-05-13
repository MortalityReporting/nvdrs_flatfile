package edu.gatech.model;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.gatech.model.enumvalueset.BaseSerialEnum;

/**
 * Base Serialized Format to collect SerialFields and create a serial format from the fields
 * Adds the write and read action to the model formats. Using the GoF Fascade pattern.
 */
@SuppressWarnings("rawtypes")
public abstract class BaseSerializedFormat {
    public List<SerialField> orderedSerialFieldList;
    public Boolean ordered = false;

    /**
     * Internal structure for organzing fields once the class has been declared and ready
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    @SuppressWarnings("unchecked")
    public List<SerialField> organizeFields() throws IllegalArgumentException, IllegalAccessException{
        orderedSerialFieldList = new ArrayList<SerialField>();
        for (Field f: this.getClass().getDeclaredFields()){
            if(f.getType().equals(SerialField.class) || f.getType().equals(BlankSerialField.class)){
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

    public BaseSerializedFormat readSerializedFormat(Reader reader) throws IOException, RuntimeException{
        if(!ordered){
            try{
                organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                throw new RuntimeException("Something is wrong with the data model when trying to organize fields" + e.getMessage());
            }
        }
        for(SerialField serialField:orderedSerialFieldList){
            char[] characterBuffer = new char[serialField.getLength()];
            int readReturnChar = reader.read(characterBuffer);
            String inputString = "";
            if(readReturnChar == -1){
                inputString = " ".repeat(serialField.getLength());
            }
            else{
                inputString = new String(characterBuffer);
            }
            //Work with the enumerated values
            if(BaseSerialEnum.class.isAssignableFrom(serialField.getValueType())){ //If the value type is assignable to BaseSerialEnum it's one of the model enums.
                @SuppressWarnings("unchecked") //This should be safe with the check before
                SerialField<? super BaseSerialEnum> typedSerialField = (SerialField<? super BaseSerialEnum>) serialField;
                Object[] enumValues = serialField.getValueType().getEnumConstants(); //get the constants from the assumed enumerated type.
                for(Object enumValue:enumValues){
                    BaseSerialEnum typedEnum = (BaseSerialEnum)enumValue; //This seems unsafe...
                    if(typedEnum.getCode().equalsIgnoreCase(inputString)){
                        typedSerialField.setValue(typedEnum);
                    }
                }
            }
            else if (CharLimitedInteger.class.equals(serialField.getValueType())){
                @SuppressWarnings("unchecked")
                SerialField<CharLimitedInteger> typedSerialField = (SerialField<CharLimitedInteger>) serialField;
                try{
                    Integer intValue = Integer.valueOf(inputString);
                    typedSerialField.setValue(new CharLimitedInteger(intValue, typedSerialField.getLength()));
                }
                catch(NumberFormatException e) {
                    continue;
                }
            }
            else if (String.class.equals(serialField.getValueType())){
                @SuppressWarnings("unchecked")
                SerialField<String> typedSerialField = (SerialField<String>) serialField;
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
            String serializedString = sf.getValue() == null ? "" : sf.getValue().toString();
            //Check for length and padding
            if(serializedString.length() < sf.getLength()){
                String formatString = "%"+sf.getLength()+"s"; //Should look like '%4s' or "4 length of string". Left padding happens automatically
                serializedString = String.format(formatString, serializedString);
            }
            writer.write(serializedString);
        }
        writer.flush();
        return writer;
    }
}
