package edu.gatech.model.enumvalueset;

public enum PlaceTypeFourthCharacter implements BaseSerialEnum{
    HOME("0", "Home"),
    RESIDENTIAL_INSTITUTION("1", "Residential Institution"),
    SCHOOL_INSTITUTION_PUBLIC_ADMINISTRATIVE_AREA("2", "School, institution, public administrative area"),
    SPORTS_AND_ATHLETIC_AREA("3", "Sports and athletic area"),
    STREET_AND_HIGHWAY("4", "Street and highway"),
    TRADE_AND_SERVICE_AREA("5", "Trade and service area"),
    INDUSTRIAL_AND_CONSTRUCTION("6", "Industrial and construction"),
    FARM("7", "Farm"),
    OTHER("8", "Other"),
    UNSPECIFIED("9", "Unspecified");

    private final String code;
    private final String description;

    PlaceTypeFourthCharacter(String code, String description) {
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
