package edu.gatech.model.enumvalueset;

public enum UnspecifiedRace implements BaseSerialEnum{
    YES("1", "Yes"),
    NO("0", "No");

    private final String code;
    private final String description;

    UnspecifiedRace(String code, String description) {
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