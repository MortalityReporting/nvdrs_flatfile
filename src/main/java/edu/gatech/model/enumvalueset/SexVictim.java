package edu.gatech.model.enumvalueset;

public enum SexVictim {
    MALE("M", "Male"),
    FEMALE("F", "Female"),
    UNKNOWN("U", "Unknown");

    private final String code;
    private final String description;

    SexVictim(String code, String description) {
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