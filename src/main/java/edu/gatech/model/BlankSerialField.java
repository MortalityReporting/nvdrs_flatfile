package edu.gatech.model;

public class BlankSerialField extends SerialField<String>{

    public BlankSerialField(String name, int firstColumn, int lastColumn){
        super(name, firstColumn, lastColumn, String.class);
        this.value = " ".repeat(this.length);
    }

}
