package edu.gatech.model.enumvalueset;

public enum DeathPlace implements BaseSerialEnum{
    HOSPITAL_INPATIENT("1", "Hospital inpatient"),
    ED_OUTPATIENT("2", "ED/Outpatient"),
    DEAD_ON_ARRIVAL("3", "Dead on Arrival"),
    DECEDENT_HOME("4", "Decedent's home"),
    HOSPICE_FACILITY("5", "Hospice facility"),
    NURSING_HOME_LONGTERM_CARE_FACILITY("6", "Nursing home, long-term care facility"),
    OTHER("7", "Other (specify)"),
    UNDETERMINED("9", "Undetermined");

    private final String code;
    private final String description;

    DeathPlace(String code, String description) {
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