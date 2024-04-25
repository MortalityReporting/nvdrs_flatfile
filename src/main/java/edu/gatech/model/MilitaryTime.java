package edu.gatech.model;

import java.security.InvalidParameterException;

public class MilitaryTime{
    protected String value;
    protected final Integer size = 4;
    public MilitaryTime(String value){
        this.value = value;
        checkValue();

    }
    public MilitaryTime(Integer value){
        this.value = Integer.toString(value);
        checkValue();
    }

    public void checkValue(){
        //Military time check
        //Special check for 9999
        if(value.equalsIgnoreCase("9999")){
            return;
        }
        if(value.length() > 4){
            throw new InvalidParameterException("A MilitaryTime of '"+value+"' was found but a length of 4 is required.");
        }
        //If less than 4 spaces are found we can do padding here.
        //TODO: Check for alphanumerics and stuff for the future.
        if(value.length() < 4){
            Integer integerValue = Integer.parseInt(value);
            value = String.format("%04d", integerValue); //Use 4 padding format
        }
        String hour = value.substring(0, 2);
        String minute = value.substring(2, 4);
        Integer hourInteger = Integer.parseInt(hour);
        Integer minuteInteger = Integer.parseInt(minute);
        if(hourInteger < 0 || hourInteger > 23){
            throw new InvalidParameterException("An hour value of '"+hour+"' was found and a range of [0-23] is expected.");
        }

        if(minuteInteger < 0 || minuteInteger > 59){
            throw new InvalidParameterException("An minute value of '"+minute+"' was found and a range of [0-59] is expected.");
        }
    }
}
