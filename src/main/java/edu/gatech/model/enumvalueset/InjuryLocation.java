package edu.gatech.model.enumvalueset;

public enum InjuryLocation implements BaseSerialEnum{
    HOUSE_APARTMENT_ROOMING_HOUSE("A", "House, apartment, rooming house, including driveway, porch, yard, garage"),
    FARM("B", "Farm"),
    SUPERVISED_RESIDENTIAL_FACILITY("C", "Supervised residential facility (e.g., shelter, halfway house, group home)"),
    HOSPITAL_OR_MEDICAL_FACILITY("E", "Hospital or medical facility"),
    OTHER("F", "Other"),
    INDUSTRIAL_OR_CONSTRUCTION_AREAS("G", "Industrial or construction areas (e.g., factory, warehouse)"),
    OTHER_COMMERCIAL_ESTABLISHMENT("I", "Other commercial establishment (e.g., grocery store, restaurants, retail outlet, Laundromat), including parking lot"),
    STREET_ROAD_SIDEWALK_ALLEY("K", "Street/road, sidewalk, alley"),
    PARK_PLAYGROUND_PUBLIC_USE_AREA("L", "Park, playground, public use area"),
    SPORTS_OR_ATHLETIC_AREA("N", "Sports or athletic area (e.g., stadium, baseball field, gymnasium, recreation center)"),
    UNKNOWN("Q", "Unknown");

    private final String code;
    private final String description;

    InjuryLocation(String code, String description) {
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
