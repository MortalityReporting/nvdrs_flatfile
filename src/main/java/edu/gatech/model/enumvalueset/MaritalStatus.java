package edu.gatech.model.enumvalueset;

public enum MaritalStatus implements BaseSerialEnum{
    MARRIED("M", "Married / Civil Union / Domestic Partnership"),
    MARRIED_SEPARATED("A", "Married / Civil Union / Domestic Partnership, but separated"),
    WIDOWED("W", "Widowed"),
    DIVORCED("D", "Divorced"),
    SINGLE("S", "Single, Never Married"),
    UNKNOWN("U", "Unknown");

    private final String code;
    private final String description;

    MaritalStatus(String code, String description) {
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
