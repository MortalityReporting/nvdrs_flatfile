package edu.gatech.model.enumvalueset;

public enum DeathManner {
    NATURAL("N", "Natural"),
    ACCIDENT("A", "Accident"),
    SUICIDE("S", "Suicide"),
    HOMICIDE("H", "Homicide"),
    PENDING_INVESTIGATION("P", "Pending investigation"),
    COULD_NOT_BE_DETERMINED("C", "Could not be determined");

    private final String code;
    private final String description;

    DeathManner(String code, String description) {
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