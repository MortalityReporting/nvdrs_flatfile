package edu.gatech.model.enumvalueset;

public enum OneOrZero implements BaseSerialEnum{
    ONE("1", "The value 1 (for yes)"),
    ZERO("0", "The value 0 (for no)");

    private final String code;
    private final String description;

    OneOrZero(String code, String description) {
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
