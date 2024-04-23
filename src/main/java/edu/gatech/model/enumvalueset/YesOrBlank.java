package edu.gatech.model.enumvalueset;

public enum YesOrBlank {
    YES("1", "Yes"),
    BLANK("", "Blank");

    private final String code;
    private final String description;

    YesOrBlank(String code, String description) {
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
