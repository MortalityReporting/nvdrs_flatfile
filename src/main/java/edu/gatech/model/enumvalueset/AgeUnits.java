package edu.gatech.model.enumvalueset;

public enum AgeUnits {
    YEARS(1, "Years"),
    MONTHS(2, "Months"),
    WEEKS(3, "Weeks"),
    DAYS(4, "Days"),
    HOURS(5, "Hours"),
    MINUTES(6, "Minutes"),
    UNKNOWN(9, "Unknown");

    private final int code;
    private final String description;

    AgeUnits(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
