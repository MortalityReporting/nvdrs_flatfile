package edu.gatech.model.enumvalueset;

public enum Pregnant {
    NOT_PREGNANT_WITHIN_LAST_YEAR("1", "Not pregnant within last year"),
    PREGNANT_AT_TIME_OF_DEATH("2", "Pregnant at time of death"),
    NOT_PREGNANT_BUT_PREGNANT_WITHIN_42_DAYS("3", "Not pregnant, but pregnant within 42 days of death"),
    NOT_PREGNANT_BUT_PREGNANT_43_DAYS_TO_1_YEAR_BEFORE_DEATH("4", "Not pregnant, but pregnant 43 days to 1 year before death"),
    UNKNOWN_IF_PREGNANT_WITHIN_LAST_YEAR("7", "Unknown if pregnant within last year"),
    NOT_APPLICABLE("8", "Not applicable"),
    UNKNOWN("9", "Unknown if pregnant within last year");

    private final String code;
    private final String description;

    Pregnant(String code, String description) {
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