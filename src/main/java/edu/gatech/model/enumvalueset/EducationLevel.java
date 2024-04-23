package edu.gatech.model.enumvalueset;

public enum EducationLevel {
    EIGHTH_GRADE_OR_LESS("1", "8th Grade or Less"),
    NINTH_TO_TWELFTH_GRADE_NO_DIPLOMA("2", "9th to 12th Grade; no diploma"),
    HIGH_SCHOOL_GRADUATE_OR_GED_COMPLETED("3", "High school graduate or GED completed"),
    SOME_COLLEGE_CREDIT_BUT_NO_DEGREE("4", "Some college credit, but no degree"),
    ASSOCIATES_DEGREE("5", "Associate's degree (e.g., AA, AS)"),
    BACHELORS_DEGREE("6", "Bachelor's degree (e.g., BA, AB, BS)"),
    MASTERS_DEGREE("7", "Master's degree (e.g., MA, MS, Mend, Med, MSW, MBA)"),
    DOCTORATE_OR_PROFESSIONAL_DEGREE("8", "Doctorate (e.g., PhD, EdD) or Professional degree (e.g., MD, DDS, DVM, LLB, JD)"),
    UNKNOWN("9", "Unknown");

    private final String code;
    private final String description;

    EducationLevel(String code, String description) {
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
