package edu.gatech.model.enumvalueset;

public enum Ethnicity implements BaseSerialEnum{
    HISPANIC("1", "Hispanic"),
    NOT_HISPANIC("0", "Not Hispanic"),
    UNKNOWN("9", "Unknown");

    private final String code;
    private final String description;

    Ethnicity(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return code;
    }
}