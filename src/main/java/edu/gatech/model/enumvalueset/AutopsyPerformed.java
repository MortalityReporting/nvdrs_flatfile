package edu.gatech.model.enumvalueset;

public enum AutopsyPerformed implements BaseSerialEnum{
    YES("Y", "Yes, autopsy performed"),
    NO("N", "No"),
    UNKNOWN("U", "Unknown");

    private final String code;
    private final String description;

    AutopsyPerformed(String code, String description) {
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
