package edu.gatech.model;
import java.security.InvalidParameterException;
import java.util.Objects;

@SuppressWarnings("rawtypes")
public class SerialField<T> implements Comparable<SerialField>{
    protected String name;
    protected int firstColumn;
    protected int lastColumn;
    protected T value;
    public final Class<T> valueType;
    protected int length;

    public SerialField(Class<T> valueType) {
        this.valueType = valueType;
    }

    public SerialField(String name, int firstColumn, int lastColumn, Class<T> valueType){
        this.valueType = valueType;
        this.name = name;
        this.firstColumn = firstColumn;
        this.lastColumn = lastColumn;
        this.length =  this.lastColumn - this.firstColumn + 1;
    }

    public SerialField(String name, int firstColumn, int lastColumn, T value, Class<T> valueType) {
        this.valueType = valueType;
        this.name = name;
        this.firstColumn = firstColumn;
        this.lastColumn = lastColumn;
        this.length =  this.lastColumn - this.firstColumn + 1;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public int getOffset() {
        return this.firstColumn;
    }

    public void setOffset(int offset) {
        this.firstColumn = offset;
        this.length =  this.lastColumn - this.firstColumn + 1;
    }

    public int getFirstColumn() {
        return this.firstColumn;
    }

    public void setFirstColumn(int firstColumn) {
        this.firstColumn = firstColumn;
        this.length =  this.lastColumn - this.firstColumn + 1;
    }

    public int getLastColumn() {
        return this.lastColumn;
    }

    public void setLastColumn(int lastColumn) {
        this.lastColumn = lastColumn;
        this.length =  this.lastColumn - this.firstColumn + 1;
    }

    public T getValue() {
        return this.value;
    }

    public String getValueAsString() {
        if(value == null){
            return " ".repeat(getLength());
        }
        String formatString = "%"+length+"s"; //Should look like '%4s' or "4 length of string". Left padding happens automatically
        return String.format(formatString, value.toString());
    }

    public void setValue(T value) {
        if(value.toString().length() > getLength()){
            throw new InvalidParameterException("The Field Name '"+name+"' can accept values of size '"+getLength()+"' but found a value of '"+value.toString()+"' with size of '"+value.toString().length()+"' instead.");
        }
        this.value = value;
    }


    public Class<T> getValueType() {
        return this.valueType;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public SerialField name(String name) {
        setName(name);
        return this;
    }

    public SerialField offset(int offset) {
        setOffset(offset);
        return this;
    }

    public SerialField firstColumn(int firstColumn) {
        setFirstColumn(firstColumn);
        return this;
    }

    public SerialField lastColumn(int lastColumn) {
        setLastColumn(lastColumn);
        return this;
    }

    public SerialField value(T value) {
        setValue(value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SerialField)) {
            return false;
        }
        SerialField serialField = (SerialField) o;
        return Objects.equals(name, serialField.name) && firstColumn == serialField.firstColumn && lastColumn == serialField.lastColumn && Objects.equals(value, serialField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstColumn, lastColumn, value);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", firstColumn='" + getFirstColumn() + "'" +
            ", lastColumn='" + getLastColumn() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }


    @Override
    public int compareTo(SerialField o) {
        return Integer.compare(this.firstColumn, o.firstColumn);
    }
}
