package edu.gatech.model.enumvalueset;

public enum MilitaryBackground implements BaseSerialEnum{
    YES("1", "Yes"),
    NO("0", "No"),
    UNKNOWN("9", "Unknown");

    private final String code;
    private final String description;

    MilitaryBackground(String code, String description) {
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