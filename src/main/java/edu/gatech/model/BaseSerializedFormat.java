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
                Class enumClass = value.getClass();
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
