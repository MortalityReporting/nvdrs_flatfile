package edu.gatech.model.enumvalueset;

public enum ActivityTypeFifthCharacter implements BaseSerialEnum{
    SPORTS_ACTIVITY("0", "While engaged in sports activity"),
    LEISURE_ACTIVITY("1", "While engaged in leisure activity"),
    WORK_FOR_INCOME("2", "While working for income"),
    OTHER_TYPES_OF_WORK("3", "While engaged in other types of work (e.g., chores, school)"),
    VITAL_ACTIVITIES("4", "While resting, sleeping, eating, or engaging in other vital activities"),
    OTHER_SPECIFIED_ACTIVITIES("8", "While engaged in other specified activities"),
    UNSPECIFIED_ACTIVITIES("9", "While engaged in unspecified activities");

    private final String code;
    private final String description;

    ActivityTypeFifthCharacter(String code, String description) {
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