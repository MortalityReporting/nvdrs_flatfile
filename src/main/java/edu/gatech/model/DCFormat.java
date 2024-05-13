package edu.gatech.model;
import java.util.Objects;

import edu.gatech.model.enumvalueset.ActivityTypeFifthCharacter;
import edu.gatech.model.enumvalueset.AgeUnits;
import edu.gatech.model.enumvalueset.AutopsyPerformed;
import edu.gatech.model.enumvalueset.BirthPlaceCnt;
import edu.gatech.model.enumvalueset.DeathManner;
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
    protected SerialField<String> forceNewRecord = new SerialField<String>("Force New Record", 1, 1, String.class);
    protected SerialField<String> overwriteConflicts = new SerialField<String>("Overwrite Conflicts", 2, 2, String.class);
    protected SerialField<CharLimitedInteger> incidentYear = new SerialField<CharLimitedInteger>("Incident Year", 3, 6, CharLimitedInteger.class);
    protected SerialField<String> incidentNumber = new SerialField<String>("Incident Number", 7, 16, String.class);
    protected SerialField<CharLimitedInteger> nvdrsVictimNumber = new SerialField<CharLimitedInteger>("NVDRS Victim Number", 17, 20, CharLimitedInteger.class);
    protected SerialField<String> last4CharactersOfDC = new SerialField<String>("Last 4 characters of DC", 21, 24, String.class);
    protected SerialField<String> last4CharactersOfCME = new SerialField<String>("Last 4 characters of CME", 25, 28, String.class);
    protected SerialField<String> firstInitialOfLastName = new SerialField<String>("First initial of last name", 29, 29, String.class);
    protected SerialField<CharLimitedInteger> dayOfBirth = new SerialField<CharLimitedInteger>("Day of birth", 30, 31, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> dateOfDeathYear = new SerialField<CharLimitedInteger>("Date of Death - Year", 32, 35, CharLimitedInteger.class);
    protected SerialField<FIPSCodes> stateOrTerritoryOfDeath = new SerialField<FIPSCodes>("State or territory of death", 36, 37, FIPSCodes.class);
    protected SerialField<CharLimitedInteger> countyOfDeath = new SerialField<CharLimitedInteger>("County of death", 38, 40, CharLimitedInteger.class);
    protected SerialField<String> sex = new SerialField<String>("Sex", 41, 41, String.class);
    protected SerialField<AgeUnits> ageUnit = new SerialField<AgeUnits>("Age Unit", 42, 42, AgeUnits.class);
    protected SerialField<CharLimitedInteger> age = new SerialField<CharLimitedInteger>("Age", 43, 45, CharLimitedInteger.class);
    protected SerialField<BirthPlaceCnt> birthCountry = new SerialField<BirthPlaceCnt>("Birth country", 46, 47, BirthPlaceCnt.class);
    protected SerialField<CharLimitedInteger> birthStateTerritoryOrCountry = new SerialField<CharLimitedInteger>("Birth state, territory or country", 48, 49, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> cityOfResidence = new SerialField<CharLimitedInteger>("City of residence", 50, 54, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> countyOfResidence = new SerialField<CharLimitedInteger>("County of residence", 55, 57, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> stateOrTerritoryOfResidence = new SerialField<CharLimitedInteger>("State or territory of residence", 58, 59, CharLimitedInteger.class);
    protected SerialField<FIPSCountryCodes> countryOfResidence = new SerialField<FIPSCountryCodes>("Country of residence", 60, 61, FIPSCountryCodes.class);
    protected SerialField<MaritalStatus> maritalStatus = new SerialField<MaritalStatus>("Marital status", 62, 62, MaritalStatus.class);
    protected SerialField<DeathPlace> placeOfDeath = new SerialField<DeathPlace>("Place of Death", 63, 63, DeathPlace.class);
    protected SerialField<CharLimitedInteger> dateOfDeathMonth = new SerialField<CharLimitedInteger>("Date of Death - Month", 64, 65, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> dateOfDeathDay = new SerialField<CharLimitedInteger>("Date of Death - Day", 66, 67, CharLimitedInteger.class);
    protected SerialField<EducationLevel> educationByDegree = new SerialField<EducationLevel>("Education by degree", 68, 68, EducationLevel.class);
    protected SerialField<Ethnicity> hispanicLatinoSpanish1 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 69, 69, Ethnicity.class);
    protected SerialField<Ethnicity> hispanicLatinoSpanish2 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 70, 70, Ethnicity.class);
    protected SerialField<Ethnicity> hispanicLatinoSpanish3 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 71, 71, Ethnicity.class);
    protected SerialField<Ethnicity> hispanicLatinoSpanish4 = new SerialField<Ethnicity>("Hispanic/Latino/Spanish", 72, 72, Ethnicity.class);
    protected SerialField<YesOrBlank> white = new SerialField<YesOrBlank>("White", 73, 73, YesOrBlank.class);
    protected SerialField<YesOrBlank> blackOrAfricanAmerican = new SerialField<YesOrBlank>("Black or African American", 74, 74, YesOrBlank.class);
    protected SerialField<YesOrBlank> americanIndianOrAlaskaNative = new SerialField<YesOrBlank>("American Indian or Alaska Native", 75, 75, YesOrBlank.class);
    protected SerialField<YesOrBlank> asian = new SerialField<YesOrBlank>("Asian", 76, 76, YesOrBlank.class);
    protected SerialField<YesOrBlank> asianIndian = new SerialField<YesOrBlank>("Asian Indian", 77, 77, YesOrBlank.class);
    protected SerialField<YesOrBlank> chinese = new SerialField<YesOrBlank>("Chinese", 78, 78, YesOrBlank.class);
    protected SerialField<YesOrBlank> filipino = new SerialField<YesOrBlank>("Filipino", 79, 79, YesOrBlank.class);
    protected SerialField<YesOrBlank> japanese = new SerialField<YesOrBlank>("Japanese", 80, 80, YesOrBlank.class);
    protected SerialField<YesOrBlank> korean = new SerialField<YesOrBlank>("Korean", 81, 81, YesOrBlank.class);
    protected SerialField<YesOrBlank> vietnamese = new SerialField<YesOrBlank>("Vietnamese", 82, 82, YesOrBlank.class);
    protected SerialField<YesOrBlank> nativeHawaiianOrOtherPacificIslander = new SerialField<YesOrBlank>("Native Hawaiian or other Pacific Islander", 83, 83, YesOrBlank.class);
    protected SerialField<YesOrBlank> nativeHawaiian = new SerialField<YesOrBlank>("Native Hawaiian", 84, 84, YesOrBlank.class);
    protected SerialField<YesOrBlank> guamanianOrChamorro = new SerialField<YesOrBlank>("Guamanian or Chamorro", 85, 85, YesOrBlank.class);
    protected SerialField<YesOrBlank> samoan = new SerialField<YesOrBlank>("Samoan", 86, 86, YesOrBlank.class);
    protected SerialField<YesOrBlank> otherRace = new SerialField<YesOrBlank>("Other race", 87, 87, YesOrBlank.class);
    protected SerialField<UnspecifiedRace> unspecifiedRace = new SerialField<UnspecifiedRace>("Unspecified race", 88, 88, UnspecifiedRace.class);
    protected SerialField<String> usualOccupationText = new SerialField<String>("Usual occupation text", 89, 128, String.class);
    protected SerialField<CharLimitedInteger> usualOccupationCode = new SerialField<CharLimitedInteger>("Usual occupation code", 129, 132, CharLimitedInteger.class);
    protected SerialField<String> usualIndustryText = new SerialField<String>("Usual industry text", 133, 172, String.class);
    protected SerialField<CharLimitedInteger> kindOfBusinessIndustryCode = new SerialField<CharLimitedInteger>("Kind of business/industry code", 173, 176, CharLimitedInteger.class);
    protected SerialField<String> immediateCauseOfDeath = new SerialField<String>("Immediate cause of death", 177, 296, String.class);
    protected SerialField<String> causeLeadingToImmediateCauseOfDeath = new SerialField<String>("Cause leading to immediate cause of death", 297, 416, String.class);
    protected SerialField<String> nextAntecedentCauseOfDeath = new SerialField<String>("Next antecedent cause of death", 417, 536, String.class);
    protected SerialField<String> underlyingCauseOfDeath = new SerialField<String>("Underlying cause of death", 537, 656, String.class);
    protected SerialField<Pregnant> victimWasPregnant = new SerialField<Pregnant>("Victim was pregnant", 657, 657, Pregnant.class);
    protected SerialField<DeathManner> mannerOfDeathOnDC = new SerialField<DeathManner>("Manner of death on DC", 658, 658, DeathManner.class);
    protected SerialField<CharLimitedInteger> dateOfInjuryMonth = new SerialField<CharLimitedInteger>("Date of injury - Month", 659, 660, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> dateOfInjuryDay = new SerialField<CharLimitedInteger>("Date of injury - Day", 661, 662, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> dateOfInjuryYear = new SerialField<CharLimitedInteger>("Date of injury - Year", 663, 666, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> timeOfInjury = new SerialField<CharLimitedInteger>("Time of injury", 667, 670, CharLimitedInteger.class);
    protected SerialField<String> notesColumn = new SerialField<String>("(See Notes Column--used for interpretation of Time of Injury)", 671, 671, String.class);
    protected SerialField<InjuredAtWork> injuredAtWork = new SerialField<InjuredAtWork>("Injured at work", 672, 672, InjuredAtWork.class);
    protected SerialField<AutopsyPerformed> autopsyPerformed = new SerialField<AutopsyPerformed>("Autopsy performed", 673, 673, AutopsyPerformed.class);
    protected SerialField<String> underlyingCauseOfDeathICD10Code = new SerialField<String>("Underlying cause of death ICD10 code", 674, 681, String.class);
    protected SerialField<ActivityTypeFifthCharacter> icd10TypeOfActivityWhenInjured = new SerialField<ActivityTypeFifthCharacter>("ICD-10 Type of Activity when Injured (\"5th Character\")", 682, 682, ActivityTypeFifthCharacter.class);
    protected SerialField<InjuryLocation> typeOfLocationWhereInjured = new SerialField<InjuryLocation>("Type of location where injured", 683, 684, InjuryLocation.class);
    protected SerialField<PlaceTypeFourthCharacter> icd10TypeOfPlaceWhereInjured = new SerialField<PlaceTypeFourthCharacter>("ICD-10 Type of Place where Injured (\"4th Character\")", 685, 685, PlaceTypeFourthCharacter.class);
    protected SerialField<String> multipleConditionsOnDC1 = new SerialField<String>("Multiple conditions on DC (1)", 686, 693, String.class);
    protected SerialField<String> multipleConditionsOnDC2 = new SerialField<String>("Multiple conditions on DC (2)", 694, 701, String.class);
    protected SerialField<String> multipleConditionsOnDC3 = new SerialField<String>("Multiple conditions on DC (3)", 702, 709, String.class);
    protected SerialField<String> multipleConditionsOnDC4 = new SerialField<String>("Multiple conditions on DC (4)", 710, 717, String.class);
    protected SerialField<String> multipleConditionsOnDC5 = new SerialField<String>("Multiple conditions on DC (5)", 718, 725, String.class);
    protected SerialField<String> multipleConditionsOnDC6 = new SerialField<String>("Multiple conditions on DC (6)", 726, 733, String.class);
    protected SerialField<String> multipleConditionsOnDC7 = new SerialField<String>("Multiple conditions on DC (7)", 734, 741, String.class);
    protected SerialField<String> multipleConditionsOnDC8 = new SerialField<String>("Multiple conditions on DC (8)", 742, 749, String.class);
    protected SerialField<String> multipleConditionsOnDC9 = new SerialField<String>("Multiple conditions on DC (9)", 750, 757, String.class);
    protected SerialField<String> multipleConditionsOnDC10 = new SerialField<String>("Multiple conditions on DC (10)", 758, 765, String.class);
    protected SerialField<CharLimitedInteger> zipCodeOfResidence = new SerialField<CharLimitedInteger>("Zip code of residence", 766, 770, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> educationByNumberOfYears = new SerialField<CharLimitedInteger>("Education by number of years", 771, 772, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> datePronouncedDeadMonth = new SerialField<CharLimitedInteger>("Date pronounced dead - Month", 773, 774, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> datePronouncedDeadDay = new SerialField<CharLimitedInteger>("Date pronounced dead - Day", 775, 776, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> datePronouncedDeadYear = new SerialField<CharLimitedInteger>("Date pronounced dead - Year", 777, 780, CharLimitedInteger.class);
    protected SerialField<FIPSCodes> stateOrTerritoryWhereInjuryOccurred = new SerialField<FIPSCodes>("State or territory where injury occurred", 781, 782, FIPSCodes.class);
    protected SerialField<CharLimitedInteger> countyWhereInjuryOccurred = new SerialField<CharLimitedInteger>("County where injury occurred", 783, 785, CharLimitedInteger.class);
    protected SerialField<String> countryOfResidence2 = new SerialField<String>("Country of residence", 786, 830, String.class);
    protected SerialField<String> usCensusTractOfResidence = new SerialField<String>("US Census tract of residence", 831, 837, String.class);
    protected SerialField<String> usCensusBlockGroupOfResidence = new SerialField<String>("US Census block group of residence", 838, 838, String.class);
    protected SerialField<String> birthCountryIfOther = new SerialField<String>("Birth country if other", 839, 868, String.class);
    protected SerialField<CharLimitedInteger> currentOrFormerMilitaryPersonnel = new SerialField<CharLimitedInteger>("Current or former military personnel", 869, 869, CharLimitedInteger.class);
    protected SerialField<String> placeOfDeathIfOther = new SerialField<String>("Place of death if other", 870, 899, String.class);
    protected BlankSerialField unused = new BlankSerialField("Unused", 900, 1000);
    protected SerialField<CharLimitedInteger> cityWhereInjuryOccurred = new SerialField<CharLimitedInteger>("City where injury occurred", 1000, 1004, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> usCensusBlockGroupWhereInjuryOccurred = new SerialField<CharLimitedInteger>("US Census block group where injury occurred", 1005, 1005, CharLimitedInteger.class);
    protected SerialField<String> usCensusTractWhereInjuryOccurred = new SerialField<String>("US Census tract where injury occurred", 1006, 1012, String.class);
    protected SerialField<CharLimitedInteger> survivalTimeNumberOfUnits = new SerialField<CharLimitedInteger>("Survival time no. of units:", 1013, 1015, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> unitOfTimeUsedInSurvivalTime = new SerialField<CharLimitedInteger>("Unit of time used in survival time", 1016, 1016, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> zipCodeWhereInjuryOccurred = new SerialField<CharLimitedInteger>("ZIP Code where injury occurred", 1017, 1021, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> mannerOfDeathPerAbstractor = new SerialField<CharLimitedInteger>("Manner of death per abstractor", 1022, 1023, CharLimitedInteger.class);
    protected SerialField<String> otherSignificantConditionsContributingToDeath = new SerialField<String>("Other significant conditions contributing to death", 1024, 1263, String.class);
    protected SerialField<String> howInjuryOccurred = new SerialField<String>("How injury occurred", 1264, 1503, String.class);
    protected SerialField<String> otherAsian = new SerialField<String>("Other Asian", 1504, 1504, String.class);
    protected SerialField<String> otherAsianSpecify = new SerialField<String>("Other Asian Specify", 1505, 1624, String.class);
    protected SerialField<String> otherPacificIslander = new SerialField<String>("Other Pacific Islander", 1625, 1625, String.class);
    protected SerialField<String> otherPacificIslanderSpecify = new SerialField<String>("Other Pacific Islander Specify", 1626, 1745, String.class);
    protected SerialField<String> nameOfTheEnrolledOrPrincipalTribe = new SerialField<String>("Name of the enrolled or Principal tribe", 1746, 1865, String.class);
    protected SerialField<String> otherRaceSpecify = new SerialField<String>("Other Race Specify", 1866, 1985, String.class);



    public DCFormat() {

    }

    public DCFormat(String forceNewRecord, String overwriteConflicts, CharLimitedInteger incidentYear, String incidentNumber, CharLimitedInteger nvdrsVictimNumber, String last4CharactersOfDC, String last4CharactersOfCME, String firstInitialOfLastName, CharLimitedInteger dayOfBirth, CharLimitedInteger dateOfDeathYear, FIPSCodes stateOrTerritoryOfDeath, CharLimitedInteger countyOfDeath, String sex, AgeUnits ageUnit, CharLimitedInteger age, BirthPlaceCnt birthCountry, CharLimitedInteger birthStateTerritoryOrCountry, CharLimitedInteger cityOfResidence, CharLimitedInteger countyOfResidence, CharLimitedInteger stateOrTerritoryOfResidence, FIPSCountryCodes countryOfResidence, MaritalStatus maritalStatus, DeathPlace placeOfDeath, CharLimitedInteger dateOfDeathMonth, CharLimitedInteger dateOfDeathDay, EducationLevel educationByDegree, Ethnicity hispanicLatinoSpanish1, Ethnicity hispanicLatinoSpanish2, Ethnicity hispanicLatinoSpanish3, Ethnicity hispanicLatinoSpanish4, YesOrBlank white, YesOrBlank blackOrAfricanAmerican, YesOrBlank americanIndianOrAlaskaNative, YesOrBlank asian, YesOrBlank asianIndian, YesOrBlank chinese, YesOrBlank filipino, YesOrBlank japanese, YesOrBlank korean, YesOrBlank vietnamese, YesOrBlank nativeHawaiianOrOtherPacificIslander, YesOrBlank nativeHawaiian, YesOrBlank guamanianOrChamorro, YesOrBlank samoan, YesOrBlank otherRace, UnspecifiedRace unspecifiedRace, String usualOccupationText, CharLimitedInteger usualOccupationCode, String usualIndustryText, CharLimitedInteger kindOfBusinessIndustryCode, String immediateCauseOfDeath, String causeLeadingToImmediateCauseOfDeath, String nextAntecedentCauseOfDeath, String underlyingCauseOfDeath, Pregnant victimWasPregnant, DeathManner mannerOfDeathOnDC, CharLimitedInteger dateOfInjuryMonth, CharLimitedInteger dateOfInjuryDay, CharLimitedInteger dateOfInjuryYear, CharLimitedInteger timeOfInjury, String notesColumn, InjuredAtWork injuredAtWork, AutopsyPerformed autopsyPerformed, String underlyingCauseOfDeathICD10Code, ActivityTypeFifthCharacter icd10TypeOfActivityWhenInjured, InjuryLocation typeOfLocationWhereInjured, PlaceTypeFourthCharacter icd10TypeOfPlaceWhereInjured, String multipleConditionsOnDC1, String multipleConditionsOnDC2, String multipleConditionsOnDC3, String multipleConditionsOnDC4, String multipleConditionsOnDC5, String multipleConditionsOnDC6, String multipleConditionsOnDC7, String multipleConditionsOnDC8, String multipleConditionsOnDC9, String multipleConditionsOnDC10, CharLimitedInteger zipCodeOfResidence, CharLimitedInteger educationByNumberOfYears, CharLimitedInteger datePronouncedDeadMonth, CharLimitedInteger datePronouncedDeadDay, CharLimitedInteger datePronouncedDeadYear, FIPSCodes stateOrTerritoryWhereInjuryOccurred, CharLimitedInteger countyWhereInjuryOccurred, String countryOfResidence2, String usCensusTractOfResidence, String usCensusBlockGroupOfResidence, String birthCountryIfOther, CharLimitedInteger currentOrFormerMilitaryPersonnel, String placeOfDeathIfOther, CharLimitedInteger cityWhereInjuryOccurred, CharLimitedInteger usCensusBlockGroupWhereInjuryOccurred, String usCensusTractWhereInjuryOccurred, CharLimitedInteger survivalTimeNumberOfUnits, CharLimitedInteger unitOfTimeUsedInSurvivalTime, CharLimitedInteger zipCodeWhereInjuryOccurred, CharLimitedInteger mannerOfDeathPerAbstractor, String otherSignificantConditionsContributingToDeath, String howInjuryOccurred, String otherAsian, String otherAsianSpecify, String otherPacificIslander, String otherPacificIslanderSpecify, String nameOfTheEnrolledOrPrincipalTribe, String otherRaceSpecify) {
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

    public void setForceNewRecord(SerialField<String> forceNewRecord) {
        this.forceNewRecord = forceNewRecord;
    }

    public SerialField<String> getOverwriteConflicts() {
        return this.overwriteConflicts;
    }

    public void setOverwriteConflicts(SerialField<String> overwriteConflicts) {
        this.overwriteConflicts = overwriteConflicts;
    }

    public SerialField<CharLimitedInteger> getIncidentYear() {
        return this.incidentYear;
    }

    public void setIncidentYear(SerialField<CharLimitedInteger> incidentYear) {
        this.incidentYear = incidentYear;
    }

    public SerialField<String> getIncidentNumber() {
        return this.incidentNumber;
    }

    public void setIncidentNumber(SerialField<String> incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public SerialField<CharLimitedInteger> getNvdrsVictimNumber() {
        return this.nvdrsVictimNumber;
    }

    public void setNvdrsVictimNumber(SerialField<CharLimitedInteger> nvdrsVictimNumber) {
        this.nvdrsVictimNumber = nvdrsVictimNumber;
    }

    public SerialField<String> getLast4CharactersOfDC() {
        return this.last4CharactersOfDC;
    }

    public void setLast4CharactersOfDC(SerialField<String> last4CharactersOfDC) {
        this.last4CharactersOfDC = last4CharactersOfDC;
    }

    public SerialField<String> getLast4CharactersOfCME() {
        return this.last4CharactersOfCME;
    }

    public void setLast4CharactersOfCME(SerialField<String> last4CharactersOfCME) {
        this.last4CharactersOfCME = last4CharactersOfCME;
    }

    public SerialField<String> getFirstInitialOfLastName() {
        return this.firstInitialOfLastName;
    }

    public void setFirstInitialOfLastName(SerialField<String> firstInitialOfLastName) {
        this.firstInitialOfLastName = firstInitialOfLastName;
    }

    public SerialField<CharLimitedInteger> getDayOfBirth() {
        return this.dayOfBirth;
    }

    public void setDayOfBirth(SerialField<CharLimitedInteger> dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public SerialField<CharLimitedInteger> getDateOfDeathYear() {
        return this.dateOfDeathYear;
    }

    public void setDateOfDeathYear(SerialField<CharLimitedInteger> dateOfDeathYear) {
        this.dateOfDeathYear = dateOfDeathYear;
    }

    public SerialField<FIPSCodes> getStateOrTerritoryOfDeath() {
        return this.stateOrTerritoryOfDeath;
    }

    public void setStateOrTerritoryOfDeath(SerialField<FIPSCodes> stateOrTerritoryOfDeath) {
        this.stateOrTerritoryOfDeath = stateOrTerritoryOfDeath;
    }

    public SerialField<CharLimitedInteger> getCountyOfDeath() {
        return this.countyOfDeath;
    }

    public void setCountyOfDeath(SerialField<CharLimitedInteger> countyOfDeath) {
        this.countyOfDeath = countyOfDeath;
    }

    public SerialField<String> getSex() {
        return this.sex;
    }

    public void setSex(SerialField<String> sex) {
        this.sex = sex;
    }

    public SerialField<AgeUnits> getAgeUnit() {
        return this.ageUnit;
    }

    public void setAgeUnit(SerialField<AgeUnits> ageUnit) {
        this.ageUnit = ageUnit;
    }

    public SerialField<CharLimitedInteger> getAge() {
        return this.age;
    }

    public void setAge(SerialField<CharLimitedInteger> age) {
        this.age = age;
    }

    public SerialField<BirthPlaceCnt> getBirthCountry() {
        return this.birthCountry;
    }

    public void setBirthCountry(SerialField<BirthPlaceCnt> birthCountry) {
        this.birthCountry = birthCountry;
    }

    public SerialField<CharLimitedInteger> getBirthStateTerritoryOrCountry() {
        return this.birthStateTerritoryOrCountry;
    }

    public void setBirthStateTerritoryOrCountry(SerialField<CharLimitedInteger> birthStateTerritoryOrCountry) {
        this.birthStateTerritoryOrCountry = birthStateTerritoryOrCountry;
    }

    public SerialField<CharLimitedInteger> getCityOfResidence() {
        return this.cityOfResidence;
    }

    public void setCityOfResidence(SerialField<CharLimitedInteger> cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    public SerialField<CharLimitedInteger> getCountyOfResidence() {
        return this.countyOfResidence;
    }

    public void setCountyOfResidence(SerialField<CharLimitedInteger> countyOfResidence) {
        this.countyOfResidence = countyOfResidence;
    }

    public SerialField<CharLimitedInteger> getStateOrTerritoryOfResidence() {
        return this.stateOrTerritoryOfResidence;
    }

    public void setStateOrTerritoryOfResidence(SerialField<CharLimitedInteger> stateOrTerritoryOfResidence) {
        this.stateOrTerritoryOfResidence = stateOrTerritoryOfResidence;
    }

    public SerialField<FIPSCountryCodes> getCountryOfResidence() {
        return this.countryOfResidence;
    }

    public void setCountryOfResidence(SerialField<FIPSCountryCodes> countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public SerialField<MaritalStatus> getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(SerialField<MaritalStatus> maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public SerialField<DeathPlace> getPlaceOfDeath() {
        return this.placeOfDeath;
    }

    public void setPlaceOfDeath(SerialField<DeathPlace> placeOfDeath) {
        this.placeOfDeath = placeOfDeath;
    }

    public SerialField<CharLimitedInteger> getDateOfDeathMonth() {
        return this.dateOfDeathMonth;
    }

    public void setDateOfDeathMonth(SerialField<CharLimitedInteger> dateOfDeathMonth) {
        this.dateOfDeathMonth = dateOfDeathMonth;
    }

    public SerialField<CharLimitedInteger> getDateOfDeathDay() {
        return this.dateOfDeathDay;
    }

    public void setDateOfDeathDay(SerialField<CharLimitedInteger> dateOfDeathDay) {
        this.dateOfDeathDay = dateOfDeathDay;
    }

    public SerialField<EducationLevel> getEducationByDegree() {
        return this.educationByDegree;
    }

    public void setEducationByDegree(SerialField<EducationLevel> educationByDegree) {
        this.educationByDegree = educationByDegree;
    }

    public SerialField<Ethnicity> getHispanicLatinoSpanish1() {
        return this.hispanicLatinoSpanish1;
    }

    public void setHispanicLatinoSpanish1(SerialField<Ethnicity> hispanicLatinoSpanish1) {
        this.hispanicLatinoSpanish1 = hispanicLatinoSpanish1;
    }

    public SerialField<Ethnicity> getHispanicLatinoSpanish2() {
        return this.hispanicLatinoSpanish2;
    }

    public void setHispanicLatinoSpanish2(SerialField<Ethnicity> hispanicLatinoSpanish2) {
        this.hispanicLatinoSpanish2 = hispanicLatinoSpanish2;
    }

    public SerialField<Ethnicity> getHispanicLatinoSpanish3() {
        return this.hispanicLatinoSpanish3;
    }

    public void setHispanicLatinoSpanish3(SerialField<Ethnicity> hispanicLatinoSpanish3) {
        this.hispanicLatinoSpanish3 = hispanicLatinoSpanish3;
    }

    public SerialField<Ethnicity> getHispanicLatinoSpanish4() {
        return this.hispanicLatinoSpanish4;
    }

    public void setHispanicLatinoSpanish4(SerialField<Ethnicity> hispanicLatinoSpanish4) {
        this.hispanicLatinoSpanish4 = hispanicLatinoSpanish4;
    }

    public SerialField<YesOrBlank> getWhite() {
        return this.white;
    }

    public void setWhite(SerialField<YesOrBlank> white) {
        this.white = white;
    }

    public SerialField<YesOrBlank> getBlackOrAfricanAmerican() {
        return this.blackOrAfricanAmerican;
    }

    public void setBlackOrAfricanAmerican(SerialField<YesOrBlank> blackOrAfricanAmerican) {
        this.blackOrAfricanAmerican = blackOrAfricanAmerican;
    }

    public SerialField<YesOrBlank> getAmericanIndianOrAlaskaNative() {
        return this.americanIndianOrAlaskaNative;
    }

    public void setAmericanIndianOrAlaskaNative(SerialField<YesOrBlank> americanIndianOrAlaskaNative) {
        this.americanIndianOrAlaskaNative = americanIndianOrAlaskaNative;
    }

    public SerialField<YesOrBlank> getAsian() {
        return this.asian;
    }

    public void setAsian(SerialField<YesOrBlank> asian) {
        this.asian = asian;
    }

    public SerialField<YesOrBlank> getAsianIndian() {
        return this.asianIndian;
    }

    public void setAsianIndian(SerialField<YesOrBlank> asianIndian) {
        this.asianIndian = asianIndian;
    }

    public SerialField<YesOrBlank> getChinese() {
        return this.chinese;
    }

    public void setChinese(SerialField<YesOrBlank> chinese) {
        this.chinese = chinese;
    }

    public SerialField<YesOrBlank> getFilipino() {
        return this.filipino;
    }

    public void setFilipino(SerialField<YesOrBlank> filipino) {
        this.filipino = filipino;
    }

    public SerialField<YesOrBlank> getJapanese() {
        return this.japanese;
    }

    public void setJapanese(SerialField<YesOrBlank> japanese) {
        this.japanese = japanese;
    }

    public SerialField<YesOrBlank> getKorean() {
        return this.korean;
    }

    public void setKorean(SerialField<YesOrBlank> korean) {
        this.korean = korean;
    }

    public SerialField<YesOrBlank> getVietnamese() {
        return this.vietnamese;
    }

    public void setVietnamese(SerialField<YesOrBlank> vietnamese) {
        this.vietnamese = vietnamese;
    }

    public SerialField<YesOrBlank> getNativeHawaiianOrOtherPacificIslander() {
        return this.nativeHawaiianOrOtherPacificIslander;
    }

    public void setNativeHawaiianOrOtherPacificIslander(SerialField<YesOrBlank> nativeHawaiianOrOtherPacificIslander) {
        this.nativeHawaiianOrOtherPacificIslander = nativeHawaiianOrOtherPacificIslander;
    }

    public SerialField<YesOrBlank> getNativeHawaiian() {
        return this.nativeHawaiian;
    }

    public void setNativeHawaiian(SerialField<YesOrBlank> nativeHawaiian) {
        this.nativeHawaiian = nativeHawaiian;
    }

    public SerialField<YesOrBlank> getGuamanianOrChamorro() {
        return this.guamanianOrChamorro;
    }

    public void setGuamanianOrChamorro(SerialField<YesOrBlank> guamanianOrChamorro) {
        this.guamanianOrChamorro = guamanianOrChamorro;
    }

    public SerialField<YesOrBlank> getSamoan() {
        return this.samoan;
    }

    public void setSamoan(SerialField<YesOrBlank> samoan) {
        this.samoan = samoan;
    }

    public SerialField<YesOrBlank> getOtherRace() {
        return this.otherRace;
    }

    public void setOtherRace(SerialField<YesOrBlank> otherRace) {
        this.otherRace = otherRace;
    }

    public SerialField<UnspecifiedRace> getUnspecifiedRace() {
        return this.unspecifiedRace;
    }

    public void setUnspecifiedRace(SerialField<UnspecifiedRace> unspecifiedRace) {
        this.unspecifiedRace = unspecifiedRace;
    }

    public SerialField<String> getUsualOccupationText() {
        return this.usualOccupationText;
    }

    public void setUsualOccupationText(SerialField<String> usualOccupationText) {
        this.usualOccupationText = usualOccupationText;
    }

    public SerialField<CharLimitedInteger> getUsualOccupationCode() {
        return this.usualOccupationCode;
    }

    public void setUsualOccupationCode(SerialField<CharLimitedInteger> usualOccupationCode) {
        this.usualOccupationCode = usualOccupationCode;
    }

    public SerialField<String> getUsualIndustryText() {
        return this.usualIndustryText;
    }

    public void setUsualIndustryText(SerialField<String> usualIndustryText) {
        this.usualIndustryText = usualIndustryText;
    }

    public SerialField<CharLimitedInteger> getKindOfBusinessIndustryCode() {
        return this.kindOfBusinessIndustryCode;
    }

    public void setKindOfBusinessIndustryCode(SerialField<CharLimitedInteger> kindOfBusinessIndustryCode) {
        this.kindOfBusinessIndustryCode = kindOfBusinessIndustryCode;
    }

    public SerialField<String> getImmediateCauseOfDeath() {
        return this.immediateCauseOfDeath;
    }

    public void setImmediateCauseOfDeath(SerialField<String> immediateCauseOfDeath) {
        this.immediateCauseOfDeath = immediateCauseOfDeath;
    }

    public SerialField<String> getCauseLeadingToImmediateCauseOfDeath() {
        return this.causeLeadingToImmediateCauseOfDeath;
    }

    public void setCauseLeadingToImmediateCauseOfDeath(SerialField<String> causeLeadingToImmediateCauseOfDeath) {
        this.causeLeadingToImmediateCauseOfDeath = causeLeadingToImmediateCauseOfDeath;
    }

    public SerialField<String> getNextAntecedentCauseOfDeath() {
        return this.nextAntecedentCauseOfDeath;
    }

    public void setNextAntecedentCauseOfDeath(SerialField<String> nextAntecedentCauseOfDeath) {
        this.nextAntecedentCauseOfDeath = nextAntecedentCauseOfDeath;
    }

    public SerialField<String> getUnderlyingCauseOfDeath() {
        return this.underlyingCauseOfDeath;
    }

    public void setUnderlyingCauseOfDeath(SerialField<String> underlyingCauseOfDeath) {
        this.underlyingCauseOfDeath = underlyingCauseOfDeath;
    }

    public SerialField<Pregnant> getVictimWasPregnant() {
        return this.victimWasPregnant;
    }

    public void setVictimWasPregnant(SerialField<Pregnant> victimWasPregnant) {
        this.victimWasPregnant = victimWasPregnant;
    }

    public SerialField<DeathManner> getMannerOfDeathOnDC() {
        return this.mannerOfDeathOnDC;
    }

    public void setMannerOfDeathOnDC(SerialField<DeathManner> mannerOfDeathOnDC) {
        this.mannerOfDeathOnDC = mannerOfDeathOnDC;
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryMonth() {
        return this.dateOfInjuryMonth;
    }

    public void setDateOfInjuryMonth(SerialField<CharLimitedInteger> dateOfInjuryMonth) {
        this.dateOfInjuryMonth = dateOfInjuryMonth;
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryDay() {
        return this.dateOfInjuryDay;
    }

    public void setDateOfInjuryDay(SerialField<CharLimitedInteger> dateOfInjuryDay) {
        this.dateOfInjuryDay = dateOfInjuryDay;
    }

    public SerialField<CharLimitedInteger> getDateOfInjuryYear() {
        return this.dateOfInjuryYear;
    }

    public void setDateOfInjuryYear(SerialField<CharLimitedInteger> dateOfInjuryYear) {
        this.dateOfInjuryYear = dateOfInjuryYear;
    }

    public SerialField<CharLimitedInteger> getTimeOfInjury() {
        return this.timeOfInjury;
    }

    public void setTimeOfInjury(SerialField<CharLimitedInteger> timeOfInjury) {
        this.timeOfInjury = timeOfInjury;
    }

    public SerialField<String> getNotesColumn() {
        return this.notesColumn;
    }

    public void setNotesColumn(SerialField<String> notesColumn) {
        this.notesColumn = notesColumn;
    }

    public SerialField<InjuredAtWork> getInjuredAtWork() {
        return this.injuredAtWork;
    }

    public void setInjuredAtWork(SerialField<InjuredAtWork> injuredAtWork) {
        this.injuredAtWork = injuredAtWork;
    }

    public SerialField<AutopsyPerformed> getAutopsyPerformed() {
        return this.autopsyPerformed;
    }

    public void setAutopsyPerformed(SerialField<AutopsyPerformed> autopsyPerformed) {
        this.autopsyPerformed = autopsyPerformed;
    }

    public SerialField<String> getUnderlyingCauseOfDeathICD10Code() {
        return this.underlyingCauseOfDeathICD10Code;
    }

    public void setUnderlyingCauseOfDeathICD10Code(SerialField<String> underlyingCauseOfDeathICD10Code) {
        this.underlyingCauseOfDeathICD10Code = underlyingCauseOfDeathICD10Code;
    }

    public SerialField<ActivityTypeFifthCharacter> getIcd10TypeOfActivityWhenInjured() {
        return this.icd10TypeOfActivityWhenInjured;
    }

    public void setIcd10TypeOfActivityWhenInjured(SerialField<ActivityTypeFifthCharacter> icd10TypeOfActivityWhenInjured) {
        this.icd10TypeOfActivityWhenInjured = icd10TypeOfActivityWhenInjured;
    }

    public SerialField<InjuryLocation> getTypeOfLocationWhereInjured() {
        return this.typeOfLocationWhereInjured;
    }

    public void setTypeOfLocationWhereInjured(SerialField<InjuryLocation> typeOfLocationWhereInjured) {
        this.typeOfLocationWhereInjured = typeOfLocationWhereInjured;
    }

    public SerialField<PlaceTypeFourthCharacter> getIcd10TypeOfPlaceWhereInjured() {
        return this.icd10TypeOfPlaceWhereInjured;
    }

    public void setIcd10TypeOfPlaceWhereInjured(SerialField<PlaceTypeFourthCharacter> icd10TypeOfPlaceWhereInjured) {
        this.icd10TypeOfPlaceWhereInjured = icd10TypeOfPlaceWhereInjured;
    }

    public SerialField<String> getMultipleConditionsOnDC1() {
        return this.multipleConditionsOnDC1;
    }

    public void setMultipleConditionsOnDC1(SerialField<String> multipleConditionsOnDC1) {
        this.multipleConditionsOnDC1 = multipleConditionsOnDC1;
    }

    public SerialField<String> getMultipleConditionsOnDC2() {
        return this.multipleConditionsOnDC2;
    }

    public void setMultipleConditionsOnDC2(SerialField<String> multipleConditionsOnDC2) {
        this.multipleConditionsOnDC2 = multipleConditionsOnDC2;
    }

    public SerialField<String> getMultipleConditionsOnDC3() {
        return this.multipleConditionsOnDC3;
    }

    public void setMultipleConditionsOnDC3(SerialField<String> multipleConditionsOnDC3) {
        this.multipleConditionsOnDC3 = multipleConditionsOnDC3;
    }

    public SerialField<String> getMultipleConditionsOnDC4() {
        return this.multipleConditionsOnDC4;
    }

    public void setMultipleConditionsOnDC4(SerialField<String> multipleConditionsOnDC4) {
        this.multipleConditionsOnDC4 = multipleConditionsOnDC4;
    }

    public SerialField<String> getMultipleConditionsOnDC5() {
        return this.multipleConditionsOnDC5;
    }

    public void setMultipleConditionsOnDC5(SerialField<String> multipleConditionsOnDC5) {
        this.multipleConditionsOnDC5 = multipleConditionsOnDC5;
    }

    public SerialField<String> getMultipleConditionsOnDC6() {
        return this.multipleConditionsOnDC6;
    }

    public void setMultipleConditionsOnDC6(SerialField<String> multipleConditionsOnDC6) {
        this.multipleConditionsOnDC6 = multipleConditionsOnDC6;
    }

    public SerialField<String> getMultipleConditionsOnDC7() {
        return this.multipleConditionsOnDC7;
    }

    public void setMultipleConditionsOnDC7(SerialField<String> multipleConditionsOnDC7) {
        this.multipleConditionsOnDC7 = multipleConditionsOnDC7;
    }

    public SerialField<String> getMultipleConditionsOnDC8() {
        return this.multipleConditionsOnDC8;
    }

    public void setMultipleConditionsOnDC8(SerialField<String> multipleConditionsOnDC8) {
        this.multipleConditionsOnDC8 = multipleConditionsOnDC8;
    }

    public SerialField<String> getMultipleConditionsOnDC9() {
        return this.multipleConditionsOnDC9;
    }

    public void setMultipleConditionsOnDC9(SerialField<String> multipleConditionsOnDC9) {
        this.multipleConditionsOnDC9 = multipleConditionsOnDC9;
    }

    public SerialField<String> getMultipleConditionsOnDC10() {
        return this.multipleConditionsOnDC10;
    }

    public void setMultipleConditionsOnDC10(SerialField<String> multipleConditionsOnDC10) {
        this.multipleConditionsOnDC10 = multipleConditionsOnDC10;
    }

    public SerialField<CharLimitedInteger> getZipCodeOfResidence() {
        return this.zipCodeOfResidence;
    }

    public void setZipCodeOfResidence(SerialField<CharLimitedInteger> zipCodeOfResidence) {
        this.zipCodeOfResidence = zipCodeOfResidence;
    }

    public SerialField<CharLimitedInteger> getEducationByNumberOfYears() {
        return this.educationByNumberOfYears;
    }

    public void setEducationByNumberOfYears(SerialField<CharLimitedInteger> educationByNumberOfYears) {
        this.educationByNumberOfYears = educationByNumberOfYears;
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadMonth() {
        return this.datePronouncedDeadMonth;
    }

    public void setDatePronouncedDeadMonth(SerialField<CharLimitedInteger> datePronouncedDeadMonth) {
        this.datePronouncedDeadMonth = datePronouncedDeadMonth;
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadDay() {
        return this.datePronouncedDeadDay;
    }

    public void setDatePronouncedDeadDay(SerialField<CharLimitedInteger> datePronouncedDeadDay) {
        this.datePronouncedDeadDay = datePronouncedDeadDay;
    }

    public SerialField<CharLimitedInteger> getDatePronouncedDeadYear() {
        return this.datePronouncedDeadYear;
    }

    public void setDatePronouncedDeadYear(SerialField<CharLimitedInteger> datePronouncedDeadYear) {
        this.datePronouncedDeadYear = datePronouncedDeadYear;
    }

    public SerialField<FIPSCodes> getStateOrTerritoryWhereInjuryOccurred() {
        return this.stateOrTerritoryWhereInjuryOccurred;
    }

    public void setStateOrTerritoryWhereInjuryOccurred(SerialField<FIPSCodes> stateOrTerritoryWhereInjuryOccurred) {
        this.stateOrTerritoryWhereInjuryOccurred = stateOrTerritoryWhereInjuryOccurred;
    }

    public SerialField<CharLimitedInteger> getCountyWhereInjuryOccurred() {
        return this.countyWhereInjuryOccurred;
    }

    public void setCountyWhereInjuryOccurred(SerialField<CharLimitedInteger> countyWhereInjuryOccurred) {
        this.countyWhereInjuryOccurred = countyWhereInjuryOccurred;
    }

    public SerialField<String> getCountryOfResidence2() {
        return this.countryOfResidence2;
    }

    public void setCountryOfResidence2(SerialField<String> countryOfResidence2) {
        this.countryOfResidence2 = countryOfResidence2;
    }

    public SerialField<String> getUsCensusTractOfResidence() {
        return this.usCensusTractOfResidence;
    }

    public void setUsCensusTractOfResidence(SerialField<String> usCensusTractOfResidence) {
        this.usCensusTractOfResidence = usCensusTractOfResidence;
    }

    public SerialField<String> getUsCensusBlockGroupOfResidence() {
        return this.usCensusBlockGroupOfResidence;
    }

    public void setUsCensusBlockGroupOfResidence(SerialField<String> usCensusBlockGroupOfResidence) {
        this.usCensusBlockGroupOfResidence = usCensusBlockGroupOfResidence;
    }

    public SerialField<String> getBirthCountryIfOther() {
        return this.birthCountryIfOther;
    }

    public void setBirthCountryIfOther(SerialField<String> birthCountryIfOther) {
        this.birthCountryIfOther = birthCountryIfOther;
    }

    public SerialField<CharLimitedInteger> getCurrentOrFormerMilitaryPersonnel() {
        return this.currentOrFormerMilitaryPersonnel;
    }

    public void setCurrentOrFormerMilitaryPersonnel(SerialField<CharLimitedInteger> currentOrFormerMilitaryPersonnel) {
        this.currentOrFormerMilitaryPersonnel = currentOrFormerMilitaryPersonnel;
    }

    public SerialField<String> getPlaceOfDeathIfOther() {
        return this.placeOfDeathIfOther;
    }

    public void setPlaceOfDeathIfOther(SerialField<String> placeOfDeathIfOther) {
        this.placeOfDeathIfOther = placeOfDeathIfOther;
    }

    public SerialField<String> getUnused() {
        return this.unused;
    }

    public void setUnused(BlankSerialField unused) {
        this.unused = unused;
    }

    public SerialField<CharLimitedInteger> getCityWhereInjuryOccurred() {
        return this.cityWhereInjuryOccurred;
    }

    public void setCityWhereInjuryOccurred(SerialField<CharLimitedInteger> cityWhereInjuryOccurred) {
        this.cityWhereInjuryOccurred = cityWhereInjuryOccurred;
    }

    public SerialField<CharLimitedInteger> getUsCensusBlockGroupWhereInjuryOccurred() {
        return this.usCensusBlockGroupWhereInjuryOccurred;
    }

    public void setUsCensusBlockGroupWhereInjuryOccurred(SerialField<CharLimitedInteger> usCensusBlockGroupWhereInjuryOccurred) {
        this.usCensusBlockGroupWhereInjuryOccurred = usCensusBlockGroupWhereInjuryOccurred;
    }

    public SerialField<String> getUsCensusTractWhereInjuryOccurred() {
        return this.usCensusTractWhereInjuryOccurred;
    }

    public void setUsCensusTractWhereInjuryOccurred(SerialField<String> usCensusTractWhereInjuryOccurred) {
        this.usCensusTractWhereInjuryOccurred = usCensusTractWhereInjuryOccurred;
    }

    public SerialField<CharLimitedInteger> getSurvivalTimeNumberOfUnits() {
        return this.survivalTimeNumberOfUnits;
    }

    public void setSurvivalTimeNumberOfUnits(SerialField<CharLimitedInteger> survivalTimeNumberOfUnits) {
        this.survivalTimeNumberOfUnits = survivalTimeNumberOfUnits;
    }

    public SerialField<CharLimitedInteger> getUnitOfTimeUsedInSurvivalTime() {
        return this.unitOfTimeUsedInSurvivalTime;
    }

    public void setUnitOfTimeUsedInSurvivalTime(SerialField<CharLimitedInteger> unitOfTimeUsedInSurvivalTime) {
        this.unitOfTimeUsedInSurvivalTime = unitOfTimeUsedInSurvivalTime;
    }

    public SerialField<CharLimitedInteger> getZipCodeWhereInjuryOccurred() {
        return this.zipCodeWhereInjuryOccurred;
    }

    public void setZipCodeWhereInjuryOccurred(SerialField<CharLimitedInteger> zipCodeWhereInjuryOccurred) {
        this.zipCodeWhereInjuryOccurred = zipCodeWhereInjuryOccurred;
    }

    public SerialField<CharLimitedInteger> getMannerOfDeathPerAbstractor() {
        return this.mannerOfDeathPerAbstractor;
    }

    public void setMannerOfDeathPerAbstractor(SerialField<CharLimitedInteger> mannerOfDeathPerAbstractor) {
        this.mannerOfDeathPerAbstractor = mannerOfDeathPerAbstractor;
    }

    public SerialField<String> getOtherSignificantConditionsContributingToDeath() {
        return this.otherSignificantConditionsContributingToDeath;
    }

    public void setOtherSignificantConditionsContributingToDeath(SerialField<String> otherSignificantConditionsContributingToDeath) {
        this.otherSignificantConditionsContributingToDeath = otherSignificantConditionsContributingToDeath;
    }

    public SerialField<String> getHowInjuryOccurred() {
        return this.howInjuryOccurred;
    }

    public void setHowInjuryOccurred(SerialField<String> howInjuryOccurred) {
        this.howInjuryOccurred = howInjuryOccurred;
    }

    public SerialField<String> getOtherAsian() {
        return this.otherAsian;
    }

    public void setOtherAsian(SerialField<String> otherAsian) {
        this.otherAsian = otherAsian;
    }

    public SerialField<String> getOtherAsianSpecify() {
        return this.otherAsianSpecify;
    }

    public void setOtherAsianSpecify(SerialField<String> otherAsianSpecify) {
        this.otherAsianSpecify = otherAsianSpecify;
    }

    public SerialField<String> getOtherPacificIslander() {
        return this.otherPacificIslander;
    }

    public void setOtherPacificIslander(SerialField<String> otherPacificIslander) {
        this.otherPacificIslander = otherPacificIslander;
    }

    public SerialField<String> getOtherPacificIslanderSpecify() {
        return this.otherPacificIslanderSpecify;
    }

    public void setOtherPacificIslanderSpecify(SerialField<String> otherPacificIslanderSpecify) {
        this.otherPacificIslanderSpecify = otherPacificIslanderSpecify;
    }

    public SerialField<String> getNameOfTheEnrolledOrPrincipalTribe() {
        return this.nameOfTheEnrolledOrPrincipalTribe;
    }

    public void setNameOfTheEnrolledOrPrincipalTribe(SerialField<String> nameOfTheEnrolledOrPrincipalTribe) {
        this.nameOfTheEnrolledOrPrincipalTribe = nameOfTheEnrolledOrPrincipalTribe;
    }

    public SerialField<String> getOtherRaceSpecify() {
        return this.otherRaceSpecify;
    }

    public void setOtherRaceSpecify(SerialField<String> otherRaceSpecify) {
        this.otherRaceSpecify = otherRaceSpecify;
    }

    public DCFormat forceNewRecord(SerialField<String> forceNewRecord) {
        setForceNewRecord(forceNewRecord);
        return this;
    }

    public DCFormat overwriteConflicts(SerialField<String> overwriteConflicts) {
        setOverwriteConflicts(overwriteConflicts);
        return this;
    }

    public DCFormat incidentYear(SerialField<CharLimitedInteger> incidentYear) {
        setIncidentYear(incidentYear);
        return this;
    }

    public DCFormat incidentNumber(SerialField<String> incidentNumber) {
        setIncidentNumber(incidentNumber);
        return this;
    }

    public DCFormat nvdrsVictimNumber(SerialField<CharLimitedInteger> nvdrsVictimNumber) {
        setNvdrsVictimNumber(nvdrsVictimNumber);
        return this;
    }

    public DCFormat last4CharactersOfDC(SerialField<String> last4CharactersOfDC) {
        setLast4CharactersOfDC(last4CharactersOfDC);
        return this;
    }

    public DCFormat last4CharactersOfCME(SerialField<String> last4CharactersOfCME) {
        setLast4CharactersOfCME(last4CharactersOfCME);
        return this;
    }

    public DCFormat firstInitialOfLastName(SerialField<String> firstInitialOfLastName) {
        setFirstInitialOfLastName(firstInitialOfLastName);
        return this;
    }

    public DCFormat dayOfBirth(SerialField<CharLimitedInteger> dayOfBirth) {
        setDayOfBirth(dayOfBirth);
        return this;
    }

    public DCFormat dateOfDeathYear(SerialField<CharLimitedInteger> dateOfDeathYear) {
        setDateOfDeathYear(dateOfDeathYear);
        return this;
    }

    public DCFormat stateOrTerritoryOfDeath(SerialField<FIPSCodes> stateOrTerritoryOfDeath) {
        setStateOrTerritoryOfDeath(stateOrTerritoryOfDeath);
        return this;
    }

    public DCFormat countyOfDeath(SerialField<CharLimitedInteger> countyOfDeath) {
        setCountyOfDeath(countyOfDeath);
        return this;
    }

    public DCFormat sex(SerialField<String> sex) {
        setSex(sex);
        return this;
    }

    public DCFormat ageUnit(SerialField<AgeUnits> ageUnit) {
        setAgeUnit(ageUnit);
        return this;
    }

    public DCFormat age(SerialField<CharLimitedInteger> age) {
        setAge(age);
        return this;
    }

    public DCFormat birthCountry(SerialField<BirthPlaceCnt> birthCountry) {
        setBirthCountry(birthCountry);
        return this;
    }

    public DCFormat birthStateTerritoryOrCountry(SerialField<CharLimitedInteger> birthStateTerritoryOrCountry) {
        setBirthStateTerritoryOrCountry(birthStateTerritoryOrCountry);
        return this;
    }

    public DCFormat cityOfResidence(SerialField<CharLimitedInteger> cityOfResidence) {
        setCityOfResidence(cityOfResidence);
        return this;
    }

    public DCFormat countyOfResidence(SerialField<CharLimitedInteger> countyOfResidence) {
        setCountyOfResidence(countyOfResidence);
        return this;
    }

    public DCFormat stateOrTerritoryOfResidence(SerialField<CharLimitedInteger> stateOrTerritoryOfResidence) {
        setStateOrTerritoryOfResidence(stateOrTerritoryOfResidence);
        return this;
    }

    public DCFormat countryOfResidence(SerialField<FIPSCountryCodes> countryOfResidence) {
        setCountryOfResidence(countryOfResidence);
        return this;
    }

    public DCFormat maritalStatus(SerialField<MaritalStatus> maritalStatus) {
        setMaritalStatus(maritalStatus);
        return this;
    }

    public DCFormat placeOfDeath(SerialField<DeathPlace> placeOfDeath) {
        setPlaceOfDeath(placeOfDeath);
        return this;
    }

    public DCFormat dateOfDeathMonth(SerialField<CharLimitedInteger> dateOfDeathMonth) {
        setDateOfDeathMonth(dateOfDeathMonth);
        return this;
    }

    public DCFormat dateOfDeathDay(SerialField<CharLimitedInteger> dateOfDeathDay) {
        setDateOfDeathDay(dateOfDeathDay);
        return this;
    }

    public DCFormat educationByDegree(SerialField<EducationLevel> educationByDegree) {
        setEducationByDegree(educationByDegree);
        return this;
    }

    public DCFormat hispanicLatinoSpanish1(SerialField<Ethnicity> hispanicLatinoSpanish1) {
        setHispanicLatinoSpanish1(hispanicLatinoSpanish1);
        return this;
    }

    public DCFormat hispanicLatinoSpanish2(SerialField<Ethnicity> hispanicLatinoSpanish2) {
        setHispanicLatinoSpanish2(hispanicLatinoSpanish2);
        return this;
    }

    public DCFormat hispanicLatinoSpanish3(SerialField<Ethnicity> hispanicLatinoSpanish3) {
        setHispanicLatinoSpanish3(hispanicLatinoSpanish3);
        return this;
    }

    public DCFormat hispanicLatinoSpanish4(SerialField<Ethnicity> hispanicLatinoSpanish4) {
        setHispanicLatinoSpanish4(hispanicLatinoSpanish4);
        return this;
    }

    public DCFormat white(SerialField<YesOrBlank> white) {
        setWhite(white);
        return this;
    }

    public DCFormat blackOrAfricanAmerican(SerialField<YesOrBlank> blackOrAfricanAmerican) {
        setBlackOrAfricanAmerican(blackOrAfricanAmerican);
        return this;
    }

    public DCFormat americanIndianOrAlaskaNative(SerialField<YesOrBlank> americanIndianOrAlaskaNative) {
        setAmericanIndianOrAlaskaNative(americanIndianOrAlaskaNative);
        return this;
    }

    public DCFormat asian(SerialField<YesOrBlank> asian) {
        setAsian(asian);
        return this;
    }

    public DCFormat asianIndian(SerialField<YesOrBlank> asianIndian) {
        setAsianIndian(asianIndian);
        return this;
    }

    public DCFormat chinese(SerialField<YesOrBlank> chinese) {
        setChinese(chinese);
        return this;
    }

    public DCFormat filipino(SerialField<YesOrBlank> filipino) {
        setFilipino(filipino);
        return this;
    }

    public DCFormat japanese(SerialField<YesOrBlank> japanese) {
        setJapanese(japanese);
        return this;
    }

    public DCFormat korean(SerialField<YesOrBlank> korean) {
        setKorean(korean);
        return this;
    }

    public DCFormat vietnamese(SerialField<YesOrBlank> vietnamese) {
        setVietnamese(vietnamese);
        return this;
    }

    public DCFormat nativeHawaiianOrOtherPacificIslander(SerialField<YesOrBlank> nativeHawaiianOrOtherPacificIslander) {
        setNativeHawaiianOrOtherPacificIslander(nativeHawaiianOrOtherPacificIslander);
        return this;
    }

    public DCFormat nativeHawaiian(SerialField<YesOrBlank> nativeHawaiian) {
        setNativeHawaiian(nativeHawaiian);
        return this;
    }

    public DCFormat guamanianOrChamorro(SerialField<YesOrBlank> guamanianOrChamorro) {
        setGuamanianOrChamorro(guamanianOrChamorro);
        return this;
    }

    public DCFormat samoan(SerialField<YesOrBlank> samoan) {
        setSamoan(samoan);
        return this;
    }

    public DCFormat otherRace(SerialField<YesOrBlank> otherRace) {
        setOtherRace(otherRace);
        return this;
    }

    public DCFormat unspecifiedRace(SerialField<UnspecifiedRace> unspecifiedRace) {
        setUnspecifiedRace(unspecifiedRace);
        return this;
    }

    public DCFormat usualOccupationText(SerialField<String> usualOccupationText) {
        setUsualOccupationText(usualOccupationText);
        return this;
    }

    public DCFormat usualOccupationCode(SerialField<CharLimitedInteger> usualOccupationCode) {
        setUsualOccupationCode(usualOccupationCode);
        return this;
    }

    public DCFormat usualIndustryText(SerialField<String> usualIndustryText) {
        setUsualIndustryText(usualIndustryText);
        return this;
    }

    public DCFormat kindOfBusinessIndustryCode(SerialField<CharLimitedInteger> kindOfBusinessIndustryCode) {
        setKindOfBusinessIndustryCode(kindOfBusinessIndustryCode);
        return this;
    }

    public DCFormat immediateCauseOfDeath(SerialField<String> immediateCauseOfDeath) {
        setImmediateCauseOfDeath(immediateCauseOfDeath);
        return this;
    }

    public DCFormat causeLeadingToImmediateCauseOfDeath(SerialField<String> causeLeadingToImmediateCauseOfDeath) {
        setCauseLeadingToImmediateCauseOfDeath(causeLeadingToImmediateCauseOfDeath);
        return this;
    }

    public DCFormat nextAntecedentCauseOfDeath(SerialField<String> nextAntecedentCauseOfDeath) {
        setNextAntecedentCauseOfDeath(nextAntecedentCauseOfDeath);
        return this;
    }

    public DCFormat underlyingCauseOfDeath(SerialField<String> underlyingCauseOfDeath) {
        setUnderlyingCauseOfDeath(underlyingCauseOfDeath);
        return this;
    }

    public DCFormat victimWasPregnant(SerialField<Pregnant> victimWasPregnant) {
        setVictimWasPregnant(victimWasPregnant);
        return this;
    }

    public DCFormat mannerOfDeathOnDC(SerialField<DeathManner> mannerOfDeathOnDC) {
        setMannerOfDeathOnDC(mannerOfDeathOnDC);
        return this;
    }

    public DCFormat dateOfInjuryMonth(SerialField<CharLimitedInteger> dateOfInjuryMonth) {
        setDateOfInjuryMonth(dateOfInjuryMonth);
        return this;
    }

    public DCFormat dateOfInjuryDay(SerialField<CharLimitedInteger> dateOfInjuryDay) {
        setDateOfInjuryDay(dateOfInjuryDay);
        return this;
    }

    public DCFormat dateOfInjuryYear(SerialField<CharLimitedInteger> dateOfInjuryYear) {
        setDateOfInjuryYear(dateOfInjuryYear);
        return this;
    }

    public DCFormat timeOfInjury(SerialField<CharLimitedInteger> timeOfInjury) {
        setTimeOfInjury(timeOfInjury);
        return this;
    }

    public DCFormat notesColumn(SerialField<String> notesColumn) {
        setNotesColumn(notesColumn);
        return this;
    }

    public DCFormat injuredAtWork(SerialField<InjuredAtWork> injuredAtWork) {
        setInjuredAtWork(injuredAtWork);
        return this;
    }

    public DCFormat autopsyPerformed(SerialField<AutopsyPerformed> autopsyPerformed) {
        setAutopsyPerformed(autopsyPerformed);
        return this;
    }

    public DCFormat underlyingCauseOfDeathICD10Code(SerialField<String> underlyingCauseOfDeathICD10Code) {
        setUnderlyingCauseOfDeathICD10Code(underlyingCauseOfDeathICD10Code);
        return this;
    }

    public DCFormat icd10TypeOfActivityWhenInjured(SerialField<ActivityTypeFifthCharacter> icd10TypeOfActivityWhenInjured) {
        setIcd10TypeOfActivityWhenInjured(icd10TypeOfActivityWhenInjured);
        return this;
    }

    public DCFormat typeOfLocationWhereInjured(SerialField<InjuryLocation> typeOfLocationWhereInjured) {
        setTypeOfLocationWhereInjured(typeOfLocationWhereInjured);
        return this;
    }

    public DCFormat icd10TypeOfPlaceWhereInjured(SerialField<PlaceTypeFourthCharacter> icd10TypeOfPlaceWhereInjured) {
        setIcd10TypeOfPlaceWhereInjured(icd10TypeOfPlaceWhereInjured);
        return this;
    }

    public DCFormat multipleConditionsOnDC1(SerialField<String> multipleConditionsOnDC1) {
        setMultipleConditionsOnDC1(multipleConditionsOnDC1);
        return this;
    }

    public DCFormat multipleConditionsOnDC2(SerialField<String> multipleConditionsOnDC2) {
        setMultipleConditionsOnDC2(multipleConditionsOnDC2);
        return this;
    }

    public DCFormat multipleConditionsOnDC3(SerialField<String> multipleConditionsOnDC3) {
        setMultipleConditionsOnDC3(multipleConditionsOnDC3);
        return this;
    }

    public DCFormat multipleConditionsOnDC4(SerialField<String> multipleConditionsOnDC4) {
        setMultipleConditionsOnDC4(multipleConditionsOnDC4);
        return this;
    }

    public DCFormat multipleConditionsOnDC5(SerialField<String> multipleConditionsOnDC5) {
        setMultipleConditionsOnDC5(multipleConditionsOnDC5);
        return this;
    }

    public DCFormat multipleConditionsOnDC6(SerialField<String> multipleConditionsOnDC6) {
        setMultipleConditionsOnDC6(multipleConditionsOnDC6);
        return this;
    }

    public DCFormat multipleConditionsOnDC7(SerialField<String> multipleConditionsOnDC7) {
        setMultipleConditionsOnDC7(multipleConditionsOnDC7);
        return this;
    }

    public DCFormat multipleConditionsOnDC8(SerialField<String> multipleConditionsOnDC8) {
        setMultipleConditionsOnDC8(multipleConditionsOnDC8);
        return this;
    }

    public DCFormat multipleConditionsOnDC9(SerialField<String> multipleConditionsOnDC9) {
        setMultipleConditionsOnDC9(multipleConditionsOnDC9);
        return this;
    }

    public DCFormat multipleConditionsOnDC10(SerialField<String> multipleConditionsOnDC10) {
        setMultipleConditionsOnDC10(multipleConditionsOnDC10);
        return this;
    }

    public DCFormat zipCodeOfResidence(SerialField<CharLimitedInteger> zipCodeOfResidence) {
        setZipCodeOfResidence(zipCodeOfResidence);
        return this;
    }

    public DCFormat educationByNumberOfYears(SerialField<CharLimitedInteger> educationByNumberOfYears) {
        setEducationByNumberOfYears(educationByNumberOfYears);
        return this;
    }

    public DCFormat datePronouncedDeadMonth(SerialField<CharLimitedInteger> datePronouncedDeadMonth) {
        setDatePronouncedDeadMonth(datePronouncedDeadMonth);
        return this;
    }

    public DCFormat datePronouncedDeadDay(SerialField<CharLimitedInteger> datePronouncedDeadDay) {
        setDatePronouncedDeadDay(datePronouncedDeadDay);
        return this;
    }

    public DCFormat datePronouncedDeadYear(SerialField<CharLimitedInteger> datePronouncedDeadYear) {
        setDatePronouncedDeadYear(datePronouncedDeadYear);
        return this;
    }

    public DCFormat stateOrTerritoryWhereInjuryOccurred(SerialField<FIPSCodes> stateOrTerritoryWhereInjuryOccurred) {
        setStateOrTerritoryWhereInjuryOccurred(stateOrTerritoryWhereInjuryOccurred);
        return this;
    }

    public DCFormat countyWhereInjuryOccurred(SerialField<CharLimitedInteger> countyWhereInjuryOccurred) {
        setCountyWhereInjuryOccurred(countyWhereInjuryOccurred);
        return this;
    }

    public DCFormat countryOfResidence2(SerialField<String> countryOfResidence2) {
        setCountryOfResidence2(countryOfResidence2);
        return this;
    }

    public DCFormat usCensusTractOfResidence(SerialField<String> usCensusTractOfResidence) {
        setUsCensusTractOfResidence(usCensusTractOfResidence);
        return this;
    }

    public DCFormat usCensusBlockGroupOfResidence(SerialField<String> usCensusBlockGroupOfResidence) {
        setUsCensusBlockGroupOfResidence(usCensusBlockGroupOfResidence);
        return this;
    }

    public DCFormat birthCountryIfOther(SerialField<String> birthCountryIfOther) {
        setBirthCountryIfOther(birthCountryIfOther);
        return this;
    }

    public DCFormat currentOrFormerMilitaryPersonnel(SerialField<CharLimitedInteger> currentOrFormerMilitaryPersonnel) {
        setCurrentOrFormerMilitaryPersonnel(currentOrFormerMilitaryPersonnel);
        return this;
    }

    public DCFormat placeOfDeathIfOther(SerialField<String> placeOfDeathIfOther) {
        setPlaceOfDeathIfOther(placeOfDeathIfOther);
        return this;
    }

    public DCFormat cityWhereInjuryOccurred(SerialField<CharLimitedInteger> cityWhereInjuryOccurred) {
        setCityWhereInjuryOccurred(cityWhereInjuryOccurred);
        return this;
    }

    public DCFormat usCensusBlockGroupWhereInjuryOccurred(SerialField<CharLimitedInteger> usCensusBlockGroupWhereInjuryOccurred) {
        setUsCensusBlockGroupWhereInjuryOccurred(usCensusBlockGroupWhereInjuryOccurred);
        return this;
    }

    public DCFormat usCensusTractWhereInjuryOccurred(SerialField<String> usCensusTractWhereInjuryOccurred) {
        setUsCensusTractWhereInjuryOccurred(usCensusTractWhereInjuryOccurred);
        return this;
    }

    public DCFormat survivalTimeNumberOfUnits(SerialField<CharLimitedInteger> survivalTimeNumberOfUnits) {
        setSurvivalTimeNumberOfUnits(survivalTimeNumberOfUnits);
        return this;
    }

    public DCFormat unitOfTimeUsedInSurvivalTime(SerialField<CharLimitedInteger> unitOfTimeUsedInSurvivalTime) {
        setUnitOfTimeUsedInSurvivalTime(unitOfTimeUsedInSurvivalTime);
        return this;
    }

    public DCFormat zipCodeWhereInjuryOccurred(SerialField<CharLimitedInteger> zipCodeWhereInjuryOccurred) {
        setZipCodeWhereInjuryOccurred(zipCodeWhereInjuryOccurred);
        return this;
    }

    public DCFormat mannerOfDeathPerAbstractor(SerialField<CharLimitedInteger> mannerOfDeathPerAbstractor) {
        setMannerOfDeathPerAbstractor(mannerOfDeathPerAbstractor);
        return this;
    }

    public DCFormat otherSignificantConditionsContributingToDeath(SerialField<String> otherSignificantConditionsContributingToDeath) {
        setOtherSignificantConditionsContributingToDeath(otherSignificantConditionsContributingToDeath);
        return this;
    }

    public DCFormat howInjuryOccurred(SerialField<String> howInjuryOccurred) {
        setHowInjuryOccurred(howInjuryOccurred);
        return this;
    }

    public DCFormat otherAsian(SerialField<String> otherAsian) {
        setOtherAsian(otherAsian);
        return this;
    }

    public DCFormat otherAsianSpecify(SerialField<String> otherAsianSpecify) {
        setOtherAsianSpecify(otherAsianSpecify);
        return this;
    }

    public DCFormat otherPacificIslander(SerialField<String> otherPacificIslander) {
        setOtherPacificIslander(otherPacificIslander);
        return this;
    }

    public DCFormat otherPacificIslanderSpecify(SerialField<String> otherPacificIslanderSpecify) {
        setOtherPacificIslanderSpecify(otherPacificIslanderSpecify);
        return this;
    }

    public DCFormat nameOfTheEnrolledOrPrincipalTribe(SerialField<String> nameOfTheEnrolledOrPrincipalTribe) {
        setNameOfTheEnrolledOrPrincipalTribe(nameOfTheEnrolledOrPrincipalTribe);
        return this;
    }

    public DCFormat otherRaceSpecify(SerialField<String> otherRaceSpecify) {
        setOtherRaceSpecify(otherRaceSpecify);
        return this;
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