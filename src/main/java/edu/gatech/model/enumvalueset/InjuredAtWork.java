package edu.gatech.model.enumvalueset;

public enum InjuredAtWork implements BaseSerialEnum{
    YES("Y", "Yes"),
    NO("N", "No"),
    UNKNOWN("U", "Unknown"),
    NOT_APPLICABLE("X", "Not applicable");

    private final String code;
    private final String description;

    InjuredAtWork(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}