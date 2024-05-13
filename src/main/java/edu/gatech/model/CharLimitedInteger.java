package edu.gatech.model;

import java.security.InvalidParameterException;
import java.util.Objects;

/**
 * Simple character limited Integer implementation
 * Note: Does not support negative numbers
 */
public class CharLimitedInteger {
    protected Integer value;
    protected Integer size;

    public CharLimitedInteger(Integer value, Integer size){
        this.value = value;
        this.size = size;
        //Check if value is greater than bound
        if(value.toString().length() > size){
            throw new InvalidParameterException("The value '"+value+"' was found to be larger than the character size of '"+size+"' and cannot be used.");
        }
    }

    public Integer getValue() {
        return this.value;
    }

    public Integer getSize() {
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CharLimitedInteger)) {
            return false;
        }
        CharLimitedInteger charLimitedInteger = (CharLimitedInteger) o;
        return Objects.equals(value, charLimitedInteger.value) && Objects.equals(size, charLimitedInteger.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, size);
    }

    @Override
    public String toString() {
        if (value == null){
            return " ".repeat(this.getSize());
        }
        return value.toString();
    }
    
}