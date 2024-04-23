package edu.gatech.model;
import java.util.Objects;

import edu.gatech.model.enumvalueset.ActivityTypeFifthCharacter;
import edu.gatech.model.enumvalueset.AutopsyPerformed;
import edu.gatech.model.enumvalueset.BirthPlaceCnt;
import edu.gatech.model.enumvalueset.DeathMannerDC;
import edu.gatech.model.enumvalueset.DeathPlace;
import edu.gatech.model.enumvalueset.EducationLevel;
import edu.gatech.model.enumvalueset.Ethnicity;
import edu.gatech.model.enumvalueset.FIPSCodes;
import edu.gatech.model.enumvalueset.FIPSCountryCodes;
import edu.gatech.model.enumvalueset.InjuredAtWork;
import edu.gatech.model.enumvalueset.InjuryLocation;
import edu.gatech.model.enumvalueset.MaritalStatus;
import edu.gatech.model.enumvalueset.PlaceTypeFourthCharacter;
import edu.gatech.model.enumvalueset.Pregnant;
import edu.gatech.model.enumvalueset.UnspecifiedRace;
import edu.gatech.model.enumvalueset.YesOrBlank;

public class DCFormat extends BaseSerializedFormat {
    protected SerialField<String> forceNewRecord = new SerialField<String>("Force New Record", 1, 1);
    protected SerialField<String> overwriteConflicts = new SerialField<String>("Overwrite Conflicts", 2, 2);
    protected SerialField<CharLimitedInteger> incidentYear = new SerialField<CharLimitedInteger>("Incident Year", 3, 6);
    protected SerialField<String> incidentNumber = new SerialField<String>("Incident Number", 7, 10);
    protected SerialField<CharLimitedInteger> nvdrsVictimNumber = new SerialField<CharLimitedInteger>("NVDRS Victim Number", 17, 20);
    protected SerialField<String> last4CharactersOfDC = new SerialField<String>("Last 4 characters of DC", 21, 24);
    protected SerialField<String> last4CharactersOfCME = new SerialField<String>("Last 4 characters of CME", 25, 28);
    protected SerialField<String> firstInitialOfLastName = new SerialField<String>("First initial of last name", 29, 29);
    protected SerialField<CharLimitedInteger> dayOfBirth = new SerialField<CharLimitedInteger>("Day of birth", 30, 31);
    protected SerialField<CharLimitedInteger> dateOfDeathYear = new SerialField<CharLimitedInteger>("Date of Death - Year", 32, 35);
    protected SerialField<FIPSCodes> stateOrTerritoryOfDeath = new SerialField<FIPSCodes>("State or territory of death", 36, 37);
    protected SerialField<CharLimitedInteger> countyOfDeath = new SerialField<CharLimitedInteger>("County of death", 38, 40);
    protected SerialField<String> sex = new SerialField<String>("Sex", 41, 41);
    protected SerialField<CharLimitedInteger> ageUnit = new SerialField<CharLimitedInteger>("Age Unit", 42, 42);
    protected SerialField<CharLimitedInteger> age = new SerialField<CharLimitedInteger>("Age", 43, 45);
    protected SerialField<BirthPlaceCnt> birthCountry = new SerialField<BirthPlaceCnt>("Birth country", 46, 47);
    protected SerialField<CharLimitedInteger> birthStateTerritoryOrCountry = new SerialField<CharLimitedInteger>("Birth state, territory or country", 48, 49);
    protected SerialField<CharLimitedInteger> cityOfResidence = new SerialField<CharLimitedInteger>("City of residence", 50, 54);
    protected SerialField<CharLimitedInteger> countyOfResidence = new SerialField<CharLimitedInteger>("County of residence", 55, 57);
    protected SerialField<CharLimitedInteger> stateOrTerritoryOfResidence = new SerialField<CharLimitedInteger>("State or territory of residence", 58, 59);
    protected SerialField<FIPSCountryCodes> countryOfResidence = new SerialField<FIPSCountryCodes>("Country of residence", 60, 61);
    protected SerialField<MaritalStatus> maritalStatus = new SerialField<MaritalStatus>("Marital status", 62, 62);
    protected SerialField<DeathPlace> placeOfDeath = new SerialField<DeathPlace>("Place of Death", 63, 63);
    protected SerialField<CharLimitedInteger> dateOfDeathMonth = new SerialField<CharLimitedInteger>("Date of Death - Month", 64, 65);
    protected SerialField<CharLimitedInteger> dateOfDeathDay = new SerialField<CharLimitedInteger>("Date of Death - Day", 66, 67);
    protected SerialField<EducationLevel> educationByDegree = new SerialField<EducationLevel>("Education by degree", 68, 68);
    protected SerialField<Ethnicity> hispanicLatinoSpanish1 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 69, 69);
    protected SerialField<Ethnicity> hispanicLatinoSpanish2 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 70, 70);
    protected SerialField<Ethnicity> hispanicLatinoSpanish3 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 71, 71);
    protected SerialField<Ethnicity> hispanicLatinoSpanish4 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 72, 72);
    protected SerialField<YesOrBlank> white = new SerialField<YesOrBlank>("White", 73, 73);
    protected SerialField<YesOrBlank> blackOrAfricanAmerican = new SerialField<YesOrBlank>("Black or African American", 74, 74);
    protected SerialField<YesOrBlank> americanIndianOrAlaskaNative = new SerialField<YesOrBlank>("American Indian or Alaska Native", 75, 75);
    protected SerialField<YesOrBlank> asian = new SerialField<YesOrBlank>("Asian", 76, 76);
    protected SerialField<YesOrBlank> asianIndian = new SerialField<YesOrBlank>("Asian Indian", 77, 77);
    protected SerialField<YesOrBlank> chinese = new SerialField<YesOrBlank>("Chinese", 78, 78);
    protected SerialField<YesOrBlank> filipino = new SerialField<YesOrBlank>("Filipino", 79, 79);
    protected SerialField<YesOrBlank> japanese = new SerialField<YesOrBlank>("Japanese", 80, 80);
    protected SerialField<YesOrBlank> korean = new SerialField<YesOrBlank>("Korean", 81, 81);
    protected SerialField<YesOrBlank> vietnamese = new SerialField<YesOrBlank>("Vietnamese", 82, 82);
    protected SerialField<YesOrBlank> nativeHawaiianOrOtherPacificIslander = new SerialField<YesOrBlank>("Native Hawaiian or other Pacific Islander", 83, 83);
    protected SerialField<YesOrBlank> nativeHawaiian = new SerialField<YesOrBlank>("Native Hawaiian", 84, 84);
    protected SerialField<YesOrBlank> guamanianOrChamorro = new SerialField<YesOrBlank>("Guamanian or Chamorro", 85, 85);
    protected SerialField<YesOrBlank> samoan = new SerialField<YesOrBlank>("Samoan", 86, 86);
    protected SerialField<YesOrBlank> otherRace = new SerialField<YesOrBlank>("Other race", 87, 87);
    protected SerialField<UnspecifiedRace> unspecifiedRace = new SerialField<UnspecifiedRace>("Unspecified race", 88, 88);
    protected SerialField<String> usualOccupationText = new SerialField<String>("Usual occupation text", 89, 128);
    protected SerialField<CharLimitedInteger> usualOccupationCode = new SerialField<CharLimitedInteger>("Usual occupation code", 129, 132);
    protected SerialField<String> usualIndustryText = new SerialField<String>("Usual industry text", 133, 172);
    protected SerialField<CharLimitedInteger> kindOfBusinessIndustryCode = new SerialField<CharLimitedInteger>("Kind of business/industry code", 173, 176);
    protected SerialField<String> immediateCauseOfDeath = new SerialField<String>("Immediate cause of death", 177, 296);
    protected SerialField<String> causeLeadingToImmediateCauseOfDeath = new SerialField<String>("Cause leading to immediate cause of death", 297, 416);
    protected SerialField<String> nextAntecedentCauseOfDeath = new SerialField<String>("Next antecedent cause of death", 417, 536);
    protected SerialField<String> underlyingCauseOfDeath = new SerialField<String>("Underlying cause of death", 537, 656);
    protected SerialField<Pregnant> victimWasPregnant = new SerialField<Pregnant>("Victim was pregnant", 657, 657);
    protected SerialField<DeathMannerDC> mannerOfDeathOnDC = new SerialField<DeathMannerDC>("Manner of death on DC", 658, 658);
    protected SerialField<CharLimitedInteger> dateOfInjuryMonth = new SerialField<CharLimitedInteger>("Date of injury - Month", 659, 660);
    protected SerialField<CharLimitedInteger> dateOfInjuryDay = new SerialField<CharLimitedInteger>("Date of injury - Day", 661, 662);
    protected SerialField<CharLimitedInteger> dateOfInjuryYear = new SerialField<CharLimitedInteger>("Date of injury - Year", 663, 666);
    protected SerialField<CharLimitedInteger> timeOfInjury = new SerialField<CharLimitedInteger>("Time of injury", 667, 670);
    protected SerialField<String> notesColumn = new SerialField<String>("(See Notes Column--used for interpretation of Time of Injury)", 671, 671);
    protected SerialField<InjuredAtWork> injuredAtWork = new SerialField<InjuredAtWork>("Injured at work", 672, 672);
    protected SerialField<AutopsyPerformed> autopsyPerformed = new SerialField<AutopsyPerformed>("Autopsy performed", 673, 673);
    protected SerialField<String> underlyingCauseOfDeathICD10Code = new SerialField<String>("Underlying cause of death ICD10 code", 674, 681);
    protected SerialField<ActivityTypeFifthCharacter> icd10TypeOfActivityWhenInjured = new SerialField<ActivityTypeFifthCharacter>("ICD-10 Type of Activity when Injured (\"5th Character\")", 682, 682);
    protected SerialField<InjuryLocation> typeOfLocationWhereInjured = new SerialField<InjuryLocation>("Type of location where injured", 683, 684);
    protected SerialField<PlaceTypeFourthCharacter> icd10TypeOfPlaceWhereInjured = new SerialField<PlaceTypeFourthCharacter>("ICD-10 Type of Place where Injured (\"4th Character\")", 685, 685);
    protected SerialField<String> multipleConditionsOnDC1 = new SerialField<String>("Multiple conditions on DC (1)", 686, 693);
    protected SerialField<String> multipleConditionsOnDC2 = new SerialField<String>("Multiple conditions on DC (2)", 694, 701);
    protected SerialField<String> multipleConditionsOnDC3 = new SerialField<String>("Multiple conditions on DC (3)", 702, 709);
    protected SerialField<String> multipleConditionsOnDC4 = new SerialField<String>("Multiple conditions on DC (4)", 710, 717);
    protected SerialField<String> multipleConditionsOnDC5 = new SerialField<String>("Multiple conditions on DC (5)", 718, 725);
    protected SerialField<String> multipleConditionsOnDC6 = new SerialField<String>("Multiple conditions on DC (6)", 726, 733);
    protected SerialField<String> multipleConditionsOnDC7 = new SerialField<String>("Multiple conditions on DC (7)", 734, 741);
    protected SerialField<String> multipleConditionsOnDC8 = new SerialField<String>("Multiple conditions on DC (8)", 742, 749);
    protected SerialField<String> multipleConditionsOnDC9 = new SerialField<String>("Multiple conditions on DC (9)", 750, 757);
    protected SerialField<String> multipleConditionsOnDC10 = new SerialField<String>("Multiple conditions on DC (10)", 758, 765);
    protected SerialField<CharLimitedInteger> zipCodeOfResidence = new SerialField<CharLimitedInteger>("Zip code of residence", 766, 770);
    protected SerialField<CharLimitedInteger> educationByNumberOfYears = new SerialField<CharLimitedInteger>("Education by number of years", 771, 772);
    protected SerialField<CharLimitedInteger> datePronouncedDeadMonth = new SerialField<CharLimitedInteger>("Date pronounced dead - Month", 773, 774);
    protected SerialField<CharLimitedInteger> datePronouncedDeadDay = new SerialField<CharLimitedInteger>("Date pronounced dead - Day", 775, 776);
    protected SerialField<CharLimitedInteger> datePronouncedDeadYear = new SerialField<CharLimitedInteger>("Date pronounced dead - Year", 777, 780);
    protected SerialField<CharLimitedInteger> stateOrTerritoryWhereInjuryOccurred = new SerialField<CharLimitedInteger>("State or territory where injury occurred", 781, 782);
    protected SerialField<CharLimitedInteger> countyWhereInjuryOccurred = new SerialField<CharLimitedInteger>("County where injury occurred", 783, 785);
    protected SerialField<String> countryOfResidence2 = new SerialField<String>("Country of residence", 786, 830);
    protected SerialField<String> usCensusTractOfResidence = new SerialField<String>("US Census tract of residence", 831, 837);
    protected SerialField<String> usCensusBlockGroupOfResidence = new SerialField<String>("US Census block group of residence", 838, 838);
    protected SerialField<String> birthCountryIfOther = new SerialField<String>("Birth country if other", 839, 868);
    protected SerialField<CharLimitedInteger> currentOrFormerMilitaryPersonnel = new SerialField<CharLimitedInteger>("Current or former military personnel", 869, 869);
    protected SerialField<String> placeOfDeathIfOther = new SerialField<String>("Place of death if other", 870, 899);
    protected SerialField<CharLimitedInteger> cityWhereInjuryOccurred = new SerialField<CharLimitedInteger>("City where injury occurred", 1000, 1004);
    protected SerialField<CharLimitedInteger> usCensusBlockGroupWhereInjuryOccurred = new SerialField<CharLimitedInteger>("US Census block group where injury occurred", 1005, 1005);
    protected SerialField<String> usCensusTractWhereInjuryOccurred = new SerialField<String>("US Census tract where injury occurred", 1006, 1012);
    protected SerialField<CharLimitedInteger> survivalTimeNumberOfUnits = new SerialField<CharLimitedInteger>("Survival time no. of units:", 1013, 1015);
    protected SerialField<CharLimitedInteger> unitOfTimeUsedInSurvivalTime = new SerialField<CharLimitedInteger>("Unit of time used in survival time", 1016, 1016);
    protected SerialField<CharLimitedInteger> zipCodeWhereInjuryOccurred = new SerialField<CharLimitedInteger>("ZIP Code where injury occurred", 1017, 1021);
    protected SerialField<CharLimitedInteger> mannerOfDeathPerAbstractor = new SerialField<CharLimitedInteger>("Manner of death per abstractor", 1022, 1023);
    protected SerialField<String> otherSignificantConditionsContributingToDeath = new SerialField<String>("Other significant conditions contributing to death", 1024,   1263);
    protected SerialField<String> howInjuryOccurred = new SerialField<String>("How injury occurred", 1264, 1503);
    protected SerialField<String> otherAsian = new SerialField<String>("Other Asian", 1504, 1504);
    protected SerialField<String> otherAsianSpecify = new SerialField<String>("Other Asian Specify", 1505, 1624);
    protected SerialField<String> otherPacificIslander = new SerialField<String>("Other Pacific Islander", 1625, 1625);
    protected SerialField<String> otherPacificIslanderSpecify = new SerialField<String>("Other Pacific Islander Specify", 1626, 1745);
    protected SerialField<String> nameOfTheEnrolledOrPrincipalTribe = new SerialField<String>("Name of the enrolled or Principal tribe", 1746, 1865);
    protected SerialField<String> otherRaceSpecify = new SerialField<String>("Other Race Specify", 1866, 1985);


    public DCFormat() {

    }

    public DCFormat(String forceNewRecord, String overwriteConflicts, CharLimitedInteger incidentYear, String incidentNumber, CharLimitedInteger nvdrsVictimNumber, String last4CharactersOfDC, String last4CharactersOfCME, String firstInitialOfLastName, CharLimitedInteger dayOfBirth, CharLimitedInteger dateOfDeathYear, CharLimitedInteger stateOrTerritoryOfDeath, CharLimitedInteger countyOfDeath, String sex, CharLimitedInteger ageUnit, CharLimitedInteger age, String birthCountry, CharLimitedInteger birthStateTerritoryOrCountry, CharLimitedInteger cityOfResidence, CharLimitedInteger countyOfResidence, CharLimitedInteger stateOrTerritoryOfResidence, String countryOfResidence, CharLimitedInteger maritalStatus, CharLimitedInteger placeOfDeath, CharLimitedInteger dateOfDeathMonth, CharLimitedInteger dateOfDeathDay, CharLimitedInteger educationByDegree, String hispanicLatinoSpanish1, String hispanicLatinoSpanish2, String hispanicLatinoSpanish3, String hispanicLatinoSpanish4, String white, String blackOrAfricanAmerican, String americanIndianOrAlaskaNative, String asian, String asianIndian, String chinese, String filipino, String japanese, String korean, String vietnamese, String nativeHawaiianOrOtherPacificIslander, String nativeHawaiian, String guamanianOrChamorro, String samoan, String otherRace, String unspecifiedRace, String usualOccupationText, CharLimitedInteger usualOccupationCode, String usualIndustryText, CharLimitedInteger kindOfBusinessIndustryCode, String immediateCauseOfDeath, String causeLeadingToImmediateCauseOfDeath, String nextAntecedentCauseOfDeath, String underlyingCauseOfDeath, CharLimitedInteger victimWasPregnant, String mannerOfDeathOnDC, CharLimitedInteger dateOfInjuryMonth, CharLimitedInteger dateOfInjuryDay, CharLimitedInteger dateOfInjuryYear, CharLimitedInteger timeOfInjury, String notesColumn, String injuredAtWork, String autopsyPerformed, String underlyingCauseOfDeathICD10Code, CharLimitedInteger icd10TypeOfActivityWhenInjured, String typeOfLocationWhereInjured, CharLimitedInteger icd10TypeOfPlaceWhereInjured, String multipleConditionsOnDC1, String multipleConditionsOnDC2, String multipleConditionsOnDC3, String multipleConditionsOnDC4, String multipleConditionsOnDC5, String multipleConditionsOnDC6, String multipleConditionsOnDC7, String multipleConditionsOnDC8, String multipleConditionsOnDC9, String multipleConditionsOnDC10, CharLimitedInteger zipCodeOfResidence, CharLimitedInteger educationByNumberOfYears, CharLimitedInteger datePronouncedDeadMonth, CharLimitedInteger datePronouncedDeadDay, CharLimitedInteger datePronouncedDeadYear, CharLimitedInteger stateOrTerritoryWhereInjuryOccurred, CharLimitedInteger countyWhereInjuryOccurred, String countryOfResidence2, String usCensusTractOfResidence, String usCensusBlockGroupOfResidence, String birthCountryIfOther, CharLimitedInteger currentOrFormerMilitaryPersonnel, String placeOfDeathIfOther, CharLimitedInteger cityWhereInjuryOccurred, CharLimitedInteger usCensusBlockGroupWhereInjuryOccurred, String usCensusTractWhereInjuryOccurred, CharLimitedInteger survivalTimeNumberOfUnits, CharLimitedInteger unitOfTimeUsedInSurvivalTime, CharLimitedInteger zipCodeWhereInjuryOccurred, CharLimitedInteger mannerOfDeathPerAbstractor, String otherSignificantConditionsContributingToDeath, String howInjuryOccurred, String otherAsian, String otherAsianSpecify, String otherPacificIslander, String otherPacificIslanderSpecify, String nameOfTheEnrolledOrPrincipalTribe, String otherRaceSpecify) {
        this.forceNewRecord.setValue(forceNewRecord);
        this.overwriteConflicts.setValue(overwriteConflicts);
        this.incidentYear.setValue(incidentYear);
        this.incidentNumber.setValue(incidentNumber);
        this.nvdrsVictimNumber.setValue(nvdrsVictimNumber);
        this.last4CharactersOfDC.setValue(last4CharactersOfDC);
        this.last4CharactersOfCME.setValue(last4CharactersOfCME);
        this.firstInitialOfLastName.setValue(firstInitialOfLastName);
        this.dayOfBirth.setValue(dayOfBirth);
        this.dateOfDeathYear.setValue(dateOfDeathYear);
        this.stateOrTerritoryOfDeath.setValue(stateOrTerritoryOfDeath);
        this.countyOfDeath.setValue(countyOfDeath);
        this.sex.setValue(sex);
        this.ageUnit.setValue(ageUnit);
        this.age.setValue(age);
        this.birthCountry.setValue(birthCountry);
        this.birthStateTerritoryOrCountry.setValue(birthStateTerritoryOrCountry);
        this.cityOfResidence.setValue(cityOfResidence);
        this.countyOfResidence.setValue(countyOfResidence);
        this.stateOrTerritoryOfResidence.setValue(stateOrTerritoryOfResidence);
        this.countryOfResidence.setValue(countryOfResidence);
        this.maritalStatus.setValue(maritalStatus);
        this.placeOfDeath.setValue(placeOfDeath);
        this.dateOfDeathMonth.setValue(dateOfDeathMonth);
        this.dateOfDeathDay.setValue(dateOfDeathDay);
        this.educationByDegree.setValue(educationByDegree);
        this.hispanicLatinoSpanish1.setValue(hispanicLatinoSpanish1);
        this.hispanicLatinoSpanish2.setValue(hispanicLatinoSpanish2);
        this.hispanicLatinoSpanish3.setValue(hispanicLatinoSpanish3);
        this.hispanicLatinoSpanish4.setValue(hispanicLatinoSpanish4);
        this.white.setValue(white);
        this.blackOrAfricanAmerican.setValue(blackOrAfricanAmerican);
        this.americanIndianOrAlaskaNative.setValue(americanIndianOrAlaskaNative);
        this.asian.setValue(asian);
        this.asianIndian.setValue(asianIndian);
        this.chinese.setValue(chinese);
        this.filipino.setValue(filipino);
        this.japanese.setValue(japanese);
        this.korean.setValue(korean);
        this.vietnamese.setValue(vietnamese);
        this.nativeHawaiianOrOtherPacificIslander.setValue(nativeHawaiianOrOtherPacificIslander);
        this.nativeHawaiian.setValue(nativeHawaiian);
        this.guamanianOrChamorro.setValue(guamanianOrChamorro);
        this.samoan.setValue(samoan);
        this.otherRace.setValue(otherRace);
        this.unspecifiedRace.setValue(unspecifiedRace);
        this.usualOccupationText.setValue(usualOccupationText);
        this.usualOccupationCode.setValue(usualOccupationCode);
        this.usualIndustryText.setValue(usualIndustryText);
        this.kindOfBusinessIndustryCode.setValue(kindOfBusinessIndustryCode);
        this.immediateCauseOfDeath.setValue(immediateCauseOfDeath);
        this.causeLeadingToImmediateCauseOfDeath.setValue(causeLeadingToImmediateCauseOfDeath);
        this.nextAntecedentCauseOfDeath.setValue(nextAntecedentCauseOfDeath);
        this.underlyingCauseOfDeath.setValue(underlyingCauseOfDeath);
        this.victimWasPregnant.setValue(victimWasPregnant);
        this.mannerOfDeathOnDC.setValue(mannerOfDeathOnDC);
        this.dateOfInjuryMonth.setValue(dateOfInjuryMonth);
        this.dateOfInjuryDay.setValue(dateOfInjuryDay);
        this.dateOfInjuryYear.setValue(dateOfInjuryYear);
        this.timeOfInjury.setValue(timeOfInjury);
        this.notesColumn.setValue(notesColumn);
        this.injuredAtWork.setValue(injuredAtWork);
        this.autopsyPerformed.setValue(autopsyPerformed);
        this.underlyingCauseOfDeathICD10Code.setValue(underlyingCauseOfDeathICD10Code);
        this.icd10TypeOfActivityWhenInjured.setValue(icd10TypeOfActivityWhenInjured);
        this.typeOfLocationWhereInjured.setValue(typeOfLocationWhereInjured);
        this.icd10TypeOfPlaceWhereInjured.setValue(icd10TypeOfPlaceWhereInjured);
        this.multipleConditionsOnDC1.setValue(multipleConditionsOnDC1);
        this.multipleConditionsOnDC2.setValue(multipleConditionsOnDC2);
        this.multipleConditionsOnDC3.setValue(multipleConditionsOnDC3);
        this.multipleConditionsOnDC4.setValue(multipleConditionsOnDC4);
        this.multipleConditionsOnDC5.setValue(multipleConditionsOnDC5);
        this.multipleConditionsOnDC6.setValue(multipleConditionsOnDC6);
        this.multipleConditionsOnDC7.setValue(multipleConditionsOnDC7);
        this.multipleConditionsOnDC8.setValue(multipleConditionsOnDC8);
        this.multipleConditionsOnDC9.setValue(multipleConditionsOnDC9);
        this.multipleConditionsOnDC10.setValue(multipleConditionsOnDC10);
        this.zipCodeOfResidence.setValue(zipCodeOfResidence);
        this.educationByNumberOfYears.setValue(educationByNumberOfYears);
        this.datePronouncedDeadMonth.setValue(datePronouncedDeadMonth);
        this.datePronouncedDeadDay.setValue(datePronouncedDeadDay);
        this.datePronouncedDeadYear.setValue(datePronouncedDeadYear);
        this.stateOrTerritoryWhereInjuryOccurred.setValue(stateOrTerritoryWhereInjuryOccurred);
        this.countyWhereInjuryOccurred.setValue(countyWhereInjuryOccurred);
        this.countryOfResidence2.setValue(countryOfResidence2);
        this.usCensusTractOfResidence.setValue(usCensusTractOfResidence);
        this.usCensusBlockGroupOfResidence.setValue(usCensusBlockGroupOfResidence);
        this.birthCountryIfOther.setValue(birthCountryIfOther);
        this.currentOrFormerMilitaryPersonnel.setValue(currentOrFormerMilitaryPersonnel);
        this.placeOfDeathIfOther.setValue(placeOfDeathIfOther);
        this.cityWhereInjuryOccurred.setValue(cityWhereInjuryOccurred);
        this.usCensusBlockGroupWhereInjuryOccurred.setValue(usCensusBlockGroupWhereInjuryOccurred);
        this.usCensusTractWhereInjuryOccurred.setValue(usCensusTractWhereInjuryOccurred);
        this.survivalTimeNumberOfUnits.setValue(survivalTimeNumberOfUnits);
        this.unitOfTimeUsedInSurvivalTime.setValue(unitOfTimeUsedInSurvivalTime);
        this.zipCodeWhereInjuryOccurred.setValue(zipCodeWhereInjuryOccurred);
        this.mannerOfDeathPerAbstractor.setValue(mannerOfDeathPerAbstractor);
        this.otherSignificantConditionsContributingToDeath.setValue(otherSignificantConditionsContributingToDeath);
        this.howInjuryOccurred.setValue(howInjuryOccurred);
        this.otherAsian.setValue(otherAsian);
        this.otherAsianSpecify.setValue(otherAsianSpecify);
        this.otherPacificIslander.setValue(otherPacificIslander);
        this.otherPacificIslanderSpecify.setValue(otherPacificIslanderSpecify);
        this.nameOfTheEnrolledOrPrincipalTribe.setValue(nameOfTheEnrolledOrPrincipalTribe);
        this.otherRaceSpecify.setValue(otherRaceSpecify);
    }

    public SerialField<String> getForceNewRecord() {
        return this.forceNewRecord;
    }

    public void setForceNewRecord(String forceNewRecord) {
        this.forceNewRecord.setValue(forceNewRecord);
    }

    public SerialField<String> getOverwriteConflicts() {
        return this.overwriteConflicts;
    }

    public void setOverwriteConflicts(String overwriteConflicts) {
        this.overwriteConflicts.setValue(overwriteConflicts);
    }

    public SerialField<CharLimitedInteger> getIncidentYear() {
        return this.incidentYear;
    }

    public void setIncidentYear(CharLimitedInteger incidentYear) {
        this.incidentYear.setValue(incidentYear);
    }

    public SerialField<String> getIncidentNumber() {
        return this.incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber.setValue(incidentNumber);
    }

    public SerialField<CharLimitedInteger> getNvdrsVictimNumber() {
        return this.nvdrsVictimNumber;
    }

    public void setNvdrsVictimNumber(CharLimitedInteger nvdrsVictimNumber) {
        this.nvdrsVictimNumber.setValue(nvdrsVictimNumber);
    }

    public SerialField<String> getLast4CharactersOfDC() {
        return this.last4CharactersOfDC;
    }

    public void setLast4CharactersOfDC(String last4CharactersOfDC) {
        this.last4CharactersOfDC.setValue(last4CharactersOfDC);
    }

    public SerialField<String> getLast4CharactersOfCME() {
        return this.last4CharactersOfCME;
    }

    public void setLast4CharactersOfCME(String last4CharactersOfCME) {
        this.last4CharactersOfCME.setValue(last4CharactersOfCME);
    }

    public SerialField<String> getFirstInitialOfLastName() {
        return this.firstInitialOfLastName;
    }

    public void setFirstInitialOfLastName(String firstInitialOfLastName) {
        this.firstInitialOfLastName.setValue(firstInitialOfLastName);
    }

    public SerialField<CharLimitedInteger> getDayOfBirth() {
        return this.dayOfBirth;
    }

    public void setDayOfBirth(CharLimitedInteger dayOfBirth) {
        this.dayOfBirth.setValue(dayOfBirth);
    }

    public SerialField<CharLimitedInteger> getDateOfDeathYear() {
        return this.dateOfDeathYear;
    }

    public void setDateOfDeathYear(CharLimitedInteger dateOfDeathYear) {
        this.dateOfDeathYear.setValue(dateOfDeathYear);
    }

    public SerialField<CharLimitedInteger> getStateOrTerritoryOfDeath() {
        return this.stateOrTerritoryOfDeath;
    }

    public void setStateOrTerritoryOfDeath(CharLimitedInteger stateOrTerritoryOfDeath) {
        this.stateOrTerritoryOfDeath.setValue(stateOrTerritoryOfDeath);
    }

    public SerialField<CharLimitedInteger> getCountyOfDeath() {
        return this.countyOfDeath;
    }

    public void setCountyOfDeath(CharLimitedInteger countyOfDeath) {
        this.countyOfDeath.setValue(countyOfDeath);
    }

    public SerialField<String> getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex.setValue(sex);
    }

    public SerialField<CharLimitedInteger> getAgeUnit() {
        return this.ageUnit;
    }

    public void setAgeUnit(CharLimitedInteger ageUnit) {
        this.ageUnit.setValue(ageUnit);
    }

    public SerialField<CharLimitedInteger> getAge() {
        return this.age;
    }

    public void setAge(CharLimitedInteger age) {
        this.age.setValue(age);
    }

    public SerialField<String> getBirthCountry() {
        return this.birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry.setValue(birthCountry);
    }

    public SerialField<CharLimitedInteger> getBirthStateTerritoryOrCountry() {
        return this.birthStateTerritoryOrCountry;
    }

    public void setBirthStateTerritoryOrCountry(CharLimitedInteger birthStateTerritoryOrCountry) {
        this.birthStateTerritoryOrCountry.setValue(birthStateTerritoryOrCountry);
    }

    public SerialField<CharLimitedInteger> getCityOfResidence() {
        return this.cityOfResidence;
    }

    public void setCityOfResidence(CharLimitedInteger cityOfResidence) {
        this.cityOfResidence.setValue(cityOfResidence);
    }

    public SerialField<CharLimitedInteger> getCountyOfResidence() {
        return this.countyOfResidence;
    }

    public void setCountyOfResidence(CharLimitedInteger countyOfResidence) {
        this.countyOfResidence.setValue(countyOfResidence);
    }

    public SerialField<CharLimitedInteger> getStateOrTerritoryOfResidence() {
        return this.stateOrTerritoryOfResidence;
    }

    public void setStateOrTerritoryOfResidence(CharLimitedInteger stateOrTerritoryOfResidence) {
        this.stateOrTerritoryOfResidence.setValue(stateOrTerritoryOfResidence);
    }

    public SerialField<String> getCountryOfResidence() {
        return this.countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence.setValue(countryOfResidence);
    }

    public SerialField<CharLimitedInteger> getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(CharLimitedInteger maritalStatus) {
        this.maritalStatus.setValue(maritalStatus);
    }

    public SerialField<CharLimitedInteger> getPlaceOfDeath() {
        return this.placeOfDeath;
    }

    public void setPlaceOfDeath(CharLimitedInteger placeOfDeath) {
        this.placeOfDeath.setValue(placeOfDeath);
    }

    public SerialField<CharLimitedInteger> getDateOfDeathMonth() {
        return this.dateOfDeathMonth;
    }

    public void setDateOfDeathMonth(CharLimitedInteger dateOfDeathMonth) {
        this.dateOfDeathMonth.setValue(dateOfDeathMonth);
    }

    public SerialField<CharLimitedInteger> getDateOfDeathDay() {
        return this.dateOfDeathDay;
    }

    public void setDateOfDeathDay(CharLimitedInteger dateOfDeathDay) {
        this.dateOfDeathDay.setValue(dateOfDeathDay);
    }

    public SerialField<CharLimitedInteger> getEducationByDegree() {
        return this.educationByDegree;
    }

    public void setEducationByDegree(CharLimitedInteger educationByDegree) {
        this.educationByDegree.setValue(educationByDegree);
    }

    public SerialField<String> getHispanicLatinoSpanish1() {
        return this.hispanicLatinoSpanish1;
    }

    public void setHispanicLatinoSpanish1(String hispanicLatinoSpanish1) {
        this.hispanicLatinoSpanish1.setValue(hispanicLatinoSpanish1);
    }

    public SerialField<String> getHispanicLatinoSpanish2() {
        return this.hispanicLatinoSpanish2;
    }

    public void setHispanicLatinoSpanish2(String hispanicLatinoSpanish2) {
        this.hispanicLatinoSpanish2.setValue(hispanicLatinoSpanish2);
    }

    public SerialField<String> getHispanicLatinoSpanish3() {
        return this.hispanicLatinoSpanish3;
    }

    public void setHispanicLatinoSpanish3(String hispanicLatinoSpanish3) {
        this.hispanicLatinoSpanish3.setValue(hispanicLatinoSpanish3);
    }

    public SerialField<String> getHispanicLatinoSpanish4() {
        return this.hispanicLatinoSpanish4;
    }

    public void setHispanicLatinoSpanish4(String hispanicLatinoSpanish4) {
        this.hispanicLatinoSpanish4.setValue(hispanicLatinoSpanish4);
    }

    public SerialField<String> getWhite() {
        return this.white;
    }

    public void setWhite(String white) {
        this.white.setValue(white);
    }

    public SerialField<String> getBlackOrAfricanAmerican() {
        return this.blackOrAfricanAmerican;
    }

    public void setBlackOrAfricanAmerican(String blackOrAfricanAmerican) {
        this.blackOrAfricanAmerican.setValue(blackOrAfricanAmerican);
    }

    public SerialField<String> getAmericanIndianOrAlaskaNative() {
        return this.americanIndianOrAlaskaNative;
    }

    public void setAmericanIndianOrAlaskaNative(String americanIndianOrAlaskaNative) {
        this.americanIndianOrAlaskaNative.setValue(americanIndianOrAlaskaNative);
    }

    public SerialField<String> getAsian() {
        return this.asian;
    }

    public void setAsian(String asian) {
        this.asian.setValue(asian);
    }

    public SerialField<String> getAsianIndian() {
        return this.asianIndian;
    }

    public void setAsianIndian(String asianIndian) {
        this.asianIndian.setValue(asianIndian);
    }

    public SerialField<String> getChinese() {
        return this.chinese;
    }

    public void setChinese(String chinese) {
        this.chinese.setValue(chinese);
    }

    public SerialField<String> getFilipino() {
        return this.filipino;
    }

    public void setFilipino(String filipino) {
        this.filipino.setValue(filipino);
    }

    public SerialField<String> getJapanese() {
        return this.japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese.setValue(japanese);
    }

    public SerialField<String> getKorean() {
        return this.korean;
    }

    public void setKorean(String korean) {
        this.korean.setValue(korean);
    }

    public SerialField<String> getVietnamese() {
        return this.vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese.setValue(vietnamese);
    }

    public SerialField<String> getNativeHawaiianOrOtherPacificIslander() {
        return this.nativeHawaiianOrOtherPacificIslander;
    }

    public void setNativeHawaiianOrOtherPacificIslander(String nativeHawaiianOrOtherPacificIslander) {
        this.nativeHawaiianOrOtherPacificIslander.setValue(nativeHawaiianOrOtherPacificIslander);
    }

    public SerialField<String> getNativeHawaiian() {
        return this.nativeHawaiian;
    }

    public void setNativeHawaiian(String nativeHawaiian) {
        this.nativeHawaiian.setValue(nativeHawaiian);
    }

    public SerialField<String> getGuamanianOrChamorro() {
        return this.guamanianOrChamorro;
    }

    public void setGuamanianOrChamorro(String guamanianOrChamorro) {
        this.guamanianOrChamorro.setValue(guamanianOrChamorro);
    }

    public SerialField<String> getSamoan() {
        return this.samoan;
    }

    public void setSamoan(String samoan) {
        this.samoan.setValue(samoan);
    }

    public SerialField<String> getOtherRace() {
        return this.otherRace;
    }

    public void setOtherRace(String otherRace) {
        this.otherRace.setValue(otherRace);
    }

    public SerialField<String> getUnspecifiedRace() {
        return this.unspecifiedRace;
    }

    public void setUnspecifiedRace(String unspecifiedRace) {
        this.unspecifiedRace.setValue(unspecifiedRace);
    }

    public SerialField<String> getUsualOccupationText() {
        return this.usualOccupationText;
    }

    public void setUsualOccupationText(String usualOccupationText) {
        this.usualOccupationText.setValue(usualOccupationText);
    }

    public SerialField<CharLimitedInteger> getUsualOccupationCode() {
        return this.usualOccupationCode;
    }

    public void setUsualOccupationCode(CharLimitedInteger usualOccupationCode) {
        this.usualOccupationCode.setValue(usualOccupationCode);
    }

    public SerialField<String> getUsualIndustryText() {
        return this.usualIndustryText;
    }

    public void setUsualIndustryText(String usualIndustryText) {
        this.usualIndustryText.setValue(usualIndustryText);
    }

    public SerialField<CharLimitedInteger> getKindOfBusinessIndustryCode() {
        return this.kindOfBusinessIndustryCode;
    }

    public void setKindOfBusinessIndustryCode(CharLimitedInteger kindOfBusinessIndustryCode) {
        this.kindOfBusinessIndustryCode.setValue(kindOfBusinessIndustryCode);
    }

    public SerialField<String> getImmediateCauseOfDeath() {
        return this.immediateCauseOfDeath;
    }

    public void setImmediateCauseOfDeath(String immediateCauseOfDeath) {
        this.immediateCauseOfDeath.setValue(immediateCauseOfDeath);
    }

    public SerialField<String> getCauseLeadingToImmediateCauseOfDeath() {
        return this.causeLeadingToImmediateCauseOfDeath;
    }

    public void setCauseLeadingToImmediateCauseOfDeath(String causeLeadingToImmediateCauseOfDeath) {
        this.causeLeadingToImmediateCauseOfDeath.setValue(causeLeadingToImmediateCauseOfDeath);
    }

    public SerialField<String> getNextAntecedentCauseOfDeath() {
        return this.nextAntecedentCauseOfDeath;
    }

    public void setNextAntecedentCauseOfDeath(String nextAntecedentCauseOfDeath) {
        this.nextAntecedentCauseOfDeath.setValue(nextAntecedentCauseOfDeath);
    }

    public SerialField<String> getUnderlyingCauseOfDeath() {
        return this.underlyingCauseOfDeath;
    }

    public void setUnderlyingCauseOfDeath(String underlyingCauseOfDeath) {
        this.underlyingCauseOfDeath.setValue(underlyingCauseOfDeath);
    }

    public SerialField<CharLimitedInteger> getVictimWasPregnant() {
        return this.victimWasPregnant;
    }

    public void setVictimWasPregnant(CharLimitedInteger victimWasPregnant) {
        this.victimWasPregnant.setValue(victimWasPregnant);
    }

    public SerialField<String> getMannerOfDeathOnDC() {
        return this.mannerOfDeathOnDC;
    }

    public void setMannerOfDeathOnDC(String mannerOfDeathOnDC) {
        this.mannerOfDeathOnDC.setValue(mannerOfDeathOnDC);
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryMonth() {
        return this.dateOfInjuryMonth;
    }

    public void setDateOfInjuryMonth(CharLimitedInteger dateOfInjuryMonth) {
        this.dateOfInjuryMonth.setValue(dateOfInjuryMonth);
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryDay() {
        return this.dateOfInjuryDay;
    }

    public void setDateOfInjuryDay(CharLimitedInteger dateOfInjuryDay) {
        this.dateOfInjuryDay.setValue(dateOfInjuryDay);
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryYear() {
        return this.dateOfInjuryYear;
    }

    public void setDateOfInjuryYear(CharLimitedInteger dateOfInjuryYear) {
        this.dateOfInjuryYear.setValue(dateOfInjuryYear);
    }

    public SerialField<CharLimitedInteger> getTimeOfInjury() {
        return this.timeOfInjury;
    }

    public void setTimeOfInjury(CharLimitedInteger timeOfInjury) {
        this.timeOfInjury.setValue(timeOfInjury);
    }

    public SerialField<String> getNotesColumn() {
        return this.notesColumn;
    }

    public void setNotesColumn(String notesColumn) {
        this.notesColumn.setValue(notesColumn);
    }

    public SerialField<String> getInjuredAtWork() {
        return this.injuredAtWork;
    }

    public void setInjuredAtWork(String injuredAtWork) {
        this.injuredAtWork.setValue(injuredAtWork);
    }

    public SerialField<String> getAutopsyPerformed() {
        return this.autopsyPerformed;
    }

    public void setAutopsyPerformed(String autopsyPerformed) {
        this.autopsyPerformed.setValue(autopsyPerformed);
    }

    public SerialField<String> getUnderlyingCauseOfDeathICD10Code() {
        return this.underlyingCauseOfDeathICD10Code;
    }

    public void setUnderlyingCauseOfDeathICD10Code(String underlyingCauseOfDeathICD10Code) {
        this.underlyingCauseOfDeathICD10Code.setValue(underlyingCauseOfDeathICD10Code);
    }

    public SerialField<CharLimitedInteger> getIcd10TypeOfActivityWhenInjured() {
        return this.icd10TypeOfActivityWhenInjured;
    }

    public void setIcd10TypeOfActivityWhenInjured(CharLimitedInteger icd10TypeOfActivityWhenInjured) {
        this.icd10TypeOfActivityWhenInjured.setValue(icd10TypeOfActivityWhenInjured);
    }

    public SerialField<String> getTypeOfLocationWhereInjured() {
        return this.typeOfLocationWhereInjured;
    }

    public void setTypeOfLocationWhereInjured(String typeOfLocationWhereInjured) {
        this.typeOfLocationWhereInjured.setValue(typeOfLocationWhereInjured);
    }

    public SerialField<CharLimitedInteger> getIcd10TypeOfPlaceWhereInjured() {
        return this.icd10TypeOfPlaceWhereInjured;
    }

    public void setIcd10TypeOfPlaceWhereInjured(CharLimitedInteger icd10TypeOfPlaceWhereInjured) {
        this.icd10TypeOfPlaceWhereInjured.setValue(icd10TypeOfPlaceWhereInjured);
    }

    public SerialField<String> getMultipleConditionsOnDC1() {
        return this.multipleConditionsOnDC1;
    }

    public void setMultipleConditionsOnDC1(String multipleConditionsOnDC1) {
        this.multipleConditionsOnDC1.setValue(multipleConditionsOnDC1);
    }

    public SerialField<String> getMultipleConditionsOnDC2() {
        return this.multipleConditionsOnDC2;
    }

    public void setMultipleConditionsOnDC2(String multipleConditionsOnDC2) {
        this.multipleConditionsOnDC2.setValue(multipleConditionsOnDC2);
    }

    public SerialField<String> getMultipleConditionsOnDC3() {
        return this.multipleConditionsOnDC3;
    }

    public void setMultipleConditionsOnDC3(String multipleConditionsOnDC3) {
        this.multipleConditionsOnDC3.setValue(multipleConditionsOnDC3);
    }

    public SerialField<String> getMultipleConditionsOnDC4() {
        return this.multipleConditionsOnDC4;
    }

    public void setMultipleConditionsOnDC4(String multipleConditionsOnDC4) {
        this.multipleConditionsOnDC4.setValue(multipleConditionsOnDC4);
    }

    public SerialField<String> getMultipleConditionsOnDC5() {
        return this.multipleConditionsOnDC5;
    }

    public void setMultipleConditionsOnDC5(String multipleConditionsOnDC5) {
        this.multipleConditionsOnDC5.setValue(multipleConditionsOnDC5);
    }

    public SerialField<String> getMultipleConditionsOnDC6() {
        return this.multipleConditionsOnDC6;
    }

    public void setMultipleConditionsOnDC6(String multipleConditionsOnDC6) {
        this.multipleConditionsOnDC6.setValue(multipleConditionsOnDC6);
    }

    public SerialField<String> getMultipleConditionsOnDC7() {
        return this.multipleConditionsOnDC7;
    }

    public void setMultipleConditionsOnDC7(String multipleConditionsOnDC7) {
        this.multipleConditionsOnDC7.setValue(multipleConditionsOnDC7);
    }

    public SerialField<String> getMultipleConditionsOnDC8() {
        return this.multipleConditionsOnDC8;
    }

    public void setMultipleConditionsOnDC8(String multipleConditionsOnDC8) {
        this.multipleConditionsOnDC8.setValue(multipleConditionsOnDC8);
    }

    public SerialField<String> getMultipleConditionsOnDC9() {
        return this.multipleConditionsOnDC9;
    }

    public void setMultipleConditionsOnDC9(String multipleConditionsOnDC9) {
        this.multipleConditionsOnDC9.setValue(multipleConditionsOnDC9);
    }

    public SerialField<String> getMultipleConditionsOnDC10() {
        return this.multipleConditionsOnDC10;
    }

    public void setMultipleConditionsOnDC10(String multipleConditionsOnDC10) {
        this.multipleConditionsOnDC10.setValue(multipleConditionsOnDC10);
    }

    public SerialField<CharLimitedInteger> getZipCodeOfResidence() {
        return this.zipCodeOfResidence;
    }

    public void setZipCodeOfResidence(CharLimitedInteger zipCodeOfResidence) {
        this.zipCodeOfResidence.setValue(zipCodeOfResidence);
    }

    public SerialField<CharLimitedInteger> getEducationByNumberOfYears() {
        return this.educationByNumberOfYears;
    }

    public void setEducationByNumberOfYears(CharLimitedInteger educationByNumberOfYears) {
        this.educationByNumberOfYears.setValue(educationByNumberOfYears);
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadMonth() {
        return this.datePronouncedDeadMonth;
    }

    public void setDatePronouncedDeadMonth(CharLimitedInteger datePronouncedDeadMonth) {
        this.datePronouncedDeadMonth.setValue(datePronouncedDeadMonth);
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadDay() {
        return this.datePronouncedDeadDay;
    }

    public void setDatePronouncedDeadDay(CharLimitedInteger datePronouncedDeadDay) {
        this.datePronouncedDeadDay.setValue(datePronouncedDeadDay);
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadYear() {
        return this.datePronouncedDeadYear;
    }

    public void setDatePronouncedDeadYear(CharLimitedInteger datePronouncedDeadYear) {
        this.datePronouncedDeadYear.setValue(datePronouncedDeadYear);
    }

    public SerialField<CharLimitedInteger> getStateOrTerritoryWhereInjuryOccurred() {
        return this.stateOrTerritoryWhereInjuryOccurred;
    }

    public void setStateOrTerritoryWhereInjuryOccurred(CharLimitedInteger stateOrTerritoryWhereInjuryOccurred) {
        this.stateOrTerritoryWhereInjuryOccurred.setValue(stateOrTerritoryWhereInjuryOccurred);
    }

    public SerialField<CharLimitedInteger> getCountyWhereInjuryOccurred() {
        return this.countyWhereInjuryOccurred;
    }

    public void setCountyWhereInjuryOccurred(CharLimitedInteger countyWhereInjuryOccurred) {
        this.countyWhereInjuryOccurred.setValue(countyWhereInjuryOccurred);
    }

    public SerialField<String> getCountryOfResidence2() {
        return this.countryOfResidence2;
    }

    public void setCountryOfResidence2(String countryOfResidence2) {
        this.countryOfResidence2.setValue(countryOfResidence2);
    }

    public SerialField<String> getUsCensusTractOfResidence() {
        return this.usCensusTractOfResidence;
    }

    public void setUsCensusTractOfResidence(String usCensusTractOfResidence) {
        this.usCensusTractOfResidence.setValue(usCensusTractOfResidence);
    }

    public SerialField<String> getUsCensusBlockGroupOfResidence() {
        return this.usCensusBlockGroupOfResidence;
    }

    public void setUsCensusBlockGroupOfResidence(String usCensusBlockGroupOfResidence) {
        this.usCensusBlockGroupOfResidence.setValue(usCensusBlockGroupOfResidence);
    }

    public SerialField<String> getBirthCountryIfOther() {
        return this.birthCountryIfOther;
    }

    public void setBirthCountryIfOther(String birthCountryIfOther) {
        this.birthCountryIfOther.setValue(birthCountryIfOther);
    }

    public SerialField<CharLimitedInteger> getCurrentOrFormerMilitaryPersonnel() {
        return this.currentOrFormerMilitaryPersonnel;
    }

    public void setCurrentOrFormerMilitaryPersonnel(CharLimitedInteger currentOrFormerMilitaryPersonnel) {
        this.currentOrFormerMilitaryPersonnel.setValue(currentOrFormerMilitaryPersonnel);
    }

    public SerialField<String> getPlaceOfDeathIfOther() {
        return this.placeOfDeathIfOther;
    }

    public void setPlaceOfDeathIfOther(String placeOfDeathIfOther) {
        this.placeOfDeathIfOther.setValue(placeOfDeathIfOther);
    }

    public SerialField<CharLimitedInteger> getCityWhereInjuryOccurred() {
        return this.cityWhereInjuryOccurred;
    }

    public void setCityWhereInjuryOccurred(CharLimitedInteger cityWhereInjuryOccurred) {
        this.cityWhereInjuryOccurred.setValue(cityWhereInjuryOccurred);
    }

    public SerialField<CharLimitedInteger> getUsCensusBlockGroupWhereInjuryOccurred() {
        return this.usCensusBlockGroupWhereInjuryOccurred;
    }

    public void setUsCensusBlockGroupWhereInjuryOccurred(CharLimitedInteger usCensusBlockGroupWhereInjuryOccurred) {
        this.usCensusBlockGroupWhereInjuryOccurred.setValue(usCensusBlockGroupWhereInjuryOccurred);
    }

    public SerialField<String> getUsCensusTractWhereInjuryOccurred() {
        return this.usCensusTractWhereInjuryOccurred;
    }

    public void setUsCensusTractWhereInjuryOccurred(String usCensusTractWhereInjuryOccurred) {
        this.usCensusTractWhereInjuryOccurred.setValue(usCensusTractWhereInjuryOccurred);
    }

    public SerialField<CharLimitedInteger> getSurvivalTimeNumberOfUnits() {
        return this.survivalTimeNumberOfUnits;
    }

    public void setSurvivalTimeNumberOfUnits(CharLimitedInteger survivalTimeNumberOfUnits) {
        this.survivalTimeNumberOfUnits.setValue(survivalTimeNumberOfUnits);
    }

    public SerialField<CharLimitedInteger> getUnitOfTimeUsedInSurvivalTime() {
        return this.unitOfTimeUsedInSurvivalTime;
    }

    public void setUnitOfTimeUsedInSurvivalTime(CharLimitedInteger unitOfTimeUsedInSurvivalTime) {
        this.unitOfTimeUsedInSurvivalTime.setValue(unitOfTimeUsedInSurvivalTime);
    }

    public SerialField<CharLimitedInteger> getZipCodeWhereInjuryOccurred() {
        return this.zipCodeWhereInjuryOccurred;
    }

    public void setZipCodeWhereInjuryOccurred(CharLimitedInteger zipCodeWhereInjuryOccurred) {
        this.zipCodeWhereInjuryOccurred.setValue(zipCodeWhereInjuryOccurred);
    }

    public SerialField<CharLimitedInteger> getMannerOfDeathPerAbstractor() {
        return this.mannerOfDeathPerAbstractor;
    }

    public void setMannerOfDeathPerAbstractor(CharLimitedInteger mannerOfDeathPerAbstractor) {
        this.mannerOfDeathPerAbstractor.setValue(mannerOfDeathPerAbstractor);
    }

    public SerialField<String> getOtherSignificantConditionsContributingToDeath() {
        return this.otherSignificantConditionsContributingToDeath;
    }

    public void setOtherSignificantConditionsContributingToDeath(String otherSignificantConditionsContributingToDeath) {
        this.otherSignificantConditionsContributingToDeath.setValue(otherSignificantConditionsContributingToDeath);
    }

    public SerialField<String> getHowInjuryOccurred() {
        return this.howInjuryOccurred;
    }

    public void setHowInjuryOccurred(String howInjuryOccurred) {
        this.howInjuryOccurred.setValue(howInjuryOccurred);
    }

    public SerialField<String> getOtherAsian() {
        return this.otherAsian;
    }

    public void setOtherAsian(String otherAsian) {
        this.otherAsian.setValue(otherAsian);
    }

    public SerialField<String> getOtherAsianSpecify() {
        return this.otherAsianSpecify;
    }

    public void setOtherAsianSpecify(String otherAsianSpecify) {
        this.otherAsianSpecify.setValue(otherAsianSpecify);
    }

    public SerialField<String> getOtherPacificIslander() {
        return this.otherPacificIslander;
    }

    public void setOtherPacificIslander(String otherPacificIslander) {
        this.otherPacificIslander.setValue(otherPacificIslander);
    }

    public SerialField<String> getOtherPacificIslanderSpecify() {
        return this.otherPacificIslanderSpecify;
    }

    public void setOtherPacificIslanderSpecify(String otherPacificIslanderSpecify) {
        this.otherPacificIslanderSpecify.setValue(otherPacificIslanderSpecify);
    }

    public SerialField<String> getNameOfTheEnrolledOrPrincipalTribe() {
        return this.nameOfTheEnrolledOrPrincipalTribe;
    }

    public void setNameOfTheEnrolledOrPrincipalTribe(String nameOfTheEnrolledOrPrincipalTribe) {
        this.nameOfTheEnrolledOrPrincipalTribe.setValue(nameOfTheEnrolledOrPrincipalTribe);
    }

    public SerialField<String> getOtherRaceSpecify() {
        return this.otherRaceSpecify;
    }

    public void setOtherRaceSpecify(String otherRaceSpecify) {
        this.otherRaceSpecify.setValue(otherRaceSpecify);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DCFormat)) {
            return false;
        }
        DCFormat dCFormat = (DCFormat) o;
        return Objects.equals(forceNewRecord, dCFormat.forceNewRecord) && Objects.equals(overwriteConflicts, dCFormat.overwriteConflicts) && Objects.equals(incidentYear, dCFormat.incidentYear) && Objects.equals(incidentNumber, dCFormat.incidentNumber) && Objects.equals(nvdrsVictimNumber, dCFormat.nvdrsVictimNumber) && Objects.equals(last4CharactersOfDC, dCFormat.last4CharactersOfDC) && Objects.equals(last4CharactersOfCME, dCFormat.last4CharactersOfCME) && Objects.equals(firstInitialOfLastName, dCFormat.firstInitialOfLastName) && Objects.equals(dayOfBirth, dCFormat.dayOfBirth) && Objects.equals(dateOfDeathYear, dCFormat.dateOfDeathYear) && Objects.equals(stateOrTerritoryOfDeath, dCFormat.stateOrTerritoryOfDeath) && Objects.equals(countyOfDeath, dCFormat.countyOfDeath) && Objects.equals(sex, dCFormat.sex) && Objects.equals(ageUnit, dCFormat.ageUnit) && Objects.equals(age, dCFormat.age) && Objects.equals(birthCountry, dCFormat.birthCountry) && Objects.equals(birthStateTerritoryOrCountry, dCFormat.birthStateTerritoryOrCountry) && Objects.equals(cityOfResidence, dCFormat.cityOfResidence) && Objects.equals(countyOfResidence, dCFormat.countyOfResidence) && Objects.equals(stateOrTerritoryOfResidence, dCFormat.stateOrTerritoryOfResidence) && Objects.equals(countryOfResidence, dCFormat.countryOfResidence) && Objects.equals(maritalStatus, dCFormat.maritalStatus) && Objects.equals(placeOfDeath, dCFormat.placeOfDeath) && Objects.equals(dateOfDeathMonth, dCFormat.dateOfDeathMonth) && Objects.equals(dateOfDeathDay, dCFormat.dateOfDeathDay) && Objects.equals(educationByDegree, dCFormat.educationByDegree) && Objects.equals(hispanicLatinoSpanish1, dCFormat.hispanicLatinoSpanish1) && Objects.equals(hispanicLatinoSpanish2, dCFormat.hispanicLatinoSpanish2) && Objects.equals(hispanicLatinoSpanish3, dCFormat.hispanicLatinoSpanish3) && Objects.equals(hispanicLatinoSpanish4, dCFormat.hispanicLatinoSpanish4) && Objects.equals(white, dCFormat.white) && Objects.equals(blackOrAfricanAmerican, dCFormat.blackOrAfricanAmerican) && Objects.equals(americanIndianOrAlaskaNative, dCFormat.americanIndianOrAlaskaNative) && Objects.equals(asian, dCFormat.asian) && Objects.equals(asianIndian, dCFormat.asianIndian) && Objects.equals(chinese, dCFormat.chinese) && Objects.equals(filipino, dCFormat.filipino) && Objects.equals(japanese, dCFormat.japanese) && Objects.equals(korean, dCFormat.korean) && Objects.equals(vietnamese, dCFormat.vietnamese) && Objects.equals(nativeHawaiianOrOtherPacificIslander, dCFormat.nativeHawaiianOrOtherPacificIslander) && Objects.equals(nativeHawaiian, dCFormat.nativeHawaiian) && Objects.equals(guamanianOrChamorro, dCFormat.guamanianOrChamorro) && Objects.equals(samoan, dCFormat.samoan) && Objects.equals(otherRace, dCFormat.otherRace) && Objects.equals(unspecifiedRace, dCFormat.unspecifiedRace) && Objects.equals(usualOccupationText, dCFormat.usualOccupationText) && Objects.equals(usualOccupationCode, dCFormat.usualOccupationCode) && Objects.equals(usualIndustryText, dCFormat.usualIndustryText) && Objects.equals(kindOfBusinessIndustryCode, dCFormat.kindOfBusinessIndustryCode) && Objects.equals(immediateCauseOfDeath, dCFormat.immediateCauseOfDeath) && Objects.equals(causeLeadingToImmediateCauseOfDeath, dCFormat.causeLeadingToImmediateCauseOfDeath) && Objects.equals(nextAntecedentCauseOfDeath, dCFormat.nextAntecedentCauseOfDeath) && Objects.equals(underlyingCauseOfDeath, dCFormat.underlyingCauseOfDeath) && Objects.equals(victimWasPregnant, dCFormat.victimWasPregnant) && Objects.equals(mannerOfDeathOnDC, dCFormat.mannerOfDeathOnDC) && Objects.equals(dateOfInjuryMonth, dCFormat.dateOfInjuryMonth) && Objects.equals(dateOfInjuryDay, dCFormat.dateOfInjuryDay) && Objects.equals(dateOfInjuryYear, dCFormat.dateOfInjuryYear) && Objects.equals(timeOfInjury, dCFormat.timeOfInjury) && Objects.equals(notesColumn, dCFormat.notesColumn) && Objects.equals(injuredAtWork, dCFormat.injuredAtWork) && Objects.equals(autopsyPerformed, dCFormat.autopsyPerformed) && Objects.equals(underlyingCauseOfDeathICD10Code, dCFormat.underlyingCauseOfDeathICD10Code) && Objects.equals(icd10TypeOfActivityWhenInjured, dCFormat.icd10TypeOfActivityWhenInjured) && Objects.equals(typeOfLocationWhereInjured, dCFormat.typeOfLocationWhereInjured) && Objects.equals(icd10TypeOfPlaceWhereInjured, dCFormat.icd10TypeOfPlaceWhereInjured) && Objects.equals(multipleConditionsOnDC1, dCFormat.multipleConditionsOnDC1) && Objects.equals(multipleConditionsOnDC2, dCFormat.multipleConditionsOnDC2) && Objects.equals(multipleConditionsOnDC3, dCFormat.multipleConditionsOnDC3) && Objects.equals(multipleConditionsOnDC4, dCFormat.multipleConditionsOnDC4) && Objects.equals(multipleConditionsOnDC5, dCFormat.multipleConditionsOnDC5) && Objects.equals(multipleConditionsOnDC6, dCFormat.multipleConditionsOnDC6) && Objects.equals(multipleConditionsOnDC7, dCFormat.multipleConditionsOnDC7) && Objects.equals(multipleConditionsOnDC8, dCFormat.multipleConditionsOnDC8) && Objects.equals(multipleConditionsOnDC9, dCFormat.multipleConditionsOnDC9) && Objects.equals(multipleConditionsOnDC10, dCFormat.multipleConditionsOnDC10) && Objects.equals(zipCodeOfResidence, dCFormat.zipCodeOfResidence) && Objects.equals(educationByNumberOfYears, dCFormat.educationByNumberOfYears) && Objects.equals(datePronouncedDeadMonth, dCFormat.datePronouncedDeadMonth) && Objects.equals(datePronouncedDeadDay, dCFormat.datePronouncedDeadDay) && Objects.equals(datePronouncedDeadYear, dCFormat.datePronouncedDeadYear) && Objects.equals(stateOrTerritoryWhereInjuryOccurred, dCFormat.stateOrTerritoryWhereInjuryOccurred) && Objects.equals(countyWhereInjuryOccurred, dCFormat.countyWhereInjuryOccurred) && Objects.equals(countryOfResidence2, dCFormat.countryOfResidence2) && Objects.equals(usCensusTractOfResidence, dCFormat.usCensusTractOfResidence) && Objects.equals(usCensusBlockGroupOfResidence, dCFormat.usCensusBlockGroupOfResidence) && Objects.equals(birthCountryIfOther, dCFormat.birthCountryIfOther) && Objects.equals(currentOrFormerMilitaryPersonnel, dCFormat.currentOrFormerMilitaryPersonnel) && Objects.equals(placeOfDeathIfOther, dCFormat.placeOfDeathIfOther) && Objects.equals(cityWhereInjuryOccurred, dCFormat.cityWhereInjuryOccurred) && Objects.equals(usCensusBlockGroupWhereInjuryOccurred, dCFormat.usCensusBlockGroupWhereInjuryOccurred) && Objects.equals(usCensusTractWhereInjuryOccurred, dCFormat.usCensusTractWhereInjuryOccurred) && Objects.equals(survivalTimeNumberOfUnits, dCFormat.survivalTimeNumberOfUnits) && Objects.equals(unitOfTimeUsedInSurvivalTime, dCFormat.unitOfTimeUsedInSurvivalTime) && Objects.equals(zipCodeWhereInjuryOccurred, dCFormat.zipCodeWhereInjuryOccurred) && Objects.equals(mannerOfDeathPerAbstractor, dCFormat.mannerOfDeathPerAbstractor) && Objects.equals(otherSignificantConditionsContributingToDeath, dCFormat.otherSignificantConditionsContributingToDeath) && Objects.equals(howInjuryOccurred, dCFormat.howInjuryOccurred) && Objects.equals(otherAsian, dCFormat.otherAsian) && Objects.equals(otherAsianSpecify, dCFormat.otherAsianSpecify) && Objects.equals(otherPacificIslander, dCFormat.otherPacificIslander) && Objects.equals(otherPacificIslanderSpecify, dCFormat.otherPacificIslanderSpecify) && Objects.equals(nameOfTheEnrolledOrPrincipalTribe, dCFormat.nameOfTheEnrolledOrPrincipalTribe) && Objects.equals(otherRaceSpecify, dCFormat.otherRaceSpecify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forceNewRecord, overwriteConflicts, incidentYear, incidentNumber, nvdrsVictimNumber, last4CharactersOfDC, last4CharactersOfCME, firstInitialOfLastName, dayOfBirth, dateOfDeathYear, stateOrTerritoryOfDeath, countyOfDeath, sex, ageUnit, age, birthCountry, birthStateTerritoryOrCountry, cityOfResidence, countyOfResidence, stateOrTerritoryOfResidence, countryOfResidence, maritalStatus, placeOfDeath, dateOfDeathMonth, dateOfDeathDay, educationByDegree, hispanicLatinoSpanish1, hispanicLatinoSpanish2, hispanicLatinoSpanish3, hispanicLatinoSpanish4, white, blackOrAfricanAmerican, americanIndianOrAlaskaNative, asian, asianIndian, chinese, filipino, japanese, korean, vietnamese, nativeHawaiianOrOtherPacificIslander, nativeHawaiian, guamanianOrChamorro, samoan, otherRace, unspecifiedRace, usualOccupationText, usualOccupationCode, usualIndustryText, kindOfBusinessIndustryCode, immediateCauseOfDeath, causeLeadingToImmediateCauseOfDeath, nextAntecedentCauseOfDeath, underlyingCauseOfDeath, victimWasPregnant, mannerOfDeathOnDC, dateOfInjuryMonth, dateOfInjuryDay, dateOfInjuryYear, timeOfInjury, notesColumn, injuredAtWork, autopsyPerformed, underlyingCauseOfDeathICD10Code, icd10TypeOfActivityWhenInjured, typeOfLocationWhereInjured, icd10TypeOfPlaceWhereInjured, multipleConditionsOnDC1, multipleConditionsOnDC2, multipleConditionsOnDC3, multipleConditionsOnDC4, multipleConditionsOnDC5, multipleConditionsOnDC6, multipleConditionsOnDC7, multipleConditionsOnDC8, multipleConditionsOnDC9, multipleConditionsOnDC10, zipCodeOfResidence, educationByNumberOfYears, datePronouncedDeadMonth, datePronouncedDeadDay, datePronouncedDeadYear, stateOrTerritoryWhereInjuryOccurred, countyWhereInjuryOccurred, countryOfResidence2, usCensusTractOfResidence, usCensusBlockGroupOfResidence, birthCountryIfOther, currentOrFormerMilitaryPersonnel, placeOfDeathIfOther, cityWhereInjuryOccurred, usCensusBlockGroupWhereInjuryOccurred, usCensusTractWhereInjuryOccurred, survivalTimeNumberOfUnits, unitOfTimeUsedInSurvivalTime, zipCodeWhereInjuryOccurred, mannerOfDeathPerAbstractor, otherSignificantConditionsContributingToDeath, howInjuryOccurred, otherAsian, otherAsianSpecify, otherPacificIslander, otherPacificIslanderSpecify, nameOfTheEnrolledOrPrincipalTribe, otherRaceSpecify);
    }

    @Override
    public String toString() {
        return "{" +
            " forceNewRecord='" + getForceNewRecord() + "'" +
            ", overwriteConflicts='" + getOverwriteConflicts() + "'" +
            ", incidentYear='" + getIncidentYear() + "'" +
            ", incidentNumber='" + getIncidentNumber() + "'" +
            ", nvdrsVictimNumber='" + getNvdrsVictimNumber() + "'" +
            ", last4CharactersOfDC='" + getLast4CharactersOfDC() + "'" +
            ", last4CharactersOfCME='" + getLast4CharactersOfCME() + "'" +
            ", firstInitialOfLastName='" + getFirstInitialOfLastName() + "'" +
            ", dayOfBirth='" + getDayOfBirth() + "'" +
            ", dateOfDeathYear='" + getDateOfDeathYear() + "'" +
            ", stateOrTerritoryOfDeath='" + getStateOrTerritoryOfDeath() + "'" +
            ", countyOfDeath='" + getCountyOfDeath() + "'" +
            ", sex='" + getSex() + "'" +
            ", ageUnit='" + getAgeUnit() + "'" +
            ", age='" + getAge() + "'" +
            ", birthCountry='" + getBirthCountry() + "'" +
            ", birthStateTerritoryOrCountry='" + getBirthStateTerritoryOrCountry() + "'" +
            ", cityOfResidence='" + getCityOfResidence() + "'" +
            ", countyOfResidence='" + getCountyOfResidence() + "'" +
            ", stateOrTerritoryOfResidence='" + getStateOrTerritoryOfResidence() + "'" +
            ", countryOfResidence='" + getCountryOfResidence() + "'" +
            ", maritalStatus='" + getMaritalStatus() + "'" +
            ", placeOfDeath='" + getPlaceOfDeath() + "'" +
            ", dateOfDeathMonth='" + getDateOfDeathMonth() + "'" +
            ", dateOfDeathDay='" + getDateOfDeathDay() + "'" +
            ", educationByDegree='" + getEducationByDegree() + "'" +
            ", hispanicLatinoSpanish1='" + getHispanicLatinoSpanish1() + "'" +
            ", hispanicLatinoSpanish2='" + getHispanicLatinoSpanish2() + "'" +
            ", hispanicLatinoSpanish3='" + getHispanicLatinoSpanish3() + "'" +
            ", hispanicLatinoSpanish4='" + getHispanicLatinoSpanish4() + "'" +
            ", white='" + getWhite() + "'" +
            ", blackOrAfricanAmerican='" + getBlackOrAfricanAmerican() + "'" +
            ", americanIndianOrAlaskaNative='" + getAmericanIndianOrAlaskaNative() + "'" +
            ", asian='" + getAsian() + "'" +
            ", asianIndian='" + getAsianIndian() + "'" +
            ", chinese='" + getChinese() + "'" +
            ", filipino='" + getFilipino() + "'" +
            ", japanese='" + getJapanese() + "'" +
            ", korean='" + getKorean() + "'" +
            ", vietnamese='" + getVietnamese() + "'" +
            ", nativeHawaiianOrOtherPacificIslander='" + getNativeHawaiianOrOtherPacificIslander() + "'" +
            ", nativeHawaiian='" + getNativeHawaiian() + "'" +
            ", guamanianOrChamorro='" + getGuamanianOrChamorro() + "'" +
            ", samoan='" + getSamoan() + "'" +
            ", otherRace='" + getOtherRace() + "'" +
            ", unspecifiedRace='" + getUnspecifiedRace() + "'" +
            ", usualOccupationText='" + getUsualOccupationText() + "'" +
            ", usualOccupationCode='" + getUsualOccupationCode() + "'" +
            ", usualIndustryText='" + getUsualIndustryText() + "'" +
            ", kindOfBusinessIndustryCode='" + getKindOfBusinessIndustryCode() + "'" +
            ", immediateCauseOfDeath='" + getImmediateCauseOfDeath() + "'" +
            ", causeLeadingToImmediateCauseOfDeath='" + getCauseLeadingToImmediateCauseOfDeath() + "'" +
            ", nextAntecedentCauseOfDeath='" + getNextAntecedentCauseOfDeath() + "'" +
            ", underlyingCauseOfDeath='" + getUnderlyingCauseOfDeath() + "'" +
            ", victimWasPregnant='" + getVictimWasPregnant() + "'" +
            ", mannerOfDeathOnDC='" + getMannerOfDeathOnDC() + "'" +
            ", dateOfInjuryMonth='" + getDateOfInjuryMonth() + "'" +
            ", dateOfInjuryDay='" + getDateOfInjuryDay() + "'" +
            ", dateOfInjuryYear='" + getDateOfInjuryYear() + "'" +
            ", timeOfInjury='" + getTimeOfInjury() + "'" +
            ", notesColumn='" + getNotesColumn() + "'" +
            ", injuredAtWork='" + getInjuredAtWork() + "'" +
            ", autopsyPerformed='" + getAutopsyPerformed() + "'" +
            ", underlyingCauseOfDeathICD10Code='" + getUnderlyingCauseOfDeathICD10Code() + "'" +
            ", icd10TypeOfActivityWhenInjured='" + getIcd10TypeOfActivityWhenInjured() + "'" +
            ", typeOfLocationWhereInjured='" + getTypeOfLocationWhereInjured() + "'" +
            ", icd10TypeOfPlaceWhereInjured='" + getIcd10TypeOfPlaceWhereInjured() + "'" +
            ", multipleConditionsOnDC1='" + getMultipleConditionsOnDC1() + "'" +
            ", multipleConditionsOnDC2='" + getMultipleConditionsOnDC2() + "'" +
            ", multipleConditionsOnDC3='" + getMultipleConditionsOnDC3() + "'" +
            ", multipleConditionsOnDC4='" + getMultipleConditionsOnDC4() + "'" +
            ", multipleConditionsOnDC5='" + getMultipleConditionsOnDC5() + "'" +
            ", multipleConditionsOnDC6='" + getMultipleConditionsOnDC6() + "'" +
            ", multipleConditionsOnDC7='" + getMultipleConditionsOnDC7() + "'" +
            ", multipleConditionsOnDC8='" + getMultipleConditionsOnDC8() + "'" +
            ", multipleConditionsOnDC9='" + getMultipleConditionsOnDC9() + "'" +
            ", multipleConditionsOnDC10='" + getMultipleConditionsOnDC10() + "'" +
            ", zipCodeOfResidence='" + getZipCodeOfResidence() + "'" +
            ", educationByNumberOfYears='" + getEducationByNumberOfYears() + "'" +
            ", datePronouncedDeadMonth='" + getDatePronouncedDeadMonth() + "'" +
            ", datePronouncedDeadDay='" + getDatePronouncedDeadDay() + "'" +
            ", datePronouncedDeadYear='" + getDatePronouncedDeadYear() + "'" +
            ", stateOrTerritoryWhereInjuryOccurred='" + getStateOrTerritoryWhereInjuryOccurred() + "'" +
            ", countyWhereInjuryOccurred='" + getCountyWhereInjuryOccurred() + "'" +
            ", countryOfResidence2='" + getCountryOfResidence2() + "'" +
            ", usCensusTractOfResidence='" + getUsCensusTractOfResidence() + "'" +
            ", usCensusBlockGroupOfResidence='" + getUsCensusBlockGroupOfResidence() + "'" +
            ", birthCountryIfOther='" + getBirthCountryIfOther() + "'" +
            ", currentOrFormerMilitaryPersonnel='" + getCurrentOrFormerMilitaryPersonnel() + "'" +
            ", placeOfDeathIfOther='" + getPlaceOfDeathIfOther() + "'" +
            ", cityWhereInjuryOccurred='" + getCityWhereInjuryOccurred() + "'" +
            ", usCensusBlockGroupWhereInjuryOccurred='" + getUsCensusBlockGroupWhereInjuryOccurred() + "'" +
            ", usCensusTractWhereInjuryOccurred='" + getUsCensusTractWhereInjuryOccurred() + "'" +
            ", survivalTimeNumberOfUnits='" + getSurvivalTimeNumberOfUnits() + "'" +
            ", unitOfTimeUsedInSurvivalTime='" + getUnitOfTimeUsedInSurvivalTime() + "'" +
            ", zipCodeWhereInjuryOccurred='" + getZipCodeWhereInjuryOccurred() + "'" +
            ", mannerOfDeathPerAbstractor='" + getMannerOfDeathPerAbstractor() + "'" +
            ", otherSignificantConditionsContributingToDeath='" + getOtherSignificantConditionsContributingToDeath() + "'" +
            ", howInjuryOccurred='" + getHowInjuryOccurred() + "'" +
            ", otherAsian='" + getOtherAsian() + "'" +
            ", otherAsianSpecify='" + getOtherAsianSpecify() + "'" +
            ", otherPacificIslander='" + getOtherPacificIslander() + "'" +
            ", otherPacificIslanderSpecify='" + getOtherPacificIslanderSpecify() + "'" +
            ", nameOfTheEnrolledOrPrincipalTribe='" + getNameOfTheEnrolledOrPrincipalTribe() + "'" +
            ", otherRaceSpecify='" + getOtherRaceSpecify() + "'" +
            "}";
    }
    
}