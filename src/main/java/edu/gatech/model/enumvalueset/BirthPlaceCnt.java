package edu.gatech.model.enumvalueset;

public enum BirthPlaceCnt implements BaseSerialEnum{
    OTHER_COUNTRY(59, "Other country (Specify in birthplace text)"),
    UNKNOWN(99, "Unknown"),
    PUERTO_RICO("RQ", "Puerto Rico"),
    US_VIRGIN_ISLANDS("VQ", "United States Virgin Islands"),
    GUAM("GQ", "Guam"),
    CANADA("CA", "Canada"),
    CUBA("CU", "Cuba"),
    MEXICO("MX", "Mexico"),
    AMERICAN_SAMOA("AQ", "American Samoa"),
    NORTHERN_MARIANAS("CQ", "Northern Marianas");

    private final String code;
    private final String description;

    BirthPlaceCnt(int code, String description) {
        this.code = String.valueOf(code);
        this.description = description;
    }

    BirthPlaceCnt(String code, String description) {
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
