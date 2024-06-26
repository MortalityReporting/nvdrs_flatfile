package edu.gatech.model;

import edu.gatech.model.enumvalueset.AgeUnits;
import edu.gatech.model.enumvalueset.AutopsyPerformed;
import edu.gatech.model.enumvalueset.DeathManner;
import edu.gatech.model.enumvalueset.DeathPlace;
import edu.gatech.model.enumvalueset.EducationLevel;
import edu.gatech.model.enumvalueset.FIPSCodes;
import edu.gatech.model.enumvalueset.FIPSCountryCodes;
import edu.gatech.model.enumvalueset.InjuryLocation;
import edu.gatech.model.enumvalueset.MaritalStatus;
import edu.gatech.model.enumvalueset.MilitaryBackground;
import edu.gatech.model.enumvalueset.OneOrZero;
import edu.gatech.model.enumvalueset.YesOrBlank;

public class LECMEFormat extends BaseSerializedFormat{
    protected SerialField<YesOrBlank> forceNewRecord = new SerialField<YesOrBlank>("ForceNewRecord", 1, 1, YesOrBlank.class);
    protected SerialField<YesOrBlank> overwriteConflicts = new SerialField<YesOrBlank>("OverwriteConflicts", 2, 2, YesOrBlank.class);
    protected SerialField<CharLimitedInteger> incidentYear = new SerialField<CharLimitedInteger>("IncidentYear", 3, 6, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> incidentNumber = new SerialField<CharLimitedInteger>("IncidentNumber", 7, 16, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> victimNumber = new SerialField<CharLimitedInteger>("VictimNumber", 17, 20, CharLimitedInteger.class);
    protected SerialField<String> lastFourDCNumber = new SerialField<String>("LastFourDCNumber", 21, 24, String.class);
    protected SerialField<String> lastFourCMENumber = new SerialField<String>("LastFourCMENumber", 25, 28, String.class);
    protected SerialField<String> initialOfLastName = new SerialField<String>("InitialOfLastName", 29, 29, String.class);
    protected SerialField<CharLimitedInteger> birthDayOfMonth = new SerialField<CharLimitedInteger>("BirthDayofMonth", 30, 31, CharLimitedInteger.class);
    protected SerialField<DeathManner> deathMannerAbstractor = new SerialField<DeathManner>("DeathMannerAbstractor", 32, 33, DeathManner.class);
    protected SerialField<DeathManner> deathMannerDC = new SerialField<DeathManner>("DeathMannerDC", 34, 34, DeathManner.class);
    protected SerialField<DeathManner> deathMannerCME = new SerialField<DeathManner>("DeathMannerCME", 35, 35, DeathManner.class);
    protected SerialField<DeathManner> deathMannerLE = new SerialField<DeathManner>("DeathMannerLE", 36, 36, DeathManner.class);
    protected SerialField<CharLimitedInteger> deathDateYear = new SerialField<CharLimitedInteger>("DeathDateYear", 37, 40, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathDateMonth = new SerialField<CharLimitedInteger>("DeathDateMonth", 41, 42, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathDateDay = new SerialField<CharLimitedInteger>("DeathDateDay", 43, 44, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathState = new SerialField<CharLimitedInteger>("DeathState", 45, 46, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathCounty = new SerialField<CharLimitedInteger>("DeathCounty", 47, 49, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathPronouncedDateYear = new SerialField<CharLimitedInteger>("DeathPronouncedDateYear", 50, 53, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathPronouncedDateMonth = new SerialField<CharLimitedInteger>("DeathPronouncedDateMonth", 54, 55, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> deathPronouncedDateDay = new SerialField<CharLimitedInteger>("DeathPronouncedDateDay", 56, 57, CharLimitedInteger.class);
    protected SerialField<DeathPlace> deathPlace = new SerialField<DeathPlace>("DeathPlace", 58, 58, DeathPlace.class);
    protected SerialField<String> deathPlaceText = new SerialField<String>("DeathPlaceText", 59, 88, String.class);
    protected SerialField<AutopsyPerformed> autopsyPerformed = new SerialField<AutopsyPerformed>("AutopsyPerformed", 89, 89, AutopsyPerformed.class);
    protected SerialField<CharLimitedInteger> injuryDateYear = new SerialField<CharLimitedInteger>("InjuryDateYear", 90, 93, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> injuryDateMonth = new SerialField<CharLimitedInteger>("InjuryDateMonth", 94, 95, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> injuryDateDay = new SerialField<CharLimitedInteger>("InjuryDateDay", 96, 97, CharLimitedInteger.class);
    protected SerialField<String> injuryTime = new SerialField<String>("InjuryTime", 98, 101, String.class);
    protected SerialField<CharLimitedInteger> survivalTime = new SerialField<CharLimitedInteger>("SurvivalTime", 102, 104, CharLimitedInteger.class);
    protected SerialField<AgeUnits> survivalTimeUnit = new SerialField<AgeUnits>("SurvivalTimeUnit", 105, 105, AgeUnits.class);
    protected SerialField<InjuryLocation> injuryLocation = new SerialField<InjuryLocation>("InjuryLocation", 106, 107, InjuryLocation.class);
    protected SerialField<OneOrZero> injuredAtWork = new SerialField<OneOrZero>("InjuredAtWork", 108, 108, OneOrZero.class);
    protected SerialField<OneOrZero> injuredAtVictimHome = new SerialField<OneOrZero>("InjuredAtVictimHome", 109, 109, OneOrZero.class);
    protected SerialField<OneOrZero> eMSPresent = new SerialField<OneOrZero>("EMSPresent", 110, 110, OneOrZero.class);
    protected SerialField<OneOrZero> victimInCustody = new SerialField<OneOrZero>("VictimInCustody", 111, 111, OneOrZero.class);
    protected SerialField<OneOrZero> alcoholUseSuspected = new SerialField<OneOrZero>("AlcoholUseSuspected", 112, 112, OneOrZero.class);
    protected SerialField<FIPSCodes> injuryState = new SerialField<FIPSCodes>("InjuryState", 113, 114, FIPSCodes.class);
    protected SerialField<CharLimitedInteger> injuryCounty = new SerialField<CharLimitedInteger>("InjuryCounty", 115, 117, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> injuryCity = new SerialField<CharLimitedInteger>("InjuryCity", 118, 122, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> injuryZip = new SerialField<CharLimitedInteger>("InjuryZip", 123, 127, CharLimitedInteger.class);
    protected SerialField<String> censusTract = new SerialField<String>("CensusTract", 128, 134, String.class);
    protected SerialField<CharLimitedInteger> censusBlock = new SerialField<CharLimitedInteger>("CensusBlock", 135, 135, CharLimitedInteger.class);
    protected SerialField<OneOrZero> sexVictim = new SerialField<OneOrZero>("SexVictim", 136, 136, OneOrZero.class);
    protected SerialField<OneOrZero> sexualOrientation = new SerialField<OneOrZero>("SexualOrientation", 137, 137, OneOrZero.class);
    protected SerialField<OneOrZero> transgender = new SerialField<OneOrZero>("Transgender", 138, 138, OneOrZero.class);
    protected SerialField<CharLimitedInteger> age = new SerialField<CharLimitedInteger>("Age", 139, 141, CharLimitedInteger.class);
    protected SerialField<AgeUnits> ageUnit = new SerialField<AgeUnits>("AgeUnit", 142, 142, AgeUnits.class);
    protected SerialField<OneOrZero> ethnicityVictim = new SerialField<OneOrZero>("EthnicityVictim", 143, 143, OneOrZero.class);
    protected SerialField<OneOrZero> raceWhiteVictim = new SerialField<OneOrZero>("RaceWhiteVictim", 144, 144, OneOrZero.class);
    protected SerialField<OneOrZero> raceBlackVictim = new SerialField<OneOrZero>("RaceBlackVictim", 145, 145, OneOrZero.class);
    protected SerialField<OneOrZero> raceAmericanIndianVictim = new SerialField<OneOrZero>("RaceAmericanIndianVictim", 146, 146, OneOrZero.class);
    protected SerialField<OneOrZero> raceAsianVictim = new SerialField<OneOrZero>("RaceAsianVictim", 147, 147, OneOrZero.class);
    protected SerialField<OneOrZero> racePacificIslanderVictim = new SerialField<OneOrZero>("RacePacificIslanderVictim", 148, 148, OneOrZero.class);
    protected SerialField<OneOrZero> raceOtherVictim = new SerialField<OneOrZero>("RaceOtherVictim", 149, 149, OneOrZero.class);
    protected SerialField<OneOrZero> raceUnspecifiedVictim = new SerialField<OneOrZero>("RaceUnspecifiedVictim", 150, 150, OneOrZero.class);
    protected SerialField<CharLimitedInteger> heightFeet = new SerialField<CharLimitedInteger>("HeightFeet", 151, 151, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> heightInches = new SerialField<CharLimitedInteger>("HeightInches", 152, 153, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> weight = new SerialField<CharLimitedInteger>("Weight", 154, 156, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> pregnant = new SerialField<CharLimitedInteger>("Pregnant", 157, 157, CharLimitedInteger.class);
    protected SerialField<MaritalStatus> maritalStatus = new SerialField<MaritalStatus>("MaritalStatus", 158, 158, MaritalStatus.class);
    protected SerialField<MilitaryBackground> military = new SerialField<MilitaryBackground>("Military", 159, 159, MilitaryBackground.class);
    protected SerialField<OneOrZero> homeless = new SerialField<OneOrZero>("Homeless", 160, 160, OneOrZero.class);
    protected SerialField<OneOrZero> recentRelease = new SerialField<OneOrZero>("RecentRelease", 161, 161, OneOrZero.class);
    protected SerialField<EducationLevel> educationLevel = new SerialField<EducationLevel>("EducationLevel", 162, 162, EducationLevel.class);
    protected SerialField<CharLimitedInteger> educationYears = new SerialField<CharLimitedInteger>("EducationYears", 163, 164, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> industry = new SerialField<CharLimitedInteger>("Industry", 165, 168, CharLimitedInteger.class);
    protected SerialField<String> industryText = new SerialField<String>("IndustryText", 169, 218, String.class);
    protected SerialField<String> occupationText = new SerialField<String>("OccupationText", 219, 268, String.class);
    protected SerialField<CharLimitedInteger> usualOccupation = new SerialField<CharLimitedInteger>("UsualOccupation", 269, 272, CharLimitedInteger.class);
    protected SerialField<String> occupationCurrentText = new SerialField<String>("OccupationCurrentText", 273, 322, String.class);
    protected SerialField<CharLimitedInteger> birthPlace = new SerialField<CharLimitedInteger>("BirthPlace", 323, 324, CharLimitedInteger.class);
    protected SerialField<String> birthCountryOther = new SerialField<String>("BirthCountryOther", 325, 354, String.class);
    protected SerialField<FIPSCountryCodes> country = new SerialField<FIPSCountryCodes>("Country", 355, 356, FIPSCountryCodes.class);
    protected SerialField<FIPSCodes> residenceState = new SerialField<FIPSCodes>("ResidenceState", 357, 358, FIPSCodes.class);
    protected SerialField<CharLimitedInteger> residenceCounty = new SerialField<CharLimitedInteger>("ResidenceCounty", 359, 361, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> residenceCity = new SerialField<CharLimitedInteger>("ResidenceCity", 362, 366, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> residenceZip = new SerialField<CharLimitedInteger>("ResidenceZip", 367, 371, CharLimitedInteger.class);
    protected SerialField<String> residenceCensusTract = new SerialField<String>("ResidenceCensusTract", 372, 378, String.class);
    protected SerialField<CharLimitedInteger> residenceCensusBlock = new SerialField<CharLimitedInteger>("ResidenceCensusBlock", 379, 379, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> toxicologyNotAvailable = new SerialField<CharLimitedInteger>("ToxicologyNotAvailable", 380, 380, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> specimensDateYear = new SerialField<CharLimitedInteger>("SpecimensDateYear", 381, 384, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> specimensDateMonth = new SerialField<CharLimitedInteger>("SpecimensDateMonth", 385, 386, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> specimensDateDay = new SerialField<CharLimitedInteger>("SpecimensDateDay", 387, 388, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> specimensTime = new SerialField<CharLimitedInteger>("SpecimensTime", 389, 392, CharLimitedInteger.class);
    protected SerialField<OneOrZero> alcoholTested = new SerialField<OneOrZero>("AlcoholTested", 393, 393, OneOrZero.class);
    protected SerialField<OneOrZero> alcoholResult = new SerialField<OneOrZero>("AlcoholResult", 394, 394, OneOrZero.class);
    protected SerialField<CharLimitedInteger> alcoholLevel = new SerialField<CharLimitedInteger>("AlcoholLevel", 395, 397, CharLimitedInteger.class);
    protected SerialField<OneOrZero> amphetamineTested = new SerialField<OneOrZero>("AmphetamineTested", 398, 398, OneOrZero.class);
    protected SerialField<OneOrZero> amphetamineResult = new SerialField<OneOrZero>("AmphetamineResult", 399, 399, OneOrZero.class);
    protected SerialField<OneOrZero> anticonvulsantsTested = new SerialField<OneOrZero>("AnticonvulsantsTested", 400, 400, OneOrZero.class);
    protected SerialField<OneOrZero> anticonvulsantsResult = new SerialField<OneOrZero>("AnticonvulsantsResult", 401, 401, OneOrZero.class);
    protected SerialField<OneOrZero> antidepressantTested = new SerialField<OneOrZero>("AntiDepressantTested", 402, 402, OneOrZero.class);
    protected SerialField<OneOrZero> antidepressantResult = new SerialField<OneOrZero>("AntiDepressantResult", 403, 403, OneOrZero.class);
    protected SerialField<OneOrZero> antipsychoticTested = new SerialField<OneOrZero>("AntiPsychoticTested", 404, 404, OneOrZero.class);
    protected SerialField<OneOrZero> antipsychoticResult = new SerialField<OneOrZero>("AntiPsychoticResult", 405, 405, OneOrZero.class);
    protected SerialField<OneOrZero> barbituratesTested = new SerialField<OneOrZero>("BarbituratesTested", 406, 406, OneOrZero.class);
    protected SerialField<OneOrZero> barbituratesResult = new SerialField<OneOrZero>("BarbituratesResult", 407, 407, OneOrZero.class);
    protected SerialField<OneOrZero> benzodiazepinesTested = new SerialField<OneOrZero>("BenzodiazepinesTested", 408, 408, OneOrZero.class);
    protected SerialField<OneOrZero> benzodiazepinesResult = new SerialField<OneOrZero>("BenzodiazepinesResult", 409, 409, OneOrZero.class);
    protected SerialField<OneOrZero> carbonMonoxideTested = new SerialField<OneOrZero>("CarbonMonoxideTested", 410, 410, OneOrZero.class);
    protected SerialField<OneOrZero> carbonMonoxideResult = new SerialField<OneOrZero>("CarbonMonoxideResult", 411, 411, OneOrZero.class);
    protected SerialField<OneOrZero> carbonMonoxideSource = new SerialField<OneOrZero>("CarbonMonoxideSource", 412, 412, OneOrZero.class);
    protected SerialField<OneOrZero> cocaineTested = new SerialField<OneOrZero>("CocaineTested", 413, 413, OneOrZero.class);
    protected SerialField<OneOrZero> cocaineResult = new SerialField<OneOrZero>("CocaineResult", 414, 414, OneOrZero.class);
    protected SerialField<OneOrZero> marijuanaTested = new SerialField<OneOrZero>("MarijuanaTested", 415, 415, OneOrZero.class);
    protected SerialField<OneOrZero> marijuanaResult = new SerialField<OneOrZero>("MarijuanaResult", 416, 416, OneOrZero.class);
    protected SerialField<OneOrZero> muscleRelaxorTested = new SerialField<OneOrZero>("MuscleRelaxorTested", 417, 417, OneOrZero.class);
    protected SerialField<OneOrZero> muscleRelaxorResult = new SerialField<OneOrZero>("MuscleRelaxorResult", 418, 418, OneOrZero.class);
    protected SerialField<OneOrZero> opiateTested = new SerialField<OneOrZero>("OpiateTested", 419, 419, OneOrZero.class);
    protected SerialField<OneOrZero> opiateResult = new SerialField<OneOrZero>("OpiateResult", 420, 420, OneOrZero.class);
    protected SerialField<CharLimitedInteger> numberWounds = new SerialField<CharLimitedInteger>("NumberWounds", 421, 422, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> numberBullets = new SerialField<CharLimitedInteger>("NumberBullets", 423, 424, CharLimitedInteger.class);
    protected SerialField<OneOrZero> woundToHead = new SerialField<OneOrZero>("WoundToHead", 425, 425, OneOrZero.class);
    protected SerialField<OneOrZero> woundToFace = new SerialField<OneOrZero>("WoundToFace", 426, 426, OneOrZero.class);
    protected SerialField<OneOrZero> woundToNeck = new SerialField<OneOrZero>("WoundToNeck", 427, 427, OneOrZero.class);
    protected SerialField<OneOrZero> woundToUpperExtremity = new SerialField<OneOrZero>("WoundToUpperExtremity", 428, 428, OneOrZero.class);
    protected SerialField<OneOrZero> woundToSpine = new SerialField<OneOrZero>("WoundToSpine", 429, 429, OneOrZero.class);
    protected SerialField<OneOrZero> woundToThorax = new SerialField<OneOrZero>("WoundToThorax", 430, 430, OneOrZero.class);
    protected SerialField<OneOrZero> woundToAbdomen = new SerialField<OneOrZero>("WoundToAbdomen", 431, 431, OneOrZero.class);
    protected SerialField<OneOrZero> woundToLowerExtremity = new SerialField<OneOrZero>("WoundToLowerExtremity", 432, 432, OneOrZero.class);
    protected SerialField<OneOrZero> circumstancesKnownCME = new SerialField<OneOrZero>("CircumstancesKnownCME", 433, 433, OneOrZero.class);
    protected SerialField<OneOrZero> abusedAsChildCME = new SerialField<OneOrZero>("AbusedAsChildCME", 434, 434, OneOrZero.class);
    protected SerialField<OneOrZero> alcoholProblemCME = new SerialField<OneOrZero>("AlcoholProblemCME", 435, 435, OneOrZero.class);
    protected SerialField<OneOrZero> argumentCME = new SerialField<OneOrZero>("ArgumentCME", 436, 436, OneOrZero.class);
    protected SerialField<OneOrZero> argumentOtherCME = new SerialField<OneOrZero>("ArgumentOtherCME", 437, 437, OneOrZero.class);
    protected SerialField<OneOrZero> argumentTimingCME = new SerialField<OneOrZero>("ArgumentTimingCME", 438, 438, OneOrZero.class);
    protected SerialField<OneOrZero> brawlCME = new SerialField<OneOrZero>("BrawlCME", 439, 439, OneOrZero.class);
    protected SerialField<OneOrZero> bulletRicochetCME = new SerialField<OneOrZero>("BulletRicochetCME", 440, 440, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderCME = new SerialField<OneOrZero>("BystanderCME", 441, 441, OneOrZero.class);
    protected SerialField<OneOrZero> celebratoryFiringCME = new SerialField<OneOrZero>("CelebratoryFiringCME", 442, 442, OneOrZero.class);
    protected SerialField<OneOrZero> circumstancesOtherCME = new SerialField<OneOrZero>("CircumstancesOtherCME", 443, 443, OneOrZero.class);
    protected SerialField<String> circumstancesOtherTextCME = new SerialField<String>("CircumstancesOtherTextCME", 444, 698, String.class);
    protected SerialField<OneOrZero> crisisProstitutionCME = new SerialField<OneOrZero>("CrisisProstitutionCME", 699, 699, OneOrZero.class);
    protected SerialField<OneOrZero> crisisAlcoholProblemCME = new SerialField<OneOrZero>("CrisisAlcoholProblemCME", 700, 700, OneOrZero.class);
    protected SerialField<OneOrZero> crisisCivilLegalCME = new SerialField<OneOrZero>("CrisisCivilLegalCME", 701, 701, OneOrZero.class);
    protected SerialField<OneOrZero> crisisCriminalCME = new SerialField<OneOrZero>("CrisisCriminalCME", 702, 702, OneOrZero.class);
    protected SerialField<OneOrZero> crisisDisasterExposureCME = new SerialField<OneOrZero>("CrisisDisasterExposureCME", 703, 703, OneOrZero.class);
    protected SerialField<OneOrZero> crisisEvictionCME = new SerialField<OneOrZero>("CrisisEvictionCME", 704, 704, OneOrZero.class);
    protected SerialField<OneOrZero> crisisFamilyStressorCME = new SerialField<OneOrZero>("CrisisFamilyStressorCME", 705, 705, OneOrZero.class);
    protected SerialField<OneOrZero> crisisFinancialCME = new SerialField<OneOrZero>("CrisisFinancialCME", 706, 706, OneOrZero.class);
    protected SerialField<OneOrZero> crisisIntimatePartnerProblemCME = new SerialField<OneOrZero>("CrisisIntimatePartnerProblemCME", 707, 707, OneOrZero.class);
    protected SerialField<OneOrZero> crisisJealousyCME = new SerialField<OneOrZero>("CrisisJealousyCME", 708, 708, OneOrZero.class);
    protected SerialField<OneOrZero> crisisJobCME = new SerialField<OneOrZero>("CrisisJobCME", 709, 709, OneOrZero.class);
    protected SerialField<OneOrZero> crisisMentalHealthCME = new SerialField<OneOrZero>("CrisisMentalHealthCME", 710, 710, OneOrZero.class);
    protected SerialField<OneOrZero> crisisOtherAddictionCME = new SerialField<OneOrZero>("CrisisOtherAddictionCME", 711, 711, OneOrZero.class);
    protected SerialField<OneOrZero> crisisPhysicalHealthCME = new SerialField<OneOrZero>("CrisisPhysicalHealthCME", 712, 712, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherCME = new SerialField<OneOrZero>("CrisisRelatedDeathFriendOrFamilyOtherCME", 713, 713, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyCME = new SerialField<OneOrZero>("CrisisRelatedSuicideFriendOrFamilyCME", 714, 714, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelationshipProblemOtherCME = new SerialField<OneOrZero>("CrisisRelationshipProblemOtherCME", 715, 715, OneOrZero.class);
    protected SerialField<OneOrZero> crisisSchoolCME = new SerialField<OneOrZero>("CrisisSchoolCME", 716, 716, OneOrZero.class);
    protected SerialField<OneOrZero> crisisStalkingCME = new SerialField<OneOrZero>("CrisisStalkingCME", 717, 717, OneOrZero.class);
    protected SerialField<OneOrZero> crisisSubstanceAbuseCME = new SerialField<OneOrZero>("CrisisSubstanceAbuseCME", 718, 718, OneOrZero.class);
    protected SerialField<OneOrZero> deathAbuseCME = new SerialField<OneOrZero>("DeathAbuseCME", 719, 719, OneOrZero.class);
    protected SerialField<OneOrZero> deathFriendOrFamilyOtherCME = new SerialField<OneOrZero>("DeathFriendOrFamilyOtherCME", 720, 720, OneOrZero.class);
    protected SerialField<OneOrZero> depressedMoodCME = new SerialField<OneOrZero>("DepressedMoodCME", 721, 721, OneOrZero.class);
    protected SerialField<OneOrZero> disasterExposureCME = new SerialField<OneOrZero>("DisasterExposureCME", 722, 722, OneOrZero.class);
    protected SerialField<OneOrZero> disclosedIntentToWhomCME = new SerialField<OneOrZero>("DisclosedIntentToWhomCME", 723, 723, OneOrZero.class);
    protected SerialField<OneOrZero> driveByShootingCME = new SerialField<OneOrZero>("DriveByShootingCME", 724, 724, OneOrZero.class);
    protected SerialField<OneOrZero> drugInvolvementCME = new SerialField<OneOrZero>("DrugInvolvementCME", 725, 725, OneOrZero.class);
    protected SerialField<OneOrZero> evictionOrLossOfHomeCME = new SerialField<OneOrZero>("EvictionOrLossOfHomeCME", 726, 726, OneOrZero.class);
    protected SerialField<OneOrZero> fightBetweenTwoPeopleCME = new SerialField<OneOrZero>("FightBetweenTwoPeopleCME", 727, 727, OneOrZero.class);
    protected SerialField<OneOrZero> financialProblemCME = new SerialField<OneOrZero>("FinancialProblemCME", 728, 728, OneOrZero.class);
    protected SerialField<OneOrZero> unused1 = new SerialField<OneOrZero>("UNUSED1", 729, 729, OneOrZero.class);
    protected SerialField<OneOrZero> gangRelatedCME = new SerialField<OneOrZero>("GangRelatedCME", 730, 730, OneOrZero.class);
    protected SerialField<OneOrZero> gunCleaningCME = new SerialField<OneOrZero>("GunCleaningCME", 731, 731, OneOrZero.class);
    protected SerialField<OneOrZero> gunDefectMalfunctionCME = new SerialField<OneOrZero>("GunDefectMalfunctionCME", 732, 732, OneOrZero.class);
    protected SerialField<OneOrZero> gunDroppedCME = new SerialField<OneOrZero>("GunDroppedCME", 733, 733, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredHolsteringCME = new SerialField<OneOrZero>("GunFiredHolsteringCME", 734, 734, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredLoadingUnloadingCME = new SerialField<OneOrZero>("GunFiredLoadingUnloadingCME", 735, 735, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredOperatingSafetyLockCME = new SerialField<OneOrZero>("GunFiredOperatingSafetyLockCME", 736, 736, OneOrZero.class);
    protected SerialField<OneOrZero> gunPlayingCME = new SerialField<OneOrZero>("GunPlayingCME", 737, 737, OneOrZero.class);
    protected SerialField<OneOrZero> gunShowingCME = new SerialField<OneOrZero>("GunShowingCME", 738, 738, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtSafetyEngagedCME = new SerialField<OneOrZero>("GunThoughtSafetyEngagedCME", 739, 739, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtToyCME = new SerialField<OneOrZero>("GunThoughtToyCME", 740, 740, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedCME = new SerialField<OneOrZero>("GunThoughtUnloadedMagazineDisengagedCME", 741, 741, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtUnloadedOtherCME = new SerialField<OneOrZero>("GunThoughtUnloadedOtherCME", 742, 742, OneOrZero.class);
    protected SerialField<OneOrZero> gunUnintentionallyPulledTriggerCME = new SerialField<OneOrZero>("GunUnintentionallyPulledTriggerCME", 743, 743, OneOrZero.class);
    protected SerialField<OneOrZero> hateCrimeCME = new SerialField<OneOrZero>("HateCrimeCME", 744, 744, OneOrZero.class);
    protected SerialField<OneOrZero> hisoryMentalIllnessTreatmentCME = new SerialField<OneOrZero>("hisoryMentalIllnessTreatmentCME", 745, 745, OneOrZero.class);
    protected SerialField<OneOrZero> huntingCME = new SerialField<OneOrZero>("HuntingCME", 746, 746, OneOrZero.class);
    protected SerialField<OneOrZero> interpersonalViolencePerpetratorCME = new SerialField<OneOrZero>("InterpersonalViolencePerpetratorCME", 747, 747, OneOrZero.class);
    protected SerialField<OneOrZero> interpersonalViolenceVictimCME = new SerialField<OneOrZero>("InterpersonalViolenceVictimCME", 748, 748, OneOrZero.class);
    protected SerialField<OneOrZero> intervenerAssistingVictimCME = new SerialField<OneOrZero>("IntervenerAssistingVictimCME", 749, 749, OneOrZero.class);
    protected SerialField<OneOrZero> intimatePartnerProblemCME = new SerialField<OneOrZero>("IntimatePartnerProblemCME", 750, 750, OneOrZero.class);
    protected SerialField<OneOrZero> intimatePartnerViolenceCME = new SerialField<OneOrZero>("IntimatePartnerViolenceCME", 751, 751, OneOrZero.class);
    protected SerialField<OneOrZero> jealouslyCME = new SerialField<OneOrZero>("JealouslyCME", 752, 752, OneOrZero.class);
    protected SerialField<OneOrZero> jobProblemCME = new SerialField<OneOrZero>("JobProblemCME", 753, 753, OneOrZero.class);
    protected SerialField<OneOrZero> justifiableSelfDefenseCME = new SerialField<OneOrZero>("JustifiableSelfDefenseCME", 754, 754, OneOrZero.class);
    protected SerialField<OneOrZero> legalProblemOtherCME = new SerialField<OneOrZero>("LegalProblemOtherCME", 755, 755, OneOrZero.class);
    protected SerialField<OneOrZero> mentalHealthDiagnosis1CME = new SerialField<OneOrZero>("MentalHealthDiagnosis1CME", 756, 757, OneOrZero.class);
    protected SerialField<OneOrZero> mentalHealthDiagnosis2CME = new SerialField<OneOrZero>("MentalHealthDiagnosis2CME", 758, 759, OneOrZero.class);
    protected SerialField<String> mentalHealthDiagnosisOtherCME = new SerialField<String>("MentalHealthDiagnosisOtherCME", 760, 809, String.class);
    protected SerialField<OneOrZero> mentalHealthProblemCME = new SerialField<OneOrZero>("MentalHealthProblemCME", 810, 810, OneOrZero.class);
    protected SerialField<OneOrZero> mentalIllnessTreatmentCurrentCME = new SerialField<OneOrZero>("MentalIllnessTreatmentCurrentCME", 811, 811, OneOrZero.class);
    protected SerialField<OneOrZero> mercyKillingCME = new SerialField<OneOrZero>("MercyKillingCME", 812, 812, OneOrZero.class);
    protected SerialField<OneOrZero> natureOtherCrime1CME = new SerialField<OneOrZero>("NatureOtherCrime1CME", 813, 814, OneOrZero.class);
    protected SerialField<OneOrZero> natureOtherCrime2CME = new SerialField<OneOrZero>("NatureOtherCrime2CME", 815, 816, OneOrZero.class);
    protected SerialField<OneOrZero> otherAddictionCME = new SerialField<OneOrZero>("OtherAddictionCME", 817, 817, OneOrZero.class);
    protected SerialField<OneOrZero> otherContextInjuryCME = new SerialField<OneOrZero>("OtherContextInjuryCME", 818, 818, OneOrZero.class);
    protected SerialField<OneOrZero> otherCrimeInProgressCME = new SerialField<OneOrZero>("OtherCrimeInProgressCME", 819, 819, OneOrZero.class);
    protected SerialField<OneOrZero> otherMechanismInjuryCME = new SerialField<OneOrZero>("Other Mechanism Injury CME", 820, 820, OneOrZero.class);
    protected SerialField<OneOrZero> precipitatedByOtherCrimeCME = new SerialField<OneOrZero>("Precipitated by Other Crime CME", 821, 821, OneOrZero.class);
    protected SerialField<OneOrZero> physicalHealthProblemCME = new SerialField<OneOrZero>("Physical Health Problem CME", 822, 822, OneOrZero.class);
    protected SerialField<OneOrZero> prostitutionCME = new SerialField<OneOrZero>("Prostitution CME", 823, 823, OneOrZero.class);
    protected SerialField<OneOrZero> randomViolenceCME = new SerialField<OneOrZero>("Random Violence CME", 824, 824, OneOrZero.class);
    protected SerialField<OneOrZero> recentCriminalLegalProblemCME = new SerialField<OneOrZero>("Recent Criminal Legal Problem CME", 825, 825, OneOrZero.class);
    protected SerialField<OneOrZero> recentSuicideFriendFamilyCME = new SerialField<OneOrZero>("Recent Suicide Friend Family CME", 826, 826, OneOrZero.class);
    protected SerialField<OneOrZero> relationshipProblemOtherCME = new SerialField<OneOrZero>("Relationship Problem Other CME", 827, 827, OneOrZero.class);
    protected SerialField<OneOrZero> schoolProblemCME = new SerialField<OneOrZero>("School Problem CME", 828, 828, OneOrZero.class);
    protected SerialField<OneOrZero> selfDefenseCME = new SerialField<OneOrZero>("Self Defense CME", 829, 829, OneOrZero.class);
    protected SerialField<OneOrZero> stalkingCME = new SerialField<OneOrZero>("Stalking CME", 830, 830, OneOrZero.class);
    protected SerialField<OneOrZero> substanceAbuseOtherCME = new SerialField<OneOrZero>("Substance Abuse Other CME", 831, 831, OneOrZero.class);
    protected SerialField<OneOrZero> suicideAttempthisoryCME = new SerialField<OneOrZero>("Suicide Attempt history CME", 832, 832, OneOrZero.class);
    protected SerialField<OneOrZero> suicideIntentDisclosedCME = new SerialField<OneOrZero>("Suicide Intent Disclosed CME", 833, 833, OneOrZero.class);
    protected SerialField<OneOrZero> suicideNoteCME = new SerialField<OneOrZero>("Suicide Note CME", 834, 834, OneOrZero.class);
    protected SerialField<OneOrZero> suicideThoughthisoryCME = new SerialField<OneOrZero>("Suicide Thought history CME", 835, 835, OneOrZero.class);
    protected SerialField<OneOrZero> targetShootingCME = new SerialField<OneOrZero>("Target Shooting CME", 836, 836, OneOrZero.class);
    protected SerialField<OneOrZero> terroristAttackCME = new SerialField<OneOrZero>("Terrorist Attack CME", 837, 837, OneOrZero.class);
    protected SerialField<OneOrZero> traumaticAnniversaryCME = new SerialField<OneOrZero>("Traumatic Anniversary CME", 838, 838, OneOrZero.class);
    protected SerialField<OneOrZero> victimPoliceOfficerOnDutyCME = new SerialField<OneOrZero>("Victim Police Officer On Duty CME", 839, 839, OneOrZero.class);
    protected SerialField<OneOrZero> victimUsedWeaponCME = new SerialField<OneOrZero>("Victim Used Weapon CME", 840, 840, OneOrZero.class);
    protected SerialField<OneOrZero> walkByAssaultCME = new SerialField<OneOrZero>("Walk By Assault CME", 841, 841, OneOrZero.class);
    protected SerialField<OneOrZero> circumstancesOtherLE = new SerialField<OneOrZero>("Circumstances Other LE", 842, 842, OneOrZero.class);
    protected SerialField<OneOrZero> abusedAsChildLE = new SerialField<OneOrZero>("Abused As Child LE", 843, 843, OneOrZero.class);
    protected SerialField<OneOrZero> alcoholProblemLE = new SerialField<OneOrZero>("Alcohol Problem LE", 844, 844, OneOrZero.class);
    protected SerialField<OneOrZero> argumentLE = new SerialField<OneOrZero>("Argument LE", 845, 845, OneOrZero.class);
    protected SerialField<OneOrZero> argumentOtherLE = new SerialField<OneOrZero>("Argument Other LE", 846, 846, OneOrZero.class);
    protected SerialField<OneOrZero> argumentTimingLE = new SerialField<OneOrZero>("Argument Timing LE", 847, 847, OneOrZero.class);
    protected SerialField<OneOrZero> brawlLE = new SerialField<OneOrZero>("Brawl LE", 848, 848, OneOrZero.class);
    protected SerialField<OneOrZero> bulletRicochetLE = new SerialField<OneOrZero>("Bullet Ricochet LE", 849, 849, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderLE = new SerialField<OneOrZero>("Bystander LE", 850, 850, OneOrZero.class);
    protected SerialField<OneOrZero> celebratoryFiringLE = new SerialField<OneOrZero>("Celebratory Firing LE", 851, 851, OneOrZero.class);
    protected SerialField<OneOrZero> isCircumstancesKnown = new SerialField<OneOrZero>("Is Circumstances Known", 852, 852, OneOrZero.class);
    protected SerialField<String> circumstancesOtherTextLE = new SerialField<String>("Circumstances Other Text LE", 853, 1107, String.class);
    protected SerialField<OneOrZero> cririsProstitutionLE = new SerialField<OneOrZero>("Crisis Prostitution LE", 1108, 1108, OneOrZero.class);
    protected SerialField<OneOrZero> crisisAlcoholProblemLE = new SerialField<OneOrZero>("Crisis Alcohol Problem LE", 1109, 1109, OneOrZero.class);
    protected SerialField<OneOrZero> crisisCivilLegalLE = new SerialField<OneOrZero>("Crisis Civil Legal LE", 1110, 1110, OneOrZero.class);
    protected SerialField<OneOrZero> crisisCriminalLE = new SerialField<OneOrZero>("Crisis Criminal LE", 1111, 1111, OneOrZero.class);
    protected SerialField<OneOrZero> crisisDisasterExposureLE = new SerialField<OneOrZero>("Crisis Disaster Exposure LE", 1112, 1112, OneOrZero.class);
    protected SerialField<OneOrZero> crisisEvictionLE = new SerialField<OneOrZero>("Crisis Eviction LE", 1113, 1113, OneOrZero.class);
    protected SerialField<OneOrZero> crisisFamilyStressorLE = new SerialField<OneOrZero>("Crisis Family Stressor LE", 1114, 1114, OneOrZero.class);
    protected SerialField<OneOrZero> crisisFinancialLE = new SerialField<OneOrZero>("Crisis Financial LE", 1115, 1115, OneOrZero.class);
    protected SerialField<OneOrZero> crisisIntimatePartnerProblemLE = new SerialField<OneOrZero>("Crisis Intimate Partner Problem LE", 1116, 1116, OneOrZero.class);
    protected SerialField<OneOrZero> crisisJealousyLE = new SerialField<OneOrZero>("Crisis Jealousy LE", 1117, 1117, OneOrZero.class);
    protected SerialField<OneOrZero> crisisJobLE = new SerialField<OneOrZero>("Crisis Job LE", 1118, 1118, OneOrZero.class);
    protected SerialField<OneOrZero> crisisMentalHealthLE = new SerialField<OneOrZero>("Crisis Mental Health LE", 1119, 1119, OneOrZero.class);
    protected SerialField<OneOrZero> crisisOtherAddictionLE = new SerialField<OneOrZero>("Crisis Other Addiction LE", 1120, 1120, OneOrZero.class);
    protected SerialField<OneOrZero> crisisPhysicalHealthLE = new SerialField<OneOrZero>("Crisis Physical Health LE", 1121, 1121, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherLE = new SerialField<OneOrZero>("Crisis Related Death Friend Or Family Other LE", 1122, 1122, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyLE = new SerialField<OneOrZero>("Crisis Related Suicide Friend Or Family LE", 1123, 1123, OneOrZero.class);
    protected SerialField<OneOrZero> crisisRelationshipProblemOtherLE = new SerialField<OneOrZero>("Crisis Relationship Problem Other LE", 1124, 1124, OneOrZero.class);
    protected SerialField<OneOrZero> crisisSchoolLE = new SerialField<OneOrZero>("Crisis School LE", 1125, 1125, OneOrZero.class);
    protected SerialField<OneOrZero> crisisStalkingLE = new SerialField<OneOrZero>("Crisis Stalking LE", 1126, 1126, OneOrZero.class);
    protected SerialField<OneOrZero> crisisSubstanceAbuseLE = new SerialField<OneOrZero>("Crisis Substance Abuse LE", 1127, 1127, OneOrZero.class);
    protected SerialField<OneOrZero> deathAbuseLE = new SerialField<OneOrZero>("Death Abuse LE", 1128, 1128, OneOrZero.class);
    protected SerialField<OneOrZero> deathFriendOrFamilyOtherLE = new SerialField<OneOrZero>("Death Friend Or Family Other LE", 1129, 1129, OneOrZero.class);
    protected SerialField<OneOrZero> depressedMoodLE = new SerialField<OneOrZero>("Depressed Mood LE", 1130, 1130, OneOrZero.class);
    protected SerialField<OneOrZero> disasterExposureLE = new SerialField<OneOrZero>("Disaster Exposure LE", 1131, 1131, OneOrZero.class);
    protected SerialField<OneOrZero> disclosedIntentToWhomLE = new SerialField<OneOrZero>("Disclosed Intent To Whom LE", 1132, 1132, OneOrZero.class);
    protected SerialField<OneOrZero> driveByShootingLE = new SerialField<OneOrZero>("Drive By Shooting LE", 1133, 1133, OneOrZero.class);
    protected SerialField<OneOrZero> drugInvolvementLE = new SerialField<OneOrZero>("Drug Involvement LE", 1134, 1134, OneOrZero.class);
    protected SerialField<OneOrZero> evictionOrLossOfHomeLE = new SerialField<OneOrZero>("Eviction Or Loss Of Home LE", 1135, 1135, OneOrZero.class);
    protected SerialField<OneOrZero> fightBetweenTwoPeopleLE = new SerialField<OneOrZero>("Fight Between Two People LE", 1136, 1136, OneOrZero.class);
    protected SerialField<OneOrZero> financialProblemLE = new SerialField<OneOrZero>("Financial Problem LE", 1137, 1137, OneOrZero.class);
    protected SerialField<OneOrZero> unused2 = new SerialField<OneOrZero>("Unused2", 1138, 1138, OneOrZero.class);
    protected SerialField<OneOrZero> gangRelatedLE = new SerialField<OneOrZero>("Gang Related LE", 1139, 1139, OneOrZero.class);
    protected SerialField<OneOrZero> gunCleaningLE = new SerialField<OneOrZero>("Gun Cleaning LE", 1140, 1140, OneOrZero.class);
    protected SerialField<OneOrZero> gunDefectMalfunctionLE = new SerialField<OneOrZero>("Gun Defect Malfunction LE", 1141, 1141, OneOrZero.class);
    protected SerialField<OneOrZero> gunDroppedLE = new SerialField<OneOrZero>("Gun Dropped LE", 1142, 1142, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredHolsteringLE = new SerialField<OneOrZero>("Gun Fired Holstering LE", 1143, 1143, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredLoadingUnloadingLE = new SerialField<OneOrZero>("Gun Fired Loading Unloading LE", 1144, 1144, OneOrZero.class);
    protected SerialField<OneOrZero> gunFiredOperatingSafetyLockLE = new SerialField<OneOrZero>("Gun Fired Operating Safety Lock LE", 1145, 1145, OneOrZero.class);
    protected SerialField<OneOrZero> gunPlayingLE = new SerialField<OneOrZero>("Gun Playing LE", 1146, 1146, OneOrZero.class);
    protected SerialField<OneOrZero> gunShowingLE = new SerialField<OneOrZero>("Gun Showing LE", 1147, 1147, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtSafetyEngagedLE = new SerialField<OneOrZero>("Gun Thought Safety Engaged LE", 1148, 1148, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtToyLE = new SerialField<OneOrZero>("Gun Thought Toy LE", 1149, 1149, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedLE = new SerialField<OneOrZero>("Gun Thought Unloaded Magazine Disengaged LE", 1150, 1150, OneOrZero.class);
    protected SerialField<OneOrZero> gunThoughtUnloadedOtherLE = new SerialField<OneOrZero>("Gun Thought Unloaded Other LE", 1151, 1151, OneOrZero.class);
    protected SerialField<OneOrZero> gunUnintentionallyPulledTriggerLE = new SerialField<OneOrZero>("Gun Unintentionally Pulled Trigger LE", 1152, 1152, OneOrZero.class);
    protected SerialField<OneOrZero> hateCrimeLE = new SerialField<OneOrZero>("Hate Crime LE", 1153, 1153, OneOrZero.class);
    protected SerialField<OneOrZero> hisoryMentalIllnessTreatmentLE = new SerialField<OneOrZero>("history Mental Illness Treatment LE", 1154, 1154, OneOrZero.class);
    protected SerialField<OneOrZero> huntingLE = new SerialField<OneOrZero>("Hunting LE", 1155, 1155, OneOrZero.class);
    protected SerialField<OneOrZero> interpersonalViolencePerpetratorLE = new SerialField<OneOrZero>("Interpersonal Violence Perpetrator LE", 1156, 1156, OneOrZero.class);
    protected SerialField<OneOrZero> interpersonalViolenceVictimLE = new SerialField<OneOrZero>("Interpersonal Violence Victim LE", 1157, 1157, OneOrZero.class);
    protected SerialField<OneOrZero> intervenerAssistingVictimLE = new SerialField<OneOrZero>("Intervener Assisting Victim LE", 1158, 1158, OneOrZero.class);
    protected SerialField<OneOrZero> intimatePartnerProblemLE = new SerialField<OneOrZero>("Intimate Partner Problem LE", 1159, 1159, OneOrZero.class);
    protected SerialField<OneOrZero> intimatePartnerViolenceLE = new SerialField<OneOrZero>("Intimate Partner Violence LE", 1160, 1160, OneOrZero.class);
    protected SerialField<OneOrZero> jealouslyLE = new SerialField<OneOrZero>("Jealously LE", 1161, 1161, OneOrZero.class);
    protected SerialField<OneOrZero> jobProblemLE = new SerialField<OneOrZero>("Job Problem LE", 1162, 1162, OneOrZero.class);
    protected SerialField<OneOrZero> justifiableSelfDefenseLE = new SerialField<OneOrZero>("Justifiable Self Defense LE", 1163, 1163, OneOrZero.class);
    protected SerialField<OneOrZero> legalProblemOtherLE = new SerialField<OneOrZero>("Legal Problem Other LE", 1164, 1164, OneOrZero.class);
    protected SerialField<OneOrZero> mentalHealthDiagnosis1LE = new SerialField<OneOrZero>("Mental Health Diagnosis 1 LE", 1165, 1166, OneOrZero.class);
    protected SerialField<OneOrZero> mentalHealthDiagnosis2LE = new SerialField<OneOrZero>("Mental Health Diagnosis 2 LE", 1167, 1168, OneOrZero.class);
    protected SerialField<String> mentalHealthDiagnosisOtherLE = new SerialField<String>("Mental Health Diagnosis Other LE", 1169, 1218, String.class);
    protected SerialField<OneOrZero> mentalHealthProblemLE = new SerialField<OneOrZero>("Mental Health Problem LE", 1219, 1219, OneOrZero.class);
    protected SerialField<OneOrZero> mentalIllnessTreatmentCurrentLE = new SerialField<OneOrZero>("Mental Illness Treatment Current LE", 1220, 1220, OneOrZero.class);
    protected SerialField<OneOrZero> mercyKillingLE = new SerialField<OneOrZero>("Mercy Killing LE", 1221, 1221, OneOrZero.class);
    protected SerialField<OneOrZero> natureOtherCrime1LE = new SerialField<OneOrZero>("Nature Other Crime 1 LE", 1222, 1223, OneOrZero.class);
    protected SerialField<OneOrZero> natureOtherCrime2LE = new SerialField<OneOrZero>("Nature Other Crime 2 LE", 1224, 1225, OneOrZero.class);
    protected SerialField<OneOrZero> otherAddictionLE = new SerialField<OneOrZero>("Other Addiction LE", 1226, 1226, OneOrZero.class);
    protected SerialField<OneOrZero> otherContextInjuryLE = new SerialField<OneOrZero>("Other Context Injury LE", 1227, 1227, OneOrZero.class);
    protected SerialField<OneOrZero> otherCrimeInProgressLE = new SerialField<OneOrZero>("Other Crime In Progress LE", 1228, 1228, OneOrZero.class);
    protected SerialField<OneOrZero> otherMechanismInjuryLE = new SerialField<OneOrZero>("Other Mechanism Injury LE", 1229, 1229, OneOrZero.class);
    protected SerialField<OneOrZero> precipitatedByOtherCrimeLE = new SerialField<OneOrZero>("Precipitated by Other Crime LE", 1230, 1230, OneOrZero.class);
    protected SerialField<OneOrZero> physicalHealthProblemLE = new SerialField<OneOrZero>("Physical Health Problem LE", 1231, 1231, OneOrZero.class);
    protected SerialField<OneOrZero> prostitutionLE = new SerialField<OneOrZero>("Prostitution LE", 1232, 1232, OneOrZero.class);
    protected SerialField<OneOrZero> randomViolenceLE = new SerialField<OneOrZero>("Random Violence LE", 1233, 1233, OneOrZero.class);
    protected SerialField<OneOrZero> recentCriminalLegalProblemLE = new SerialField<OneOrZero>("Recent Criminal Legal Problem LE", 1234, 1234, OneOrZero.class);
    protected SerialField<OneOrZero> recentSuicideFriendFamilyLE = new SerialField<OneOrZero>("Recent Suicide Friend Family LE", 1235, 1235, OneOrZero.class);
    protected SerialField<OneOrZero> relationshipProblemOtherLE = new SerialField<OneOrZero>("Relationship Problem Other LE", 1236, 1236, OneOrZero.class);
    protected SerialField<OneOrZero> schoolProblemLE = new SerialField<OneOrZero>("School Problem LE", 1237, 1237, OneOrZero.class);
    protected SerialField<OneOrZero> selfDefenseLE = new SerialField<OneOrZero>("Self Defense LE", 1238, 1238, OneOrZero.class);
    protected SerialField<OneOrZero> stalkingLE = new SerialField<OneOrZero>("Stalking LE", 1239, 1239, OneOrZero.class);
    protected SerialField<OneOrZero> substanceAbuseOtherLE = new SerialField<OneOrZero>("Substance Abuse Other LE", 1240, 1240, OneOrZero.class);
    protected SerialField<OneOrZero> suicideAttempthisoryLE = new SerialField<OneOrZero>("Suicide Attempt history LE", 1241, 1241, OneOrZero.class);
    protected SerialField<OneOrZero> suicideIntentDisclosedLE = new SerialField<OneOrZero>("Suicide Intent Disclosed LE", 1242, 1242, OneOrZero.class);
    protected SerialField<OneOrZero> suicideNoteLE = new SerialField<OneOrZero>("Suicide Note LE", 1243, 1243, OneOrZero.class);
    protected SerialField<OneOrZero> suicideThoughthisoryLE = new SerialField<OneOrZero>("Suicide Thought history LE", 1244, 1244, OneOrZero.class);
    protected SerialField<OneOrZero> targetShootingLE = new SerialField<OneOrZero>("Target Shooting LE", 1245, 1245, OneOrZero.class);
    protected SerialField<OneOrZero> terroristAttackLE = new SerialField<OneOrZero>("Terrorist Attack LE", 1246, 1246, OneOrZero.class);
    protected SerialField<OneOrZero> traumaticAnniversaryLE = new SerialField<OneOrZero>("Traumatic Anniversary LE", 1247, 1247, OneOrZero.class);
    protected SerialField<OneOrZero> victimPoliceOfficeOnDutyLE = new SerialField<OneOrZero>("Victim Police Officer On Duty LE", 1248, 1248, OneOrZero.class);
    protected SerialField<OneOrZero> victimUsedWeaponLE = new SerialField<OneOrZero>("Victim Used Weapon LE", 1249, 1249, OneOrZero.class);
    protected SerialField<OneOrZero> walkByAssaultLE = new SerialField<OneOrZero>("Walk-up Assault LE", 1250, 1250, OneOrZero.class);
    protected SerialField<String> weaponType = new SerialField<String>("Weapon Type", 1251, 1252, String.class);
    protected SerialField<String> firearmType = new SerialField<String>("Firearm Type", 1253, 1254, String.class);
    protected SerialField<CharLimitedInteger> firearmCaliber = new SerialField<CharLimitedInteger>("Firearm Caliber", 1255, 1258, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> firearmGauge = new SerialField<CharLimitedInteger>("Firearm Gauge", 1259, 1261, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> firearmMake = new SerialField<CharLimitedInteger>("Firearm Make", 1262, 1265, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> firearmModel = new SerialField<CharLimitedInteger>("Firearm Model", 1266, 1269, CharLimitedInteger.class);
    protected SerialField<OneOrZero> gunLoaded = new SerialField<OneOrZero>("Gun Stored Loaded", 1270, 1270, OneOrZero.class);
    protected SerialField<String> gunOwner = new SerialField<String>("Gun Owner", 1271, 1272, String.class);
    protected SerialField<CharLimitedInteger> gunStoredLocked = new SerialField<CharLimitedInteger>("Gun Stored Locked", 1273, 1273, CharLimitedInteger.class);
    protected SerialField<OneOrZero> firearmStolen = new SerialField<OneOrZero>("Firearm Stolen", 1274, 1274, OneOrZero.class);
    protected SerialField<String> suspectSex = new SerialField<String>("Sex", 1275, 1275, String.class);
    protected SerialField<String> victimSuspectRelationshipPrimary = new SerialField<String>("Victim to Suspect Relationship 1", 1276, 1277, String.class);
    protected SerialField<String> victimSuspectRelationshipSecondary = new SerialField<String>("Victim to Suspect Relationship 2", 1278, 1279, String.class);
    protected SerialField<OneOrZero> hasAbusehistory = new SerialField<OneOrZero>("history of Abuse of Victim by this.suspect", 1280, 1280, OneOrZero.class);
    protected SerialField<OneOrZero> isCareTaker = new SerialField<OneOrZero>("this.suspect Was a Caregiver for the Victim", 1281, 1281, OneOrZero.class);
    protected SerialField<OneOrZero> hasAttemptedSuicide = new SerialField<OneOrZero>("Suspect Attempted Suicide After Incident", 1282, 1282, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectAlsoVictim = new SerialField<OneOrZero>("this.suspect is Also a Victim in the Incident", 1283, 1283, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectMentallyIll = new SerialField<OneOrZero>("Suspect Mentally Ill", 1284, 1284, OneOrZero.class);
    protected SerialField<OneOrZero> hasSuspectDevelopmentDisability = new SerialField<OneOrZero>("Suspect Had Developmental Disability", 1285, 1285, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectAlcoholUseSuspected = new SerialField<OneOrZero>("Suspected Alcohol Use by Suspect", 1286, 1286, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectSubstanceUseSuspected = new SerialField<OneOrZero>("Suspected Substance Use by Suspect", 1287, 1287, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectContactPolice = new SerialField<OneOrZero>("Suspect Had Been in Contact with Law Enforcement", 1288, 1288, OneOrZero.class);
    protected SerialField<OneOrZero> suspectRecentRelease = new SerialField<OneOrZero>("Suspect Was Recently Released from an Institution", 1289, 1290, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectCaucasian = new SerialField<OneOrZero>("White", 1291, 1291, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectAfricanAmerican = new SerialField<OneOrZero>("Black or African American", 1292, 1292, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectAsian = new SerialField<OneOrZero>("Asian", 1293, 1293, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectPacificIslander = new SerialField<OneOrZero>("Native Hawaiian or Other Pacific Islander", 1294, 1294, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectAmericanIndian = new SerialField<OneOrZero>("American Indian or Alaska Native", 1295, 1295, OneOrZero.class);
    protected SerialField<OneOrZero> isSuspectRaceUnspecified = new SerialField<OneOrZero>("American Indian or Alaska Native", 1296, 1296, OneOrZero.class);
    protected SerialField<String> suspectEthnicity = new SerialField<String>("Race", 1297, 1297, String.class);
    protected SerialField<OneOrZero> isTreatmentNonAdherenceCME = new SerialField<OneOrZero>("Non-adherence to Mental Health/Substance Abuse Treatment", 1298, 1298, OneOrZero.class);
    protected SerialField<OneOrZero> isTraumaticBrainInjuryhistoryCME = new SerialField<OneOrZero>("history of Traumatic Brain Injury (TBI)", 1299, 1299, OneOrZero.class);
    protected SerialField<OneOrZero> isFamilyStressorsCME = new SerialField<OneOrZero>("Family Relationship Problem", 1300, 1300, OneOrZero.class);
    protected SerialField<OneOrZero> isCrisisFamilyStressorCME = new SerialField<OneOrZero>("Family Relationship Problem Was Crisis", 1301, 1301, OneOrZero.class);
    protected SerialField<OneOrZero> isCaregiverBurdenCME = new SerialField<OneOrZero>("Caregiver Burden", 1302, 1302, OneOrZero.class);
    protected SerialField<OneOrZero> isFamilyStressorCME = new SerialField<OneOrZero>("Family Stressors", 1303, 1303, OneOrZero.class);
    protected SerialField<OneOrZero> isHouseholdKnownCME = new SerialField<OneOrZero>("Household Known to Local Authorities", 1304, 1304, OneOrZero.class);
    protected SerialField<OneOrZero> isPriorCPSReportCME = new SerialField<OneOrZero>("Prior Child Protective Services (CPS) Report on a Child Victim's Household", 1305, 1305, OneOrZero.class);
    protected SerialField<OneOrZero> isHouseholdSubstanceAbuseCME = new SerialField<OneOrZero>("Substance Abuse in Child Victim's Household", 1306, 1306, OneOrZero.class);
    protected SerialField<OneOrZero> isLivingTransitionCME = new SerialField<OneOrZero>("Loss of Independent Living", 1307, 1307, OneOrZero.class);
    protected SerialField<OneOrZero> isCorporalPunishmentCME = new SerialField<OneOrZero>("Caregiver Use of Corporal Punishment Contributed to Child Death", 1308, 1308, OneOrZero.class);
    protected SerialField<OneOrZero> ishistorySelfHarmCME = new SerialField<OneOrZero>("history of Non-suicidal Self-Injury/Self-Harm", 1309, 1309, OneOrZero.class);
    protected SerialField<OneOrZero> isTreatmentNonAdherenceLE = new SerialField<OneOrZero>("Non-adherence to Mental Health/Substance Abuse Treatment", 1310, 1310, OneOrZero.class);
    protected SerialField<OneOrZero> isTraumaticBrainInjuryhistoryLE = new SerialField<OneOrZero>("history of Traumatic Brain Injury (TBI)", 1311, 1311, OneOrZero.class);
    protected SerialField<OneOrZero> isFamilyStressorsLE = new SerialField<OneOrZero>("Family Relationship Problem", 1312, 1312, OneOrZero.class);
    protected SerialField<OneOrZero> isCrisisFamilyStressorLE = new SerialField<OneOrZero>("Family Relationship Problem Was Crisis", 1313, 1313, OneOrZero.class);
    protected SerialField<OneOrZero> isCaregiverBurdenLE = new SerialField<OneOrZero>("Caregiver Burden", 1314, 1314, OneOrZero.class);
    protected SerialField<OneOrZero> isFamilyStressorLE = new SerialField<OneOrZero>("Family Stressors", 1315, 1315, OneOrZero.class);
    protected SerialField<OneOrZero> isHouseholdKnownLE = new SerialField<OneOrZero>("Household Known to Local Authorities", 1316, 1316, OneOrZero.class);
    protected SerialField<OneOrZero> isPriorCPSReportLE = new SerialField<OneOrZero>("Prior Child Protective Services (CPS) Report on a Child Victim's Household", 1317, 1317, OneOrZero.class);
    protected SerialField<OneOrZero> isHouseholdSubstanceAbuseLE = new SerialField<OneOrZero>("Substance Abuse in Child Victim's Household", 1318, 1318, OneOrZero.class);
    protected SerialField<OneOrZero> isLivingTransitionLE = new SerialField<OneOrZero>("Loss of Independent Living", 1319, 1319, OneOrZero.class);
    protected SerialField<OneOrZero> isCorporalPunishmentLE = new SerialField<OneOrZero>("Caregiver Use of Corporal Punishment Contributed to Child Death", 1320, 1320, OneOrZero.class);
    protected SerialField<OneOrZero> ishistorySelfHarmLE = new SerialField<OneOrZero>("history of Non-suicidal Self-Injury/Self-Harm", 1321, 1321, OneOrZero.class);
    protected SerialField<CharLimitedInteger> typeOfPoisoning = new SerialField<CharLimitedInteger>("Type of Drug Overdose/Poisoning", 1322, 1322, CharLimitedInteger.class);
    protected SerialField<MilitaryTime> lastSeenAliveTime = new SerialField<MilitaryTime>("Time Last Known Alive and Well Before Overdose (Military Time format e.g., 0000-2359, 9999)", 1323, 1326, MilitaryTime.class);
    protected SerialField<MilitaryTime> foundUnresponsiveTime = new SerialField<MilitaryTime>("Time First Found Unresponsive (Military Time format e.g., 0000-2359, 9999)", 1327, 1330, MilitaryTime.class);
    protected SerialField<CharLimitedInteger> lastSeenAliveMonth = new SerialField<CharLimitedInteger>("Date Last Known Alive and Well Before Overdose (Month)", 1331, 1332, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> lastSeenAliveDay = new SerialField<CharLimitedInteger>("Date Last Known Alive and Well Before Overdose (Day)", 1333, 1334, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> lastSeenAliveYear = new SerialField<CharLimitedInteger>("Date Last Known Alive and Well Before Overdose (Year)", 1335, 1338, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> foundUnresponsiveMonth = new SerialField<CharLimitedInteger>("Date Found Unresponsive (Month)", 1339, 1340, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> foundUnresponsiveDay = new SerialField<CharLimitedInteger>("Date Found Unresponsive (Day)", 1341, 1342, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> foundUnresponsiveYear = new SerialField<CharLimitedInteger>("Date Found Unresponsive (Year)", 1343, 1346, CharLimitedInteger.class);
    protected SerialField<OneOrZero> previousOverdose = new SerialField<OneOrZero>("Previous Drug Overdose", 1347, 1347, OneOrZero.class);
    protected SerialField<OneOrZero> overdose0to2DaysPrior = new SerialField<OneOrZero>("Overdose Occurred 0-2 Days Prior", 1348, 1348, OneOrZero.class);
    protected SerialField<OneOrZero> overdose3to7DaysPrior = new SerialField<OneOrZero>("Overdose Occurred 3-7 Days Prior", 1349, 1349, OneOrZero.class);
    protected SerialField<OneOrZero> recentOpioidUse = new SerialField<OneOrZero>("Recent Return to Use of Opioids", 1350, 1350, OneOrZero.class);
    protected SerialField<OneOrZero> recentEmergencyDept = new SerialField<OneOrZero>("Recent Emergency Department or Urgent Care Visit", 1351, 1351, OneOrZero.class);
    protected SerialField<OneOrZero> histDrugNoEvidence = new SerialField<OneOrZero>("No Evidence of Current or Past Drug Use/Misuse", 1352, 1352, OneOrZero.class);
    protected SerialField<OneOrZero> histHeroin = new SerialField<OneOrZero>("Heroin", 1353, 1353, OneOrZero.class);
    protected SerialField<OneOrZero> histRxOpioid = new SerialField<OneOrZero>("Prescription Opioids", 1354, 1354, OneOrZero.class);
    protected SerialField<OneOrZero> histAnyOpioid = new SerialField<OneOrZero>("Unspecified Opioids", 1355, 1355, OneOrZero.class);
    protected SerialField<OneOrZero> histFentanyl = new SerialField<OneOrZero>("Fentanyl", 1356, 1356, OneOrZero.class);
    protected SerialField<OneOrZero> histCocaine = new SerialField<OneOrZero>("Cocaine", 1357, 1357, OneOrZero.class);
    protected SerialField<OneOrZero> histMeth = new SerialField<OneOrZero>("Methamphetamine", 1358, 1358, OneOrZero.class);
    protected SerialField<OneOrZero> histBenzo = new SerialField<OneOrZero>("Benzodiazepines", 1359, 1359, OneOrZero.class);
    protected SerialField<OneOrZero> histCannabis = new SerialField<OneOrZero>("Cannabis (Marijuana)", 1360, 1360, OneOrZero.class);
    protected SerialField<OneOrZero> histUnspecified = new SerialField<OneOrZero>("Drug Use/Misuse, Substance Unspecified", 1361, 1361, OneOrZero.class);
    protected SerialField<OneOrZero> histOther = new SerialField<OneOrZero>("Other Substance - Specify", 1362, 1362, OneOrZero.class);
    protected SerialField<String> histOtherDesc = new SerialField<String>("Other Substance - Specify Textbox", 1363, 1490, String.class);
    protected SerialField<OneOrZero> treatmentForSubstanceAbuse = new SerialField<OneOrZero>("Treatment for Substance Use Disorder", 1491, 1491, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentRehab = new SerialField<OneOrZero>("Inpatient/Outpatient Rehabilitation", 1492, 1492, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentMATcog = new SerialField<OneOrZero>("Medications for Opioid Use Disorder (with Cognitive/Behavioral Therapy)", 1493, 1493, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentMATNoCog = new SerialField<OneOrZero>("Medications for Opioid Use Disorder (without Cognitive/Behavioral Therapy)", 1494, 1494, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentMAT = new SerialField<OneOrZero>("Medications for Opioid Use Disorder (Cognitive/Behavioral Therapy Unknown)", 1495, 1495, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentCogTherapy = new SerialField<OneOrZero>("Cognitive/Behavioral Therapy", 1496, 1496, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentNA = new SerialField<OneOrZero>("Narcotics Anonymous", 1497, 1497, OneOrZero.class);
    protected SerialField<OneOrZero> substanceTreatmentOther = new SerialField<OneOrZero>("Other - Specify", 1498, 1498, OneOrZero.class);
    protected SerialField<String> substanceTreatmentOtherSpecify = new SerialField<String>("Other - Specify Textbox", 1499, 1626, String.class);
    protected SerialField<OneOrZero> involveCriminalJustice = new SerialField<OneOrZero>("Involved with Criminal Justice System (Perpetrator)", 1627, 1627, OneOrZero.class);
    protected SerialField<OneOrZero> hasIndicationsDrugPara = new SerialField<OneOrZero>("Any Evidence of Drug Use", 1628, 1628, OneOrZero.class);
    protected SerialField<OneOrZero> hasIndicationsNone = new SerialField<OneOrZero>("No Evidence of Drug Use", 1629, 1629, OneOrZero.class);
    protected SerialField<OneOrZero> hasIndicationsNonSpecific = new SerialField<OneOrZero>("Non-specific Drug Use Evidence", 1630, 1630, OneOrZero.class);
    protected SerialField<OneOrZero> hasRapidOverdoseEvidence = new SerialField<OneOrZero>("Evidence of Rapid Overdose", 1631, 1631, OneOrZero.class);
    protected SerialField<OneOrZero> isTourniquetAroundArm = new SerialField<OneOrZero>("Tourniquet Still in Place", 1632, 1632, OneOrZero.class);
    protected SerialField<OneOrZero> bodyPosition = new SerialField<OneOrZero>("Body Position Consistent with Rapid Overdose", 1633, 1633, OneOrZero.class);
    protected SerialField<OneOrZero> needleLocation = new SerialField<OneOrZero>("Needle Location", 1634, 1634, OneOrZero.class);
    protected SerialField<OneOrZero> rapidOverdoseWitnessReport = new SerialField<OneOrZero>("Witness Report Rapid Overdose", 1635, 1635, OneOrZero.class);
    protected SerialField<OneOrZero> hasRapidOverdoseOther = new SerialField<OneOrZero>("Other - Explain", 1636, 1636, OneOrZero.class);
    protected SerialField<String> rapidOverdoseOtherDescription = new SerialField<String>("Other - Explain Textbox", 1637, 1764, String.class);
    protected SerialField<OneOrZero> hasRouteUnknown = new SerialField<OneOrZero>("No Information on Route of Administration", 1765, 1765, OneOrZero.class);
    protected SerialField<OneOrZero> hasRouteInjection = new SerialField<OneOrZero>("Evidence of Injection (Check All That Apply)", 1766, 1766, OneOrZero.class);
    protected SerialField<OneOrZero> hasIndicationsTracks = new SerialField<OneOrZero>("Track Marks on Decedent", 1767, 1767, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfInjectionTourniquet = new SerialField<OneOrZero>("Tourniquet", 1768, 1768, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfInjectionCooker = new SerialField<OneOrZero>("Cookers", 1769, 1769, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfinjectionNeedle = new SerialField<OneOrZero>("Needles/Syringe", 1770, 1770, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfInjectionFilter = new SerialField<OneOrZero>("Filters", 1771, 1771, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfInjectionWitnessReport = new SerialField<OneOrZero>("Witness Report", 1772, 1772, OneOrZero.class);
    protected SerialField<CharLimitedInteger> hasEvidenceOfInjectionOther = new SerialField<CharLimitedInteger>("Other Injection Evidence - Specify", 1773, 1773, CharLimitedInteger.class);
    protected SerialField<String> hasEvidenceOfInjectionOtherDescription = new SerialField<String>("Other Injection Evidence - Specify Textbox", 1774, 1901, String.class);
    protected SerialField<OneOrZero> hasRouteSnorting = new SerialField<OneOrZero>("Evidence of Snorting/Sniffing", 1902, 1902, OneOrZero.class);
    protected SerialField<OneOrZero> snortingStraw = new SerialField<OneOrZero>("Straws", 1903, 1903, OneOrZero.class);
    protected SerialField<OneOrZero> snortingRolled = new SerialField<OneOrZero>("Rolled Paper or Dollar Bills", 1904, 1904, OneOrZero.class);
    protected SerialField<OneOrZero> snortingRazor = new SerialField<OneOrZero>("Razor Blades", 1905, 1905, OneOrZero.class);
    protected SerialField<OneOrZero> snortingPowderMirror = new SerialField<OneOrZero>("Powder on Table/Mirror", 1906, 1906, OneOrZero.class);
    protected SerialField<OneOrZero> snortingPowderNose = new SerialField<OneOrZero>("Powder on Decedent's Nose", 1907, 1907, OneOrZero.class);
    protected SerialField<OneOrZero> snortingWitness = new SerialField<OneOrZero>("Witness Report", 1908, 1908, OneOrZero.class);
    protected SerialField<OneOrZero> snortingOther = new SerialField<OneOrZero>("Other Snorting Evidence - Specify", 1909, 1909, OneOrZero.class);
    protected SerialField<String> snortingOtherDesc = new SerialField<String>("Other Snorting Evidence - Specify Textbox", 1910, 2037, String.class);
    protected SerialField<OneOrZero> hasRouteSmoking = new SerialField<OneOrZero>("Evidence of Smoking/Inhalation", 2038, 2038, OneOrZero.class);
    protected SerialField<OneOrZero> smokingPipe = new SerialField<OneOrZero>("Pipes", 2039, 2039, OneOrZero.class);
    protected SerialField<OneOrZero> smokingTinfoil = new SerialField<OneOrZero>("Smoking Tinfoil", 2040, 2040, OneOrZero.class);
    protected SerialField<OneOrZero> smokingVape = new SerialField<OneOrZero>("Smoking Vape", 2041, 2041, OneOrZero.class);
    protected SerialField<OneOrZero> smokingBongBowl = new SerialField<OneOrZero>("Smoking Bong Bowl", 2042, 2042, OneOrZero.class);
    protected SerialField<OneOrZero> smokingWitness = new SerialField<OneOrZero>("Smoking Witness Report", 2043, 2043, OneOrZero.class);
    protected SerialField<OneOrZero> smokingOther = new SerialField<OneOrZero>("Smoking Other Evidence", 2044, 2044, OneOrZero.class);
    protected SerialField<String> smokingOtherDesc = new SerialField<String>("Smoking Other Evidence Description", 2045, 2172, String.class);
    protected SerialField<OneOrZero> hasRouteTransdermal = new SerialField<OneOrZero>("Has Route Transdermal", 2173, 2173, OneOrZero.class);
    protected SerialField<OneOrZero> hasRouteIngestion = new SerialField<OneOrZero>("Has Route Ingestion", 2174, 2174, OneOrZero.class);
    protected SerialField<OneOrZero> hasRouteSuppository = new SerialField<OneOrZero>("Has Route Suppository", 2175, 2175, OneOrZero.class);
    protected SerialField<OneOrZero> hasRouteSublingual = new SerialField<OneOrZero>("Has Route Sublingual", 2176, 2176, OneOrZero.class);
    protected SerialField<OneOrZero> hasRouteBuccal = new SerialField<OneOrZero>("Has Route Buccal", 2177, 2177, OneOrZero.class);
    protected SerialField<OneOrZero> nonSpecificRx = new SerialField<OneOrZero>("Evidence of Unspecified Drug Type", 2178, 2178, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfPrescriptionDrug = new SerialField<OneOrZero>("Has Evidence of Prescription Drugs", 2179, 2179, OneOrZero.class);
    protected SerialField<OneOrZero> isPrescribedToVictim = new SerialField<OneOrZero>("Prescribed to Decedent", 2180, 2180, OneOrZero.class);
    protected SerialField<OneOrZero> isUnknownWhoPrescribed = new SerialField<OneOrZero>("Unknown Who Prescribed For", 2181, 2181, OneOrZero.class);
    protected SerialField<OneOrZero> hasIndicationsRxDrugs = new SerialField<OneOrZero>("Not Prescribed to Decedent", 2182, 2182, OneOrZero.class);
    protected SerialField<String> prescriptionOtherDescription = new SerialField<String>("Other Form - Specify", 2192, 2192, String.class);
    protected SerialField<OneOrZero> hasIndicationsDrugatScene = new SerialField<OneOrZero>("Has Indications of Illicit Drugs", 2320, 2320, OneOrZero.class);
    protected SerialField<OneOrZero> haveEvidenceIllicitPowder = new SerialField<OneOrZero>("Powder", 2321, 2321, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceIllicitTar = new SerialField<OneOrZero>("Tar", 2322, 2322, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceOfIllicitWitnessReport = new SerialField<OneOrZero>("Witness Report", 2323, 2323, OneOrZero.class);
    protected SerialField<OneOrZero> hasEvidenceCrystal = new SerialField<OneOrZero>("Crystal", 2324, 2324, OneOrZero.class);
    protected SerialField<String> otherFormDescription = new SerialField<String>("Other Illicit Drug Description", 2328, 2455, String.class);
    protected SerialField<CharLimitedInteger> bystandersPresent = new SerialField<CharLimitedInteger>("Bystander Present", 2456, 2456, CharLimitedInteger.class);
    protected SerialField<String> bystanderOtherSpecify = new SerialField<String>("Other - Specify", 2465, 2465, String.class);
    protected SerialField<OneOrZero> witnessedDrugUse = new SerialField<OneOrZero>("Drug Use Witnessed", 2593, 2593, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderCPR = new SerialField<OneOrZero>("CPR", 2594, 2594, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderBreathing = new SerialField<OneOrZero>("Rescue breathing", 2595, 2595, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderSternal = new SerialField<OneOrZero>("Sternal rub", 2596, 2596, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderStimulation = new SerialField<OneOrZero>("Stimulation", 2597, 2597, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderIntrvOther = new SerialField<OneOrZero>("Other - specify", 2598, 2598, OneOrZero.class);
    protected SerialField<String> bystanderIntrvOtherSpecify = new SerialField<String>("Other - specify textbox", 2599, 2726, String.class);
    protected SerialField<OneOrZero> wasNaloxoneAdministered = new SerialField<OneOrZero>("Naloxone administered", 2727, 2727, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneNotAdmin = new SerialField<OneOrZero>("Naloxone not administered", 2728, 2728, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneUnknown = new SerialField<OneOrZero>("Unknown whether naloxone administered", 2729, 2729, OneOrZero.class);
    protected SerialField<OneOrZero> naloxoneTotalResponder = new SerialField<OneOrZero>("Total # of naloxone dosages administered by first responders/health care", 2730, 2731, OneOrZero.class);
    protected SerialField<OneOrZero> naloxoneTotalBystander = new SerialField<OneOrZero>("Total # of naloxone dosages administered by layperson(s)", 2732, 2733, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminUnknown = new SerialField<OneOrZero>("Unknown", 2734, 2734, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminLaw = new SerialField<OneOrZero>("Law enforcement", 2735, 2735, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminEms = new SerialField<OneOrZero>("EMS/fire", 2736, 2736, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminHospital = new SerialField<OneOrZero>("Hospital staff/health care staff", 2737, 2737, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminOther = new SerialField<OneOrZero>("Other-specify", 2738, 2738, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneAdminBystander = new SerialField<OneOrZero>("Layperson", 2739, 2739, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoPerson = new SerialField<OneOrZero>("Person using drugs", 2740, 2740, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoPartner = new SerialField<OneOrZero>("Intimate partner", 2741, 2741, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoFriend = new SerialField<OneOrZero>("Friend", 2742, 2742, OneOrZero.class);

    protected SerialField<OneOrZero> isNaloxoneWhoOtherFamily = new SerialField<OneOrZero>("Family member other than intimate partner", 2743, 2743, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoRoomate = new SerialField<OneOrZero>("Roommate", 2744, 2744, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoStranger = new SerialField<OneOrZero>("Stranger", 2745, 2745, OneOrZero.class);
    protected SerialField<OneOrZero> isNaloxoneWhoOther = new SerialField<OneOrZero>("Other-specify", 2746, 2746, OneOrZero.class);
    protected SerialField<String> isNaloxoneWhoOtherDescription = new SerialField<String>("Other-specify textbox", 2747, 2874, String.class);
    protected SerialField<OneOrZero> hadPulse = new SerialField<OneOrZero>("Presence of pulse on first-responder arrival", 2875, 2875, OneOrZero.class);
    protected SerialField<OneOrZero> intrvCPR = new SerialField<OneOrZero>("CPR", 2876, 2876, OneOrZero.class);
    protected SerialField<OneOrZero> intrvBreathing = new SerialField<OneOrZero>("Rescue breathing", 2877, 2877, OneOrZero.class);
    protected SerialField<OneOrZero> intrvEpinephrine = new SerialField<OneOrZero>("Epinephrine administration", 2878, 2878, OneOrZero.class);
    protected SerialField<OneOrZero> intrvTransport = new SerialField<OneOrZero>("Transport to ED", 2879, 2879, OneOrZero.class);
    protected SerialField<OneOrZero> intrvOxygen = new SerialField<OneOrZero>("Provided oxygen", 2880, 2880, OneOrZero.class);
    protected SerialField<OneOrZero> intrvOther = new SerialField<OneOrZero>("Other - specify", 2881, 2881, OneOrZero.class);
    protected SerialField<String> intrvOtherSpecify = new SerialField<String>("Other - specify textbox", 2882, 3009, String.class);
    protected SerialField<OneOrZero> bystanderNotRecognize = new SerialField<OneOrZero>("Did not recognize any abnormalities", 3010, 3010, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderUsing = new SerialField<OneOrZero>("Bystander using substances or drinking alcohol and impaired", 3011, 3011, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderPublic = new SerialField<OneOrZero>("Public space and strangers didn’t intervene", 3012, 3012, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderNoOverdose = new SerialField<OneOrZero>("Reported abnormalities but did not recognize as overdose", 3013, 3013, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderSeperated = new SerialField<OneOrZero>("Spatially separated (e.g., different room)", 3014, 3014, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderUnaware = new SerialField<OneOrZero>("Unaware that decedent was using substances", 3015, 3015, OneOrZero.class);
    protected SerialField<OneOrZero> bystanderReasonOther = new SerialField<OneOrZero>("Other - specify", 3016, 3016, OneOrZero.class);
    protected SerialField<String> bystanderReasonOtherSpecify = new SerialField<String>("Other - specify textbox", 3017, 3144, String.class);
    protected SerialField<OneOrZero> treatedforPain = new SerialField<OneOrZero>("Treated for pain at time of injury", 3145, 3145, OneOrZero.class);
    protected SerialField<OneOrZero> medhistCopd = new SerialField<OneOrZero>("COPD", 3146, 3146, OneOrZero.class);
    protected SerialField<OneOrZero> medhistAsthma = new SerialField<OneOrZero>("Asthma", 3147, 3147, OneOrZero.class);
    protected SerialField<OneOrZero> medhistApnea = new SerialField<OneOrZero>("Sleep apnea", 3148, 3148, OneOrZero.class);
    protected SerialField<OneOrZero> medhistHeart = new SerialField<OneOrZero>("Heart disease", 3149, 3149, OneOrZero.class);
    protected SerialField<OneOrZero> medhistObesity = new SerialField<OneOrZero>("Obesity", 3150, 3150, OneOrZero.class);
    protected SerialField<OneOrZero> medhistInjury = new SerialField<OneOrZero>("history of major injury", 3151, 3151, OneOrZero.class);
    protected SerialField<OneOrZero> medhistMigraine = new SerialField<OneOrZero>("Migraine", 3152, 3152, OneOrZero.class);
    protected SerialField<OneOrZero> medhistBackpain = new SerialField<OneOrZero>("Back pain", 3153, 3153, OneOrZero.class);
    protected SerialField<OneOrZero> medicalhistHepc = new SerialField<OneOrZero>("Hepatitis C", 3154, 3154, OneOrZero.class);
    protected SerialField<OneOrZero> medicalhistHIV = new SerialField<OneOrZero>("HIV/AIDS", 3155, 3155, OneOrZero.class);
    protected SerialField<OneOrZero> medhistOtherpain = new SerialField<OneOrZero>("Other pain", 3156, 3156, OneOrZero.class);
    protected SerialField<OneOrZero> medhistOtherbreathing = new SerialField<OneOrZero>("Other breathing problem", 3157, 3157, OneOrZero.class);
    protected SerialField<OneOrZero> prescriptionMorphine = new SerialField<OneOrZero>("Use of Pharmaceutical Morphine", 3158, 3158, OneOrZero.class);
    protected SerialField<String> prescriptionMorphineNarrative = new SerialField<String>("Prescription Morphine Narrative", 3159, 3414, String.class);
    protected SerialField<OneOrZero> buprenorphineRx = new SerialField<OneOrZero>("Buprenorphine prescribed", 3415, 3415, OneOrZero.class);
    protected SerialField<OneOrZero> buprenorphineRxForPain = new SerialField<OneOrZero>("Buprenorphine for pain", 3416, 3416, OneOrZero.class);
    protected SerialField<OneOrZero> buprenorphineRxForMat = new SerialField<OneOrZero>("Buprenorphine for MAT", 3417, 3417, OneOrZero.class);
    protected SerialField<OneOrZero> buprenorphineRxForUnk = new SerialField<OneOrZero>("Buprenorphine for unknown reason", 3418, 3418, OneOrZero.class);
    protected SerialField<OneOrZero> methadoneRx = new SerialField<OneOrZero>("Methadone prescribed", 3419, 3419, OneOrZero.class);
    protected SerialField<OneOrZero> methadoneRxForPain = new SerialField<OneOrZero>("Methadone for pain", 3420, 3420, OneOrZero.class);
    protected SerialField<OneOrZero> methadoneRxForMat = new SerialField<OneOrZero>("Methadone for MAT", 3421, 3421, OneOrZero.class);
    protected SerialField<OneOrZero> methadoneRxUnk = new SerialField<OneOrZero>("Methadone for unknown reason", 3422, 3422, OneOrZero.class);
    protected SerialField<OneOrZero> naltrexoneRx = new SerialField<OneOrZero>("Naltrexone prescribed", 3423, 3423, OneOrZero.class);
    protected SerialField<OneOrZero> fentanylRx = new SerialField<OneOrZero>("Fentanyl prescribed", 3424, 3424, OneOrZero.class);
    protected SerialField<CharLimitedInteger> numScripsPast30Days = new SerialField<CharLimitedInteger>("Number of opioid prescriptions (past 30 days)", 3425, 3426, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> numPharmaciesPast30Days = new SerialField<CharLimitedInteger>("Number of dispensing pharmacies (past 180 days)", 3427, 3428, CharLimitedInteger.class);
    protected SerialField<CharLimitedInteger> numDoctorsPrescribing30Days = new SerialField<CharLimitedInteger>("Number of prescribing doctors (past 180 days)", 3429, 3430, CharLimitedInteger.class);
    protected SerialField<OneOrZero> isAsianIndian = new SerialField<OneOrZero>("Asian Indian", 3431, 3431, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianChinese = new SerialField<OneOrZero>("Asian Chinese", 3432, 3432, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianFilipino = new SerialField<OneOrZero>("Asian Filipino", 3433, 3433, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianJapanese = new SerialField<OneOrZero>("Asian Japanese", 3434, 3434, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianKorean = new SerialField<OneOrZero>("Asian Korean", 3435, 3435, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianVietnamese = new SerialField<OneOrZero>("Asian Vietnamese", 3436, 3436, OneOrZero.class);
    protected SerialField<OneOrZero> isAsianOther = new SerialField<OneOrZero>("Asian Other", 3437, 3437, OneOrZero.class);
    protected SerialField<String> isAsianOtherText = new SerialField<String>("Asian Other Specify", 3438, 3557, String.class);
    protected SerialField<OneOrZero> isPacificIslanderHawaii = new SerialField<OneOrZero>("Pacific Islander - Native Hawaiian", 3558, 3558, OneOrZero.class);
    protected SerialField<OneOrZero> isPacificIslanderGuam = new SerialField<OneOrZero>("Pacific Islander - Guamanian or Chamorro", 3559, 3559, OneOrZero.class);
    protected SerialField<OneOrZero> isPacificIslanderSamoa = new SerialField<OneOrZero>("Pacific Islander - Samoan", 3560, 3560, OneOrZero.class);
    protected SerialField<OneOrZero> isPacificIslanderOther = new SerialField<OneOrZero>("Pacific Islander - Other", 3561, 3561, OneOrZero.class);
    protected SerialField<OneOrZero> isPacificIslanderOtherText = new SerialField<OneOrZero>("Pacific Islander Other Specify", 3562, 3681, OneOrZero.class);
    protected SerialField<OneOrZero> americanIndianTribe = new SerialField<OneOrZero>("American Indian Tribe", 3682, 3801, OneOrZero.class);
    protected SerialField<String> americanIndianTribeOther = new SerialField<String>("American Indian Other Race Specify", 3802, 3921, String.class);



    public LECMEFormat() {
    }

    public SerialField<YesOrBlank> getForceNewRecord() {
        return this.forceNewRecord;
    }

    public void setForceNewRecord(SerialField<YesOrBlank> forceNewRecord) {
        this.forceNewRecord = forceNewRecord;
    }

    public SerialField<YesOrBlank> getOverwriteConflicts() {
        return this.overwriteConflicts;
    }

    public void setOverwriteConflicts(SerialField<YesOrBlank> overwriteConflicts) {
        this.overwriteConflicts = overwriteConflicts;
    }

    public SerialField<CharLimitedInteger> getIncidentYear() {
        return this.incidentYear;
    }

    public void setIncidentYear(SerialField<CharLimitedInteger> incidentYear) {
        this.incidentYear = incidentYear;
    }

    public SerialField<CharLimitedInteger> getIncidentNumber() {
        return this.incidentNumber;
    }

    public void setIncidentNumber(SerialField<CharLimitedInteger> incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public SerialField<CharLimitedInteger> getVictimNumber() {
        return this.victimNumber;
    }

    public void setVictimNumber(SerialField<CharLimitedInteger> victimNumber) {
        this.victimNumber = victimNumber;
    }

    public SerialField<String> getLastFourDCNumber() {
        return this.lastFourDCNumber;
    }

    public void setLastFourDCNumber(SerialField<String> lastFourDCNumber) {
        this.lastFourDCNumber = lastFourDCNumber;
    }

    public SerialField<String> getLastFourCMENumber() {
        return this.lastFourCMENumber;
    }

    public void setLastFourCMENumber(SerialField<String> lastFourCMENumber) {
        this.lastFourCMENumber = lastFourCMENumber;
    }

    public SerialField<String> getInitialOfLastName() {
        return this.initialOfLastName;
    }

    public void setInitialOfLastName(SerialField<String> initialOfLastName) {
        this.initialOfLastName = initialOfLastName;
    }

    public SerialField<CharLimitedInteger> getBirthDayOfMonth() {
        return this.birthDayOfMonth;
    }

    public void setBirthDayOfMonth(SerialField<CharLimitedInteger> birthDayOfMonth) {
        this.birthDayOfMonth = birthDayOfMonth;
    }

    public SerialField<DeathManner> getDeathMannerAbstractor() {
        return this.deathMannerAbstractor;
    }

    public void setDeathMannerAbstractor(SerialField<DeathManner> deathMannerAbstractor) {
        this.deathMannerAbstractor = deathMannerAbstractor;
    }

    public SerialField<DeathManner> getDeathMannerDC() {
        return this.deathMannerDC;
    }

    public void setDeathMannerDC(SerialField<DeathManner> deathMannerDC) {
        this.deathMannerDC = deathMannerDC;
    }

    public SerialField<DeathManner> getDeathMannerCME() {
        return this.deathMannerCME;
    }

    public void setDeathMannerCME(SerialField<DeathManner> deathMannerCME) {
        this.deathMannerCME = deathMannerCME;
    }

    public SerialField<DeathManner> getDeathMannerLE() {
        return this.deathMannerLE;
    }

    public void setDeathMannerLE(SerialField<DeathManner> deathMannerLE) {
        this.deathMannerLE = deathMannerLE;
    }

    public SerialField<CharLimitedInteger> getDeathDateYear() {
        return this.deathDateYear;
    }

    public void setDeathDateYear(SerialField<CharLimitedInteger> deathDateYear) {
        this.deathDateYear = deathDateYear;
    }

    public SerialField<CharLimitedInteger> getDeathDateMonth() {
        return this.deathDateMonth;
    }

    public void setDeathDateMonth(SerialField<CharLimitedInteger> deathDateMonth) {
        this.deathDateMonth = deathDateMonth;
    }

    public SerialField<CharLimitedInteger> getDeathDateDay() {
        return this.deathDateDay;
    }

    public void setDeathDateDay(SerialField<CharLimitedInteger> deathDateDay) {
        this.deathDateDay = deathDateDay;
    }

    public SerialField<CharLimitedInteger> getDeathState() {
        return this.deathState;
    }

    public void setDeathState(SerialField<CharLimitedInteger> deathState) {
        this.deathState = deathState;
    }

    public SerialField<CharLimitedInteger> getDeathCounty() {
        return this.deathCounty;
    }

    public void setDeathCounty(SerialField<CharLimitedInteger> deathCounty) {
        this.deathCounty = deathCounty;
    }

    public SerialField<CharLimitedInteger> getDeathPronouncedDateYear() {
        return this.deathPronouncedDateYear;
    }

    public void setDeathPronouncedDateYear(SerialField<CharLimitedInteger> deathPronouncedDateYear) {
        this.deathPronouncedDateYear = deathPronouncedDateYear;
    }

    public SerialField<CharLimitedInteger> getDeathPronouncedDateMonth() {
        return this.deathPronouncedDateMonth;
    }

    public void setDeathPronouncedDateMonth(SerialField<CharLimitedInteger> deathPronouncedDateMonth) {
        this.deathPronouncedDateMonth = deathPronouncedDateMonth;
    }

    public SerialField<CharLimitedInteger> getDeathPronouncedDateDay() {
        return this.deathPronouncedDateDay;
    }

    public void setDeathPronouncedDateDay(SerialField<CharLimitedInteger> deathPronouncedDateDay) {
        this.deathPronouncedDateDay = deathPronouncedDateDay;
    }

    public SerialField<DeathPlace> getDeathPlace() {
        return this.deathPlace;
    }

    public void setDeathPlace(SerialField<DeathPlace> deathPlace) {
        this.deathPlace = deathPlace;
    }

    public SerialField<String> getDeathPlaceText() {
        return this.deathPlaceText;
    }

    public void setDeathPlaceText(SerialField<String> deathPlaceText) {
        this.deathPlaceText = deathPlaceText;
    }

    public SerialField<AutopsyPerformed> getAutopsyPerformed() {
        return this.autopsyPerformed;
    }

    public void setAutopsyPerformed(SerialField<AutopsyPerformed> autopsyPerformed) {
        this.autopsyPerformed = autopsyPerformed;
    }

    public SerialField<CharLimitedInteger> getInjuryDateYear() {
        return this.injuryDateYear;
    }

    public void setInjuryDateYear(SerialField<CharLimitedInteger> injuryDateYear) {
        this.injuryDateYear = injuryDateYear;
    }

    public SerialField<CharLimitedInteger> getInjuryDateMonth() {
        return this.injuryDateMonth;
    }

    public void setInjuryDateMonth(SerialField<CharLimitedInteger> injuryDateMonth) {
        this.injuryDateMonth = injuryDateMonth;
    }

    public SerialField<CharLimitedInteger> getInjuryDateDay() {
        return this.injuryDateDay;
    }

    public void setInjuryDateDay(SerialField<CharLimitedInteger> injuryDateDay) {
        this.injuryDateDay = injuryDateDay;
    }

    public SerialField<String> getInjuryTime() {
        return this.injuryTime;
    }

    public void setInjuryTime(SerialField<String> injuryTime) {
        this.injuryTime = injuryTime;
    }

    public SerialField<CharLimitedInteger> getSurvivalTime() {
        return this.survivalTime;
    }

    public void setSurvivalTime(SerialField<CharLimitedInteger> survivalTime) {
        this.survivalTime = survivalTime;
    }

    public SerialField<AgeUnits> getSurvivalTimeUnit() {
        return this.survivalTimeUnit;
    }

    public void setSurvivalTimeUnit(SerialField<AgeUnits> survivalTimeUnit) {
        this.survivalTimeUnit = survivalTimeUnit;
    }

    public SerialField<InjuryLocation> getInjuryLocation() {
        return this.injuryLocation;
    }

    public void setInjuryLocation(SerialField<InjuryLocation> injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

    public SerialField<OneOrZero> getInjuredAtWork() {
        return this.injuredAtWork;
    }

    public void setInjuredAtWork(SerialField<OneOrZero> injuredAtWork) {
        this.injuredAtWork = injuredAtWork;
    }

    public SerialField<OneOrZero> getInjuredAtVictimHome() {
        return this.injuredAtVictimHome;
    }

    public void setInjuredAtVictimHome(SerialField<OneOrZero> injuredAtVictimHome) {
        this.injuredAtVictimHome = injuredAtVictimHome;
    }

    public SerialField<OneOrZero> getEMSPresent() {
        return this.eMSPresent;
    }

    public void setEMSPresent(SerialField<OneOrZero> eMSPresent) {
        this.eMSPresent = eMSPresent;
    }

    public SerialField<OneOrZero> getVictimInCustody() {
        return this.victimInCustody;
    }

    public void setVictimInCustody(SerialField<OneOrZero> victimInCustody) {
        this.victimInCustody = victimInCustody;
    }

    public SerialField<OneOrZero> getAlcoholUseSuspected() {
        return this.alcoholUseSuspected;
    }

    public void setAlcoholUseSuspected(SerialField<OneOrZero> alcoholUseSuspected) {
        this.alcoholUseSuspected = alcoholUseSuspected;
    }

    public SerialField<FIPSCodes> getInjuryState() {
        return this.injuryState;
    }

    public void setInjuryState(SerialField<FIPSCodes> injuryState) {
        this.injuryState = injuryState;
    }

    public SerialField<CharLimitedInteger> getInjuryCounty() {
        return this.injuryCounty;
    }

    public void setInjuryCounty(SerialField<CharLimitedInteger> injuryCounty) {
        this.injuryCounty = injuryCounty;
    }

    public SerialField<CharLimitedInteger> getInjuryCity() {
        return this.injuryCity;
    }

    public void setInjuryCity(SerialField<CharLimitedInteger> injuryCity) {
        this.injuryCity = injuryCity;
    }

    public SerialField<CharLimitedInteger> getInjuryZip() {
        return this.injuryZip;
    }

    public void setInjuryZip(SerialField<CharLimitedInteger> injuryZip) {
        this.injuryZip = injuryZip;
    }

    public SerialField<String> getCensusTract() {
        return this.censusTract;
    }

    public void setCensusTract(SerialField<String> censusTract) {
        this.censusTract = censusTract;
    }

    public SerialField<CharLimitedInteger> getCensusBlock() {
        return this.censusBlock;
    }

    public void setCensusBlock(SerialField<CharLimitedInteger> censusBlock) {
        this.censusBlock = censusBlock;
    }

    public SerialField<OneOrZero> getSexVictim() {
        return this.sexVictim;
    }

    public void setSexVictim(SerialField<OneOrZero> sexVictim) {
        this.sexVictim = sexVictim;
    }

    public SerialField<OneOrZero> getSexualOrientation() {
        return this.sexualOrientation;
    }

    public void setSexualOrientation(SerialField<OneOrZero> sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public SerialField<OneOrZero> getTransgender() {
        return this.transgender;
    }

    public void setTransgender(SerialField<OneOrZero> transgender) {
        this.transgender = transgender;
    }

    public SerialField<CharLimitedInteger> getAge() {
        return this.age;
    }

    public void setAge(SerialField<CharLimitedInteger> age) {
        this.age = age;
    }

    public SerialField<AgeUnits> getAgeUnit() {
        return this.ageUnit;
    }

    public void setAgeUnit(SerialField<AgeUnits> ageUnit) {
        this.ageUnit = ageUnit;
    }

    public SerialField<OneOrZero> getEthnicityVictim() {
        return this.ethnicityVictim;
    }

    public void setEthnicityVictim(SerialField<OneOrZero> ethnicityVictim) {
        this.ethnicityVictim = ethnicityVictim;
    }

    public SerialField<OneOrZero> getRaceWhiteVictim() {
        return this.raceWhiteVictim;
    }

    public void setRaceWhiteVictim(SerialField<OneOrZero> raceWhiteVictim) {
        this.raceWhiteVictim = raceWhiteVictim;
    }

    public SerialField<OneOrZero> getRaceBlackVictim() {
        return this.raceBlackVictim;
    }

    public void setRaceBlackVictim(SerialField<OneOrZero> raceBlackVictim) {
        this.raceBlackVictim = raceBlackVictim;
    }

    public SerialField<OneOrZero> getRaceAmericanIndianVictim() {
        return this.raceAmericanIndianVictim;
    }

    public void setRaceAmericanIndianVictim(SerialField<OneOrZero> raceAmericanIndianVictim) {
        this.raceAmericanIndianVictim = raceAmericanIndianVictim;
    }

    public SerialField<OneOrZero> getRaceAsianVictim() {
        return this.raceAsianVictim;
    }

    public void setRaceAsianVictim(SerialField<OneOrZero> raceAsianVictim) {
        this.raceAsianVictim = raceAsianVictim;
    }

    public SerialField<OneOrZero> getRacePacificIslanderVictim() {
        return this.racePacificIslanderVictim;
    }

    public void setRacePacificIslanderVictim(SerialField<OneOrZero> racePacificIslanderVictim) {
        this.racePacificIslanderVictim = racePacificIslanderVictim;
    }

    public SerialField<OneOrZero> getRaceOtherVictim() {
        return this.raceOtherVictim;
    }

    public void setRaceOtherVictim(SerialField<OneOrZero> raceOtherVictim) {
        this.raceOtherVictim = raceOtherVictim;
    }

    public SerialField<OneOrZero> getRaceUnspecifiedVictim() {
        return this.raceUnspecifiedVictim;
    }

    public void setRaceUnspecifiedVictim(SerialField<OneOrZero> raceUnspecifiedVictim) {
        this.raceUnspecifiedVictim = raceUnspecifiedVictim;
    }

    public SerialField<CharLimitedInteger> getHeightFeet() {
        return this.heightFeet;
    }

    public void setHeightFeet(SerialField<CharLimitedInteger> heightFeet) {
        this.heightFeet = heightFeet;
    }

    public SerialField<CharLimitedInteger> getHeightInches() {
        return this.heightInches;
    }

    public void setHeightInches(SerialField<CharLimitedInteger> heightInches) {
        this.heightInches = heightInches;
    }

    public SerialField<CharLimitedInteger> getWeight() {
        return this.weight;
    }

    public void setWeight(SerialField<CharLimitedInteger> weight) {
        this.weight = weight;
    }

    public SerialField<CharLimitedInteger> getPregnant() {
        return this.pregnant;
    }

    public void setPregnant(SerialField<CharLimitedInteger> pregnant) {
        this.pregnant = pregnant;
    }

    public SerialField<MaritalStatus> getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(SerialField<MaritalStatus> maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public SerialField<MilitaryBackground> getMilitary() {
        return this.military;
    }

    public void setMilitary(SerialField<MilitaryBackground> military) {
        this.military = military;
    }

    public SerialField<OneOrZero> getHomeless() {
        return this.homeless;
    }

    public void setHomeless(SerialField<OneOrZero> homeless) {
        this.homeless = homeless;
    }

    public SerialField<OneOrZero> getRecentRelease() {
        return this.recentRelease;
    }

    public void setRecentRelease(SerialField<OneOrZero> recentRelease) {
        this.recentRelease = recentRelease;
    }

    public SerialField<EducationLevel> getEducationLevel() {
        return this.educationLevel;
    }

    public void setEducationLevel(SerialField<EducationLevel> educationLevel) {
        this.educationLevel = educationLevel;
    }

    public SerialField<CharLimitedInteger> getEducationYears() {
        return this.educationYears;
    }

    public void setEducationYears(SerialField<CharLimitedInteger> educationYears) {
        this.educationYears = educationYears;
    }

    public SerialField<CharLimitedInteger> getIndustry() {
        return this.industry;
    }

    public void setIndustry(SerialField<CharLimitedInteger> industry) {
        this.industry = industry;
    }

    public SerialField<String> getIndustryText() {
        return this.industryText;
    }

    public void setIndustryText(SerialField<String> industryText) {
        this.industryText = industryText;
    }

    public SerialField<String> getOccupationText() {
        return this.occupationText;
    }

    public void setOccupationText(SerialField<String> occupationText) {
        this.occupationText = occupationText;
    }

    public SerialField<CharLimitedInteger> getUsualOccupation() {
        return this.usualOccupation;
    }

    public void setUsualOccupation(SerialField<CharLimitedInteger> usualOccupation) {
        this.usualOccupation = usualOccupation;
    }

    public SerialField<String> getOccupationCurrentText() {
        return this.occupationCurrentText;
    }

    public void setOccupationCurrentText(SerialField<String> occupationCurrentText) {
        this.occupationCurrentText = occupationCurrentText;
    }

    public SerialField<CharLimitedInteger> getBirthPlace() {
        return this.birthPlace;
    }

    public void setBirthPlace(SerialField<CharLimitedInteger> birthPlace) {
        this.birthPlace = birthPlace;
    }

    public SerialField<String> getBirthCountryOther() {
        return this.birthCountryOther;
    }

    public void setBirthCountryOther(SerialField<String> birthCountryOther) {
        this.birthCountryOther = birthCountryOther;
    }

    public SerialField<FIPSCountryCodes> getCountry() {
        return this.country;
    }

    public void setCountry(SerialField<FIPSCountryCodes> country) {
        this.country = country;
    }

    public SerialField<FIPSCodes> getResidenceState() {
        return this.residenceState;
    }

    public void setResidenceState(SerialField<FIPSCodes> residenceState) {
        this.residenceState = residenceState;
    }

    public SerialField<CharLimitedInteger> getResidenceCounty() {
        return this.residenceCounty;
    }

    public void setResidenceCounty(SerialField<CharLimitedInteger> residenceCounty) {
        this.residenceCounty = residenceCounty;
    }

    public SerialField<CharLimitedInteger> getResidenceCity() {
        return this.residenceCity;
    }

    public void setResidenceCity(SerialField<CharLimitedInteger> residenceCity) {
        this.residenceCity = residenceCity;
    }

    public SerialField<CharLimitedInteger> getResidenceZip() {
        return this.residenceZip;
    }

    public void setResidenceZip(SerialField<CharLimitedInteger> residenceZip) {
        this.residenceZip = residenceZip;
    }

    public SerialField<String> getResidenceCensusTract() {
        return this.residenceCensusTract;
    }

    public void setResidenceCensusTract(SerialField<String> residenceCensusTract) {
        this.residenceCensusTract = residenceCensusTract;
    }

    public SerialField<CharLimitedInteger> getResidenceCensusBlock() {
        return this.residenceCensusBlock;
    }

    public void setResidenceCensusBlock(SerialField<CharLimitedInteger> residenceCensusBlock) {
        this.residenceCensusBlock = residenceCensusBlock;
    }

    public SerialField<CharLimitedInteger> getToxicologyNotAvailable() {
        return this.toxicologyNotAvailable;
    }

    public void setToxicologyNotAvailable(SerialField<CharLimitedInteger> toxicologyNotAvailable) {
        this.toxicologyNotAvailable = toxicologyNotAvailable;
    }

    public SerialField<CharLimitedInteger> getSpecimensDateYear() {
        return this.specimensDateYear;
    }

    public void setSpecimensDateYear(SerialField<CharLimitedInteger> specimensDateYear) {
        this.specimensDateYear = specimensDateYear;
    }

    public SerialField<CharLimitedInteger> getSpecimensDateMonth() {
        return this.specimensDateMonth;
    }

    public void setSpecimensDateMonth(SerialField<CharLimitedInteger> specimensDateMonth) {
        this.specimensDateMonth = specimensDateMonth;
    }

    public SerialField<CharLimitedInteger> getSpecimensDateDay() {
        return this.specimensDateDay;
    }

    public void setSpecimensDateDay(SerialField<CharLimitedInteger> specimensDateDay) {
        this.specimensDateDay = specimensDateDay;
    }

    public SerialField<CharLimitedInteger> getSpecimensTime() {
        return this.specimensTime;
    }

    public void setSpecimensTime(SerialField<CharLimitedInteger> specimensTime) {
        this.specimensTime = specimensTime;
    }

    public SerialField<OneOrZero> getAlcoholTested() {
        return this.alcoholTested;
    }

    public void setAlcoholTested(SerialField<OneOrZero> alcoholTested) {
        this.alcoholTested = alcoholTested;
    }

    public SerialField<OneOrZero> getAlcoholResult() {
        return this.alcoholResult;
    }

    public void setAlcoholResult(SerialField<OneOrZero> alcoholResult) {
        this.alcoholResult = alcoholResult;
    }

    public SerialField<CharLimitedInteger> getAlcoholLevel() {
        return this.alcoholLevel;
    }

    public void setAlcoholLevel(SerialField<CharLimitedInteger> alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    }

    public SerialField<OneOrZero> getAmphetamineTested() {
        return this.amphetamineTested;
    }

    public void setAmphetamineTested(SerialField<OneOrZero> amphetamineTested) {
        this.amphetamineTested = amphetamineTested;
    }

    public SerialField<OneOrZero> getAmphetamineResult() {
        return this.amphetamineResult;
    }

    public void setAmphetamineResult(SerialField<OneOrZero> amphetamineResult) {
        this.amphetamineResult = amphetamineResult;
    }

    public SerialField<OneOrZero> getAnticonvulsantsTested() {
        return this.anticonvulsantsTested;
    }

    public void setAnticonvulsantsTested(SerialField<OneOrZero> anticonvulsantsTested) {
        this.anticonvulsantsTested = anticonvulsantsTested;
    }

    public SerialField<OneOrZero> getAnticonvulsantsResult() {
        return this.anticonvulsantsResult;
    }

    public void setAnticonvulsantsResult(SerialField<OneOrZero> anticonvulsantsResult) {
        this.anticonvulsantsResult = anticonvulsantsResult;
    }

    public SerialField<OneOrZero> getAntidepressantTested() {
        return this.antidepressantTested;
    }

    public void setAntidepressantTested(SerialField<OneOrZero> antidepressantTested) {
        this.antidepressantTested = antidepressantTested;
    }

    public SerialField<OneOrZero> getAntidepressantResult() {
        return this.antidepressantResult;
    }

    public void setAntidepressantResult(SerialField<OneOrZero> antidepressantResult) {
        this.antidepressantResult = antidepressantResult;
    }

    public SerialField<OneOrZero> getAntipsychoticTested() {
        return this.antipsychoticTested;
    }

    public void setAntipsychoticTested(SerialField<OneOrZero> antipsychoticTested) {
        this.antipsychoticTested = antipsychoticTested;
    }

    public SerialField<OneOrZero> getAntipsychoticResult() {
        return this.antipsychoticResult;
    }

    public void setAntipsychoticResult(SerialField<OneOrZero> antipsychoticResult) {
        this.antipsychoticResult = antipsychoticResult;
    }

    public SerialField<OneOrZero> getBarbituratesTested() {
        return this.barbituratesTested;
    }

    public void setBarbituratesTested(SerialField<OneOrZero> barbituratesTested) {
        this.barbituratesTested = barbituratesTested;
    }

    public SerialField<OneOrZero> getBarbituratesResult() {
        return this.barbituratesResult;
    }

    public void setBarbituratesResult(SerialField<OneOrZero> barbituratesResult) {
        this.barbituratesResult = barbituratesResult;
    }

    public SerialField<OneOrZero> getBenzodiazepinesTested() {
        return this.benzodiazepinesTested;
    }

    public void setBenzodiazepinesTested(SerialField<OneOrZero> benzodiazepinesTested) {
        this.benzodiazepinesTested = benzodiazepinesTested;
    }

    public SerialField<OneOrZero> getBenzodiazepinesResult() {
        return this.benzodiazepinesResult;
    }

    public void setBenzodiazepinesResult(SerialField<OneOrZero> benzodiazepinesResult) {
        this.benzodiazepinesResult = benzodiazepinesResult;
    }

    public SerialField<OneOrZero> getCarbonMonoxideTested() {
        return this.carbonMonoxideTested;
    }

    public void setCarbonMonoxideTested(SerialField<OneOrZero> carbonMonoxideTested) {
        this.carbonMonoxideTested = carbonMonoxideTested;
    }

    public SerialField<OneOrZero> getCarbonMonoxideResult() {
        return this.carbonMonoxideResult;
    }

    public void setCarbonMonoxideResult(SerialField<OneOrZero> carbonMonoxideResult) {
        this.carbonMonoxideResult = carbonMonoxideResult;
    }

    public SerialField<OneOrZero> getCarbonMonoxideSource() {
        return this.carbonMonoxideSource;
    }

    public void setCarbonMonoxideSource(SerialField<OneOrZero> carbonMonoxideSource) {
        this.carbonMonoxideSource = carbonMonoxideSource;
    }

    public SerialField<OneOrZero> getCocaineTested() {
        return this.cocaineTested;
    }

    public void setCocaineTested(SerialField<OneOrZero> cocaineTested) {
        this.cocaineTested = cocaineTested;
    }

    public SerialField<OneOrZero> getCocaineResult() {
        return this.cocaineResult;
    }

    public void setCocaineResult(SerialField<OneOrZero> cocaineResult) {
        this.cocaineResult = cocaineResult;
    }

    public SerialField<OneOrZero> getMarijuanaTested() {
        return this.marijuanaTested;
    }

    public void setMarijuanaTested(SerialField<OneOrZero> marijuanaTested) {
        this.marijuanaTested = marijuanaTested;
    }

    public SerialField<OneOrZero> getMarijuanaResult() {
        return this.marijuanaResult;
    }

    public void setMarijuanaResult(SerialField<OneOrZero> marijuanaResult) {
        this.marijuanaResult = marijuanaResult;
    }

    public SerialField<OneOrZero> getMuscleRelaxorTested() {
        return this.muscleRelaxorTested;
    }

    public void setMuscleRelaxorTested(SerialField<OneOrZero> muscleRelaxorTested) {
        this.muscleRelaxorTested = muscleRelaxorTested;
    }

    public SerialField<OneOrZero> getMuscleRelaxorResult() {
        return this.muscleRelaxorResult;
    }

    public void setMuscleRelaxorResult(SerialField<OneOrZero> muscleRelaxorResult) {
        this.muscleRelaxorResult = muscleRelaxorResult;
    }

    public SerialField<OneOrZero> getOpiateTested() {
        return this.opiateTested;
    }

    public void setOpiateTested(SerialField<OneOrZero> opiateTested) {
        this.opiateTested = opiateTested;
    }

    public SerialField<OneOrZero> getOpiateResult() {
        return this.opiateResult;
    }

    public void setOpiateResult(SerialField<OneOrZero> opiateResult) {
        this.opiateResult = opiateResult;
    }

    public SerialField<CharLimitedInteger> getNumberWounds() {
        return this.numberWounds;
    }

    public void setNumberWounds(SerialField<CharLimitedInteger> numberWounds) {
        this.numberWounds = numberWounds;
    }

    public SerialField<CharLimitedInteger> getNumberBullets() {
        return this.numberBullets;
    }

    public void setNumberBullets(SerialField<CharLimitedInteger> numberBullets) {
        this.numberBullets = numberBullets;
    }

    public SerialField<OneOrZero> getWoundToHead() {
        return this.woundToHead;
    }

    public void setWoundToHead(SerialField<OneOrZero> woundToHead) {
        this.woundToHead = woundToHead;
    }

    public SerialField<OneOrZero> getWoundToFace() {
        return this.woundToFace;
    }

    public void setWoundToFace(SerialField<OneOrZero> woundToFace) {
        this.woundToFace = woundToFace;
    }

    public SerialField<OneOrZero> getWoundToNeck() {
        return this.woundToNeck;
    }

    public void setWoundToNeck(SerialField<OneOrZero> woundToNeck) {
        this.woundToNeck = woundToNeck;
    }

    public SerialField<OneOrZero> getWoundToUpperExtremity() {
        return this.woundToUpperExtremity;
    }

    public void setWoundToUpperExtremity(SerialField<OneOrZero> woundToUpperExtremity) {
        this.woundToUpperExtremity = woundToUpperExtremity;
    }

    public SerialField<OneOrZero> getWoundToSpine() {
        return this.woundToSpine;
    }

    public void setWoundToSpine(SerialField<OneOrZero> woundToSpine) {
        this.woundToSpine = woundToSpine;
    }

    public SerialField<OneOrZero> getWoundToThorax() {
        return this.woundToThorax;
    }

    public void setWoundToThorax(SerialField<OneOrZero> woundToThorax) {
        this.woundToThorax = woundToThorax;
    }

    public SerialField<OneOrZero> getWoundToAbdomen() {
        return this.woundToAbdomen;
    }

    public void setWoundToAbdomen(SerialField<OneOrZero> woundToAbdomen) {
        this.woundToAbdomen = woundToAbdomen;
    }

    public SerialField<OneOrZero> getWoundToLowerExtremity() {
        return this.woundToLowerExtremity;
    }

    public void setWoundToLowerExtremity(SerialField<OneOrZero> woundToLowerExtremity) {
        this.woundToLowerExtremity = woundToLowerExtremity;
    }

    public SerialField<OneOrZero> getCircumstancesKnownCME() {
        return this.circumstancesKnownCME;
    }

    public void setCircumstancesKnownCME(SerialField<OneOrZero> circumstancesKnownCME) {
        this.circumstancesKnownCME = circumstancesKnownCME;
    }

    public SerialField<OneOrZero> getAbusedAsChildCME() {
        return this.abusedAsChildCME;
    }

    public void setAbusedAsChildCME(SerialField<OneOrZero> abusedAsChildCME) {
        this.abusedAsChildCME = abusedAsChildCME;
    }

    public SerialField<OneOrZero> getAlcoholProblemCME() {
        return this.alcoholProblemCME;
    }

    public void setAlcoholProblemCME(SerialField<OneOrZero> alcoholProblemCME) {
        this.alcoholProblemCME = alcoholProblemCME;
    }

    public SerialField<OneOrZero> getArgumentCME() {
        return this.argumentCME;
    }

    public void setArgumentCME(SerialField<OneOrZero> argumentCME) {
        this.argumentCME = argumentCME;
    }

    public SerialField<OneOrZero> getArgumentOtherCME() {
        return this.argumentOtherCME;
    }

    public void setArgumentOtherCME(SerialField<OneOrZero> argumentOtherCME) {
        this.argumentOtherCME = argumentOtherCME;
    }

    public SerialField<OneOrZero> getArgumentTimingCME() {
        return this.argumentTimingCME;
    }

    public void setArgumentTimingCME(SerialField<OneOrZero> argumentTimingCME) {
        this.argumentTimingCME = argumentTimingCME;
    }

    public SerialField<OneOrZero> getBrawlCME() {
        return this.brawlCME;
    }

    public void setBrawlCME(SerialField<OneOrZero> brawlCME) {
        this.brawlCME = brawlCME;
    }

    public SerialField<OneOrZero> getBulletRicochetCME() {
        return this.bulletRicochetCME;
    }

    public void setBulletRicochetCME(SerialField<OneOrZero> bulletRicochetCME) {
        this.bulletRicochetCME = bulletRicochetCME;
    }

    public SerialField<OneOrZero> getBystanderCME() {
        return this.bystanderCME;
    }

    public void setBystanderCME(SerialField<OneOrZero> bystanderCME) {
        this.bystanderCME = bystanderCME;
    }

    public SerialField<OneOrZero> getCelebratoryFiringCME() {
        return this.celebratoryFiringCME;
    }

    public void setCelebratoryFiringCME(SerialField<OneOrZero> celebratoryFiringCME) {
        this.celebratoryFiringCME = celebratoryFiringCME;
    }

    public SerialField<OneOrZero> getCircumstancesOtherCME() {
        return this.circumstancesOtherCME;
    }

    public void setCircumstancesOtherCME(SerialField<OneOrZero> circumstancesOtherCME) {
        this.circumstancesOtherCME = circumstancesOtherCME;
    }

    public SerialField<String> getCircumstancesOtherTextCME() {
        return this.circumstancesOtherTextCME;
    }

    public void setCircumstancesOtherTextCME(SerialField<String> circumstancesOtherTextCME) {
        this.circumstancesOtherTextCME = circumstancesOtherTextCME;
    }

    public SerialField<OneOrZero> getCrisisProstitutionCME() {
        return this.crisisProstitutionCME;
    }

    public void setCrisisProstitutionCME(SerialField<OneOrZero> crisisProstitutionCME) {
        this.crisisProstitutionCME = crisisProstitutionCME;
    }

    public SerialField<OneOrZero> getCrisisAlcoholProblemCME() {
        return this.crisisAlcoholProblemCME;
    }

    public void setCrisisAlcoholProblemCME(SerialField<OneOrZero> crisisAlcoholProblemCME) {
        this.crisisAlcoholProblemCME = crisisAlcoholProblemCME;
    }

    public SerialField<OneOrZero> getCrisisCivilLegalCME() {
        return this.crisisCivilLegalCME;
    }

    public void setCrisisCivilLegalCME(SerialField<OneOrZero> crisisCivilLegalCME) {
        this.crisisCivilLegalCME = crisisCivilLegalCME;
    }

    public SerialField<OneOrZero> getCrisisCriminalCME() {
        return this.crisisCriminalCME;
    }

    public void setCrisisCriminalCME(SerialField<OneOrZero> crisisCriminalCME) {
        this.crisisCriminalCME = crisisCriminalCME;
    }

    public SerialField<OneOrZero> getCrisisDisasterExposureCME() {
        return this.crisisDisasterExposureCME;
    }

    public void setCrisisDisasterExposureCME(SerialField<OneOrZero> crisisDisasterExposureCME) {
        this.crisisDisasterExposureCME = crisisDisasterExposureCME;
    }

    public SerialField<OneOrZero> getCrisisEvictionCME() {
        return this.crisisEvictionCME;
    }

    public void setCrisisEvictionCME(SerialField<OneOrZero> crisisEvictionCME) {
        this.crisisEvictionCME = crisisEvictionCME;
    }

    public SerialField<OneOrZero> getCrisisFamilyStressorCME() {
        return this.crisisFamilyStressorCME;
    }

    public void setCrisisFamilyStressorCME(SerialField<OneOrZero> crisisFamilyStressorCME) {
        this.crisisFamilyStressorCME = crisisFamilyStressorCME;
    }

    public SerialField<OneOrZero> getCrisisFinancialCME() {
        return this.crisisFinancialCME;
    }

    public void setCrisisFinancialCME(SerialField<OneOrZero> crisisFinancialCME) {
        this.crisisFinancialCME = crisisFinancialCME;
    }

    public SerialField<OneOrZero> getCrisisIntimatePartnerProblemCME() {
        return this.crisisIntimatePartnerProblemCME;
    }

    public void setCrisisIntimatePartnerProblemCME(SerialField<OneOrZero> crisisIntimatePartnerProblemCME) {
        this.crisisIntimatePartnerProblemCME = crisisIntimatePartnerProblemCME;
    }

    public SerialField<OneOrZero> getCrisisJealousyCME() {
        return this.crisisJealousyCME;
    }

    public void setCrisisJealousyCME(SerialField<OneOrZero> crisisJealousyCME) {
        this.crisisJealousyCME = crisisJealousyCME;
    }

    public SerialField<OneOrZero> getCrisisJobCME() {
        return this.crisisJobCME;
    }

    public void setCrisisJobCME(SerialField<OneOrZero> crisisJobCME) {
        this.crisisJobCME = crisisJobCME;
    }

    public SerialField<OneOrZero> getCrisisMentalHealthCME() {
        return this.crisisMentalHealthCME;
    }

    public void setCrisisMentalHealthCME(SerialField<OneOrZero> crisisMentalHealthCME) {
        this.crisisMentalHealthCME = crisisMentalHealthCME;
    }

    public SerialField<OneOrZero> getCrisisOtherAddictionCME() {
        return this.crisisOtherAddictionCME;
    }

    public void setCrisisOtherAddictionCME(SerialField<OneOrZero> crisisOtherAddictionCME) {
        this.crisisOtherAddictionCME = crisisOtherAddictionCME;
    }

    public SerialField<OneOrZero> getCrisisPhysicalHealthCME() {
        return this.crisisPhysicalHealthCME;
    }

    public void setCrisisPhysicalHealthCME(SerialField<OneOrZero> crisisPhysicalHealthCME) {
        this.crisisPhysicalHealthCME = crisisPhysicalHealthCME;
    }

    public SerialField<OneOrZero> getCrisisRelatedDeathFriendOrFamilyOtherCME() {
        return this.crisisRelatedDeathFriendOrFamilyOtherCME;
    }

    public void setCrisisRelatedDeathFriendOrFamilyOtherCME(SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherCME) {
        this.crisisRelatedDeathFriendOrFamilyOtherCME = crisisRelatedDeathFriendOrFamilyOtherCME;
    }

    public SerialField<OneOrZero> getCrisisRelatedSuicideFriendOrFamilyCME() {
        return this.crisisRelatedSuicideFriendOrFamilyCME;
    }

    public void setCrisisRelatedSuicideFriendOrFamilyCME(SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyCME) {
        this.crisisRelatedSuicideFriendOrFamilyCME = crisisRelatedSuicideFriendOrFamilyCME;
    }

    public SerialField<OneOrZero> getCrisisRelationshipProblemOtherCME() {
        return this.crisisRelationshipProblemOtherCME;
    }

    public void setCrisisRelationshipProblemOtherCME(SerialField<OneOrZero> crisisRelationshipProblemOtherCME) {
        this.crisisRelationshipProblemOtherCME = crisisRelationshipProblemOtherCME;
    }

    public SerialField<OneOrZero> getCrisisSchoolCME() {
        return this.crisisSchoolCME;
    }

    public void setCrisisSchoolCME(SerialField<OneOrZero> crisisSchoolCME) {
        this.crisisSchoolCME = crisisSchoolCME;
    }

    public SerialField<OneOrZero> getCrisisStalkingCME() {
        return this.crisisStalkingCME;
    }

    public void setCrisisStalkingCME(SerialField<OneOrZero> crisisStalkingCME) {
        this.crisisStalkingCME = crisisStalkingCME;
    }

    public SerialField<OneOrZero> getCrisisSubstanceAbuseCME() {
        return this.crisisSubstanceAbuseCME;
    }

    public void setCrisisSubstanceAbuseCME(SerialField<OneOrZero> crisisSubstanceAbuseCME) {
        this.crisisSubstanceAbuseCME = crisisSubstanceAbuseCME;
    }

    public SerialField<OneOrZero> getDeathAbuseCME() {
        return this.deathAbuseCME;
    }

    public void setDeathAbuseCME(SerialField<OneOrZero> deathAbuseCME) {
        this.deathAbuseCME = deathAbuseCME;
    }

    public SerialField<OneOrZero> getDeathFriendOrFamilyOtherCME() {
        return this.deathFriendOrFamilyOtherCME;
    }

    public void setDeathFriendOrFamilyOtherCME(SerialField<OneOrZero> deathFriendOrFamilyOtherCME) {
        this.deathFriendOrFamilyOtherCME = deathFriendOrFamilyOtherCME;
    }

    public SerialField<OneOrZero> getDepressedMoodCME() {
        return this.depressedMoodCME;
    }

    public void setDepressedMoodCME(SerialField<OneOrZero> depressedMoodCME) {
        this.depressedMoodCME = depressedMoodCME;
    }

    public SerialField<OneOrZero> getDisasterExposureCME() {
        return this.disasterExposureCME;
    }

    public void setDisasterExposureCME(SerialField<OneOrZero> disasterExposureCME) {
        this.disasterExposureCME = disasterExposureCME;
    }

    public SerialField<OneOrZero> getDisclosedIntentToWhomCME() {
        return this.disclosedIntentToWhomCME;
    }

    public void setDisclosedIntentToWhomCME(SerialField<OneOrZero> disclosedIntentToWhomCME) {
        this.disclosedIntentToWhomCME = disclosedIntentToWhomCME;
    }

    public SerialField<OneOrZero> getDriveByShootingCME() {
        return this.driveByShootingCME;
    }

    public void setDriveByShootingCME(SerialField<OneOrZero> driveByShootingCME) {
        this.driveByShootingCME = driveByShootingCME;
    }

    public SerialField<OneOrZero> getDrugInvolvementCME() {
        return this.drugInvolvementCME;
    }

    public void setDrugInvolvementCME(SerialField<OneOrZero> drugInvolvementCME) {
        this.drugInvolvementCME = drugInvolvementCME;
    }

    public SerialField<OneOrZero> getEvictionOrLossOfHomeCME() {
        return this.evictionOrLossOfHomeCME;
    }

    public void setEvictionOrLossOfHomeCME(SerialField<OneOrZero> evictionOrLossOfHomeCME) {
        this.evictionOrLossOfHomeCME = evictionOrLossOfHomeCME;
    }

    public SerialField<OneOrZero> getFightBetweenTwoPeopleCME() {
        return this.fightBetweenTwoPeopleCME;
    }

    public void setFightBetweenTwoPeopleCME(SerialField<OneOrZero> fightBetweenTwoPeopleCME) {
        this.fightBetweenTwoPeopleCME = fightBetweenTwoPeopleCME;
    }

    public SerialField<OneOrZero> getFinancialProblemCME() {
        return this.financialProblemCME;
    }

    public void setFinancialProblemCME(SerialField<OneOrZero> financialProblemCME) {
        this.financialProblemCME = financialProblemCME;
    }

    public SerialField<OneOrZero> getUnused1() {
        return this.unused1;
    }

    public void setUnused1(SerialField<OneOrZero> unused1) {
        this.unused1 = unused1;
    }

    public SerialField<OneOrZero> getGangRelatedCME() {
        return this.gangRelatedCME;
    }

    public void setGangRelatedCME(SerialField<OneOrZero> gangRelatedCME) {
        this.gangRelatedCME = gangRelatedCME;
    }

    public SerialField<OneOrZero> getGunCleaningCME() {
        return this.gunCleaningCME;
    }

    public void setGunCleaningCME(SerialField<OneOrZero> gunCleaningCME) {
        this.gunCleaningCME = gunCleaningCME;
    }

    public SerialField<OneOrZero> getGunDefectMalfunctionCME() {
        return this.gunDefectMalfunctionCME;
    }

    public void setGunDefectMalfunctionCME(SerialField<OneOrZero> gunDefectMalfunctionCME) {
        this.gunDefectMalfunctionCME = gunDefectMalfunctionCME;
    }

    public SerialField<OneOrZero> getGunDroppedCME() {
        return this.gunDroppedCME;
    }

    public void setGunDroppedCME(SerialField<OneOrZero> gunDroppedCME) {
        this.gunDroppedCME = gunDroppedCME;
    }

    public SerialField<OneOrZero> getGunFiredHolsteringCME() {
        return this.gunFiredHolsteringCME;
    }

    public void setGunFiredHolsteringCME(SerialField<OneOrZero> gunFiredHolsteringCME) {
        this.gunFiredHolsteringCME = gunFiredHolsteringCME;
    }

    public SerialField<OneOrZero> getGunFiredLoadingUnloadingCME() {
        return this.gunFiredLoadingUnloadingCME;
    }

    public void setGunFiredLoadingUnloadingCME(SerialField<OneOrZero> gunFiredLoadingUnloadingCME) {
        this.gunFiredLoadingUnloadingCME = gunFiredLoadingUnloadingCME;
    }

    public SerialField<OneOrZero> getGunFiredOperatingSafetyLockCME() {
        return this.gunFiredOperatingSafetyLockCME;
    }

    public void setGunFiredOperatingSafetyLockCME(SerialField<OneOrZero> gunFiredOperatingSafetyLockCME) {
        this.gunFiredOperatingSafetyLockCME = gunFiredOperatingSafetyLockCME;
    }

    public SerialField<OneOrZero> getGunPlayingCME() {
        return this.gunPlayingCME;
    }

    public void setGunPlayingCME(SerialField<OneOrZero> gunPlayingCME) {
        this.gunPlayingCME = gunPlayingCME;
    }

    public SerialField<OneOrZero> getGunShowingCME() {
        return this.gunShowingCME;
    }

    public void setGunShowingCME(SerialField<OneOrZero> gunShowingCME) {
        this.gunShowingCME = gunShowingCME;
    }

    public SerialField<OneOrZero> getGunThoughtSafetyEngagedCME() {
        return this.gunThoughtSafetyEngagedCME;
    }

    public void setGunThoughtSafetyEngagedCME(SerialField<OneOrZero> gunThoughtSafetyEngagedCME) {
        this.gunThoughtSafetyEngagedCME = gunThoughtSafetyEngagedCME;
    }

    public SerialField<OneOrZero> getGunThoughtToyCME() {
        return this.gunThoughtToyCME;
    }

    public void setGunThoughtToyCME(SerialField<OneOrZero> gunThoughtToyCME) {
        this.gunThoughtToyCME = gunThoughtToyCME;
    }

    public SerialField<OneOrZero> getGunThoughtUnloadedMagazineDisengagedCME() {
        return this.gunThoughtUnloadedMagazineDisengagedCME;
    }

    public void setGunThoughtUnloadedMagazineDisengagedCME(SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedCME) {
        this.gunThoughtUnloadedMagazineDisengagedCME = gunThoughtUnloadedMagazineDisengagedCME;
    }

    public SerialField<OneOrZero> getGunThoughtUnloadedOtherCME() {
        return this.gunThoughtUnloadedOtherCME;
    }

    public void setGunThoughtUnloadedOtherCME(SerialField<OneOrZero> gunThoughtUnloadedOtherCME) {
        this.gunThoughtUnloadedOtherCME = gunThoughtUnloadedOtherCME;
    }

    public SerialField<OneOrZero> getGunUnintentionallyPulledTriggerCME() {
        return this.gunUnintentionallyPulledTriggerCME;
    }

    public void setGunUnintentionallyPulledTriggerCME(SerialField<OneOrZero> gunUnintentionallyPulledTriggerCME) {
        this.gunUnintentionallyPulledTriggerCME = gunUnintentionallyPulledTriggerCME;
    }

    public SerialField<OneOrZero> getHateCrimeCME() {
        return this.hateCrimeCME;
    }

    public void setHateCrimeCME(SerialField<OneOrZero> hateCrimeCME) {
        this.hateCrimeCME = hateCrimeCME;
    }

    public SerialField<OneOrZero> gethisryMentalIllnessTreatmentCME() {
        return this.hisoryMentalIllnessTreatmentCME;
    }

    public void sethisryMentalIllnessTreatmentCME(SerialField<OneOrZero> hisoryMentalIllnessTreatmentCME) {
        this.hisoryMentalIllnessTreatmentCME = hisoryMentalIllnessTreatmentCME;
    }

    public SerialField<OneOrZero> getHuntingCME() {
        return this.huntingCME;
    }

    public void setHuntingCME(SerialField<OneOrZero> huntingCME) {
        this.huntingCME = huntingCME;
    }

    public SerialField<OneOrZero> getInterpersonalViolencePerpetratorCME() {
        return this.interpersonalViolencePerpetratorCME;
    }

    public void setInterpersonalViolencePerpetratorCME(SerialField<OneOrZero> interpersonalViolencePerpetratorCME) {
        this.interpersonalViolencePerpetratorCME = interpersonalViolencePerpetratorCME;
    }

    public SerialField<OneOrZero> getInterpersonalViolenceVictimCME() {
        return this.interpersonalViolenceVictimCME;
    }

    public void setInterpersonalViolenceVictimCME(SerialField<OneOrZero> interpersonalViolenceVictimCME) {
        this.interpersonalViolenceVictimCME = interpersonalViolenceVictimCME;
    }

    public SerialField<OneOrZero> getIntervenerAssistingVictimCME() {
        return this.intervenerAssistingVictimCME;
    }

    public void setIntervenerAssistingVictimCME(SerialField<OneOrZero> intervenerAssistingVictimCME) {
        this.intervenerAssistingVictimCME = intervenerAssistingVictimCME;
    }

    public SerialField<OneOrZero> getIntimatePartnerProblemCME() {
        return this.intimatePartnerProblemCME;
    }

    public void setIntimatePartnerProblemCME(SerialField<OneOrZero> intimatePartnerProblemCME) {
        this.intimatePartnerProblemCME = intimatePartnerProblemCME;
    }

    public SerialField<OneOrZero> getIntimatePartnerViolenceCME() {
        return this.intimatePartnerViolenceCME;
    }

    public void setIntimatePartnerViolenceCME(SerialField<OneOrZero> intimatePartnerViolenceCME) {
        this.intimatePartnerViolenceCME = intimatePartnerViolenceCME;
    }

    public SerialField<OneOrZero> getJealouslyCME() {
        return this.jealouslyCME;
    }

    public void setJealouslyCME(SerialField<OneOrZero> jealouslyCME) {
        this.jealouslyCME = jealouslyCME;
    }

    public SerialField<OneOrZero> getJobProblemCME() {
        return this.jobProblemCME;
    }

    public void setJobProblemCME(SerialField<OneOrZero> jobProblemCME) {
        this.jobProblemCME = jobProblemCME;
    }

    public SerialField<OneOrZero> getJustifiableSelfDefenseCME() {
        return this.justifiableSelfDefenseCME;
    }

    public void setJustifiableSelfDefenseCME(SerialField<OneOrZero> justifiableSelfDefenseCME) {
        this.justifiableSelfDefenseCME = justifiableSelfDefenseCME;
    }

    public SerialField<OneOrZero> getLegalProblemOtherCME() {
        return this.legalProblemOtherCME;
    }

    public void setLegalProblemOtherCME(SerialField<OneOrZero> legalProblemOtherCME) {
        this.legalProblemOtherCME = legalProblemOtherCME;
    }

    public SerialField<OneOrZero> getMentalHealthDiagnosis1CME() {
        return this.mentalHealthDiagnosis1CME;
    }

    public void setMentalHealthDiagnosis1CME(SerialField<OneOrZero> mentalHealthDiagnosis1CME) {
        this.mentalHealthDiagnosis1CME = mentalHealthDiagnosis1CME;
    }

    public SerialField<OneOrZero> getMentalHealthDiagnosis2CME() {
        return this.mentalHealthDiagnosis2CME;
    }

    public void setMentalHealthDiagnosis2CME(SerialField<OneOrZero> mentalHealthDiagnosis2CME) {
        this.mentalHealthDiagnosis2CME = mentalHealthDiagnosis2CME;
    }

    public SerialField<String> getMentalHealthDiagnosisOtherCME() {
        return this.mentalHealthDiagnosisOtherCME;
    }

    public void setMentalHealthDiagnosisOtherCME(SerialField<String> mentalHealthDiagnosisOtherCME) {
        this.mentalHealthDiagnosisOtherCME = mentalHealthDiagnosisOtherCME;
    }

    public SerialField<OneOrZero> getMentalHealthProblemCME() {
        return this.mentalHealthProblemCME;
    }

    public void setMentalHealthProblemCME(SerialField<OneOrZero> mentalHealthProblemCME) {
        this.mentalHealthProblemCME = mentalHealthProblemCME;
    }

    public SerialField<OneOrZero> getMentalIllnessTreatmentCurrentCME() {
        return this.mentalIllnessTreatmentCurrentCME;
    }

    public void setMentalIllnessTreatmentCurrentCME(SerialField<OneOrZero> mentalIllnessTreatmentCurrentCME) {
        this.mentalIllnessTreatmentCurrentCME = mentalIllnessTreatmentCurrentCME;
    }

    public SerialField<OneOrZero> getMercyKillingCME() {
        return this.mercyKillingCME;
    }

    public void setMercyKillingCME(SerialField<OneOrZero> mercyKillingCME) {
        this.mercyKillingCME = mercyKillingCME;
    }

    public SerialField<OneOrZero> getNatureOtherCrime1CME() {
        return this.natureOtherCrime1CME;
    }

    public void setNatureOtherCrime1CME(SerialField<OneOrZero> natureOtherCrime1CME) {
        this.natureOtherCrime1CME = natureOtherCrime1CME;
    }

    public SerialField<OneOrZero> getNatureOtherCrime2CME() {
        return this.natureOtherCrime2CME;
    }

    public void setNatureOtherCrime2CME(SerialField<OneOrZero> natureOtherCrime2CME) {
        this.natureOtherCrime2CME = natureOtherCrime2CME;
    }

    public SerialField<OneOrZero> getOtherAddictionCME() {
        return this.otherAddictionCME;
    }

    public void setOtherAddictionCME(SerialField<OneOrZero> otherAddictionCME) {
        this.otherAddictionCME = otherAddictionCME;
    }

    public SerialField<OneOrZero> getOtherContextInjuryCME() {
        return this.otherContextInjuryCME;
    }

    public void setOtherContextInjuryCME(SerialField<OneOrZero> otherContextInjuryCME) {
        this.otherContextInjuryCME = otherContextInjuryCME;
    }

    public SerialField<OneOrZero> getOtherCrimeInProgressCME() {
        return this.otherCrimeInProgressCME;
    }

    public void setOtherCrimeInProgressCME(SerialField<OneOrZero> otherCrimeInProgressCME) {
        this.otherCrimeInProgressCME = otherCrimeInProgressCME;
    }

    public SerialField<OneOrZero> getOtherMechanismInjuryCME() {
        return this.otherMechanismInjuryCME;
    }

    public void setOtherMechanismInjuryCME(SerialField<OneOrZero> otherMechanismInjuryCME) {
        this.otherMechanismInjuryCME = otherMechanismInjuryCME;
    }

    public SerialField<OneOrZero> getPrecipitatedByOtherCrimeCME() {
        return this.precipitatedByOtherCrimeCME;
    }

    public void setPrecipitatedByOtherCrimeCME(SerialField<OneOrZero> precipitatedByOtherCrimeCME) {
        this.precipitatedByOtherCrimeCME = precipitatedByOtherCrimeCME;
    }

    public SerialField<OneOrZero> getPhysicalHealthProblemCME() {
        return this.physicalHealthProblemCME;
    }

    public void setPhysicalHealthProblemCME(SerialField<OneOrZero> physicalHealthProblemCME) {
        this.physicalHealthProblemCME = physicalHealthProblemCME;
    }

    public SerialField<OneOrZero> getProstitutionCME() {
        return this.prostitutionCME;
    }

    public void setProstitutionCME(SerialField<OneOrZero> prostitutionCME) {
        this.prostitutionCME = prostitutionCME;
    }

    public SerialField<OneOrZero> getRandomViolenceCME() {
        return this.randomViolenceCME;
    }

    public void setRandomViolenceCME(SerialField<OneOrZero> randomViolenceCME) {
        this.randomViolenceCME = randomViolenceCME;
    }

    public SerialField<OneOrZero> getRecentCriminalLegalProblemCME() {
        return this.recentCriminalLegalProblemCME;
    }

    public void setRecentCriminalLegalProblemCME(SerialField<OneOrZero> recentCriminalLegalProblemCME) {
        this.recentCriminalLegalProblemCME = recentCriminalLegalProblemCME;
    }

    public SerialField<OneOrZero> getRecentSuicideFriendFamilyCME() {
        return this.recentSuicideFriendFamilyCME;
    }

    public void setRecentSuicideFriendFamilyCME(SerialField<OneOrZero> recentSuicideFriendFamilyCME) {
        this.recentSuicideFriendFamilyCME = recentSuicideFriendFamilyCME;
    }

    public SerialField<OneOrZero> getRelationshipProblemOtherCME() {
        return this.relationshipProblemOtherCME;
    }

    public void setRelationshipProblemOtherCME(SerialField<OneOrZero> relationshipProblemOtherCME) {
        this.relationshipProblemOtherCME = relationshipProblemOtherCME;
    }

    public SerialField<OneOrZero> getSchoolProblemCME() {
        return this.schoolProblemCME;
    }

    public void setSchoolProblemCME(SerialField<OneOrZero> schoolProblemCME) {
        this.schoolProblemCME = schoolProblemCME;
    }

    public SerialField<OneOrZero> getSelfDefenseCME() {
        return this.selfDefenseCME;
    }

    public void setSelfDefenseCME(SerialField<OneOrZero> selfDefenseCME) {
        this.selfDefenseCME = selfDefenseCME;
    }

    public SerialField<OneOrZero> getStalkingCME() {
        return this.stalkingCME;
    }

    public void setStalkingCME(SerialField<OneOrZero> stalkingCME) {
        this.stalkingCME = stalkingCME;
    }

    public SerialField<OneOrZero> getSubstanceAbuseOtherCME() {
        return this.substanceAbuseOtherCME;
    }

    public void setSubstanceAbuseOtherCME(SerialField<OneOrZero> substanceAbuseOtherCME) {
        this.substanceAbuseOtherCME = substanceAbuseOtherCME;
    }

    public SerialField<OneOrZero> getsuicideAttempthisoryCME() {
        return this.suicideAttempthisoryCME;
    }

    public void setsuicideAttempthisoryCME(SerialField<OneOrZero> suicideAttempthisoryCME) {
        this.suicideAttempthisoryCME = suicideAttempthisoryCME;
    }

    public SerialField<OneOrZero> getSuicideIntentDisclosedCME() {
        return this.suicideIntentDisclosedCME;
    }

    public void setSuicideIntentDisclosedCME(SerialField<OneOrZero> suicideIntentDisclosedCME) {
        this.suicideIntentDisclosedCME = suicideIntentDisclosedCME;
    }

    public SerialField<OneOrZero> getSuicideNoteCME() {
        return this.suicideNoteCME;
    }

    public void setSuicideNoteCME(SerialField<OneOrZero> suicideNoteCME) {
        this.suicideNoteCME = suicideNoteCME;
    }

    public SerialField<OneOrZero> getsuicideThoughthisoryCME() {
        return this.suicideThoughthisoryCME;
    }

    public void setsuicideThoughthisoryCME(SerialField<OneOrZero> suicideThoughthisoryCME) {
        this.suicideThoughthisoryCME = suicideThoughthisoryCME;
    }

    public SerialField<OneOrZero> getTargetShootingCME() {
        return this.targetShootingCME;
    }

    public void setTargetShootingCME(SerialField<OneOrZero> targetShootingCME) {
        this.targetShootingCME = targetShootingCME;
    }

    public SerialField<OneOrZero> getTerroristAttackCME() {
        return this.terroristAttackCME;
    }

    public void setTerroristAttackCME(SerialField<OneOrZero> terroristAttackCME) {
        this.terroristAttackCME = terroristAttackCME;
    }

    public SerialField<OneOrZero> getTraumaticAnniversaryCME() {
        return this.traumaticAnniversaryCME;
    }

    public void setTraumaticAnniversaryCME(SerialField<OneOrZero> traumaticAnniversaryCME) {
        this.traumaticAnniversaryCME = traumaticAnniversaryCME;
    }

    public SerialField<OneOrZero> getVictimPoliceOfficerOnDutyCME() {
        return this.victimPoliceOfficerOnDutyCME;
    }

    public void setVictimPoliceOfficerOnDutyCME(SerialField<OneOrZero> victimPoliceOfficerOnDutyCME) {
        this.victimPoliceOfficerOnDutyCME = victimPoliceOfficerOnDutyCME;
    }

    public SerialField<OneOrZero> getVictimUsedWeaponCME() {
        return this.victimUsedWeaponCME;
    }

    public void setVictimUsedWeaponCME(SerialField<OneOrZero> victimUsedWeaponCME) {
        this.victimUsedWeaponCME = victimUsedWeaponCME;
    }

    public SerialField<OneOrZero> getWalkByAssaultCME() {
        return this.walkByAssaultCME;
    }

    public void setWalkByAssaultCME(SerialField<OneOrZero> walkByAssaultCME) {
        this.walkByAssaultCME = walkByAssaultCME;
    }

    public SerialField<OneOrZero> getCircumstancesOtherLE() {
        return this.circumstancesOtherLE;
    }

    public void setCircumstancesOtherLE(SerialField<OneOrZero> circumstancesOtherLE) {
        this.circumstancesOtherLE = circumstancesOtherLE;
    }

    public SerialField<OneOrZero> getAbusedAsChildLE() {
        return this.abusedAsChildLE;
    }

    public void setAbusedAsChildLE(SerialField<OneOrZero> abusedAsChildLE) {
        this.abusedAsChildLE = abusedAsChildLE;
    }

    public SerialField<OneOrZero> getAlcoholProblemLE() {
        return this.alcoholProblemLE;
    }

    public void setAlcoholProblemLE(SerialField<OneOrZero> alcoholProblemLE) {
        this.alcoholProblemLE = alcoholProblemLE;
    }

    public SerialField<OneOrZero> getArgumentLE() {
        return this.argumentLE;
    }

    public void setArgumentLE(SerialField<OneOrZero> argumentLE) {
        this.argumentLE = argumentLE;
    }

    public SerialField<OneOrZero> getArgumentOtherLE() {
        return this.argumentOtherLE;
    }

    public void setArgumentOtherLE(SerialField<OneOrZero> argumentOtherLE) {
        this.argumentOtherLE = argumentOtherLE;
    }

    public SerialField<OneOrZero> getArgumentTimingLE() {
        return this.argumentTimingLE;
    }

    public void setArgumentTimingLE(SerialField<OneOrZero> argumentTimingLE) {
        this.argumentTimingLE = argumentTimingLE;
    }

    public SerialField<OneOrZero> getBrawlLE() {
        return this.brawlLE;
    }

    public void setBrawlLE(SerialField<OneOrZero> brawlLE) {
        this.brawlLE = brawlLE;
    }

    public SerialField<OneOrZero> getBulletRicochetLE() {
        return this.bulletRicochetLE;
    }

    public void setBulletRicochetLE(SerialField<OneOrZero> bulletRicochetLE) {
        this.bulletRicochetLE = bulletRicochetLE;
    }

    public SerialField<OneOrZero> getBystanderLE() {
        return this.bystanderLE;
    }

    public void setBystanderLE(SerialField<OneOrZero> bystanderLE) {
        this.bystanderLE = bystanderLE;
    }

    public SerialField<OneOrZero> getCelebratoryFiringLE() {
        return this.celebratoryFiringLE;
    }

    public void setCelebratoryFiringLE(SerialField<OneOrZero> celebratoryFiringLE) {
        this.celebratoryFiringLE = celebratoryFiringLE;
    }

    public SerialField<OneOrZero> getIsCircumstancesKnown() {
        return this.isCircumstancesKnown;
    }

    public void setIsCircumstancesKnown(SerialField<OneOrZero> isCircumstancesKnown) {
        this.isCircumstancesKnown = isCircumstancesKnown;
    }

    public SerialField<String> getCircumstancesOtherTextLE() {
        return this.circumstancesOtherTextLE;
    }

    public void setCircumstancesOtherTextLE(SerialField<String> circumstancesOtherTextLE) {
        this.circumstancesOtherTextLE = circumstancesOtherTextLE;
    }

    public SerialField<OneOrZero> getCririsProstitutionLE() {
        return this.cririsProstitutionLE;
    }

    public void setCririsProstitutionLE(SerialField<OneOrZero> cririsProstitutionLE) {
        this.cririsProstitutionLE = cririsProstitutionLE;
    }

    public SerialField<OneOrZero> getCrisisAlcoholProblemLE() {
        return this.crisisAlcoholProblemLE;
    }

    public void setCrisisAlcoholProblemLE(SerialField<OneOrZero> crisisAlcoholProblemLE) {
        this.crisisAlcoholProblemLE = crisisAlcoholProblemLE;
    }

    public SerialField<OneOrZero> getCrisisCivilLegalLE() {
        return this.crisisCivilLegalLE;
    }

    public void setCrisisCivilLegalLE(SerialField<OneOrZero> crisisCivilLegalLE) {
        this.crisisCivilLegalLE = crisisCivilLegalLE;
    }

    public SerialField<OneOrZero> getCrisisCriminalLE() {
        return this.crisisCriminalLE;
    }

    public void setCrisisCriminalLE(SerialField<OneOrZero> crisisCriminalLE) {
        this.crisisCriminalLE = crisisCriminalLE;
    }

    public SerialField<OneOrZero> getCrisisDisasterExposureLE() {
        return this.crisisDisasterExposureLE;
    }

    public void setCrisisDisasterExposureLE(SerialField<OneOrZero> crisisDisasterExposureLE) {
        this.crisisDisasterExposureLE = crisisDisasterExposureLE;
    }

    public SerialField<OneOrZero> getCrisisEvictionLE() {
        return this.crisisEvictionLE;
    }

    public void setCrisisEvictionLE(SerialField<OneOrZero> crisisEvictionLE) {
        this.crisisEvictionLE = crisisEvictionLE;
    }

    public SerialField<OneOrZero> getCrisisFamilyStressorLE() {
        return this.crisisFamilyStressorLE;
    }

    public void setCrisisFamilyStressorLE(SerialField<OneOrZero> crisisFamilyStressorLE) {
        this.crisisFamilyStressorLE = crisisFamilyStressorLE;
    }

    public SerialField<OneOrZero> getCrisisFinancialLE() {
        return this.crisisFinancialLE;
    }

    public void setCrisisFinancialLE(SerialField<OneOrZero> crisisFinancialLE) {
        this.crisisFinancialLE = crisisFinancialLE;
    }

    public SerialField<OneOrZero> getCrisisIntimatePartnerProblemLE() {
        return this.crisisIntimatePartnerProblemLE;
    }

    public void setCrisisIntimatePartnerProblemLE(SerialField<OneOrZero> crisisIntimatePartnerProblemLE) {
        this.crisisIntimatePartnerProblemLE = crisisIntimatePartnerProblemLE;
    }

    public SerialField<OneOrZero> getCrisisJealousyLE() {
        return this.crisisJealousyLE;
    }

    public void setCrisisJealousyLE(SerialField<OneOrZero> crisisJealousyLE) {
        this.crisisJealousyLE = crisisJealousyLE;
    }

    public SerialField<OneOrZero> getCrisisJobLE() {
        return this.crisisJobLE;
    }

    public void setCrisisJobLE(SerialField<OneOrZero> crisisJobLE) {
        this.crisisJobLE = crisisJobLE;
    }

    public SerialField<OneOrZero> getCrisisMentalHealthLE() {
        return this.crisisMentalHealthLE;
    }

    public void setCrisisMentalHealthLE(SerialField<OneOrZero> crisisMentalHealthLE) {
        this.crisisMentalHealthLE = crisisMentalHealthLE;
    }

    public SerialField<OneOrZero> getCrisisOtherAddictionLE() {
        return this.crisisOtherAddictionLE;
    }

    public void setCrisisOtherAddictionLE(SerialField<OneOrZero> crisisOtherAddictionLE) {
        this.crisisOtherAddictionLE = crisisOtherAddictionLE;
    }

    public SerialField<OneOrZero> getCrisisPhysicalHealthLE() {
        return this.crisisPhysicalHealthLE;
    }

    public void setCrisisPhysicalHealthLE(SerialField<OneOrZero> crisisPhysicalHealthLE) {
        this.crisisPhysicalHealthLE = crisisPhysicalHealthLE;
    }

    public SerialField<OneOrZero> getCrisisRelatedDeathFriendOrFamilyOtherLE() {
        return this.crisisRelatedDeathFriendOrFamilyOtherLE;
    }

    public void setCrisisRelatedDeathFriendOrFamilyOtherLE(SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherLE) {
        this.crisisRelatedDeathFriendOrFamilyOtherLE = crisisRelatedDeathFriendOrFamilyOtherLE;
    }

    public SerialField<OneOrZero> getCrisisRelatedSuicideFriendOrFamilyLE() {
        return this.crisisRelatedSuicideFriendOrFamilyLE;
    }

    public void setCrisisRelatedSuicideFriendOrFamilyLE(SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyLE) {
        this.crisisRelatedSuicideFriendOrFamilyLE = crisisRelatedSuicideFriendOrFamilyLE;
    }

    public SerialField<OneOrZero> getCrisisRelationshipProblemOtherLE() {
        return this.crisisRelationshipProblemOtherLE;
    }

    public void setCrisisRelationshipProblemOtherLE(SerialField<OneOrZero> crisisRelationshipProblemOtherLE) {
        this.crisisRelationshipProblemOtherLE = crisisRelationshipProblemOtherLE;
    }

    public SerialField<OneOrZero> getCrisisSchoolLE() {
        return this.crisisSchoolLE;
    }

    public void setCrisisSchoolLE(SerialField<OneOrZero> crisisSchoolLE) {
        this.crisisSchoolLE = crisisSchoolLE;
    }

    public SerialField<OneOrZero> getCrisisStalkingLE() {
        return this.crisisStalkingLE;
    }

    public void setCrisisStalkingLE(SerialField<OneOrZero> crisisStalkingLE) {
        this.crisisStalkingLE = crisisStalkingLE;
    }

    public SerialField<OneOrZero> getCrisisSubstanceAbuseLE() {
        return this.crisisSubstanceAbuseLE;
    }

    public void setCrisisSubstanceAbuseLE(SerialField<OneOrZero> crisisSubstanceAbuseLE) {
        this.crisisSubstanceAbuseLE = crisisSubstanceAbuseLE;
    }

    public SerialField<OneOrZero> getDeathAbuseLE() {
        return this.deathAbuseLE;
    }

    public void setDeathAbuseLE(SerialField<OneOrZero> deathAbuseLE) {
        this.deathAbuseLE = deathAbuseLE;
    }

    public SerialField<OneOrZero> getDeathFriendOrFamilyOtherLE() {
        return this.deathFriendOrFamilyOtherLE;
    }

    public void setDeathFriendOrFamilyOtherLE(SerialField<OneOrZero> deathFriendOrFamilyOtherLE) {
        this.deathFriendOrFamilyOtherLE = deathFriendOrFamilyOtherLE;
    }

    public SerialField<OneOrZero> getDepressedMoodLE() {
        return this.depressedMoodLE;
    }

    public void setDepressedMoodLE(SerialField<OneOrZero> depressedMoodLE) {
        this.depressedMoodLE = depressedMoodLE;
    }

    public SerialField<OneOrZero> getDisasterExposureLE() {
        return this.disasterExposureLE;
    }

    public void setDisasterExposureLE(SerialField<OneOrZero> disasterExposureLE) {
        this.disasterExposureLE = disasterExposureLE;
    }

    public SerialField<OneOrZero> getDisclosedIntentToWhomLE() {
        return this.disclosedIntentToWhomLE;
    }

    public void setDisclosedIntentToWhomLE(SerialField<OneOrZero> disclosedIntentToWhomLE) {
        this.disclosedIntentToWhomLE = disclosedIntentToWhomLE;
    }

    public SerialField<OneOrZero> getDriveByShootingLE() {
        return this.driveByShootingLE;
    }

    public void setDriveByShootingLE(SerialField<OneOrZero> driveByShootingLE) {
        this.driveByShootingLE = driveByShootingLE;
    }

    public SerialField<OneOrZero> getDrugInvolvementLE() {
        return this.drugInvolvementLE;
    }

    public void setDrugInvolvementLE(SerialField<OneOrZero> drugInvolvementLE) {
        this.drugInvolvementLE = drugInvolvementLE;
    }

    public SerialField<OneOrZero> getEvictionOrLossOfHomeLE() {
        return this.evictionOrLossOfHomeLE;
    }

    public void setEvictionOrLossOfHomeLE(SerialField<OneOrZero> evictionOrLossOfHomeLE) {
        this.evictionOrLossOfHomeLE = evictionOrLossOfHomeLE;
    }

    public SerialField<OneOrZero> getFightBetweenTwoPeopleLE() {
        return this.fightBetweenTwoPeopleLE;
    }

    public void setFightBetweenTwoPeopleLE(SerialField<OneOrZero> fightBetweenTwoPeopleLE) {
        this.fightBetweenTwoPeopleLE = fightBetweenTwoPeopleLE;
    }

    public SerialField<OneOrZero> getFinancialProblemLE() {
        return this.financialProblemLE;
    }

    public void setFinancialProblemLE(SerialField<OneOrZero> financialProblemLE) {
        this.financialProblemLE = financialProblemLE;
    }

    public SerialField<OneOrZero> getUnused2() {
        return this.unused2;
    }

    public void setUnused2(SerialField<OneOrZero> unused2) {
        this.unused2 = unused2;
    }

    public SerialField<OneOrZero> getGangRelatedLE() {
        return this.gangRelatedLE;
    }

    public void setGangRelatedLE(SerialField<OneOrZero> gangRelatedLE) {
        this.gangRelatedLE = gangRelatedLE;
    }

    public SerialField<OneOrZero> getGunCleaningLE() {
        return this.gunCleaningLE;
    }

    public void setGunCleaningLE(SerialField<OneOrZero> gunCleaningLE) {
        this.gunCleaningLE = gunCleaningLE;
    }

    public SerialField<OneOrZero> getGunDefectMalfunctionLE() {
        return this.gunDefectMalfunctionLE;
    }

    public void setGunDefectMalfunctionLE(SerialField<OneOrZero> gunDefectMalfunctionLE) {
        this.gunDefectMalfunctionLE = gunDefectMalfunctionLE;
    }

    public SerialField<OneOrZero> getGunDroppedLE() {
        return this.gunDroppedLE;
    }

    public void setGunDroppedLE(SerialField<OneOrZero> gunDroppedLE) {
        this.gunDroppedLE = gunDroppedLE;
    }

    public SerialField<OneOrZero> getGunFiredHolsteringLE() {
        return this.gunFiredHolsteringLE;
    }

    public void setGunFiredHolsteringLE(SerialField<OneOrZero> gunFiredHolsteringLE) {
        this.gunFiredHolsteringLE = gunFiredHolsteringLE;
    }

    public SerialField<OneOrZero> getGunFiredLoadingUnloadingLE() {
        return this.gunFiredLoadingUnloadingLE;
    }

    public void setGunFiredLoadingUnloadingLE(SerialField<OneOrZero> gunFiredLoadingUnloadingLE) {
        this.gunFiredLoadingUnloadingLE = gunFiredLoadingUnloadingLE;
    }

    public SerialField<OneOrZero> getGunFiredOperatingSafetyLockLE() {
        return this.gunFiredOperatingSafetyLockLE;
    }

    public void setGunFiredOperatingSafetyLockLE(SerialField<OneOrZero> gunFiredOperatingSafetyLockLE) {
        this.gunFiredOperatingSafetyLockLE = gunFiredOperatingSafetyLockLE;
    }

    public SerialField<OneOrZero> getGunPlayingLE() {
        return this.gunPlayingLE;
    }

    public void setGunPlayingLE(SerialField<OneOrZero> gunPlayingLE) {
        this.gunPlayingLE = gunPlayingLE;
    }

    public SerialField<OneOrZero> getGunShowingLE() {
        return this.gunShowingLE;
    }

    public void setGunShowingLE(SerialField<OneOrZero> gunShowingLE) {
        this.gunShowingLE = gunShowingLE;
    }

    public SerialField<OneOrZero> getGunThoughtSafetyEngagedLE() {
        return this.gunThoughtSafetyEngagedLE;
    }

    public void setGunThoughtSafetyEngagedLE(SerialField<OneOrZero> gunThoughtSafetyEngagedLE) {
        this.gunThoughtSafetyEngagedLE = gunThoughtSafetyEngagedLE;
    }

    public SerialField<OneOrZero> getGunThoughtToyLE() {
        return this.gunThoughtToyLE;
    }

    public void setGunThoughtToyLE(SerialField<OneOrZero> gunThoughtToyLE) {
        this.gunThoughtToyLE = gunThoughtToyLE;
    }

    public SerialField<OneOrZero> getGunThoughtUnloadedMagazineDisengagedLE() {
        return this.gunThoughtUnloadedMagazineDisengagedLE;
    }

    public void setGunThoughtUnloadedMagazineDisengagedLE(SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedLE) {
        this.gunThoughtUnloadedMagazineDisengagedLE = gunThoughtUnloadedMagazineDisengagedLE;
    }

    public SerialField<OneOrZero> getGunThoughtUnloadedOtherLE() {
        return this.gunThoughtUnloadedOtherLE;
    }

    public void setGunThoughtUnloadedOtherLE(SerialField<OneOrZero> gunThoughtUnloadedOtherLE) {
        this.gunThoughtUnloadedOtherLE = gunThoughtUnloadedOtherLE;
    }

    public SerialField<OneOrZero> getGunUnintentionallyPulledTriggerLE() {
        return this.gunUnintentionallyPulledTriggerLE;
    }

    public void setGunUnintentionallyPulledTriggerLE(SerialField<OneOrZero> gunUnintentionallyPulledTriggerLE) {
        this.gunUnintentionallyPulledTriggerLE = gunUnintentionallyPulledTriggerLE;
    }

    public SerialField<OneOrZero> getHateCrimeLE() {
        return this.hateCrimeLE;
    }

    public void setHateCrimeLE(SerialField<OneOrZero> hateCrimeLE) {
        this.hateCrimeLE = hateCrimeLE;
    }

    public SerialField<OneOrZero> gethisryMentalIllnessTreatmentLE() {
        return this.hisoryMentalIllnessTreatmentLE;
    }

    public void sethisryMentalIllnessTreatmentLE(SerialField<OneOrZero> hisoryMentalIllnessTreatmentLE) {
        this.hisoryMentalIllnessTreatmentLE = hisoryMentalIllnessTreatmentLE;
    }

    public SerialField<OneOrZero> getHuntingLE() {
        return this.huntingLE;
    }

    public void setHuntingLE(SerialField<OneOrZero> huntingLE) {
        this.huntingLE = huntingLE;
    }

    public SerialField<OneOrZero> getInterpersonalViolencePerpetratorLE() {
        return this.interpersonalViolencePerpetratorLE;
    }

    public void setInterpersonalViolencePerpetratorLE(SerialField<OneOrZero> interpersonalViolencePerpetratorLE) {
        this.interpersonalViolencePerpetratorLE = interpersonalViolencePerpetratorLE;
    }

    public SerialField<OneOrZero> getInterpersonalViolenceVictimLE() {
        return this.interpersonalViolenceVictimLE;
    }

    public void setInterpersonalViolenceVictimLE(SerialField<OneOrZero> interpersonalViolenceVictimLE) {
        this.interpersonalViolenceVictimLE = interpersonalViolenceVictimLE;
    }

    public SerialField<OneOrZero> getIntervenerAssistingVictimLE() {
        return this.intervenerAssistingVictimLE;
    }

    public void setIntervenerAssistingVictimLE(SerialField<OneOrZero> intervenerAssistingVictimLE) {
        this.intervenerAssistingVictimLE = intervenerAssistingVictimLE;
    }

    public SerialField<OneOrZero> getIntimatePartnerProblemLE() {
        return this.intimatePartnerProblemLE;
    }

    public void setIntimatePartnerProblemLE(SerialField<OneOrZero> intimatePartnerProblemLE) {
        this.intimatePartnerProblemLE = intimatePartnerProblemLE;
    }

    public SerialField<OneOrZero> getIntimatePartnerViolenceLE() {
        return this.intimatePartnerViolenceLE;
    }

    public void setIntimatePartnerViolenceLE(SerialField<OneOrZero> intimatePartnerViolenceLE) {
        this.intimatePartnerViolenceLE = intimatePartnerViolenceLE;
    }

    public SerialField<OneOrZero> getJealouslyLE() {
        return this.jealouslyLE;
    }

    public void setJealouslyLE(SerialField<OneOrZero> jealouslyLE) {
        this.jealouslyLE = jealouslyLE;
    }

    public SerialField<OneOrZero> getJobProblemLE() {
        return this.jobProblemLE;
    }

    public void setJobProblemLE(SerialField<OneOrZero> jobProblemLE) {
        this.jobProblemLE = jobProblemLE;
    }

    public SerialField<OneOrZero> getJustifiableSelfDefenseLE() {
        return this.justifiableSelfDefenseLE;
    }

    public void setJustifiableSelfDefenseLE(SerialField<OneOrZero> justifiableSelfDefenseLE) {
        this.justifiableSelfDefenseLE = justifiableSelfDefenseLE;
    }

    public SerialField<OneOrZero> getLegalProblemOtherLE() {
        return this.legalProblemOtherLE;
    }

    public void setLegalProblemOtherLE(SerialField<OneOrZero> legalProblemOtherLE) {
        this.legalProblemOtherLE = legalProblemOtherLE;
    }

    public SerialField<OneOrZero> getMentalHealthDiagnosis1LE() {
        return this.mentalHealthDiagnosis1LE;
    }

    public void setMentalHealthDiagnosis1LE(SerialField<OneOrZero> mentalHealthDiagnosis1LE) {
        this.mentalHealthDiagnosis1LE = mentalHealthDiagnosis1LE;
    }

    public SerialField<OneOrZero> getMentalHealthDiagnosis2LE() {
        return this.mentalHealthDiagnosis2LE;
    }

    public void setMentalHealthDiagnosis2LE(SerialField<OneOrZero> mentalHealthDiagnosis2LE) {
        this.mentalHealthDiagnosis2LE = mentalHealthDiagnosis2LE;
    }

    public SerialField<String> getMentalHealthDiagnosisOtherLE() {
        return this.mentalHealthDiagnosisOtherLE;
    }

    public void setMentalHealthDiagnosisOtherLE(SerialField<String> mentalHealthDiagnosisOtherLE) {
        this.mentalHealthDiagnosisOtherLE = mentalHealthDiagnosisOtherLE;
    }

    public SerialField<OneOrZero> getMentalHealthProblemLE() {
        return this.mentalHealthProblemLE;
    }

    public void setMentalHealthProblemLE(SerialField<OneOrZero> mentalHealthProblemLE) {
        this.mentalHealthProblemLE = mentalHealthProblemLE;
    }

    public SerialField<OneOrZero> getMentalIllnessTreatmentCurrentLE() {
        return this.mentalIllnessTreatmentCurrentLE;
    }

    public void setMentalIllnessTreatmentCurrentLE(SerialField<OneOrZero> mentalIllnessTreatmentCurrentLE) {
        this.mentalIllnessTreatmentCurrentLE = mentalIllnessTreatmentCurrentLE;
    }

    public SerialField<OneOrZero> getMercyKillingLE() {
        return this.mercyKillingLE;
    }

    public void setMercyKillingLE(SerialField<OneOrZero> mercyKillingLE) {
        this.mercyKillingLE = mercyKillingLE;
    }

    public SerialField<OneOrZero> getNatureOtherCrime1LE() {
        return this.natureOtherCrime1LE;
    }

    public void setNatureOtherCrime1LE(SerialField<OneOrZero> natureOtherCrime1LE) {
        this.natureOtherCrime1LE = natureOtherCrime1LE;
    }

    public SerialField<OneOrZero> getNatureOtherCrime2LE() {
        return this.natureOtherCrime2LE;
    }

    public void setNatureOtherCrime2LE(SerialField<OneOrZero> natureOtherCrime2LE) {
        this.natureOtherCrime2LE = natureOtherCrime2LE;
    }

    public SerialField<OneOrZero> getOtherAddictionLE() {
        return this.otherAddictionLE;
    }

    public void setOtherAddictionLE(SerialField<OneOrZero> otherAddictionLE) {
        this.otherAddictionLE = otherAddictionLE;
    }

    public SerialField<OneOrZero> getOtherContextInjuryLE() {
        return this.otherContextInjuryLE;
    }

    public void setOtherContextInjuryLE(SerialField<OneOrZero> otherContextInjuryLE) {
        this.otherContextInjuryLE = otherContextInjuryLE;
    }

    public SerialField<OneOrZero> getOtherCrimeInProgressLE() {
        return this.otherCrimeInProgressLE;
    }

    public void setOtherCrimeInProgressLE(SerialField<OneOrZero> otherCrimeInProgressLE) {
        this.otherCrimeInProgressLE = otherCrimeInProgressLE;
    }

    public SerialField<OneOrZero> getOtherMechanismInjuryLE() {
        return this.otherMechanismInjuryLE;
    }

    public void setOtherMechanismInjuryLE(SerialField<OneOrZero> otherMechanismInjuryLE) {
        this.otherMechanismInjuryLE = otherMechanismInjuryLE;
    }

    public SerialField<OneOrZero> getPrecipitatedByOtherCrimeLE() {
        return this.precipitatedByOtherCrimeLE;
    }

    public void setPrecipitatedByOtherCrimeLE(SerialField<OneOrZero> precipitatedByOtherCrimeLE) {
        this.precipitatedByOtherCrimeLE = precipitatedByOtherCrimeLE;
    }

    public SerialField<OneOrZero> getPhysicalHealthProblemLE() {
        return this.physicalHealthProblemLE;
    }

    public void setPhysicalHealthProblemLE(SerialField<OneOrZero> physicalHealthProblemLE) {
        this.physicalHealthProblemLE = physicalHealthProblemLE;
    }

    public SerialField<OneOrZero> getProstitutionLE() {
        return this.prostitutionLE;
    }

    public void setProstitutionLE(SerialField<OneOrZero> prostitutionLE) {
        this.prostitutionLE = prostitutionLE;
    }

    public SerialField<OneOrZero> getRandomViolenceLE() {
        return this.randomViolenceLE;
    }

    public void setRandomViolenceLE(SerialField<OneOrZero> randomViolenceLE) {
        this.randomViolenceLE = randomViolenceLE;
    }

    public SerialField<OneOrZero> getRecentCriminalLegalProblemLE() {
        return this.recentCriminalLegalProblemLE;
    }

    public void setRecentCriminalLegalProblemLE(SerialField<OneOrZero> recentCriminalLegalProblemLE) {
        this.recentCriminalLegalProblemLE = recentCriminalLegalProblemLE;
    }

    public SerialField<OneOrZero> getRecentSuicideFriendFamilyLE() {
        return this.recentSuicideFriendFamilyLE;
    }

    public void setRecentSuicideFriendFamilyLE(SerialField<OneOrZero> recentSuicideFriendFamilyLE) {
        this.recentSuicideFriendFamilyLE = recentSuicideFriendFamilyLE;
    }

    public SerialField<OneOrZero> getRelationshipProblemOtherLE() {
        return this.relationshipProblemOtherLE;
    }

    public void setRelationshipProblemOtherLE(SerialField<OneOrZero> relationshipProblemOtherLE) {
        this.relationshipProblemOtherLE = relationshipProblemOtherLE;
    }

    public SerialField<OneOrZero> getSchoolProblemLE() {
        return this.schoolProblemLE;
    }

    public void setSchoolProblemLE(SerialField<OneOrZero> schoolProblemLE) {
        this.schoolProblemLE = schoolProblemLE;
    }

    public SerialField<OneOrZero> getSelfDefenseLE() {
        return this.selfDefenseLE;
    }

    public void setSelfDefenseLE(SerialField<OneOrZero> selfDefenseLE) {
        this.selfDefenseLE = selfDefenseLE;
    }

    public SerialField<OneOrZero> getStalkingLE() {
        return this.stalkingLE;
    }

    public void setStalkingLE(SerialField<OneOrZero> stalkingLE) {
        this.stalkingLE = stalkingLE;
    }

    public SerialField<OneOrZero> getSubstanceAbuseOtherLE() {
        return this.substanceAbuseOtherLE;
    }

    public void setSubstanceAbuseOtherLE(SerialField<OneOrZero> substanceAbuseOtherLE) {
        this.substanceAbuseOtherLE = substanceAbuseOtherLE;
    }

    public SerialField<OneOrZero> getSuicideAttempthisoryLE() {
        return this.suicideAttempthisoryLE;
    }

    public void setsuicideAttempthisoryLE(SerialField<OneOrZero> suicideAttempthisoryLE) {
        this.suicideAttempthisoryLE = suicideAttempthisoryLE;
    }

    public SerialField<OneOrZero> getSuicideIntentDisclosedLE() {
        return this.suicideIntentDisclosedLE;
    }

    public void setSuicideIntentDisclosedLE(SerialField<OneOrZero> suicideIntentDisclosedLE) {
        this.suicideIntentDisclosedLE = suicideIntentDisclosedLE;
    }

    public SerialField<OneOrZero> getSuicideNoteLE() {
        return this.suicideNoteLE;
    }

    public void setSuicideNoteLE(SerialField<OneOrZero> suicideNoteLE) {
        this.suicideNoteLE = suicideNoteLE;
    }

    public SerialField<OneOrZero> getsuicideThoughthisoryLE() {
        return this.suicideThoughthisoryLE;
    }

    public void setsuicideThoughthisoryLE(SerialField<OneOrZero> suicideThoughthisoryLE) {
        this.suicideThoughthisoryLE = suicideThoughthisoryLE;
    }

    public SerialField<OneOrZero> getTargetShootingLE() {
        return this.targetShootingLE;
    }

    public void setTargetShootingLE(SerialField<OneOrZero> targetShootingLE) {
        this.targetShootingLE = targetShootingLE;
    }

    public SerialField<OneOrZero> getTerroristAttackLE() {
        return this.terroristAttackLE;
    }

    public void setTerroristAttackLE(SerialField<OneOrZero> terroristAttackLE) {
        this.terroristAttackLE = terroristAttackLE;
    }

    public SerialField<OneOrZero> getTraumaticAnniversaryLE() {
        return this.traumaticAnniversaryLE;
    }

    public void setTraumaticAnniversaryLE(SerialField<OneOrZero> TraumaticAnniversaryLE) {
        this.traumaticAnniversaryLE = TraumaticAnniversaryLE;
    }

    public SerialField<OneOrZero> getVictimPoliceOfficeOnDutyLE() {
        return this.victimPoliceOfficeOnDutyLE;
    }

    public void setVictimPoliceOfficeOnDutyLE(SerialField<OneOrZero> VictimPoliceOfficeOnDutyLE) {
        this.victimPoliceOfficeOnDutyLE = VictimPoliceOfficeOnDutyLE;
    }

    public SerialField<OneOrZero> getVictimUsedWeaponLE() {
        return this.victimUsedWeaponLE;
    }

    public void setVictimUsedWeaponLE(SerialField<OneOrZero> VictimUsedWeaponLE) {
        this.victimUsedWeaponLE = VictimUsedWeaponLE;
    }

    public SerialField<OneOrZero> getWalkByAssaultLE() {
        return this.walkByAssaultLE;
    }

    public void setWalkByAssaultLE(SerialField<OneOrZero> WalkByAssaultLE) {
        this.walkByAssaultLE = WalkByAssaultLE;
    }

    public SerialField<String> getWeaponType() {
        return this.weaponType;
    }

    public void setWeaponType(SerialField<String> WeaponType) {
        this.weaponType = WeaponType;
    }

    public SerialField<String> getFirearmType() {
        return this.firearmType;
    }

    public void setFirearmType(SerialField<String> FirearmType) {
        this.firearmType = FirearmType;
    }

    public SerialField<CharLimitedInteger> getFirearmCaliber() {
        return this.firearmCaliber;
    }

    public void setFirearmCaliber(SerialField<CharLimitedInteger> FirearmCaliber) {
        this.firearmCaliber = FirearmCaliber;
    }

    public SerialField<CharLimitedInteger> getFirearmGauge() {
        return this.firearmGauge;
    }

    public void setFirearmGauge(SerialField<CharLimitedInteger> FirearmGauge) {
        this.firearmGauge = FirearmGauge;
    }

    public SerialField<CharLimitedInteger> getFirearmMake() {
        return this.firearmMake;
    }

    public void setFirearmMake(SerialField<CharLimitedInteger> FirearmMake) {
        this.firearmMake = FirearmMake;
    }

    public SerialField<CharLimitedInteger> getFirearmModel() {
        return this.firearmModel;
    }

    public void setFirearmModel(SerialField<CharLimitedInteger> FirearmModel) {
        this.firearmModel = FirearmModel;
    }

    public SerialField<OneOrZero> getGunLoaded() {
        return this.gunLoaded;
    }

    public void setGunLoaded(SerialField<OneOrZero> GunLoaded) {
        this.gunLoaded = GunLoaded;
    }

    public SerialField<String> getGunOwner() {
        return this.gunOwner;
    }

    public void setGunOwner(SerialField<String> GunOwner) {
        this.gunOwner = GunOwner;
    }

    public SerialField<CharLimitedInteger> getGunStoredLocked() {
        return this.gunStoredLocked;
    }

    public void setGunStoredLocked(SerialField<CharLimitedInteger> GunStoredLocked) {
        this.gunStoredLocked = GunStoredLocked;
    }

    public SerialField<OneOrZero> getFirearmStolen() {
        return this.firearmStolen;
    }

    public void setFirearmStolen(SerialField<OneOrZero> FirearmStolen) {
        this.firearmStolen = FirearmStolen;
    }

    public SerialField<String> getSuspectSex() {
        return this.suspectSex;
    }

    public void setSuspectSex(SerialField<String> SuspectSex) {
        this.suspectSex = SuspectSex;
    }

    public SerialField<String> getVictimSuspectRelationshipPrimary() {
        return this.victimSuspectRelationshipPrimary;
    }

    public void setVictimSuspectRelationshipPrimary(SerialField<String> VictimSuspectRelationshipPrimary) {
        this.victimSuspectRelationshipPrimary = VictimSuspectRelationshipPrimary;
    }

    public SerialField<String> getVictimSuspectRelationshipSecondary() {
        return this.victimSuspectRelationshipSecondary;
    }

    public void setVictimSuspectRelationshipSecondary(SerialField<String> VictimSuspectRelationshipSecondary) {
        this.victimSuspectRelationshipSecondary = VictimSuspectRelationshipSecondary;
    }

    public SerialField<OneOrZero> getHasAbusehistory() {
        return this.hasAbusehistory;
    }

    public void setHasAbusehistory(SerialField<OneOrZero> HasAbusehistory) {
        this.hasAbusehistory = HasAbusehistory;
    }

    public SerialField<OneOrZero> getIsCareTaker() {
        return this.isCareTaker;
    }

    public void setIsCareTaker(SerialField<OneOrZero> IsCareTaker) {
        this.isCareTaker = IsCareTaker;
    }

    public SerialField<OneOrZero> getHasAttemptedSuicide() {
        return this.hasAttemptedSuicide;
    }

    public void setHasAttemptedSuicide(SerialField<OneOrZero> HasAttemptedSuicide) {
        this.hasAttemptedSuicide = HasAttemptedSuicide;
    }

    public SerialField<OneOrZero> getIsSuspectAlsoVictim() {
        return this.isSuspectAlsoVictim;
    }

    public void setIsSuspectAlsoVictim(SerialField<OneOrZero> IsSuspectAlsoVictim) {
        this.isSuspectAlsoVictim = IsSuspectAlsoVictim;
    }

    public SerialField<OneOrZero> getIsSuspectMentallyIll() {
        return this.isSuspectMentallyIll;
    }

    public void setIsSuspectMentallyIll(SerialField<OneOrZero> IsSuspectMentallyIll) {
        this.isSuspectMentallyIll = IsSuspectMentallyIll;
    }

    public SerialField<OneOrZero> getHasSuspectDevelopmentDisability() {
        return this.hasSuspectDevelopmentDisability;
    }

    public void setHasSuspectDevelopmentDisability(SerialField<OneOrZero> HasSuspectDevelopmentDisability) {
        this.hasSuspectDevelopmentDisability = HasSuspectDevelopmentDisability;
    }

    public SerialField<OneOrZero> getIsSuspectAlcoholUseSuspected() {
        return this.isSuspectAlcoholUseSuspected;
    }

    public void setIsSuspectAlcoholUseSuspected(SerialField<OneOrZero> IsSuspectAlcoholUseSuspected) {
        this.isSuspectAlcoholUseSuspected = IsSuspectAlcoholUseSuspected;
    }

    public SerialField<OneOrZero> getIsSuspectSubstanceUseSuspected() {
        return this.isSuspectSubstanceUseSuspected;
    }

    public void setIsSuspectSubstanceUseSuspected(SerialField<OneOrZero> IsSuspectSubstanceUseSuspected) {
        this.isSuspectSubstanceUseSuspected = IsSuspectSubstanceUseSuspected;
    }

    public SerialField<OneOrZero> getIsSuspectContactPolice() {
        return this.isSuspectContactPolice;
    }

    public void setIsSuspectContactPolice(SerialField<OneOrZero> IsSuspectContactPolice) {
        this.isSuspectContactPolice = IsSuspectContactPolice;
    }

    public SerialField<OneOrZero> getSuspectRecentRelease() {
        return this.suspectRecentRelease;
    }

    public void setSuspectRecentRelease(SerialField<OneOrZero> SuspectRecentRelease) {
        this.suspectRecentRelease = SuspectRecentRelease;
    }

    public SerialField<OneOrZero> getIsSuspectCaucasian() {
        return this.isSuspectCaucasian;
    }

    public void setIsSuspectCaucasian(SerialField<OneOrZero> IsSuspectCaucasian) {
        this.isSuspectCaucasian = IsSuspectCaucasian;
    }

    public SerialField<OneOrZero> getIsSuspectAfricanAmerican() {
        return this.isSuspectAfricanAmerican;
    }

    public void setIsSuspectAfricanAmerican(SerialField<OneOrZero> IsSuspectAfricanAmerican) {
        this.isSuspectAfricanAmerican = IsSuspectAfricanAmerican;
    }

    public SerialField<OneOrZero> getIsSuspectAsian() {
        return this.isSuspectAsian;
    }

    public void setIsSuspectAsian(SerialField<OneOrZero> IsSuspectAsian) {
        this.isSuspectAsian = IsSuspectAsian;
    }

    public SerialField<OneOrZero> getIsSuspectPacificIslander() {
        return this.isSuspectPacificIslander;
    }

    public void setIsSuspectPacificIslander(SerialField<OneOrZero> IsSuspectPacificIslander) {
        this.isSuspectPacificIslander = IsSuspectPacificIslander;
    }

    public SerialField<OneOrZero> getIsSuspectAmericanIndian() {
        return this.isSuspectAmericanIndian;
    }

    public void setIsSuspectAmericanIndian(SerialField<OneOrZero> IsSuspectAmericanIndian) {
        this.isSuspectAmericanIndian = IsSuspectAmericanIndian;
    }

    public SerialField<OneOrZero> getIsSuspectRaceUnspecified() {
        return this.isSuspectRaceUnspecified;
    }

    public void setIsSuspectRaceUnspecified(SerialField<OneOrZero> IsSuspectRaceUnspecified) {
        this.isSuspectRaceUnspecified = IsSuspectRaceUnspecified;
    }

    public SerialField<String> getSuspectEthnicity() {
        return this.suspectEthnicity;
    }

    public void setSuspectEthnicity(SerialField<String> SuspectEthnicity) {
        this.suspectEthnicity = SuspectEthnicity;
    }

    public SerialField<OneOrZero> getIsTreatmentNonAdherenceCME() {
        return this.isTreatmentNonAdherenceCME;
    }

    public void setIsTreatmentNonAdherenceCME(SerialField<OneOrZero> IsTreatmentNonAdherenceCME) {
        this.isTreatmentNonAdherenceCME = IsTreatmentNonAdherenceCME;
    }

    public SerialField<OneOrZero> getIsTraumaticBrainInjuryhistoryCME() {
        return this.isTraumaticBrainInjuryhistoryCME;
    }

    public void setIsTraumaticBrainInjuryhistoryCME(SerialField<OneOrZero> IsTraumaticBrainInjuryhistoryCME) {
        this.isTraumaticBrainInjuryhistoryCME = IsTraumaticBrainInjuryhistoryCME;
    }

    public SerialField<OneOrZero> getIsFamilyStressorsCME() {
        return this.isFamilyStressorsCME;
    }

    public void setIsFamilyStressorsCME(SerialField<OneOrZero> IsFamilyStressorsCME) {
        this.isFamilyStressorsCME = IsFamilyStressorsCME;
    }

    public SerialField<OneOrZero> getIsCrisisFamilyStressorCME() {
        return this.isCrisisFamilyStressorCME;
    }

    public void setIsCrisisFamilyStressorCME(SerialField<OneOrZero> IsCrisisFamilyStressorCME) {
        this.isCrisisFamilyStressorCME = IsCrisisFamilyStressorCME;
    }

    public SerialField<OneOrZero> getIsCaregiverBurdenCME() {
        return this.isCaregiverBurdenCME;
    }

    public void setIsCaregiverBurdenCME(SerialField<OneOrZero> IsCaregiverBurdenCME) {
        this.isCaregiverBurdenCME = IsCaregiverBurdenCME;
    }

    public SerialField<OneOrZero> getIsFamilyStressorCME() {
        return this.isFamilyStressorCME;
    }

    public void setIsFamilyStressorCME(SerialField<OneOrZero> IsFamilyStressorCME) {
        this.isFamilyStressorCME = IsFamilyStressorCME;
    }

    public SerialField<OneOrZero> getIsHouseholdKnownCME() {
        return this.isHouseholdKnownCME;
    }

    public void setIsHouseholdKnownCME(SerialField<OneOrZero> IsHouseholdKnownCME) {
        this.isHouseholdKnownCME = IsHouseholdKnownCME;
    }

    public SerialField<OneOrZero> getIsPriorCPSReportCME() {
        return this.isPriorCPSReportCME;
    }

    public void setIsPriorCPSReportCME(SerialField<OneOrZero> IsPriorCPSReportCME) {
        this.isPriorCPSReportCME = IsPriorCPSReportCME;
    }

    public SerialField<OneOrZero> getIsHouseholdSubstanceAbuseCME() {
        return this.isHouseholdSubstanceAbuseCME;
    }

    public void setIsHouseholdSubstanceAbuseCME(SerialField<OneOrZero> IsHouseholdSubstanceAbuseCME) {
        this.isHouseholdSubstanceAbuseCME = IsHouseholdSubstanceAbuseCME;
    }

    public SerialField<OneOrZero> getIsLivingTransitionCME() {
        return this.isLivingTransitionCME;
    }

    public void setIsLivingTransitionCME(SerialField<OneOrZero> IsLivingTransitionCME) {
        this.isLivingTransitionCME = IsLivingTransitionCME;
    }

    public SerialField<OneOrZero> getIsCorporalPunishmentCME() {
        return this.isCorporalPunishmentCME;
    }

    public void setIsCorporalPunishmentCME(SerialField<OneOrZero> IsCorporalPunishmentCME) {
        this.isCorporalPunishmentCME = IsCorporalPunishmentCME;
    }

    public SerialField<OneOrZero> getIshistorySelfHarmCME() {
        return this.ishistorySelfHarmCME;
    }

    public void setIshistorySelfHarmCME(SerialField<OneOrZero> IshistorySelfHarmCME) {
        this.ishistorySelfHarmCME = IshistorySelfHarmCME;
    }

    public SerialField<OneOrZero> getIsTreatmentNonAdherenceLE() {
        return this.isTreatmentNonAdherenceLE;
    }

    public void setIsTreatmentNonAdherenceLE(SerialField<OneOrZero> IsTreatmentNonAdherenceLE) {
        this.isTreatmentNonAdherenceLE = IsTreatmentNonAdherenceLE;
    }

    public SerialField<OneOrZero> getIsTraumaticBrainInjuryhistoryLE() {
        return this.isTraumaticBrainInjuryhistoryLE;
    }

    public void setIsTraumaticBrainInjuryhistoryLE(SerialField<OneOrZero> IsTraumaticBrainInjuryhistoryLE) {
        this.isTraumaticBrainInjuryhistoryLE = IsTraumaticBrainInjuryhistoryLE;
    }

    public SerialField<OneOrZero> getIsFamilyStressorsLE() {
        return this.isFamilyStressorsLE;
    }

    public void setIsFamilyStressorsLE(SerialField<OneOrZero> IsFamilyStressorsLE) {
        this.isFamilyStressorsLE = IsFamilyStressorsLE;
    }

    public SerialField<OneOrZero> getIsCrisisFamilyStressorLE() {
        return this.isCrisisFamilyStressorLE;
    }

    public void setIsCrisisFamilyStressorLE(SerialField<OneOrZero> IsCrisisFamilyStressorLE) {
        this.isCrisisFamilyStressorLE = IsCrisisFamilyStressorLE;
    }

    public SerialField<OneOrZero> getIsCaregiverBurdenLE() {
        return this.isCaregiverBurdenLE;
    }

    public void setIsCaregiverBurdenLE(SerialField<OneOrZero> IsCaregiverBurdenLE) {
        this.isCaregiverBurdenLE = IsCaregiverBurdenLE;
    }

    public SerialField<OneOrZero> getIsFamilyStressorLE() {
        return this.isFamilyStressorLE;
    }

    public void setIsFamilyStressorLE(SerialField<OneOrZero> IsFamilyStressorLE) {
        this.isFamilyStressorLE = IsFamilyStressorLE;
    }

    public SerialField<OneOrZero> getIsHouseholdKnownLE() {
        return this.isHouseholdKnownLE;
    }

    public void setIsHouseholdKnownLE(SerialField<OneOrZero> IsHouseholdKnownLE) {
        this.isHouseholdKnownLE = IsHouseholdKnownLE;
    }

    public SerialField<OneOrZero> getIsPriorCPSReportLE() {
        return this.isPriorCPSReportLE;
    }

    public void setIsPriorCPSReportLE(SerialField<OneOrZero> IsPriorCPSReportLE) {
        this.isPriorCPSReportLE = IsPriorCPSReportLE;
    }

    public SerialField<OneOrZero> getIsHouseholdSubstanceAbuseLE() {
        return this.isHouseholdSubstanceAbuseLE;
    }

    public void setIsHouseholdSubstanceAbuseLE(SerialField<OneOrZero> IsHouseholdSubstanceAbuseLE) {
        this.isHouseholdSubstanceAbuseLE = IsHouseholdSubstanceAbuseLE;
    }

    public SerialField<OneOrZero> getIsLivingTransitionLE() {
        return this.isLivingTransitionLE;
    }

    public void setIsLivingTransitionLE(SerialField<OneOrZero> IsLivingTransitionLE) {
        this.isLivingTransitionLE = IsLivingTransitionLE;
    }

    public SerialField<OneOrZero> getIsCorporalPunishmentLE() {
        return this.isCorporalPunishmentLE;
    }

    public void setIsCorporalPunishmentLE(SerialField<OneOrZero> IsCorporalPunishmentLE) {
        this.isCorporalPunishmentLE = IsCorporalPunishmentLE;
    }

    public SerialField<OneOrZero> getIshistorySelfHarmLE() {
        return this.ishistorySelfHarmLE;
    }

    public void setIshistorySelfHarmLE(SerialField<OneOrZero> IshistorySelfHarmLE) {
        this.ishistorySelfHarmLE = IshistorySelfHarmLE;
    }

    public SerialField<CharLimitedInteger> getTypeOfPoisoning() {
        return this.typeOfPoisoning;
    }

    public void setTypeOfPoisoning(SerialField<CharLimitedInteger> TypeOfPoisoning) {
        this.typeOfPoisoning = TypeOfPoisoning;
    }

    public SerialField<MilitaryTime> getLastSeenAliveTime() {
        return this.lastSeenAliveTime;
    }

    public void setLastSeenAliveTime(SerialField<MilitaryTime> LastSeenAliveTime) {
        this.lastSeenAliveTime = LastSeenAliveTime;
    }

    public SerialField<MilitaryTime> getFoundUnresponsiveTime() {
        return this.foundUnresponsiveTime;
    }

    public void setFoundUnresponsiveTime(SerialField<MilitaryTime> FoundUnresponsiveTime) {
        this.foundUnresponsiveTime = FoundUnresponsiveTime;
    }

    public SerialField<CharLimitedInteger> getLastSeenAliveMonth() {
        return this.lastSeenAliveMonth;
    }

    public void setLastSeenAliveMonth(SerialField<CharLimitedInteger> LastSeenAliveMonth) {
        this.lastSeenAliveMonth = LastSeenAliveMonth;
    }

    public SerialField<CharLimitedInteger> getLastSeenAliveDay() {
        return this.lastSeenAliveDay;
    }

    public void setLastSeenAliveDay(SerialField<CharLimitedInteger> LastSeenAliveDay) {
        this.lastSeenAliveDay = LastSeenAliveDay;
    }

    public SerialField<CharLimitedInteger> getLastSeenAliveYear() {
        return this.lastSeenAliveYear;
    }

    public void setLastSeenAliveYear(SerialField<CharLimitedInteger> LastSeenAliveYear) {
        this.lastSeenAliveYear = LastSeenAliveYear;
    }

    public SerialField<CharLimitedInteger> getFoundUnresponsiveMonth() {
        return this.foundUnresponsiveMonth;
    }

    public void setFoundUnresponsiveMonth(SerialField<CharLimitedInteger> FoundUnresponsiveMonth) {
        this.foundUnresponsiveMonth = FoundUnresponsiveMonth;
    }

    public SerialField<CharLimitedInteger> getFoundUnresponsiveDay() {
        return this.foundUnresponsiveDay;
    }

    public void setFoundUnresponsiveDay(SerialField<CharLimitedInteger> FoundUnresponsiveDay) {
        this.foundUnresponsiveDay = FoundUnresponsiveDay;
    }

    public SerialField<CharLimitedInteger> getFoundUnresponsiveYear() {
        return this.foundUnresponsiveYear;
    }

    public void setFoundUnresponsiveYear(SerialField<CharLimitedInteger> FoundUnresponsiveYear) {
        this.foundUnresponsiveYear = FoundUnresponsiveYear;
    }

    public SerialField<OneOrZero> getPreviousOverdose() {
        return this.previousOverdose;
    }

    public void setPreviousOverdose(SerialField<OneOrZero> PreviousOverdose) {
        this.previousOverdose = PreviousOverdose;
    }

    public SerialField<OneOrZero> getOverdose0to2DaysPrior() {
        return this.overdose0to2DaysPrior;
    }

    public void setOverdose0to2DaysPrior(SerialField<OneOrZero> Overdose0to2DaysPrior) {
        this.overdose0to2DaysPrior = Overdose0to2DaysPrior;
    }

    public SerialField<OneOrZero> getOverdose3to7DaysPrior() {
        return this.overdose3to7DaysPrior;
    }

    public void setOverdose3to7DaysPrior(SerialField<OneOrZero> Overdose3to7DaysPrior) {
        this.overdose3to7DaysPrior = Overdose3to7DaysPrior;
    }

    public SerialField<OneOrZero> getRecentOpioidUse() {
        return this.recentOpioidUse;
    }

    public void setRecentOpioidUse(SerialField<OneOrZero> RecentOpioidUse) {
        this.recentOpioidUse = RecentOpioidUse;
    }

    public SerialField<OneOrZero> getRecentEmergencyDept() {
        return this.recentEmergencyDept;
    }

    public void setRecentEmergencyDept(SerialField<OneOrZero> RecentEmergencyDept) {
        this.recentEmergencyDept = RecentEmergencyDept;
    }

    public SerialField<OneOrZero> gethisdrugNoEvidence() {
        return this.histDrugNoEvidence;
    }

    public void sethisdrugNoEvidence(SerialField<OneOrZero> histDrugNoEvidence) {
        this.histDrugNoEvidence = histDrugNoEvidence;
    }

    public SerialField<OneOrZero> gethisheroin() {
        return this.histHeroin;
    }

    public void sethisheroin(SerialField<OneOrZero> histHeroin) {
        this.histHeroin = histHeroin;
    }

    public SerialField<OneOrZero> gethisrxOpioid() {
        return this.histRxOpioid;
    }

    public void sethisrxOpioid(SerialField<OneOrZero> histRxOpioid) {
        this.histRxOpioid = histRxOpioid;
    }

    public SerialField<OneOrZero> gethisanyOpioid() {
        return this.histAnyOpioid;
    }

    public void sethisanyOpioid(SerialField<OneOrZero> histAnyOpioid) {
        this.histAnyOpioid = histAnyOpioid;
    }

    public SerialField<OneOrZero> gethisfentanyl() {
        return this.histFentanyl;
    }

    public void sethisfentanyl(SerialField<OneOrZero> histFentanyl) {
        this.histFentanyl = histFentanyl;
    }

    public SerialField<OneOrZero> gethiscocaine() {
        return this.histCocaine;
    }

    public void sethiscocaine(SerialField<OneOrZero> histCocaine) {
        this.histCocaine = histCocaine;
    }

    public SerialField<OneOrZero> gethismeth() {
        return this.histMeth;
    }

    public void sethismeth(SerialField<OneOrZero> histMeth) {
        this.histMeth = histMeth;
    }

    public SerialField<OneOrZero> gethisbenzo() {
        return this.histBenzo;
    }

    public void sethisbenzo(SerialField<OneOrZero> histBenzo) {
        this.histBenzo = histBenzo;
    }

    public SerialField<OneOrZero> gethiscannabis() {
        return this.histCannabis;
    }

    public void sethiscannabis(SerialField<OneOrZero> histCannabis) {
        this.histCannabis = histCannabis;
    }

    public SerialField<OneOrZero> gethisunspecified() {
        return this.histUnspecified;
    }

    public void sethisunspecified(SerialField<OneOrZero> histUnspecified) {
        this.histUnspecified = histUnspecified;
    }

    public SerialField<OneOrZero> gethisother() {
        return this.histOther;
    }

    public void sethisother(SerialField<OneOrZero> histOther) {
        this.histOther = histOther;
    }

    public SerialField<String> gethisotherDesc() {
        return this.histOtherDesc;
    }

    public void sethisotherDesc(SerialField<String> histOtherDesc) {
        this.histOtherDesc = histOtherDesc;
    }

    public SerialField<OneOrZero> getTreatmentForSubstanceAbuse() {
        return this.treatmentForSubstanceAbuse;
    }

    public void setTreatmentForSubstanceAbuse(SerialField<OneOrZero> TreatmentForSubstanceAbuse) {
        this.treatmentForSubstanceAbuse = TreatmentForSubstanceAbuse;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentRehab() {
        return this.substanceTreatmentRehab;
    }

    public void setSubstanceTreatmentRehab(SerialField<OneOrZero> SubstanceTreatmentRehab) {
        this.substanceTreatmentRehab = SubstanceTreatmentRehab;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentMATcog() {
        return this.substanceTreatmentMATcog;
    }

    public void setSubstanceTreatmentMATcog(SerialField<OneOrZero> SubstanceTreatmentMATcog) {
        this.substanceTreatmentMATcog = SubstanceTreatmentMATcog;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentMATNoCog() {
        return this.substanceTreatmentMATNoCog;
    }

    public void setSubstanceTreatmentMATNoCog(SerialField<OneOrZero> SubstanceTreatmentMATNoCog) {
        this.substanceTreatmentMATNoCog = SubstanceTreatmentMATNoCog;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentMAT() {
        return this.substanceTreatmentMAT;
    }

    public void setSubstanceTreatmentMAT(SerialField<OneOrZero> SubstanceTreatmentMAT) {
        this.substanceTreatmentMAT = SubstanceTreatmentMAT;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentCogTherapy() {
        return this.substanceTreatmentCogTherapy;
    }

    public void setSubstanceTreatmentCogTherapy(SerialField<OneOrZero> SubstanceTreatmentCogTherapy) {
        this.substanceTreatmentCogTherapy = SubstanceTreatmentCogTherapy;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentNA() {
        return this.substanceTreatmentNA;
    }

    public void setSubstanceTreatmentNA(SerialField<OneOrZero> SubstanceTreatmentNA) {
        this.substanceTreatmentNA = SubstanceTreatmentNA;
    }

    public SerialField<OneOrZero> getSubstanceTreatmentOther() {
        return this.substanceTreatmentOther;
    }

    public void setSubstanceTreatmentOther(SerialField<OneOrZero> SubstanceTreatmentOther) {
        this.substanceTreatmentOther = SubstanceTreatmentOther;
    }

    public SerialField<String> getSubstanceTreatmentOtherSpecify() {
        return this.substanceTreatmentOtherSpecify;
    }

    public void setSubstanceTreatmentOtherSpecify(SerialField<String> SubstanceTreatmentOtherSpecify) {
        this.substanceTreatmentOtherSpecify = SubstanceTreatmentOtherSpecify;
    }

    public SerialField<OneOrZero> getInvolveCriminalJustice() {
        return this.involveCriminalJustice;
    }

    public void setInvolveCriminalJustice(SerialField<OneOrZero> InvolveCriminalJustice) {
        this.involveCriminalJustice = InvolveCriminalJustice;
    }

    public SerialField<OneOrZero> getHasIndicationsDrugPara() {
        return this.hasIndicationsDrugPara;
    }

    public void setHasIndicationsDrugPara(SerialField<OneOrZero> HasIndicationsDrugPara) {
        this.hasIndicationsDrugPara = HasIndicationsDrugPara;
    }

    public SerialField<OneOrZero> getHasIndicationsNone() {
        return this.hasIndicationsNone;
    }

    public void setHasIndicationsNone(SerialField<OneOrZero> HasIndicationsNone) {
        this.hasIndicationsNone = HasIndicationsNone;
    }

    public SerialField<OneOrZero> getHasIndicationsNonSpecific() {
        return this.hasIndicationsNonSpecific;
    }

    public void setHasIndicationsNonSpecific(SerialField<OneOrZero> HasIndicationsNonSpecific) {
        this.hasIndicationsNonSpecific = HasIndicationsNonSpecific;
    }

    public SerialField<OneOrZero> getHasRapidOverdoseEvidence() {
        return this.hasRapidOverdoseEvidence;
    }

    public void setHasRapidOverdoseEvidence(SerialField<OneOrZero> HasRapidOverdoseEvidence) {
        this.hasRapidOverdoseEvidence = HasRapidOverdoseEvidence;
    }

    public SerialField<OneOrZero> getIsTourniquetAroundArm() {
        return this.isTourniquetAroundArm;
    }

    public void setIsTourniquetAroundArm(SerialField<OneOrZero> IsTourniquetAroundArm) {
        this.isTourniquetAroundArm = IsTourniquetAroundArm;
    }

    public SerialField<OneOrZero> getBodyPosition() {
        return this.bodyPosition;
    }

    public void setBodyPosition(SerialField<OneOrZero> BodyPosition) {
        this.bodyPosition = BodyPosition;
    }

    public SerialField<OneOrZero> getNeedleLocation() {
        return this.needleLocation;
    }

    public void setNeedleLocation(SerialField<OneOrZero> NeedleLocation) {
        this.needleLocation = NeedleLocation;
    }

    public SerialField<OneOrZero> getRapidOverdoseWitnessReport() {
        return this.rapidOverdoseWitnessReport;
    }

    public void setRapidOverdoseWitnessReport(SerialField<OneOrZero> RapidOverdoseWitnessReport) {
        this.rapidOverdoseWitnessReport = RapidOverdoseWitnessReport;
    }

    public SerialField<OneOrZero> getHasRapidOverdoseOther() {
        return this.hasRapidOverdoseOther;
    }

    public void setHasRapidOverdoseOther(SerialField<OneOrZero> HasRapidOverdoseOther) {
        this.hasRapidOverdoseOther = HasRapidOverdoseOther;
    }

    public SerialField<String> getRapidOverdoseOtherDescription() {
        return this.rapidOverdoseOtherDescription;
    }

    public void setRapidOverdoseOtherDescription(SerialField<String> RapidOverdoseOtherDescription) {
        this.rapidOverdoseOtherDescription = RapidOverdoseOtherDescription;
    }

    public SerialField<OneOrZero> getHasRouteUnknown() {
        return this.hasRouteUnknown;
    }

    public void setHasRouteUnknown(SerialField<OneOrZero> HasRouteUnknown) {
        this.hasRouteUnknown = HasRouteUnknown;
    }

    public SerialField<OneOrZero> getHasRouteInjection() {
        return this.hasRouteInjection;
    }

    public void setHasRouteInjection(SerialField<OneOrZero> HasRouteInjection) {
        this.hasRouteInjection = HasRouteInjection;
    }

    public SerialField<OneOrZero> getHasIndicationsTracks() {
        return this.hasIndicationsTracks;
    }

    public void setHasIndicationsTracks(SerialField<OneOrZero> HasIndicationsTracks) {
        this.hasIndicationsTracks = HasIndicationsTracks;
    }

    public SerialField<OneOrZero> getHasEvidenceOfInjectionTourniquet() {
        return this.hasEvidenceOfInjectionTourniquet;
    }

    public void setHasEvidenceOfInjectionTourniquet(SerialField<OneOrZero> HasEvidenceOfInjectionTourniquet) {
        this.hasEvidenceOfInjectionTourniquet = HasEvidenceOfInjectionTourniquet;
    }

    public SerialField<OneOrZero> getHasEvidenceOfInjectionCooker() {
        return this.hasEvidenceOfInjectionCooker;
    }

    public void setHasEvidenceOfInjectionCooker(SerialField<OneOrZero> HasEvidenceOfInjectionCooker) {
        this.hasEvidenceOfInjectionCooker = HasEvidenceOfInjectionCooker;
    }

    public SerialField<OneOrZero> getHasEvidenceOfinjectionNeedle() {
        return this.hasEvidenceOfinjectionNeedle;
    }

    public void setHasEvidenceOfinjectionNeedle(SerialField<OneOrZero> HasEvidenceOfinjectionNeedle) {
        this.hasEvidenceOfinjectionNeedle = HasEvidenceOfinjectionNeedle;
    }

    public SerialField<OneOrZero> getHasEvidenceOfInjectionFilter() {
        return this.hasEvidenceOfInjectionFilter;
    }

    public void setHasEvidenceOfInjectionFilter(SerialField<OneOrZero> HasEvidenceOfInjectionFilter) {
        this.hasEvidenceOfInjectionFilter = HasEvidenceOfInjectionFilter;
    }

    public SerialField<OneOrZero> getHasEvidenceOfInjectionWitnessReport() {
        return this.hasEvidenceOfInjectionWitnessReport;
    }

    public void setHasEvidenceOfInjectionWitnessReport(SerialField<OneOrZero> HasEvidenceOfInjectionWitnessReport) {
        this.hasEvidenceOfInjectionWitnessReport = HasEvidenceOfInjectionWitnessReport;
    }

    public SerialField<CharLimitedInteger> getHasEvidenceOfInjectionOther() {
        return this.hasEvidenceOfInjectionOther;
    }

    public void setHasEvidenceOfInjectionOther(SerialField<CharLimitedInteger> HasEvidenceOfInjectionOther) {
        this.hasEvidenceOfInjectionOther = HasEvidenceOfInjectionOther;
    }

    public SerialField<String> getHasEvidenceOfInjectionOtherDescription() {
        return this.hasEvidenceOfInjectionOtherDescription;
    }

    public void setHasEvidenceOfInjectionOtherDescription(SerialField<String> HasEvidenceOfInjectionOtherDescription) {
        this.hasEvidenceOfInjectionOtherDescription = HasEvidenceOfInjectionOtherDescription;
    }

    public SerialField<OneOrZero> getHasRouteSnorting() {
        return this.hasRouteSnorting;
    }

    public void setHasRouteSnorting(SerialField<OneOrZero> HasRouteSnorting) {
        this.hasRouteSnorting = HasRouteSnorting;
    }

    public SerialField<OneOrZero> getSnortingStraw() {
        return this.snortingStraw;
    }

    public void setSnortingStraw(SerialField<OneOrZero> SnortingStraw) {
        this.snortingStraw = SnortingStraw;
    }

    public SerialField<OneOrZero> getSnortingRolled() {
        return this.snortingRolled;
    }

    public void setSnortingRolled(SerialField<OneOrZero> SnortingRolled) {
        this.snortingRolled = SnortingRolled;
    }

    public SerialField<OneOrZero> getSnortingRazor() {
        return this.snortingRazor;
    }

    public void setSnortingRazor(SerialField<OneOrZero> SnortingRazor) {
        this.snortingRazor = SnortingRazor;
    }

    public SerialField<OneOrZero> getSnortingPowderMirror() {
        return this.snortingPowderMirror;
    }

    public void setSnortingPowderMirror(SerialField<OneOrZero> SnortingPowderMirror) {
        this.snortingPowderMirror = SnortingPowderMirror;
    }

    public SerialField<OneOrZero> getSnortingPowderNose() {
        return this.snortingPowderNose;
    }

    public void setSnortingPowderNose(SerialField<OneOrZero> SnortingPowderNose) {
        this.snortingPowderNose = SnortingPowderNose;
    }

    public SerialField<OneOrZero> getSnortingWitness() {
        return this.snortingWitness;
    }

    public void setSnortingWitness(SerialField<OneOrZero> SnortingWitness) {
        this.snortingWitness = SnortingWitness;
    }

    public SerialField<OneOrZero> getSnortingOther() {
        return this.snortingOther;
    }

    public void setSnortingOther(SerialField<OneOrZero> SnortingOther) {
        this.snortingOther = SnortingOther;
    }

    public SerialField<String> getSnortingOtherDesc() {
        return this.snortingOtherDesc;
    }

    public void setSnortingOtherDesc(SerialField<String> SnortingOtherDesc) {
        this.snortingOtherDesc = SnortingOtherDesc;
    }

    public SerialField<OneOrZero> getHasRouteSmoking() {
        return this.hasRouteSmoking;
    }

    public void setHasRouteSmoking(SerialField<OneOrZero> HasRouteSmoking) {
        this.hasRouteSmoking = HasRouteSmoking;
    }

    public SerialField<OneOrZero> getSmokingPipe() {
        return this.smokingPipe;
    }

    public void setSmokingPipe(SerialField<OneOrZero> SmokingPipe) {
        this.smokingPipe = SmokingPipe;
    }

    public SerialField<OneOrZero> getSmokingTinfoil() {
        return this.smokingTinfoil;
    }

    public void setSmokingTinfoil(SerialField<OneOrZero> smokingTinfoil) {
        this.smokingTinfoil = smokingTinfoil;
    }

    public SerialField<OneOrZero> getSmokingVape() {
        return this.smokingVape;
    }

    public void setSmokingVape(SerialField<OneOrZero> smokingVape) {
        this.smokingVape = smokingVape;
    }

    public SerialField<OneOrZero> getSmokingBongBowl() {
        return this.smokingBongBowl;
    }

    public void setSmokingBongBowl(SerialField<OneOrZero> smokingBongBowl) {
        this.smokingBongBowl = smokingBongBowl;
    }

    public SerialField<OneOrZero> getSmokingWitness() {
        return this.smokingWitness;
    }

    public void setSmokingWitness(SerialField<OneOrZero> smokingWitness) {
        this.smokingWitness = smokingWitness;
    }

    public SerialField<OneOrZero> getSmokingOther() {
        return this.smokingOther;
    }

    public void setSmokingOther(SerialField<OneOrZero> smokingOther) {
        this.smokingOther = smokingOther;
    }

    public SerialField<String> getSmokingOtherDesc() {
        return this.smokingOtherDesc;
    }

    public void setSmokingOtherDesc(SerialField<String> smokingOtherDesc) {
        this.smokingOtherDesc = smokingOtherDesc;
    }

    public SerialField<OneOrZero> getHasRouteTransdermal() {
        return this.hasRouteTransdermal;
    }

    public void setHasRouteTransdermal(SerialField<OneOrZero> hasRouteTransdermal) {
        this.hasRouteTransdermal = hasRouteTransdermal;
    }

    public SerialField<OneOrZero> getHasRouteIngestion() {
        return this.hasRouteIngestion;
    }

    public void setHasRouteIngestion(SerialField<OneOrZero> hasRouteIngestion) {
        this.hasRouteIngestion = hasRouteIngestion;
    }

    public SerialField<OneOrZero> getHasRouteSuppository() {
        return this.hasRouteSuppository;
    }

    public void setHasRouteSuppository(SerialField<OneOrZero> hasRouteSuppository) {
        this.hasRouteSuppository = hasRouteSuppository;
    }

    public SerialField<OneOrZero> getHasRouteSublingual() {
        return this.hasRouteSublingual;
    }

    public void setHasRouteSublingual(SerialField<OneOrZero> hasRouteSublingual) {
        this.hasRouteSublingual = hasRouteSublingual;
    }

    public SerialField<OneOrZero> getHasRouteBuccal() {
        return this.hasRouteBuccal;
    }

    public void setHasRouteBuccal(SerialField<OneOrZero> hasRouteBuccal) {
        this.hasRouteBuccal = hasRouteBuccal;
    }

    public SerialField<OneOrZero> getNonSpecificRx() {
        return this.nonSpecificRx;
    }

    public void setNonSpecificRx(SerialField<OneOrZero> nonSpecificRx) {
        this.nonSpecificRx = nonSpecificRx;
    }

    public SerialField<OneOrZero> getHasEvidenceOfPrescriptionDrug() {
        return this.hasEvidenceOfPrescriptionDrug;
    }

    public void setHasEvidenceOfPrescriptionDrug(SerialField<OneOrZero> hasEvidenceOfPrescriptionDrug) {
        this.hasEvidenceOfPrescriptionDrug = hasEvidenceOfPrescriptionDrug;
    }

    public SerialField<OneOrZero> getIsPrescribedToVictim() {
        return this.isPrescribedToVictim;
    }

    public void setIsPrescribedToVictim(SerialField<OneOrZero> isPrescribedToVictim) {
        this.isPrescribedToVictim = isPrescribedToVictim;
    }

    public SerialField<OneOrZero> getIsUnknownWhoPrescribed() {
        return this.isUnknownWhoPrescribed;
    }

    public void setIsUnknownWhoPrescribed(SerialField<OneOrZero> isUnknownWhoPrescribed) {
        this.isUnknownWhoPrescribed = isUnknownWhoPrescribed;
    }

    public SerialField<OneOrZero> getHasIndicationsRxDrugs() {
        return this.hasIndicationsRxDrugs;
    }

    public void setHasIndicationsRxDrugs(SerialField<OneOrZero> hasIndicationsRxDrugs) {
        this.hasIndicationsRxDrugs = hasIndicationsRxDrugs;
    }

    public SerialField<String> getPrescriptionOtherDescription() {
        return this.prescriptionOtherDescription;
    }

    public void setPrescriptionOtherDescription(SerialField<String> prescriptionOtherDescription) {
        this.prescriptionOtherDescription = prescriptionOtherDescription;
    }

    public SerialField<OneOrZero> getHasIndicationsDrugatScene() {
        return this.hasIndicationsDrugatScene;
    }

    public void setHasIndicationsDrugatScene(SerialField<OneOrZero> hasIndicationsDrugatScene) {
        this.hasIndicationsDrugatScene = hasIndicationsDrugatScene;
    }

    public SerialField<OneOrZero> getHaveEvidenceIllicitPowder() {
        return this.haveEvidenceIllicitPowder;
    }

    public void setHaveEvidenceIllicitPowder(SerialField<OneOrZero> haveEvidenceIllicitPowder) {
        this.haveEvidenceIllicitPowder = haveEvidenceIllicitPowder;
    }

    public SerialField<OneOrZero> getHasEvidenceIllicitTar() {
        return this.hasEvidenceIllicitTar;
    }

    public void setHasEvidenceIllicitTar(SerialField<OneOrZero> hasEvidenceIllicitTar) {
        this.hasEvidenceIllicitTar = hasEvidenceIllicitTar;
    }

    public SerialField<OneOrZero> getHasEvidenceOfIllicitWitnessReport() {
        return this.hasEvidenceOfIllicitWitnessReport;
    }

    public void setHasEvidenceOfIllicitWitnessReport(SerialField<OneOrZero> hasEvidenceOfIllicitWitnessReport) {
        this.hasEvidenceOfIllicitWitnessReport = hasEvidenceOfIllicitWitnessReport;
    }

    public SerialField<OneOrZero> getHasEvidenceCrystal() {
        return this.hasEvidenceCrystal;
    }

    public void setHasEvidenceCrystal(SerialField<OneOrZero> hasEvidenceCrystal) {
        this.hasEvidenceCrystal = hasEvidenceCrystal;
    }

    public SerialField<String> getOtherFormDescription() {
        return this.otherFormDescription;
    }

    public void setOtherFormDescription(SerialField<String> otherFormDescription) {
        this.otherFormDescription = otherFormDescription;
    }

    public SerialField<CharLimitedInteger> getBystandersPresent() {
        return this.bystandersPresent;
    }

    public void setBystandersPresent(SerialField<CharLimitedInteger> bystandersPresent) {
        this.bystandersPresent = bystandersPresent;
    }

    public SerialField<String> getBystanderOtherSpecify() {
        return this.bystanderOtherSpecify;
    }

    public void setBystanderOtherSpecify(SerialField<String> bystanderOtherSpecify) {
        this.bystanderOtherSpecify = bystanderOtherSpecify;
    }

    public SerialField<OneOrZero> getWitnessedDrugUse() {
        return this.witnessedDrugUse;
    }

    public void setWitnessedDrugUse(SerialField<OneOrZero> witnessedDrugUse) {
        this.witnessedDrugUse = witnessedDrugUse;
    }

    public SerialField<OneOrZero> getBystanderCPR() {
        return this.bystanderCPR;
    }

    public void setBystanderCPR(SerialField<OneOrZero> bystanderCPR) {
        this.bystanderCPR = bystanderCPR;
    }

    public SerialField<OneOrZero> getBystanderBreathing() {
        return this.bystanderBreathing;
    }

    public void setBystanderBreathing(SerialField<OneOrZero> bystanderBreathing) {
        this.bystanderBreathing = bystanderBreathing;
    }

    public SerialField<OneOrZero> getBystanderSternal() {
        return this.bystanderSternal;
    }

    public void setBystanderSternal(SerialField<OneOrZero> bystanderSternal) {
        this.bystanderSternal = bystanderSternal;
    }

    public SerialField<OneOrZero> getBystanderStimulation() {
        return this.bystanderStimulation;
    }

    public void setBystanderStimulation(SerialField<OneOrZero> bystanderStimulation) {
        this.bystanderStimulation = bystanderStimulation;
    }

    public SerialField<OneOrZero> getBystanderIntrvOther() {
        return this.bystanderIntrvOther;
    }

    public void setBystanderIntrvOther(SerialField<OneOrZero> bystanderIntrvOther) {
        this.bystanderIntrvOther = bystanderIntrvOther;
    }

    public SerialField<String> getBystanderIntrvOtherSpecify() {
        return this.bystanderIntrvOtherSpecify;
    }

    public void setBystanderIntrvOtherSpecify(SerialField<String> bystanderIntrvOtherSpecify) {
        this.bystanderIntrvOtherSpecify = bystanderIntrvOtherSpecify;
    }

    public SerialField<OneOrZero> getWasNaloxoneAdministered() {
        return this.wasNaloxoneAdministered;
    }

    public void setWasNaloxoneAdministered(SerialField<OneOrZero> wasNaloxoneAdministered) {
        this.wasNaloxoneAdministered = wasNaloxoneAdministered;
    }

    public SerialField<OneOrZero> getIsNaloxoneNotAdmin() {
        return this.isNaloxoneNotAdmin;
    }

    public void setIsNaloxoneNotAdmin(SerialField<OneOrZero> isNaloxoneNotAdmin) {
        this.isNaloxoneNotAdmin = isNaloxoneNotAdmin;
    }

    public SerialField<OneOrZero> getIsNaloxoneUnknown() {
        return this.isNaloxoneUnknown;
    }

    public void setIsNaloxoneUnknown(SerialField<OneOrZero> isNaloxoneUnknown) {
        this.isNaloxoneUnknown = isNaloxoneUnknown;
    }

    public SerialField<OneOrZero> getNaloxoneTotalResponder() {
        return this.naloxoneTotalResponder;
    }

    public void setNaloxoneTotalResponder(SerialField<OneOrZero> naloxoneTotalResponder) {
        this.naloxoneTotalResponder = naloxoneTotalResponder;
    }

    public SerialField<OneOrZero> getNaloxoneTotalBystander() {
        return this.naloxoneTotalBystander;
    }

    public void setNaloxoneTotalBystander(SerialField<OneOrZero> naloxoneTotalBystander) {
        this.naloxoneTotalBystander = naloxoneTotalBystander;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminUnknown() {
        return this.isNaloxoneAdminUnknown;
    }

    public void setIsNaloxoneAdminUnknown(SerialField<OneOrZero> isNaloxoneAdminUnknown) {
        this.isNaloxoneAdminUnknown = isNaloxoneAdminUnknown;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminLaw() {
        return this.isNaloxoneAdminLaw;
    }

    public void setIsNaloxoneAdminLaw(SerialField<OneOrZero> isNaloxoneAdminLaw) {
        this.isNaloxoneAdminLaw = isNaloxoneAdminLaw;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminEms() {
        return this.isNaloxoneAdminEms;
    }

    public void setIsNaloxoneAdminEms(SerialField<OneOrZero> isNaloxoneAdminEms) {
        this.isNaloxoneAdminEms = isNaloxoneAdminEms;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminHospital() {
        return this.isNaloxoneAdminHospital;
    }

    public void setIsNaloxoneAdminHospital(SerialField<OneOrZero> isNaloxoneAdminHospital) {
        this.isNaloxoneAdminHospital = isNaloxoneAdminHospital;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminOther() {
        return this.isNaloxoneAdminOther;
    }

    public void setIsNaloxoneAdminOther(SerialField<OneOrZero> isNaloxoneAdminOther) {
        this.isNaloxoneAdminOther = isNaloxoneAdminOther;
    }

    public SerialField<OneOrZero> getIsNaloxoneAdminBystander() {
        return this.isNaloxoneAdminBystander;
    }

    public void setIsNaloxoneAdminBystander(SerialField<OneOrZero> isNaloxoneAdminBystander) {
        this.isNaloxoneAdminBystander = isNaloxoneAdminBystander;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoPerson() {
        return this.isNaloxoneWhoPerson;
    }

    public void setIsNaloxoneWhoPerson(SerialField<OneOrZero> isNaloxoneWhoPerson) {
        this.isNaloxoneWhoPerson = isNaloxoneWhoPerson;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoPartner() {
        return this.isNaloxoneWhoPartner;
    }

    public void setIsNaloxoneWhoPartner(SerialField<OneOrZero> isNaloxoneWhoPartner) {
        this.isNaloxoneWhoPartner = isNaloxoneWhoPartner;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoFriend() {
        return this.isNaloxoneWhoFriend;
    }

    public void setIsNaloxoneWhoFriend(SerialField<OneOrZero> isNaloxoneWhoFriend) {
        this.isNaloxoneWhoFriend = isNaloxoneWhoFriend;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoOtherFamily() {
        return this.isNaloxoneWhoOtherFamily;
    }

    public void setIsNaloxoneWhoOtherFamily(SerialField<OneOrZero> isNaloxoneWhoOtherFamily) {
        this.isNaloxoneWhoOtherFamily = isNaloxoneWhoOtherFamily;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoRoomate() {
        return this.isNaloxoneWhoRoomate;
    }

    public void setIsNaloxoneWhoRoomate(SerialField<OneOrZero> isNaloxoneWhoRoomate) {
        this.isNaloxoneWhoRoomate = isNaloxoneWhoRoomate;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoStranger() {
        return this.isNaloxoneWhoStranger;
    }

    public void setIsNaloxoneWhoStranger(SerialField<OneOrZero> isNaloxoneWhoStranger) {
        this.isNaloxoneWhoStranger = isNaloxoneWhoStranger;
    }

    public SerialField<OneOrZero> getIsNaloxoneWhoOther() {
        return this.isNaloxoneWhoOther;
    }

    public void setIsNaloxoneWhoOther(SerialField<OneOrZero> isNaloxoneWhoOther) {
        this.isNaloxoneWhoOther = isNaloxoneWhoOther;
    }

    public SerialField<String> getIsNaloxoneWhoOtherDescription() {
        return this.isNaloxoneWhoOtherDescription;
    }

    public void setIsNaloxoneWhoOtherDescription(SerialField<String> isNaloxoneWhoOtherDescription) {
        this.isNaloxoneWhoOtherDescription = isNaloxoneWhoOtherDescription;
    }

    public SerialField<OneOrZero> getHadPulse() {
        return this.hadPulse;
    }

    public void setHadPulse(SerialField<OneOrZero> hadPulse) {
        this.hadPulse = hadPulse;
    }

    public SerialField<OneOrZero> getIntrvCPR() {
        return this.intrvCPR;
    }

    public void setIntrvCPR(SerialField<OneOrZero> intrvCPR) {
        this.intrvCPR = intrvCPR;
    }

    public SerialField<OneOrZero> getIntrvBreathing() {
        return this.intrvBreathing;
    }

    public void setIntrvBreathing(SerialField<OneOrZero> intrvBreathing) {
        this.intrvBreathing = intrvBreathing;
    }

    public SerialField<OneOrZero> getIntrvEpinephrine() {
        return this.intrvEpinephrine;
    }

    public void setIntrvEpinephrine(SerialField<OneOrZero> intrvEpinephrine) {
        this.intrvEpinephrine = intrvEpinephrine;
    }

    public SerialField<OneOrZero> getIntrvTransport() {
        return this.intrvTransport;
    }

    public void setIntrvTransport(SerialField<OneOrZero> intrvTransport) {
        this.intrvTransport = intrvTransport;
    }

    public SerialField<OneOrZero> getIntrvOxygen() {
        return this.intrvOxygen;
    }

    public void setIntrvOxygen(SerialField<OneOrZero> intrvOxygen) {
        this.intrvOxygen = intrvOxygen;
    }

    public SerialField<OneOrZero> getIntrvOther() {
        return this.intrvOther;
    }

    public void setIntrvOther(SerialField<OneOrZero> intrvOther) {
        this.intrvOther = intrvOther;
    }

    public SerialField<String> getIntrvOtherSpecify() {
        return this.intrvOtherSpecify;
    }

    public void setIntrvOtherSpecify(SerialField<String> intrvOtherSpecify) {
        this.intrvOtherSpecify = intrvOtherSpecify;
    }

    public SerialField<OneOrZero> getBystanderNotRecognize() {
        return this.bystanderNotRecognize;
    }

    public void setBystanderNotRecognize(SerialField<OneOrZero> bystanderNotRecognize) {
        this.bystanderNotRecognize = bystanderNotRecognize;
    }

    public SerialField<OneOrZero> getBystanderUsing() {
        return this.bystanderUsing;
    }

    public void setBystanderUsing(SerialField<OneOrZero> bystanderUsing) {
        this.bystanderUsing = bystanderUsing;
    }

    public SerialField<OneOrZero> getBystanderPublic() {
        return this.bystanderPublic;
    }

    public void setBystanderPublic(SerialField<OneOrZero> bystanderPublic) {
        this.bystanderPublic = bystanderPublic;
    }

    public SerialField<OneOrZero> getBystanderNoOverdose() {
        return this.bystanderNoOverdose;
    }

    public void setBystanderNoOverdose(SerialField<OneOrZero> bystanderNoOverdose) {
        this.bystanderNoOverdose = bystanderNoOverdose;
    }

    public SerialField<OneOrZero> getBystanderSeperated() {
        return this.bystanderSeperated;
    }

    public void setBystanderSeperated(SerialField<OneOrZero> bystanderSeperated) {
        this.bystanderSeperated = bystanderSeperated;
    }

    public SerialField<OneOrZero> getBystanderUnaware() {
        return this.bystanderUnaware;
    }

    public void setBystanderUnaware(SerialField<OneOrZero> bystanderUnaware) {
        this.bystanderUnaware = bystanderUnaware;
    }

    public SerialField<OneOrZero> getBystanderReasonOther() {
        return this.bystanderReasonOther;
    }

    public void setBystanderReasonOther(SerialField<OneOrZero> bystanderReasonOther) {
        this.bystanderReasonOther = bystanderReasonOther;
    }

    public SerialField<String> getBystanderReasonOtherSpecify() {
        return this.bystanderReasonOtherSpecify;
    }

    public void setBystanderReasonOtherSpecify(SerialField<String> bystanderReasonOtherSpecify) {
        this.bystanderReasonOtherSpecify = bystanderReasonOtherSpecify;
    }

    public SerialField<OneOrZero> getTreatedforPain() {
        return this.treatedforPain;
    }

    public void setTreatedforPain(SerialField<OneOrZero> treatedforPain) {
        this.treatedforPain = treatedforPain;
    }

    public SerialField<OneOrZero> getMedhistCopd() {
        return this.medhistCopd;
    }

    public void setMedhistCopd(SerialField<OneOrZero> medhistCopd) {
        this.medhistCopd = medhistCopd;
    }

    public SerialField<OneOrZero> getMedhistAsthma() {
        return this.medhistAsthma;
    }

    public void setMedhistAsthma(SerialField<OneOrZero> medhistAsthma) {
        this.medhistAsthma = medhistAsthma;
    }

    public SerialField<OneOrZero> getMedhistApnea() {
        return this.medhistApnea;
    }

    public void setMedhistApnea(SerialField<OneOrZero> medhistApnea) {
        this.medhistApnea = medhistApnea;
    }

    public SerialField<OneOrZero> getMedhistHeart() {
        return this.medhistHeart;
    }

    public void setMedhistHeart(SerialField<OneOrZero> medhistHeart) {
        this.medhistHeart = medhistHeart;
    }

    public SerialField<OneOrZero> getMedhistObesity() {
        return this.medhistObesity;
    }

    public void setMedhistObesity(SerialField<OneOrZero> medhistObesity) {
        this.medhistObesity = medhistObesity;
    }

    public SerialField<OneOrZero> getMedhistInjury() {
        return this.medhistInjury;
    }

    public void setMedhistInjury(SerialField<OneOrZero> medhistInjury) {
        this.medhistInjury = medhistInjury;
    }

    public SerialField<OneOrZero> getMedhistMigraine() {
        return this.medhistMigraine;
    }

    public void setMedhistMigraine(SerialField<OneOrZero> medhistMigraine) {
        this.medhistMigraine = medhistMigraine;
    }

    public SerialField<OneOrZero> getMedhistBackpain() {
        return this.medhistBackpain;
    }

    public void setMedhistBackpain(SerialField<OneOrZero> medhistBackpain) {
        this.medhistBackpain = medhistBackpain;
    }

    public SerialField<OneOrZero> getMedicalhistHepc() {
        return this.medicalhistHepc;
    }

    public void setMedicalhistHepc(SerialField<OneOrZero> medicalhistHepc) {
        this.medicalhistHepc = medicalhistHepc;
    }

    public SerialField<OneOrZero> getMedicalhistHIV() {
        return this.medicalhistHIV;
    }

    public void setMedicalhistHIV(SerialField<OneOrZero> medicalhistHIV) {
        this.medicalhistHIV = medicalhistHIV;
    }

    public SerialField<OneOrZero> getMedhistOtherpain() {
        return this.medhistOtherpain;
    }

    public void setMedhistOtherpain(SerialField<OneOrZero> medhistOtherpain) {
        this.medhistOtherpain = medhistOtherpain;
    }

    public SerialField<OneOrZero> getMedhistOtherbreathing() {
        return this.medhistOtherbreathing;
    }

    public void setMedhistOtherbreathing(SerialField<OneOrZero> medhistOtherbreathing) {
        this.medhistOtherbreathing = medhistOtherbreathing;
    }

    public SerialField<OneOrZero> getPrescriptionMorphine() {
        return this.prescriptionMorphine;
    }

    public void setPrescriptionMorphine(SerialField<OneOrZero> prescriptionMorphine) {
        this.prescriptionMorphine = prescriptionMorphine;
    }

    public SerialField<String> getPrescriptionMorphineNarrative() {
        return this.prescriptionMorphineNarrative;
    }

    public void setPrescriptionMorphineNarrative(SerialField<String> prescriptionMorphineNarrative) {
        this.prescriptionMorphineNarrative = prescriptionMorphineNarrative;
    }

    public SerialField<OneOrZero> getBuprenorphineRx() {
        return this.buprenorphineRx;
    }

    public void setBuprenorphineRx(SerialField<OneOrZero> buprenorphineRx) {
        this.buprenorphineRx = buprenorphineRx;
    }

    public SerialField<OneOrZero> getBuprenorphineRxForPain() {
        return this.buprenorphineRxForPain;
    }

    public void setBuprenorphineRxForPain(SerialField<OneOrZero> buprenorphineRxForPain) {
        this.buprenorphineRxForPain = buprenorphineRxForPain;
    }

    public SerialField<OneOrZero> getBuprenorphineRxForMat() {
        return this.buprenorphineRxForMat;
    }

    public void setBuprenorphineRxForMat(SerialField<OneOrZero> buprenorphineRxForMat) {
        this.buprenorphineRxForMat = buprenorphineRxForMat;
    }

    public SerialField<OneOrZero> getBuprenorphineRxForUnk() {
        return this.buprenorphineRxForUnk;
    }

    public void setBuprenorphineRxForUnk(SerialField<OneOrZero> buprenorphineRxForUnk) {
        this.buprenorphineRxForUnk = buprenorphineRxForUnk;
    }

    public SerialField<OneOrZero> getMethadoneRx() {
        return this.methadoneRx;
    }

    public void setMethadoneRx(SerialField<OneOrZero> methadoneRx) {
        this.methadoneRx = methadoneRx;
    }

    public SerialField<OneOrZero> getMethadoneRxForPain() {
        return this.methadoneRxForPain;
    }

    public void setMethadoneRxForPain(SerialField<OneOrZero> methadoneRxForPain) {
        this.methadoneRxForPain = methadoneRxForPain;
    }

    public SerialField<OneOrZero> getMethadoneRxForMat() {
        return this.methadoneRxForMat;
    }

    public void setMethadoneRxForMat(SerialField<OneOrZero> methadoneRxForMat) {
        this.methadoneRxForMat = methadoneRxForMat;
    }

    public SerialField<OneOrZero> getMethadoneRxUnk() {
        return this.methadoneRxUnk;
    }

    public void setMethadoneRxUnk(SerialField<OneOrZero> methadoneRxUnk) {
        this.methadoneRxUnk = methadoneRxUnk;
    }

    public SerialField<OneOrZero> getNaltrexoneRx() {
        return this.naltrexoneRx;
    }

    public void setNaltrexoneRx(SerialField<OneOrZero> naltrexoneRx) {
        this.naltrexoneRx = naltrexoneRx;
    }

    public SerialField<OneOrZero> getFentanylRx() {
        return this.fentanylRx;
    }

    public void setFentanylRx(SerialField<OneOrZero> fentanylRx) {
        this.fentanylRx = fentanylRx;
    }

    public SerialField<CharLimitedInteger> getNumScripsPast30Days() {
        return this.numScripsPast30Days;
    }

    public void setNumScripsPast30Days(SerialField<CharLimitedInteger> numScripsPast30Days) {
        this.numScripsPast30Days = numScripsPast30Days;
    }

    public SerialField<CharLimitedInteger> getNumPharmaciesPast30Days() {
        return this.numPharmaciesPast30Days;
    }

    public void setNumPharmaciesPast30Days(SerialField<CharLimitedInteger> numPharmaciesPast30Days) {
        this.numPharmaciesPast30Days = numPharmaciesPast30Days;
    }

    public SerialField<CharLimitedInteger> getNumDoctorsPrescribing30Days() {
        return this.numDoctorsPrescribing30Days;
    }

    public void setNumDoctorsPrescribing30Days(SerialField<CharLimitedInteger> numDoctorsPrescribing30Days) {
        this.numDoctorsPrescribing30Days = numDoctorsPrescribing30Days;
    }

    public SerialField<OneOrZero> getIsAsianIndian() {
        return this.isAsianIndian;
    }

    public void setIsAsianIndian(SerialField<OneOrZero> isAsianIndian) {
        this.isAsianIndian = isAsianIndian;
    }

    public SerialField<OneOrZero> getIsAsianChinese() {
        return this.isAsianChinese;
    }

    public void setIsAsianChinese(SerialField<OneOrZero> isAsianChinese) {
        this.isAsianChinese = isAsianChinese;
    }

    public SerialField<OneOrZero> getIsAsianFilipino() {
        return this.isAsianFilipino;
    }

    public void setIsAsianFilipino(SerialField<OneOrZero> isAsianFilipino) {
        this.isAsianFilipino = isAsianFilipino;
    }

    public SerialField<OneOrZero> getIsAsianJapanese() {
        return this.isAsianJapanese;
    }

    public void setIsAsianJapanese(SerialField<OneOrZero> isAsianJapanese) {
        this.isAsianJapanese = isAsianJapanese;
    }

    public SerialField<OneOrZero> getIsAsianKorean() {
        return this.isAsianKorean;
    }

    public void setIsAsianKorean(SerialField<OneOrZero> isAsianKorean) {
        this.isAsianKorean = isAsianKorean;
    }

    public SerialField<OneOrZero> getIsAsianVietnamese() {
        return this.isAsianVietnamese;
    }

    public void setIsAsianVietnamese(SerialField<OneOrZero> isAsianVietnamese) {
        this.isAsianVietnamese = isAsianVietnamese;
    }

    public SerialField<OneOrZero> getIsAsianOther() {
        return this.isAsianOther;
    }

    public void setIsAsianOther(SerialField<OneOrZero> isAsianOther) {
        this.isAsianOther = isAsianOther;
    }

    public SerialField<String> getIsAsianOtherText() {
        return this.isAsianOtherText;
    }

    public void setIsAsianOtherText(SerialField<String> isAsianOtherText) {
        this.isAsianOtherText = isAsianOtherText;
    }

    public SerialField<OneOrZero> getIsPacificIslanderHawaii() {
        return this.isPacificIslanderHawaii;
    }

    public void setIsPacificIslanderHawaii(SerialField<OneOrZero> isPacificIslanderHawaii) {
        this.isPacificIslanderHawaii = isPacificIslanderHawaii;
    }

    public SerialField<OneOrZero> getIsPacificIslanderGuam() {
        return this.isPacificIslanderGuam;
    }

    public void setIsPacificIslanderGuam(SerialField<OneOrZero> isPacificIslanderGuam) {
        this.isPacificIslanderGuam = isPacificIslanderGuam;
    }

    public SerialField<OneOrZero> getIsPacificIslanderSamoa() {
        return this.isPacificIslanderSamoa;
    }

    public void setIsPacificIslanderSamoa(SerialField<OneOrZero> isPacificIslanderSamoa) {
        this.isPacificIslanderSamoa = isPacificIslanderSamoa;
    }

    public SerialField<OneOrZero> getIsPacificIslanderOther() {
        return this.isPacificIslanderOther;
    }

    public void setIsPacificIslanderOther(SerialField<OneOrZero> isPacificIslanderOther) {
        this.isPacificIslanderOther = isPacificIslanderOther;
    }

    public SerialField<OneOrZero> getIsPacificIslanderOtherText() {
        return this.isPacificIslanderOtherText;
    }

    public void setIsPacificIslanderOtherText(SerialField<OneOrZero> isPacificIslanderOtherText) {
        this.isPacificIslanderOtherText = isPacificIslanderOtherText;
    }

    public SerialField<OneOrZero> getAmericanIndianTribe() {
        return this.americanIndianTribe;
    }

    public void setAmericanIndianTribe(SerialField<OneOrZero> americanIndianTribe) {
        this.americanIndianTribe = americanIndianTribe;
    }

    public SerialField<String> getAmericanIndianTribeOther() {
        return this.americanIndianTribeOther;
    }

    public void setAmericanIndianTribeOther(SerialField<String> americanIndianTribeOther) {
        this.americanIndianTribeOther = americanIndianTribeOther;
    }

    public LECMEFormat forceNewRecord(SerialField<YesOrBlank> forceNewRecord) {
        setForceNewRecord(forceNewRecord);
        return this;
    }

    public LECMEFormat overwriteConflicts(SerialField<YesOrBlank> overwriteConflicts) {
        setOverwriteConflicts(overwriteConflicts);
        return this;
    }

    public LECMEFormat incidentYear(SerialField<CharLimitedInteger> incidentYear) {
        setIncidentYear(incidentYear);
        return this;
    }

    public LECMEFormat incidentNumber(SerialField<CharLimitedInteger> incidentNumber) {
        setIncidentNumber(incidentNumber);
        return this;
    }

    public LECMEFormat victimNumber(SerialField<CharLimitedInteger> victimNumber) {
        setVictimNumber(victimNumber);
        return this;
    }

    public LECMEFormat lastFourDCNumber(SerialField<String> lastFourDCNumber) {
        setLastFourDCNumber(lastFourDCNumber);
        return this;
    }

    public LECMEFormat lastFourCMENumber(SerialField<String> lastFourCMENumber) {
        setLastFourCMENumber(lastFourCMENumber);
        return this;
    }

    public LECMEFormat initialOfLastName(SerialField<String> initialOfLastName) {
        setInitialOfLastName(initialOfLastName);
        return this;
    }

    public LECMEFormat birthDayOfMonth(SerialField<CharLimitedInteger> birthDayOfMonth) {
        setBirthDayOfMonth(birthDayOfMonth);
        return this;
    }

    public LECMEFormat deathMannerAbstractor(SerialField<DeathManner> deathMannerAbstractor) {
        setDeathMannerAbstractor(deathMannerAbstractor);
        return this;
    }

    public LECMEFormat deathMannerDC(SerialField<DeathManner> deathMannerDC) {
        setDeathMannerDC(deathMannerDC);
        return this;
    }

    public LECMEFormat deathMannerCME(SerialField<DeathManner> deathMannerCME) {
        setDeathMannerCME(deathMannerCME);
        return this;
    }

    public LECMEFormat deathMannerLE(SerialField<DeathManner> deathMannerLE) {
        setDeathMannerLE(deathMannerLE);
        return this;
    }

    public LECMEFormat deathDateYear(SerialField<CharLimitedInteger> deathDateYear) {
        setDeathDateYear(deathDateYear);
        return this;
    }

    public LECMEFormat deathDateMonth(SerialField<CharLimitedInteger> deathDateMonth) {
        setDeathDateMonth(deathDateMonth);
        return this;
    }

    public LECMEFormat deathDateDay(SerialField<CharLimitedInteger> deathDateDay) {
        setDeathDateDay(deathDateDay);
        return this;
    }

    public LECMEFormat deathState(SerialField<CharLimitedInteger> deathState) {
        setDeathState(deathState);
        return this;
    }

    public LECMEFormat deathCounty(SerialField<CharLimitedInteger> deathCounty) {
        setDeathCounty(deathCounty);
        return this;
    }

    public LECMEFormat deathPronouncedDateYear(SerialField<CharLimitedInteger> deathPronouncedDateYear) {
        setDeathPronouncedDateYear(deathPronouncedDateYear);
        return this;
    }

    public LECMEFormat deathPronouncedDateMonth(SerialField<CharLimitedInteger> deathPronouncedDateMonth) {
        setDeathPronouncedDateMonth(deathPronouncedDateMonth);
        return this;
    }

    public LECMEFormat deathPronouncedDateDay(SerialField<CharLimitedInteger> deathPronouncedDateDay) {
        setDeathPronouncedDateDay(deathPronouncedDateDay);
        return this;
    }

    public LECMEFormat deathPlace(SerialField<DeathPlace> deathPlace) {
        setDeathPlace(deathPlace);
        return this;
    }

    public LECMEFormat deathPlaceText(SerialField<String> deathPlaceText) {
        setDeathPlaceText(deathPlaceText);
        return this;
    }

    public LECMEFormat autopsyPerformed(SerialField<AutopsyPerformed> autopsyPerformed) {
        setAutopsyPerformed(autopsyPerformed);
        return this;
    }

    public LECMEFormat injuryDateYear(SerialField<CharLimitedInteger> injuryDateYear) {
        setInjuryDateYear(injuryDateYear);
        return this;
    }

    public LECMEFormat injuryDateMonth(SerialField<CharLimitedInteger> injuryDateMonth) {
        setInjuryDateMonth(injuryDateMonth);
        return this;
    }

    public LECMEFormat injuryDateDay(SerialField<CharLimitedInteger> injuryDateDay) {
        setInjuryDateDay(injuryDateDay);
        return this;
    }

    public LECMEFormat injuryTime(SerialField<String> injuryTime) {
        setInjuryTime(injuryTime);
        return this;
    }

    public LECMEFormat survivalTime(SerialField<CharLimitedInteger> survivalTime) {
        setSurvivalTime(survivalTime);
        return this;
    }

    public LECMEFormat survivalTimeUnit(SerialField<AgeUnits> survivalTimeUnit) {
        setSurvivalTimeUnit(survivalTimeUnit);
        return this;
    }

    public LECMEFormat injuryLocation(SerialField<InjuryLocation> injuryLocation) {
        setInjuryLocation(injuryLocation);
        return this;
    }

    public LECMEFormat injuredAtWork(SerialField<OneOrZero> injuredAtWork) {
        setInjuredAtWork(injuredAtWork);
        return this;
    }

    public LECMEFormat injuredAtVictimHome(SerialField<OneOrZero> injuredAtVictimHome) {
        setInjuredAtVictimHome(injuredAtVictimHome);
        return this;
    }

    public LECMEFormat eMSPresent(SerialField<OneOrZero> eMSPresent) {
        setEMSPresent(eMSPresent);
        return this;
    }

    public LECMEFormat victimInCustody(SerialField<OneOrZero> victimInCustody) {
        setVictimInCustody(victimInCustody);
        return this;
    }

    public LECMEFormat alcoholUseSuspected(SerialField<OneOrZero> alcoholUseSuspected) {
        setAlcoholUseSuspected(alcoholUseSuspected);
        return this;
    }

    public LECMEFormat injuryState(SerialField<FIPSCodes> injuryState) {
        setInjuryState(injuryState);
        return this;
    }

    public LECMEFormat injuryCounty(SerialField<CharLimitedInteger> injuryCounty) {
        setInjuryCounty(injuryCounty);
        return this;
    }

    public LECMEFormat injuryCity(SerialField<CharLimitedInteger> injuryCity) {
        setInjuryCity(injuryCity);
        return this;
    }

    public LECMEFormat injuryZip(SerialField<CharLimitedInteger> injuryZip) {
        setInjuryZip(injuryZip);
        return this;
    }

    public LECMEFormat censusTract(SerialField<String> censusTract) {
        setCensusTract(censusTract);
        return this;
    }

    public LECMEFormat censusBlock(SerialField<CharLimitedInteger> censusBlock) {
        setCensusBlock(censusBlock);
        return this;
    }

    public LECMEFormat sexVictim(SerialField<OneOrZero> sexVictim) {
        setSexVictim(sexVictim);
        return this;
    }

    public LECMEFormat sexualOrientation(SerialField<OneOrZero> sexualOrientation) {
        setSexualOrientation(sexualOrientation);
        return this;
    }

    public LECMEFormat transgender(SerialField<OneOrZero> transgender) {
        setTransgender(transgender);
        return this;
    }

    public LECMEFormat age(SerialField<CharLimitedInteger> age) {
        setAge(age);
        return this;
    }

    public LECMEFormat ageUnit(SerialField<AgeUnits> ageUnit) {
        setAgeUnit(ageUnit);
        return this;
    }

    public LECMEFormat ethnicityVictim(SerialField<OneOrZero> ethnicityVictim) {
        setEthnicityVictim(ethnicityVictim);
        return this;
    }

    public LECMEFormat raceWhiteVictim(SerialField<OneOrZero> raceWhiteVictim) {
        setRaceWhiteVictim(raceWhiteVictim);
        return this;
    }

    public LECMEFormat raceBlackVictim(SerialField<OneOrZero> raceBlackVictim) {
        setRaceBlackVictim(raceBlackVictim);
        return this;
    }

    public LECMEFormat raceAmericanIndianVictim(SerialField<OneOrZero> raceAmericanIndianVictim) {
        setRaceAmericanIndianVictim(raceAmericanIndianVictim);
        return this;
    }

    public LECMEFormat raceAsianVictim(SerialField<OneOrZero> raceAsianVictim) {
        setRaceAsianVictim(raceAsianVictim);
        return this;
    }

    public LECMEFormat racePacificIslanderVictim(SerialField<OneOrZero> racePacificIslanderVictim) {
        setRacePacificIslanderVictim(racePacificIslanderVictim);
        return this;
    }

    public LECMEFormat raceOtherVictim(SerialField<OneOrZero> raceOtherVictim) {
        setRaceOtherVictim(raceOtherVictim);
        return this;
    }

    public LECMEFormat raceUnspecifiedVictim(SerialField<OneOrZero> raceUnspecifiedVictim) {
        setRaceUnspecifiedVictim(raceUnspecifiedVictim);
        return this;
    }

    public LECMEFormat heightFeet(SerialField<CharLimitedInteger> heightFeet) {
        setHeightFeet(heightFeet);
        return this;
    }

    public LECMEFormat heightInches(SerialField<CharLimitedInteger> heightInches) {
        setHeightInches(heightInches);
        return this;
    }

    public LECMEFormat weight(SerialField<CharLimitedInteger> weight) {
        setWeight(weight);
        return this;
    }

    public LECMEFormat pregnant(SerialField<CharLimitedInteger> pregnant) {
        setPregnant(pregnant);
        return this;
    }

    public LECMEFormat maritalStatus(SerialField<MaritalStatus> maritalStatus) {
        setMaritalStatus(maritalStatus);
        return this;
    }

    public LECMEFormat military(SerialField<MilitaryBackground> military) {
        setMilitary(military);
        return this;
    }

    public LECMEFormat homeless(SerialField<OneOrZero> homeless) {
        setHomeless(homeless);
        return this;
    }

    public LECMEFormat recentRelease(SerialField<OneOrZero> recentRelease) {
        setRecentRelease(recentRelease);
        return this;
    }

    public LECMEFormat educationLevel(SerialField<EducationLevel> educationLevel) {
        setEducationLevel(educationLevel);
        return this;
    }

    public LECMEFormat educationYears(SerialField<CharLimitedInteger> educationYears) {
        setEducationYears(educationYears);
        return this;
    }

    public LECMEFormat industry(SerialField<CharLimitedInteger> industry) {
        setIndustry(industry);
        return this;
    }

    public LECMEFormat industryText(SerialField<String> industryText) {
        setIndustryText(industryText);
        return this;
    }

    public LECMEFormat occupationText(SerialField<String> occupationText) {
        setOccupationText(occupationText);
        return this;
    }

    public LECMEFormat usualOccupation(SerialField<CharLimitedInteger> usualOccupation) {
        setUsualOccupation(usualOccupation);
        return this;
    }

    public LECMEFormat occupationCurrentText(SerialField<String> occupationCurrentText) {
        setOccupationCurrentText(occupationCurrentText);
        return this;
    }

    public LECMEFormat birthPlace(SerialField<CharLimitedInteger> birthPlace) {
        setBirthPlace(birthPlace);
        return this;
    }

    public LECMEFormat birthCountryOther(SerialField<String> birthCountryOther) {
        setBirthCountryOther(birthCountryOther);
        return this;
    }

    public LECMEFormat country(SerialField<FIPSCountryCodes> country) {
        setCountry(country);
        return this;
    }

    public LECMEFormat residenceState(SerialField<FIPSCodes> residenceState) {
        setResidenceState(residenceState);
        return this;
    }

    public LECMEFormat residenceCounty(SerialField<CharLimitedInteger> residenceCounty) {
        setResidenceCounty(residenceCounty);
        return this;
    }

    public LECMEFormat residenceCity(SerialField<CharLimitedInteger> residenceCity) {
        setResidenceCity(residenceCity);
        return this;
    }

    public LECMEFormat residenceZip(SerialField<CharLimitedInteger> residenceZip) {
        setResidenceZip(residenceZip);
        return this;
    }

    public LECMEFormat residenceCensusTract(SerialField<String> residenceCensusTract) {
        setResidenceCensusTract(residenceCensusTract);
        return this;
    }

    public LECMEFormat residenceCensusBlock(SerialField<CharLimitedInteger> residenceCensusBlock) {
        setResidenceCensusBlock(residenceCensusBlock);
        return this;
    }

    public LECMEFormat toxicologyNotAvailable(SerialField<CharLimitedInteger> toxicologyNotAvailable) {
        setToxicologyNotAvailable(toxicologyNotAvailable);
        return this;
    }

    public LECMEFormat specimensDateYear(SerialField<CharLimitedInteger> specimensDateYear) {
        setSpecimensDateYear(specimensDateYear);
        return this;
    }

    public LECMEFormat specimensDateMonth(SerialField<CharLimitedInteger> specimensDateMonth) {
        setSpecimensDateMonth(specimensDateMonth);
        return this;
    }

    public LECMEFormat specimensDateDay(SerialField<CharLimitedInteger> specimensDateDay) {
        setSpecimensDateDay(specimensDateDay);
        return this;
    }

    public LECMEFormat specimensTime(SerialField<CharLimitedInteger> specimensTime) {
        setSpecimensTime(specimensTime);
        return this;
    }

    public LECMEFormat alcoholTested(SerialField<OneOrZero> alcoholTested) {
        setAlcoholTested(alcoholTested);
        return this;
    }

    public LECMEFormat alcoholResult(SerialField<OneOrZero> alcoholResult) {
        setAlcoholResult(alcoholResult);
        return this;
    }

    public LECMEFormat alcoholLevel(SerialField<CharLimitedInteger> alcoholLevel) {
        setAlcoholLevel(alcoholLevel);
        return this;
    }

    public LECMEFormat amphetamineTested(SerialField<OneOrZero> amphetamineTested) {
        setAmphetamineTested(amphetamineTested);
        return this;
    }

    public LECMEFormat amphetamineResult(SerialField<OneOrZero> amphetamineResult) {
        setAmphetamineResult(amphetamineResult);
        return this;
    }

    public LECMEFormat anticonvulsantsTested(SerialField<OneOrZero> anticonvulsantsTested) {
        setAnticonvulsantsTested(anticonvulsantsTested);
        return this;
    }

    public LECMEFormat anticonvulsantsResult(SerialField<OneOrZero> anticonvulsantsResult) {
        setAnticonvulsantsResult(anticonvulsantsResult);
        return this;
    }

    public LECMEFormat antidepressantTested(SerialField<OneOrZero> antidepressantTested) {
        setAntidepressantTested(antidepressantTested);
        return this;
    }

    public LECMEFormat antidepressantResult(SerialField<OneOrZero> antidepressantResult) {
        setAntidepressantResult(antidepressantResult);
        return this;
    }

    public LECMEFormat antipsychoticTested(SerialField<OneOrZero> antipsychoticTested) {
        setAntipsychoticTested(antipsychoticTested);
        return this;
    }

    public LECMEFormat antipsychoticResult(SerialField<OneOrZero> antipsychoticResult) {
        setAntipsychoticResult(antipsychoticResult);
        return this;
    }

    public LECMEFormat barbituratesTested(SerialField<OneOrZero> barbituratesTested) {
        setBarbituratesTested(barbituratesTested);
        return this;
    }

    public LECMEFormat barbituratesResult(SerialField<OneOrZero> barbituratesResult) {
        setBarbituratesResult(barbituratesResult);
        return this;
    }

    public LECMEFormat benzodiazepinesTested(SerialField<OneOrZero> benzodiazepinesTested) {
        setBenzodiazepinesTested(benzodiazepinesTested);
        return this;
    }

    public LECMEFormat benzodiazepinesResult(SerialField<OneOrZero> benzodiazepinesResult) {
        setBenzodiazepinesResult(benzodiazepinesResult);
        return this;
    }

    public LECMEFormat carbonMonoxideTested(SerialField<OneOrZero> carbonMonoxideTested) {
        setCarbonMonoxideTested(carbonMonoxideTested);
        return this;
    }

    public LECMEFormat carbonMonoxideResult(SerialField<OneOrZero> carbonMonoxideResult) {
        setCarbonMonoxideResult(carbonMonoxideResult);
        return this;
    }

    public LECMEFormat carbonMonoxideSource(SerialField<OneOrZero> carbonMonoxideSource) {
        setCarbonMonoxideSource(carbonMonoxideSource);
        return this;
    }

    public LECMEFormat cocaineTested(SerialField<OneOrZero> cocaineTested) {
        setCocaineTested(cocaineTested);
        return this;
    }

    public LECMEFormat cocaineResult(SerialField<OneOrZero> cocaineResult) {
        setCocaineResult(cocaineResult);
        return this;
    }

    public LECMEFormat marijuanaTested(SerialField<OneOrZero> marijuanaTested) {
        setMarijuanaTested(marijuanaTested);
        return this;
    }

    public LECMEFormat marijuanaResult(SerialField<OneOrZero> marijuanaResult) {
        setMarijuanaResult(marijuanaResult);
        return this;
    }

    public LECMEFormat muscleRelaxorTested(SerialField<OneOrZero> muscleRelaxorTested) {
        setMuscleRelaxorTested(muscleRelaxorTested);
        return this;
    }

    public LECMEFormat muscleRelaxorResult(SerialField<OneOrZero> muscleRelaxorResult) {
        setMuscleRelaxorResult(muscleRelaxorResult);
        return this;
    }

    public LECMEFormat opiateTested(SerialField<OneOrZero> opiateTested) {
        setOpiateTested(opiateTested);
        return this;
    }

    public LECMEFormat opiateResult(SerialField<OneOrZero> opiateResult) {
        setOpiateResult(opiateResult);
        return this;
    }

    public LECMEFormat numberWounds(SerialField<CharLimitedInteger> numberWounds) {
        setNumberWounds(numberWounds);
        return this;
    }

    public LECMEFormat numberBullets(SerialField<CharLimitedInteger> numberBullets) {
        setNumberBullets(numberBullets);
        return this;
    }

    public LECMEFormat woundToHead(SerialField<OneOrZero> woundToHead) {
        setWoundToHead(woundToHead);
        return this;
    }

    public LECMEFormat woundToFace(SerialField<OneOrZero> woundToFace) {
        setWoundToFace(woundToFace);
        return this;
    }

    public LECMEFormat woundToNeck(SerialField<OneOrZero> woundToNeck) {
        setWoundToNeck(woundToNeck);
        return this;
    }

    public LECMEFormat woundToUpperExtremity(SerialField<OneOrZero> woundToUpperExtremity) {
        setWoundToUpperExtremity(woundToUpperExtremity);
        return this;
    }

    public LECMEFormat woundToSpine(SerialField<OneOrZero> woundToSpine) {
        setWoundToSpine(woundToSpine);
        return this;
    }

    public LECMEFormat woundToThorax(SerialField<OneOrZero> woundToThorax) {
        setWoundToThorax(woundToThorax);
        return this;
    }

    public LECMEFormat woundToAbdomen(SerialField<OneOrZero> woundToAbdomen) {
        setWoundToAbdomen(woundToAbdomen);
        return this;
    }

    public LECMEFormat woundToLowerExtremity(SerialField<OneOrZero> woundToLowerExtremity) {
        setWoundToLowerExtremity(woundToLowerExtremity);
        return this;
    }

    public LECMEFormat circumstancesKnownCME(SerialField<OneOrZero> circumstancesKnownCME) {
        setCircumstancesKnownCME(circumstancesKnownCME);
        return this;
    }

    public LECMEFormat abusedAsChildCME(SerialField<OneOrZero> abusedAsChildCME) {
        setAbusedAsChildCME(abusedAsChildCME);
        return this;
    }

    public LECMEFormat alcoholProblemCME(SerialField<OneOrZero> alcoholProblemCME) {
        setAlcoholProblemCME(alcoholProblemCME);
        return this;
    }

    public LECMEFormat argumentCME(SerialField<OneOrZero> argumentCME) {
        setArgumentCME(argumentCME);
        return this;
    }

    public LECMEFormat argumentOtherCME(SerialField<OneOrZero> argumentOtherCME) {
        setArgumentOtherCME(argumentOtherCME);
        return this;
    }

    public LECMEFormat argumentTimingCME(SerialField<OneOrZero> argumentTimingCME) {
        setArgumentTimingCME(argumentTimingCME);
        return this;
    }

    public LECMEFormat brawlCME(SerialField<OneOrZero> brawlCME) {
        setBrawlCME(brawlCME);
        return this;
    }

    public LECMEFormat bulletRicochetCME(SerialField<OneOrZero> bulletRicochetCME) {
        setBulletRicochetCME(bulletRicochetCME);
        return this;
    }

    public LECMEFormat bystanderCME(SerialField<OneOrZero> bystanderCME) {
        setBystanderCME(bystanderCME);
        return this;
    }

    public LECMEFormat celebratoryFiringCME(SerialField<OneOrZero> celebratoryFiringCME) {
        setCelebratoryFiringCME(celebratoryFiringCME);
        return this;
    }

    public LECMEFormat circumstancesOtherCME(SerialField<OneOrZero> circumstancesOtherCME) {
        setCircumstancesOtherCME(circumstancesOtherCME);
        return this;
    }

    public LECMEFormat circumstancesOtherTextCME(SerialField<String> circumstancesOtherTextCME) {
        setCircumstancesOtherTextCME(circumstancesOtherTextCME);
        return this;
    }

    public LECMEFormat crisisProstitutionCME(SerialField<OneOrZero> crisisProstitutionCME) {
        setCrisisProstitutionCME(crisisProstitutionCME);
        return this;
    }

    public LECMEFormat crisisAlcoholProblemCME(SerialField<OneOrZero> crisisAlcoholProblemCME) {
        setCrisisAlcoholProblemCME(crisisAlcoholProblemCME);
        return this;
    }

    public LECMEFormat crisisCivilLegalCME(SerialField<OneOrZero> crisisCivilLegalCME) {
        setCrisisCivilLegalCME(crisisCivilLegalCME);
        return this;
    }

    public LECMEFormat crisisCriminalCME(SerialField<OneOrZero> crisisCriminalCME) {
        setCrisisCriminalCME(crisisCriminalCME);
        return this;
    }

    public LECMEFormat crisisDisasterExposureCME(SerialField<OneOrZero> crisisDisasterExposureCME) {
        setCrisisDisasterExposureCME(crisisDisasterExposureCME);
        return this;
    }

    public LECMEFormat crisisEvictionCME(SerialField<OneOrZero> crisisEvictionCME) {
        setCrisisEvictionCME(crisisEvictionCME);
        return this;
    }

    public LECMEFormat crisisFamilyStressorCME(SerialField<OneOrZero> crisisFamilyStressorCME) {
        setCrisisFamilyStressorCME(crisisFamilyStressorCME);
        return this;
    }

    public LECMEFormat crisisFinancialCME(SerialField<OneOrZero> crisisFinancialCME) {
        setCrisisFinancialCME(crisisFinancialCME);
        return this;
    }

    public LECMEFormat crisisIntimatePartnerProblemCME(SerialField<OneOrZero> crisisIntimatePartnerProblemCME) {
        setCrisisIntimatePartnerProblemCME(crisisIntimatePartnerProblemCME);
        return this;
    }

    public LECMEFormat crisisJealousyCME(SerialField<OneOrZero> crisisJealousyCME) {
        setCrisisJealousyCME(crisisJealousyCME);
        return this;
    }

    public LECMEFormat crisisJobCME(SerialField<OneOrZero> crisisJobCME) {
        setCrisisJobCME(crisisJobCME);
        return this;
    }

    public LECMEFormat crisisMentalHealthCME(SerialField<OneOrZero> crisisMentalHealthCME) {
        setCrisisMentalHealthCME(crisisMentalHealthCME);
        return this;
    }

    public LECMEFormat crisisOtherAddictionCME(SerialField<OneOrZero> crisisOtherAddictionCME) {
        setCrisisOtherAddictionCME(crisisOtherAddictionCME);
        return this;
    }

    public LECMEFormat crisisPhysicalHealthCME(SerialField<OneOrZero> crisisPhysicalHealthCME) {
        setCrisisPhysicalHealthCME(crisisPhysicalHealthCME);
        return this;
    }

    public LECMEFormat crisisRelatedDeathFriendOrFamilyOtherCME(SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherCME) {
        setCrisisRelatedDeathFriendOrFamilyOtherCME(crisisRelatedDeathFriendOrFamilyOtherCME);
        return this;
    }

    public LECMEFormat crisisRelatedSuicideFriendOrFamilyCME(SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyCME) {
        setCrisisRelatedSuicideFriendOrFamilyCME(crisisRelatedSuicideFriendOrFamilyCME);
        return this;
    }

    public LECMEFormat crisisRelationshipProblemOtherCME(SerialField<OneOrZero> crisisRelationshipProblemOtherCME) {
        setCrisisRelationshipProblemOtherCME(crisisRelationshipProblemOtherCME);
        return this;
    }

    public LECMEFormat crisisSchoolCME(SerialField<OneOrZero> crisisSchoolCME) {
        setCrisisSchoolCME(crisisSchoolCME);
        return this;
    }

    public LECMEFormat crisisStalkingCME(SerialField<OneOrZero> crisisStalkingCME) {
        setCrisisStalkingCME(crisisStalkingCME);
        return this;
    }

    public LECMEFormat crisisSubstanceAbuseCME(SerialField<OneOrZero> crisisSubstanceAbuseCME) {
        setCrisisSubstanceAbuseCME(crisisSubstanceAbuseCME);
        return this;
    }

    public LECMEFormat deathAbuseCME(SerialField<OneOrZero> deathAbuseCME) {
        setDeathAbuseCME(deathAbuseCME);
        return this;
    }

    public LECMEFormat deathFriendOrFamilyOtherCME(SerialField<OneOrZero> deathFriendOrFamilyOtherCME) {
        setDeathFriendOrFamilyOtherCME(deathFriendOrFamilyOtherCME);
        return this;
    }

    public LECMEFormat depressedMoodCME(SerialField<OneOrZero> depressedMoodCME) {
        setDepressedMoodCME(depressedMoodCME);
        return this;
    }

    public LECMEFormat disasterExposureCME(SerialField<OneOrZero> disasterExposureCME) {
        setDisasterExposureCME(disasterExposureCME);
        return this;
    }

    public LECMEFormat disclosedIntentToWhomCME(SerialField<OneOrZero> disclosedIntentToWhomCME) {
        setDisclosedIntentToWhomCME(disclosedIntentToWhomCME);
        return this;
    }

    public LECMEFormat driveByShootingCME(SerialField<OneOrZero> driveByShootingCME) {
        setDriveByShootingCME(driveByShootingCME);
        return this;
    }

    public LECMEFormat drugInvolvementCME(SerialField<OneOrZero> drugInvolvementCME) {
        setDrugInvolvementCME(drugInvolvementCME);
        return this;
    }

    public LECMEFormat evictionOrLossOfHomeCME(SerialField<OneOrZero> evictionOrLossOfHomeCME) {
        setEvictionOrLossOfHomeCME(evictionOrLossOfHomeCME);
        return this;
    }

    public LECMEFormat fightBetweenTwoPeopleCME(SerialField<OneOrZero> fightBetweenTwoPeopleCME) {
        setFightBetweenTwoPeopleCME(fightBetweenTwoPeopleCME);
        return this;
    }

    public LECMEFormat financialProblemCME(SerialField<OneOrZero> financialProblemCME) {
        setFinancialProblemCME(financialProblemCME);
        return this;
    }

    public LECMEFormat unused1(SerialField<OneOrZero> unused1) {
        setUnused1(unused1);
        return this;
    }

    public LECMEFormat gangRelatedCME(SerialField<OneOrZero> gangRelatedCME) {
        setGangRelatedCME(gangRelatedCME);
        return this;
    }

    public LECMEFormat gunCleaningCME(SerialField<OneOrZero> gunCleaningCME) {
        setGunCleaningCME(gunCleaningCME);
        return this;
    }

    public LECMEFormat gunDefectMalfunctionCME(SerialField<OneOrZero> gunDefectMalfunctionCME) {
        setGunDefectMalfunctionCME(gunDefectMalfunctionCME);
        return this;
    }

    public LECMEFormat gunDroppedCME(SerialField<OneOrZero> gunDroppedCME) {
        setGunDroppedCME(gunDroppedCME);
        return this;
    }

    public LECMEFormat gunFiredHolsteringCME(SerialField<OneOrZero> gunFiredHolsteringCME) {
        setGunFiredHolsteringCME(gunFiredHolsteringCME);
        return this;
    }

    public LECMEFormat gunFiredLoadingUnloadingCME(SerialField<OneOrZero> gunFiredLoadingUnloadingCME) {
        setGunFiredLoadingUnloadingCME(gunFiredLoadingUnloadingCME);
        return this;
    }

    public LECMEFormat gunFiredOperatingSafetyLockCME(SerialField<OneOrZero> gunFiredOperatingSafetyLockCME) {
        setGunFiredOperatingSafetyLockCME(gunFiredOperatingSafetyLockCME);
        return this;
    }

    public LECMEFormat gunPlayingCME(SerialField<OneOrZero> gunPlayingCME) {
        setGunPlayingCME(gunPlayingCME);
        return this;
    }

    public LECMEFormat gunShowingCME(SerialField<OneOrZero> gunShowingCME) {
        setGunShowingCME(gunShowingCME);
        return this;
    }

    public LECMEFormat gunThoughtSafetyEngagedCME(SerialField<OneOrZero> gunThoughtSafetyEngagedCME) {
        setGunThoughtSafetyEngagedCME(gunThoughtSafetyEngagedCME);
        return this;
    }

    public LECMEFormat gunThoughtToyCME(SerialField<OneOrZero> gunThoughtToyCME) {
        setGunThoughtToyCME(gunThoughtToyCME);
        return this;
    }

    public LECMEFormat gunThoughtUnloadedMagazineDisengagedCME(SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedCME) {
        setGunThoughtUnloadedMagazineDisengagedCME(gunThoughtUnloadedMagazineDisengagedCME);
        return this;
    }

    public LECMEFormat gunThoughtUnloadedOtherCME(SerialField<OneOrZero> gunThoughtUnloadedOtherCME) {
        setGunThoughtUnloadedOtherCME(gunThoughtUnloadedOtherCME);
        return this;
    }

    public LECMEFormat gunUnintentionallyPulledTriggerCME(SerialField<OneOrZero> gunUnintentionallyPulledTriggerCME) {
        setGunUnintentionallyPulledTriggerCME(gunUnintentionallyPulledTriggerCME);
        return this;
    }

    public LECMEFormat hateCrimeCME(SerialField<OneOrZero> hateCrimeCME) {
        setHateCrimeCME(hateCrimeCME);
        return this;
    }

    public LECMEFormat hisoryMentalIllnessTreatmentCME(SerialField<OneOrZero> hisoryMentalIllnessTreatmentCME) {
        sethisryMentalIllnessTreatmentCME(hisoryMentalIllnessTreatmentCME);
        return this;
    }

    public LECMEFormat huntingCME(SerialField<OneOrZero> huntingCME) {
        setHuntingCME(huntingCME);
        return this;
    }

    public LECMEFormat interpersonalViolencePerpetratorCME(SerialField<OneOrZero> interpersonalViolencePerpetratorCME) {
        setInterpersonalViolencePerpetratorCME(interpersonalViolencePerpetratorCME);
        return this;
    }

    public LECMEFormat interpersonalViolenceVictimCME(SerialField<OneOrZero> interpersonalViolenceVictimCME) {
        setInterpersonalViolenceVictimCME(interpersonalViolenceVictimCME);
        return this;
    }

    public LECMEFormat intervenerAssistingVictimCME(SerialField<OneOrZero> intervenerAssistingVictimCME) {
        setIntervenerAssistingVictimCME(intervenerAssistingVictimCME);
        return this;
    }

    public LECMEFormat intimatePartnerProblemCME(SerialField<OneOrZero> intimatePartnerProblemCME) {
        setIntimatePartnerProblemCME(intimatePartnerProblemCME);
        return this;
    }

    public LECMEFormat intimatePartnerViolenceCME(SerialField<OneOrZero> intimatePartnerViolenceCME) {
        setIntimatePartnerViolenceCME(intimatePartnerViolenceCME);
        return this;
    }

    public LECMEFormat jealouslyCME(SerialField<OneOrZero> jealouslyCME) {
        setJealouslyCME(jealouslyCME);
        return this;
    }

    public LECMEFormat jobProblemCME(SerialField<OneOrZero> jobProblemCME) {
        setJobProblemCME(jobProblemCME);
        return this;
    }

    public LECMEFormat justifiableSelfDefenseCME(SerialField<OneOrZero> justifiableSelfDefenseCME) {
        setJustifiableSelfDefenseCME(justifiableSelfDefenseCME);
        return this;
    }

    public LECMEFormat legalProblemOtherCME(SerialField<OneOrZero> legalProblemOtherCME) {
        setLegalProblemOtherCME(legalProblemOtherCME);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosis1CME(SerialField<OneOrZero> mentalHealthDiagnosis1CME) {
        setMentalHealthDiagnosis1CME(mentalHealthDiagnosis1CME);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosis2CME(SerialField<OneOrZero> mentalHealthDiagnosis2CME) {
        setMentalHealthDiagnosis2CME(mentalHealthDiagnosis2CME);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosisOtherCME(SerialField<String> mentalHealthDiagnosisOtherCME) {
        setMentalHealthDiagnosisOtherCME(mentalHealthDiagnosisOtherCME);
        return this;
    }

    public LECMEFormat mentalHealthProblemCME(SerialField<OneOrZero> mentalHealthProblemCME) {
        setMentalHealthProblemCME(mentalHealthProblemCME);
        return this;
    }

    public LECMEFormat mentalIllnessTreatmentCurrentCME(SerialField<OneOrZero> mentalIllnessTreatmentCurrentCME) {
        setMentalIllnessTreatmentCurrentCME(mentalIllnessTreatmentCurrentCME);
        return this;
    }

    public LECMEFormat mercyKillingCME(SerialField<OneOrZero> mercyKillingCME) {
        setMercyKillingCME(mercyKillingCME);
        return this;
    }

    public LECMEFormat natureOtherCrime1CME(SerialField<OneOrZero> natureOtherCrime1CME) {
        setNatureOtherCrime1CME(natureOtherCrime1CME);
        return this;
    }

    public LECMEFormat natureOtherCrime2CME(SerialField<OneOrZero> natureOtherCrime2CME) {
        setNatureOtherCrime2CME(natureOtherCrime2CME);
        return this;
    }

    public LECMEFormat otherAddictionCME(SerialField<OneOrZero> otherAddictionCME) {
        setOtherAddictionCME(otherAddictionCME);
        return this;
    }

    public LECMEFormat otherContextInjuryCME(SerialField<OneOrZero> otherContextInjuryCME) {
        setOtherContextInjuryCME(otherContextInjuryCME);
        return this;
    }

    public LECMEFormat otherCrimeInProgressCME(SerialField<OneOrZero> otherCrimeInProgressCME) {
        setOtherCrimeInProgressCME(otherCrimeInProgressCME);
        return this;
    }

    public LECMEFormat otherMechanismInjuryCME(SerialField<OneOrZero> otherMechanismInjuryCME) {
        setOtherMechanismInjuryCME(otherMechanismInjuryCME);
        return this;
    }

    public LECMEFormat precipitatedByOtherCrimeCME(SerialField<OneOrZero> precipitatedByOtherCrimeCME) {
        setPrecipitatedByOtherCrimeCME(precipitatedByOtherCrimeCME);
        return this;
    }

    public LECMEFormat physicalHealthProblemCME(SerialField<OneOrZero> physicalHealthProblemCME) {
        setPhysicalHealthProblemCME(physicalHealthProblemCME);
        return this;
    }

    public LECMEFormat prostitutionCME(SerialField<OneOrZero> prostitutionCME) {
        setProstitutionCME(prostitutionCME);
        return this;
    }

    public LECMEFormat randomViolenceCME(SerialField<OneOrZero> randomViolenceCME) {
        setRandomViolenceCME(randomViolenceCME);
        return this;
    }

    public LECMEFormat recentCriminalLegalProblemCME(SerialField<OneOrZero> recentCriminalLegalProblemCME) {
        setRecentCriminalLegalProblemCME(recentCriminalLegalProblemCME);
        return this;
    }

    public LECMEFormat recentSuicideFriendFamilyCME(SerialField<OneOrZero> recentSuicideFriendFamilyCME) {
        setRecentSuicideFriendFamilyCME(recentSuicideFriendFamilyCME);
        return this;
    }

    public LECMEFormat relationshipProblemOtherCME(SerialField<OneOrZero> relationshipProblemOtherCME) {
        setRelationshipProblemOtherCME(relationshipProblemOtherCME);
        return this;
    }

    public LECMEFormat schoolProblemCME(SerialField<OneOrZero> schoolProblemCME) {
        setSchoolProblemCME(schoolProblemCME);
        return this;
    }

    public LECMEFormat selfDefenseCME(SerialField<OneOrZero> selfDefenseCME) {
        setSelfDefenseCME(selfDefenseCME);
        return this;
    }

    public LECMEFormat stalkingCME(SerialField<OneOrZero> stalkingCME) {
        setStalkingCME(stalkingCME);
        return this;
    }

    public LECMEFormat substanceAbuseOtherCME(SerialField<OneOrZero> substanceAbuseOtherCME) {
        setSubstanceAbuseOtherCME(substanceAbuseOtherCME);
        return this;
    }

    public LECMEFormat suicideAttempthisoryCME(SerialField<OneOrZero> suicideAttempthisoryCME) {
        setsuicideAttempthisoryCME(suicideAttempthisoryCME);
        return this;
    }

    public LECMEFormat suicideIntentDisclosedCME(SerialField<OneOrZero> suicideIntentDisclosedCME) {
        setSuicideIntentDisclosedCME(suicideIntentDisclosedCME);
        return this;
    }

    public LECMEFormat suicideNoteCME(SerialField<OneOrZero> suicideNoteCME) {
        setSuicideNoteCME(suicideNoteCME);
        return this;
    }

    public LECMEFormat suicideThoughthisoryCME(SerialField<OneOrZero> suicideThoughthisoryCME) {
        setsuicideThoughthisoryCME(suicideThoughthisoryCME);
        return this;
    }

    public LECMEFormat targetShootingCME(SerialField<OneOrZero> targetShootingCME) {
        setTargetShootingCME(targetShootingCME);
        return this;
    }

    public LECMEFormat terroristAttackCME(SerialField<OneOrZero> terroristAttackCME) {
        setTerroristAttackCME(terroristAttackCME);
        return this;
    }

    public LECMEFormat traumaticAnniversaryCME(SerialField<OneOrZero> traumaticAnniversaryCME) {
        setTraumaticAnniversaryCME(traumaticAnniversaryCME);
        return this;
    }

    public LECMEFormat victimPoliceOfficerOnDutyCME(SerialField<OneOrZero> victimPoliceOfficerOnDutyCME) {
        setVictimPoliceOfficerOnDutyCME(victimPoliceOfficerOnDutyCME);
        return this;
    }

    public LECMEFormat victimUsedWeaponCME(SerialField<OneOrZero> victimUsedWeaponCME) {
        setVictimUsedWeaponCME(victimUsedWeaponCME);
        return this;
    }

    public LECMEFormat walkByAssaultCME(SerialField<OneOrZero> walkByAssaultCME) {
        setWalkByAssaultCME(walkByAssaultCME);
        return this;
    }

    public LECMEFormat circumstancesOtherLE(SerialField<OneOrZero> circumstancesOtherLE) {
        setCircumstancesOtherLE(circumstancesOtherLE);
        return this;
    }

    public LECMEFormat abusedAsChildLE(SerialField<OneOrZero> abusedAsChildLE) {
        setAbusedAsChildLE(abusedAsChildLE);
        return this;
    }

    public LECMEFormat alcoholProblemLE(SerialField<OneOrZero> alcoholProblemLE) {
        setAlcoholProblemLE(alcoholProblemLE);
        return this;
    }

    public LECMEFormat argumentLE(SerialField<OneOrZero> argumentLE) {
        setArgumentLE(argumentLE);
        return this;
    }

    public LECMEFormat argumentOtherLE(SerialField<OneOrZero> argumentOtherLE) {
        setArgumentOtherLE(argumentOtherLE);
        return this;
    }

    public LECMEFormat argumentTimingLE(SerialField<OneOrZero> argumentTimingLE) {
        setArgumentTimingLE(argumentTimingLE);
        return this;
    }

    public LECMEFormat brawlLE(SerialField<OneOrZero> brawlLE) {
        setBrawlLE(brawlLE);
        return this;
    }

    public LECMEFormat bulletRicochetLE(SerialField<OneOrZero> bulletRicochetLE) {
        setBulletRicochetLE(bulletRicochetLE);
        return this;
    }

    public LECMEFormat bystanderLE(SerialField<OneOrZero> bystanderLE) {
        setBystanderLE(bystanderLE);
        return this;
    }

    public LECMEFormat celebratoryFiringLE(SerialField<OneOrZero> celebratoryFiringLE) {
        setCelebratoryFiringLE(celebratoryFiringLE);
        return this;
    }

    public LECMEFormat isCircumstancesKnown(SerialField<OneOrZero> isCircumstancesKnown) {
        setIsCircumstancesKnown(isCircumstancesKnown);
        return this;
    }

    public LECMEFormat circumstancesOtherTextLE(SerialField<String> circumstancesOtherTextLE) {
        setCircumstancesOtherTextLE(circumstancesOtherTextLE);
        return this;
    }

    public LECMEFormat cririsProstitutionLE(SerialField<OneOrZero> cririsProstitutionLE) {
        setCririsProstitutionLE(cririsProstitutionLE);
        return this;
    }

    public LECMEFormat crisisAlcoholProblemLE(SerialField<OneOrZero> crisisAlcoholProblemLE) {
        setCrisisAlcoholProblemLE(crisisAlcoholProblemLE);
        return this;
    }

    public LECMEFormat crisisCivilLegalLE(SerialField<OneOrZero> crisisCivilLegalLE) {
        setCrisisCivilLegalLE(crisisCivilLegalLE);
        return this;
    }

    public LECMEFormat crisisCriminalLE(SerialField<OneOrZero> crisisCriminalLE) {
        setCrisisCriminalLE(crisisCriminalLE);
        return this;
    }

    public LECMEFormat crisisDisasterExposureLE(SerialField<OneOrZero> crisisDisasterExposureLE) {
        setCrisisDisasterExposureLE(crisisDisasterExposureLE);
        return this;
    }

    public LECMEFormat crisisEvictionLE(SerialField<OneOrZero> crisisEvictionLE) {
        setCrisisEvictionLE(crisisEvictionLE);
        return this;
    }

    public LECMEFormat crisisFamilyStressorLE(SerialField<OneOrZero> crisisFamilyStressorLE) {
        setCrisisFamilyStressorLE(crisisFamilyStressorLE);
        return this;
    }

    public LECMEFormat crisisFinancialLE(SerialField<OneOrZero> crisisFinancialLE) {
        setCrisisFinancialLE(crisisFinancialLE);
        return this;
    }

    public LECMEFormat crisisIntimatePartnerProblemLE(SerialField<OneOrZero> crisisIntimatePartnerProblemLE) {
        setCrisisIntimatePartnerProblemLE(crisisIntimatePartnerProblemLE);
        return this;
    }

    public LECMEFormat crisisJealousyLE(SerialField<OneOrZero> crisisJealousyLE) {
        setCrisisJealousyLE(crisisJealousyLE);
        return this;
    }

    public LECMEFormat crisisJobLE(SerialField<OneOrZero> crisisJobLE) {
        setCrisisJobLE(crisisJobLE);
        return this;
    }

    public LECMEFormat crisisMentalHealthLE(SerialField<OneOrZero> crisisMentalHealthLE) {
        setCrisisMentalHealthLE(crisisMentalHealthLE);
        return this;
    }

    public LECMEFormat crisisOtherAddictionLE(SerialField<OneOrZero> crisisOtherAddictionLE) {
        setCrisisOtherAddictionLE(crisisOtherAddictionLE);
        return this;
    }

    public LECMEFormat crisisPhysicalHealthLE(SerialField<OneOrZero> crisisPhysicalHealthLE) {
        setCrisisPhysicalHealthLE(crisisPhysicalHealthLE);
        return this;
    }

    public LECMEFormat crisisRelatedDeathFriendOrFamilyOtherLE(SerialField<OneOrZero> crisisRelatedDeathFriendOrFamilyOtherLE) {
        setCrisisRelatedDeathFriendOrFamilyOtherLE(crisisRelatedDeathFriendOrFamilyOtherLE);
        return this;
    }

    public LECMEFormat crisisRelatedSuicideFriendOrFamilyLE(SerialField<OneOrZero> crisisRelatedSuicideFriendOrFamilyLE) {
        setCrisisRelatedSuicideFriendOrFamilyLE(crisisRelatedSuicideFriendOrFamilyLE);
        return this;
    }

    public LECMEFormat crisisRelationshipProblemOtherLE(SerialField<OneOrZero> crisisRelationshipProblemOtherLE) {
        setCrisisRelationshipProblemOtherLE(crisisRelationshipProblemOtherLE);
        return this;
    }

    public LECMEFormat crisisSchoolLE(SerialField<OneOrZero> crisisSchoolLE) {
        setCrisisSchoolLE(crisisSchoolLE);
        return this;
    }

    public LECMEFormat crisisStalkingLE(SerialField<OneOrZero> crisisStalkingLE) {
        setCrisisStalkingLE(crisisStalkingLE);
        return this;
    }

    public LECMEFormat crisisSubstanceAbuseLE(SerialField<OneOrZero> crisisSubstanceAbuseLE) {
        setCrisisSubstanceAbuseLE(crisisSubstanceAbuseLE);
        return this;
    }

    public LECMEFormat deathAbuseLE(SerialField<OneOrZero> deathAbuseLE) {
        setDeathAbuseLE(deathAbuseLE);
        return this;
    }

    public LECMEFormat deathFriendOrFamilyOtherLE(SerialField<OneOrZero> deathFriendOrFamilyOtherLE) {
        setDeathFriendOrFamilyOtherLE(deathFriendOrFamilyOtherLE);
        return this;
    }

    public LECMEFormat depressedMoodLE(SerialField<OneOrZero> depressedMoodLE) {
        setDepressedMoodLE(depressedMoodLE);
        return this;
    }

    public LECMEFormat disasterExposureLE(SerialField<OneOrZero> disasterExposureLE) {
        setDisasterExposureLE(disasterExposureLE);
        return this;
    }

    public LECMEFormat disclosedIntentToWhomLE(SerialField<OneOrZero> disclosedIntentToWhomLE) {
        setDisclosedIntentToWhomLE(disclosedIntentToWhomLE);
        return this;
    }

    public LECMEFormat driveByShootingLE(SerialField<OneOrZero> driveByShootingLE) {
        setDriveByShootingLE(driveByShootingLE);
        return this;
    }

    public LECMEFormat drugInvolvementLE(SerialField<OneOrZero> drugInvolvementLE) {
        setDrugInvolvementLE(drugInvolvementLE);
        return this;
    }

    public LECMEFormat evictionOrLossOfHomeLE(SerialField<OneOrZero> evictionOrLossOfHomeLE) {
        setEvictionOrLossOfHomeLE(evictionOrLossOfHomeLE);
        return this;
    }

    public LECMEFormat fightBetweenTwoPeopleLE(SerialField<OneOrZero> fightBetweenTwoPeopleLE) {
        setFightBetweenTwoPeopleLE(fightBetweenTwoPeopleLE);
        return this;
    }

    public LECMEFormat financialProblemLE(SerialField<OneOrZero> financialProblemLE) {
        setFinancialProblemLE(financialProblemLE);
        return this;
    }

    public LECMEFormat unused2(SerialField<OneOrZero> unused2) {
        setUnused2(unused2);
        return this;
    }

    public LECMEFormat gangRelatedLE(SerialField<OneOrZero> gangRelatedLE) {
        setGangRelatedLE(gangRelatedLE);
        return this;
    }

    public LECMEFormat gunCleaningLE(SerialField<OneOrZero> gunCleaningLE) {
        setGunCleaningLE(gunCleaningLE);
        return this;
    }

    public LECMEFormat gunDefectMalfunctionLE(SerialField<OneOrZero> gunDefectMalfunctionLE) {
        setGunDefectMalfunctionLE(gunDefectMalfunctionLE);
        return this;
    }

    public LECMEFormat gunDroppedLE(SerialField<OneOrZero> gunDroppedLE) {
        setGunDroppedLE(gunDroppedLE);
        return this;
    }

    public LECMEFormat gunFiredHolsteringLE(SerialField<OneOrZero> gunFiredHolsteringLE) {
        setGunFiredHolsteringLE(gunFiredHolsteringLE);
        return this;
    }

    public LECMEFormat gunFiredLoadingUnloadingLE(SerialField<OneOrZero> gunFiredLoadingUnloadingLE) {
        setGunFiredLoadingUnloadingLE(gunFiredLoadingUnloadingLE);
        return this;
    }

    public LECMEFormat gunFiredOperatingSafetyLockLE(SerialField<OneOrZero> gunFiredOperatingSafetyLockLE) {
        setGunFiredOperatingSafetyLockLE(gunFiredOperatingSafetyLockLE);
        return this;
    }

    public LECMEFormat gunPlayingLE(SerialField<OneOrZero> gunPlayingLE) {
        setGunPlayingLE(gunPlayingLE);
        return this;
    }

    public LECMEFormat gunShowingLE(SerialField<OneOrZero> gunShowingLE) {
        setGunShowingLE(gunShowingLE);
        return this;
    }

    public LECMEFormat gunThoughtSafetyEngagedLE(SerialField<OneOrZero> gunThoughtSafetyEngagedLE) {
        setGunThoughtSafetyEngagedLE(gunThoughtSafetyEngagedLE);
        return this;
    }

    public LECMEFormat gunThoughtToyLE(SerialField<OneOrZero> gunThoughtToyLE) {
        setGunThoughtToyLE(gunThoughtToyLE);
        return this;
    }

    public LECMEFormat gunThoughtUnloadedMagazineDisengagedLE(SerialField<OneOrZero> gunThoughtUnloadedMagazineDisengagedLE) {
        setGunThoughtUnloadedMagazineDisengagedLE(gunThoughtUnloadedMagazineDisengagedLE);
        return this;
    }

    public LECMEFormat gunThoughtUnloadedOtherLE(SerialField<OneOrZero> gunThoughtUnloadedOtherLE) {
        setGunThoughtUnloadedOtherLE(gunThoughtUnloadedOtherLE);
        return this;
    }

    public LECMEFormat gunUnintentionallyPulledTriggerLE(SerialField<OneOrZero> gunUnintentionallyPulledTriggerLE) {
        setGunUnintentionallyPulledTriggerLE(gunUnintentionallyPulledTriggerLE);
        return this;
    }

    public LECMEFormat hateCrimeLE(SerialField<OneOrZero> hateCrimeLE) {
        setHateCrimeLE(hateCrimeLE);
        return this;
    }

    public LECMEFormat hisoryMentalIllnessTreatmentLE(SerialField<OneOrZero> hisoryMentalIllnessTreatmentLE) {
        sethisryMentalIllnessTreatmentLE(hisoryMentalIllnessTreatmentLE);
        return this;
    }

    public LECMEFormat huntingLE(SerialField<OneOrZero> huntingLE) {
        setHuntingLE(huntingLE);
        return this;
    }

    public LECMEFormat interpersonalViolencePerpetratorLE(SerialField<OneOrZero> interpersonalViolencePerpetratorLE) {
        setInterpersonalViolencePerpetratorLE(interpersonalViolencePerpetratorLE);
        return this;
    }

    public LECMEFormat interpersonalViolenceVictimLE(SerialField<OneOrZero> interpersonalViolenceVictimLE) {
        setInterpersonalViolenceVictimLE(interpersonalViolenceVictimLE);
        return this;
    }

    public LECMEFormat intervenerAssistingVictimLE(SerialField<OneOrZero> intervenerAssistingVictimLE) {
        setIntervenerAssistingVictimLE(intervenerAssistingVictimLE);
        return this;
    }

    public LECMEFormat intimatePartnerProblemLE(SerialField<OneOrZero> intimatePartnerProblemLE) {
        setIntimatePartnerProblemLE(intimatePartnerProblemLE);
        return this;
    }

    public LECMEFormat intimatePartnerViolenceLE(SerialField<OneOrZero> intimatePartnerViolenceLE) {
        setIntimatePartnerViolenceLE(intimatePartnerViolenceLE);
        return this;
    }

    public LECMEFormat jealouslyLE(SerialField<OneOrZero> jealouslyLE) {
        setJealouslyLE(jealouslyLE);
        return this;
    }

    public LECMEFormat jobProblemLE(SerialField<OneOrZero> jobProblemLE) {
        setJobProblemLE(jobProblemLE);
        return this;
    }

    public LECMEFormat justifiableSelfDefenseLE(SerialField<OneOrZero> justifiableSelfDefenseLE) {
        setJustifiableSelfDefenseLE(justifiableSelfDefenseLE);
        return this;
    }

    public LECMEFormat legalProblemOtherLE(SerialField<OneOrZero> legalProblemOtherLE) {
        setLegalProblemOtherLE(legalProblemOtherLE);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosis1LE(SerialField<OneOrZero> mentalHealthDiagnosis1LE) {
        setMentalHealthDiagnosis1LE(mentalHealthDiagnosis1LE);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosis2LE(SerialField<OneOrZero> mentalHealthDiagnosis2LE) {
        setMentalHealthDiagnosis2LE(mentalHealthDiagnosis2LE);
        return this;
    }

    public LECMEFormat mentalHealthDiagnosisOtherLE(SerialField<String> mentalHealthDiagnosisOtherLE) {
        setMentalHealthDiagnosisOtherLE(mentalHealthDiagnosisOtherLE);
        return this;
    }

    public LECMEFormat mentalHealthProblemLE(SerialField<OneOrZero> mentalHealthProblemLE) {
        setMentalHealthProblemLE(mentalHealthProblemLE);
        return this;
    }

    public LECMEFormat mentalIllnessTreatmentCurrentLE(SerialField<OneOrZero> mentalIllnessTreatmentCurrentLE) {
        setMentalIllnessTreatmentCurrentLE(mentalIllnessTreatmentCurrentLE);
        return this;
    }

    public LECMEFormat mercyKillingLE(SerialField<OneOrZero> mercyKillingLE) {
        setMercyKillingLE(mercyKillingLE);
        return this;
    }

    public LECMEFormat natureOtherCrime1LE(SerialField<OneOrZero> natureOtherCrime1LE) {
        setNatureOtherCrime1LE(natureOtherCrime1LE);
        return this;
    }

    public LECMEFormat natureOtherCrime2LE(SerialField<OneOrZero> natureOtherCrime2LE) {
        setNatureOtherCrime2LE(natureOtherCrime2LE);
        return this;
    }

    public LECMEFormat otherAddictionLE(SerialField<OneOrZero> otherAddictionLE) {
        setOtherAddictionLE(otherAddictionLE);
        return this;
    }

    public LECMEFormat otherContextInjuryLE(SerialField<OneOrZero> otherContextInjuryLE) {
        setOtherContextInjuryLE(otherContextInjuryLE);
        return this;
    }

    public LECMEFormat otherCrimeInProgressLE(SerialField<OneOrZero> otherCrimeInProgressLE) {
        setOtherCrimeInProgressLE(otherCrimeInProgressLE);
        return this;
    }

    public LECMEFormat otherMechanismInjuryLE(SerialField<OneOrZero> otherMechanismInjuryLE) {
        setOtherMechanismInjuryLE(otherMechanismInjuryLE);
        return this;
    }

    public LECMEFormat precipitatedByOtherCrimeLE(SerialField<OneOrZero> precipitatedByOtherCrimeLE) {
        setPrecipitatedByOtherCrimeLE(precipitatedByOtherCrimeLE);
        return this;
    }

    public LECMEFormat physicalHealthProblemLE(SerialField<OneOrZero> physicalHealthProblemLE) {
        setPhysicalHealthProblemLE(physicalHealthProblemLE);
        return this;
    }

    public LECMEFormat prostitutionLE(SerialField<OneOrZero> prostitutionLE) {
        setProstitutionLE(prostitutionLE);
        return this;
    }

    public LECMEFormat randomViolenceLE(SerialField<OneOrZero> randomViolenceLE) {
        setRandomViolenceLE(randomViolenceLE);
        return this;
    }

    public LECMEFormat recentCriminalLegalProblemLE(SerialField<OneOrZero> recentCriminalLegalProblemLE) {
        setRecentCriminalLegalProblemLE(recentCriminalLegalProblemLE);
        return this;
    }

    public LECMEFormat recentSuicideFriendFamilyLE(SerialField<OneOrZero> recentSuicideFriendFamilyLE) {
        setRecentSuicideFriendFamilyLE(recentSuicideFriendFamilyLE);
        return this;
    }

    public LECMEFormat relationshipProblemOtherLE(SerialField<OneOrZero> relationshipProblemOtherLE) {
        setRelationshipProblemOtherLE(relationshipProblemOtherLE);
        return this;
    }

    public LECMEFormat schoolProblemLE(SerialField<OneOrZero> schoolProblemLE) {
        setSchoolProblemLE(schoolProblemLE);
        return this;
    }

    public LECMEFormat selfDefenseLE(SerialField<OneOrZero> selfDefenseLE) {
        setSelfDefenseLE(selfDefenseLE);
        return this;
    }

    public LECMEFormat stalkingLE(SerialField<OneOrZero> stalkingLE) {
        setStalkingLE(stalkingLE);
        return this;
    }

    public LECMEFormat substanceAbuseOtherLE(SerialField<OneOrZero> substanceAbuseOtherLE) {
        setSubstanceAbuseOtherLE(substanceAbuseOtherLE);
        return this;
    }

    public LECMEFormat suicideAttempthisoryLE(SerialField<OneOrZero> suicideAttempthisoryLE) {
        setsuicideAttempthisoryLE(suicideAttempthisoryLE);
        return this;
    }

    public LECMEFormat suicideIntentDisclosedLE(SerialField<OneOrZero> suicideIntentDisclosedLE) {
        setSuicideIntentDisclosedLE(suicideIntentDisclosedLE);
        return this;
    }

    public LECMEFormat suicideNoteLE(SerialField<OneOrZero> suicideNoteLE) {
        setSuicideNoteLE(suicideNoteLE);
        return this;
    }

    public LECMEFormat suicideThoughthisoryLE(SerialField<OneOrZero> suicideThoughthisoryLE) {
        setsuicideThoughthisoryLE(suicideThoughthisoryLE);
        return this;
    }

    public LECMEFormat targetShootingLE(SerialField<OneOrZero> targetShootingLE) {
        setTargetShootingLE(targetShootingLE);
        return this;
    }

    public LECMEFormat terroristAttackLE(SerialField<OneOrZero> terroristAttackLE) {
        setTerroristAttackLE(terroristAttackLE);
        return this;
    }

    public LECMEFormat TraumaticAnniversaryLE(SerialField<OneOrZero> TraumaticAnniversaryLE) {
        setTraumaticAnniversaryLE(TraumaticAnniversaryLE);
        return this;
    }

    public LECMEFormat VictimPoliceOfficeOnDutyLE(SerialField<OneOrZero> VictimPoliceOfficeOnDutyLE) {
        setVictimPoliceOfficeOnDutyLE(VictimPoliceOfficeOnDutyLE);
        return this;
    }

    public LECMEFormat VictimUsedWeaponLE(SerialField<OneOrZero> VictimUsedWeaponLE) {
        setVictimUsedWeaponLE(VictimUsedWeaponLE);
        return this;
    }

    public LECMEFormat WalkByAssaultLE(SerialField<OneOrZero> WalkByAssaultLE) {
        setWalkByAssaultLE(WalkByAssaultLE);
        return this;
    }

    public LECMEFormat WeaponType(SerialField<String> WeaponType) {
        setWeaponType(WeaponType);
        return this;
    }

    public LECMEFormat FirearmType(SerialField<String> FirearmType) {
        setFirearmType(FirearmType);
        return this;
    }

    public LECMEFormat FirearmCaliber(SerialField<CharLimitedInteger> FirearmCaliber) {
        setFirearmCaliber(FirearmCaliber);
        return this;
    }

    public LECMEFormat FirearmGauge(SerialField<CharLimitedInteger> FirearmGauge) {
        setFirearmGauge(FirearmGauge);
        return this;
    }

    public LECMEFormat FirearmMake(SerialField<CharLimitedInteger> FirearmMake) {
        setFirearmMake(FirearmMake);
        return this;
    }

    public LECMEFormat FirearmModel(SerialField<CharLimitedInteger> FirearmModel) {
        setFirearmModel(FirearmModel);
        return this;
    }

    public LECMEFormat GunLoaded(SerialField<OneOrZero> GunLoaded) {
        setGunLoaded(GunLoaded);
        return this;
    }

    public LECMEFormat GunOwner(SerialField<String> GunOwner) {
        setGunOwner(GunOwner);
        return this;
    }

    public LECMEFormat GunStoredLocked(SerialField<CharLimitedInteger> GunStoredLocked) {
        setGunStoredLocked(GunStoredLocked);
        return this;
    }

    public LECMEFormat FirearmStolen(SerialField<OneOrZero> FirearmStolen) {
        setFirearmStolen(FirearmStolen);
        return this;
    }

    public LECMEFormat SuspectSex(SerialField<String> SuspectSex) {
        setSuspectSex(SuspectSex);
        return this;
    }

    public LECMEFormat VictimSuspectRelationshipPrimary(SerialField<String> VictimSuspectRelationshipPrimary) {
        setVictimSuspectRelationshipPrimary(VictimSuspectRelationshipPrimary);
        return this;
    }

    public LECMEFormat VictimSuspectRelationshipSecondary(SerialField<String> VictimSuspectRelationshipSecondary) {
        setVictimSuspectRelationshipSecondary(VictimSuspectRelationshipSecondary);
        return this;
    }

    public LECMEFormat HasAbusehistory(SerialField<OneOrZero> HasAbusehistory) {
        setHasAbusehistory(HasAbusehistory);
        return this;
    }

    public LECMEFormat IsCareTaker(SerialField<OneOrZero> IsCareTaker) {
        setIsCareTaker(IsCareTaker);
        return this;
    }

    public LECMEFormat HasAttemptedSuicide(SerialField<OneOrZero> HasAttemptedSuicide) {
        setHasAttemptedSuicide(HasAttemptedSuicide);
        return this;
    }

    public LECMEFormat IsSuspectAlsoVictim(SerialField<OneOrZero> IsSuspectAlsoVictim) {
        setIsSuspectAlsoVictim(IsSuspectAlsoVictim);
        return this;
    }

    public LECMEFormat IsSuspectMentallyIll(SerialField<OneOrZero> IsSuspectMentallyIll) {
        setIsSuspectMentallyIll(IsSuspectMentallyIll);
        return this;
    }

    public LECMEFormat HasSuspectDevelopmentDisability(SerialField<OneOrZero> HasSuspectDevelopmentDisability) {
        setHasSuspectDevelopmentDisability(HasSuspectDevelopmentDisability);
        return this;
    }

    public LECMEFormat IsSuspectAlcoholUseSuspected(SerialField<OneOrZero> IsSuspectAlcoholUseSuspected) {
        setIsSuspectAlcoholUseSuspected(IsSuspectAlcoholUseSuspected);
        return this;
    }

    public LECMEFormat IsSuspectSubstanceUseSuspected(SerialField<OneOrZero> IsSuspectSubstanceUseSuspected) {
        setIsSuspectSubstanceUseSuspected(IsSuspectSubstanceUseSuspected);
        return this;
    }

    public LECMEFormat IsSuspectContactPolice(SerialField<OneOrZero> IsSuspectContactPolice) {
        setIsSuspectContactPolice(IsSuspectContactPolice);
        return this;
    }

    public LECMEFormat SuspectRecentRelease(SerialField<OneOrZero> SuspectRecentRelease) {
        setSuspectRecentRelease(SuspectRecentRelease);
        return this;
    }

    public LECMEFormat IsSuspectCaucasian(SerialField<OneOrZero> IsSuspectCaucasian) {
        setIsSuspectCaucasian(IsSuspectCaucasian);
        return this;
    }

    public LECMEFormat IsSuspectAfricanAmerican(SerialField<OneOrZero> IsSuspectAfricanAmerican) {
        setIsSuspectAfricanAmerican(IsSuspectAfricanAmerican);
        return this;
    }

    public LECMEFormat IsSuspectAsian(SerialField<OneOrZero> IsSuspectAsian) {
        setIsSuspectAsian(IsSuspectAsian);
        return this;
    }

    public LECMEFormat IsSuspectPacificIslander(SerialField<OneOrZero> IsSuspectPacificIslander) {
        setIsSuspectPacificIslander(IsSuspectPacificIslander);
        return this;
    }

    public LECMEFormat IsSuspectAmericanIndian(SerialField<OneOrZero> IsSuspectAmericanIndian) {
        setIsSuspectAmericanIndian(IsSuspectAmericanIndian);
        return this;
    }

    public LECMEFormat IsSuspectRaceUnspecified(SerialField<OneOrZero> IsSuspectRaceUnspecified) {
        setIsSuspectRaceUnspecified(IsSuspectRaceUnspecified);
        return this;
    }

    public LECMEFormat SuspectEthnicity(SerialField<String> SuspectEthnicity) {
        setSuspectEthnicity(SuspectEthnicity);
        return this;
    }

    public LECMEFormat IsTreatmentNonAdherenceCME(SerialField<OneOrZero> IsTreatmentNonAdherenceCME) {
        setIsTreatmentNonAdherenceCME(IsTreatmentNonAdherenceCME);
        return this;
    }

    public LECMEFormat IsTraumaticBrainInjuryhistoryCME(SerialField<OneOrZero> IsTraumaticBrainInjuryhistoryCME) {
        setIsTraumaticBrainInjuryhistoryCME(IsTraumaticBrainInjuryhistoryCME);
        return this;
    }

    public LECMEFormat IsFamilyStressorsCME(SerialField<OneOrZero> IsFamilyStressorsCME) {
        setIsFamilyStressorsCME(IsFamilyStressorsCME);
        return this;
    }

    public LECMEFormat IsCrisisFamilyStressorCME(SerialField<OneOrZero> IsCrisisFamilyStressorCME) {
        setIsCrisisFamilyStressorCME(IsCrisisFamilyStressorCME);
        return this;
    }

    public LECMEFormat IsCaregiverBurdenCME(SerialField<OneOrZero> IsCaregiverBurdenCME) {
        setIsCaregiverBurdenCME(IsCaregiverBurdenCME);
        return this;
    }

    public LECMEFormat IsFamilyStressorCME(SerialField<OneOrZero> IsFamilyStressorCME) {
        setIsFamilyStressorCME(IsFamilyStressorCME);
        return this;
    }

    public LECMEFormat IsHouseholdKnownCME(SerialField<OneOrZero> IsHouseholdKnownCME) {
        setIsHouseholdKnownCME(IsHouseholdKnownCME);
        return this;
    }

    public LECMEFormat IsPriorCPSReportCME(SerialField<OneOrZero> IsPriorCPSReportCME) {
        setIsPriorCPSReportCME(IsPriorCPSReportCME);
        return this;
    }

    public LECMEFormat IsHouseholdSubstanceAbuseCME(SerialField<OneOrZero> IsHouseholdSubstanceAbuseCME) {
        setIsHouseholdSubstanceAbuseCME(IsHouseholdSubstanceAbuseCME);
        return this;
    }

    public LECMEFormat IsLivingTransitionCME(SerialField<OneOrZero> IsLivingTransitionCME) {
        setIsLivingTransitionCME(IsLivingTransitionCME);
        return this;
    }

    public LECMEFormat IsCorporalPunishmentCME(SerialField<OneOrZero> IsCorporalPunishmentCME) {
        setIsCorporalPunishmentCME(IsCorporalPunishmentCME);
        return this;
    }

    public LECMEFormat IshistorySelfHarmCME(SerialField<OneOrZero> IshistorySelfHarmCME) {
        setIshistorySelfHarmCME(IshistorySelfHarmCME);
        return this;
    }

    public LECMEFormat IsTreatmentNonAdherenceLE(SerialField<OneOrZero> IsTreatmentNonAdherenceLE) {
        setIsTreatmentNonAdherenceLE(IsTreatmentNonAdherenceLE);
        return this;
    }

    public LECMEFormat IsTraumaticBrainInjuryhistoryLE(SerialField<OneOrZero> IsTraumaticBrainInjuryhistoryLE) {
        setIsTraumaticBrainInjuryhistoryLE(IsTraumaticBrainInjuryhistoryLE);
        return this;
    }

    public LECMEFormat IsFamilyStressorsLE(SerialField<OneOrZero> IsFamilyStressorsLE) {
        setIsFamilyStressorsLE(IsFamilyStressorsLE);
        return this;
    }

    public LECMEFormat IsCrisisFamilyStressorLE(SerialField<OneOrZero> IsCrisisFamilyStressorLE) {
        setIsCrisisFamilyStressorLE(IsCrisisFamilyStressorLE);
        return this;
    }

    public LECMEFormat IsCaregiverBurdenLE(SerialField<OneOrZero> IsCaregiverBurdenLE) {
        setIsCaregiverBurdenLE(IsCaregiverBurdenLE);
        return this;
    }

    public LECMEFormat IsFamilyStressorLE(SerialField<OneOrZero> IsFamilyStressorLE) {
        setIsFamilyStressorLE(IsFamilyStressorLE);
        return this;
    }

    public LECMEFormat IsHouseholdKnownLE(SerialField<OneOrZero> IsHouseholdKnownLE) {
        setIsHouseholdKnownLE(IsHouseholdKnownLE);
        return this;
    }

    public LECMEFormat IsPriorCPSReportLE(SerialField<OneOrZero> IsPriorCPSReportLE) {
        setIsPriorCPSReportLE(IsPriorCPSReportLE);
        return this;
    }

    public LECMEFormat IsHouseholdSubstanceAbuseLE(SerialField<OneOrZero> IsHouseholdSubstanceAbuseLE) {
        setIsHouseholdSubstanceAbuseLE(IsHouseholdSubstanceAbuseLE);
        return this;
    }

    public LECMEFormat IsLivingTransitionLE(SerialField<OneOrZero> IsLivingTransitionLE) {
        setIsLivingTransitionLE(IsLivingTransitionLE);
        return this;
    }

    public LECMEFormat IsCorporalPunishmentLE(SerialField<OneOrZero> IsCorporalPunishmentLE) {
        setIsCorporalPunishmentLE(IsCorporalPunishmentLE);
        return this;
    }

    public LECMEFormat IshistorySelfHarmLE(SerialField<OneOrZero> IshistorySelfHarmLE) {
        setIshistorySelfHarmLE(IshistorySelfHarmLE);
        return this;
    }

    public LECMEFormat TypeOfPoisoning(SerialField<CharLimitedInteger> TypeOfPoisoning) {
        setTypeOfPoisoning(TypeOfPoisoning);
        return this;
    }

    public LECMEFormat LastSeenAliveTime(SerialField<MilitaryTime> LastSeenAliveTime) {
        setLastSeenAliveTime(LastSeenAliveTime);
        return this;
    }

    public LECMEFormat FoundUnresponsiveTime(SerialField<MilitaryTime> FoundUnresponsiveTime) {
        setFoundUnresponsiveTime(FoundUnresponsiveTime);
        return this;
    }

    public LECMEFormat LastSeenAliveMonth(SerialField<CharLimitedInteger> LastSeenAliveMonth) {
        setLastSeenAliveMonth(LastSeenAliveMonth);
        return this;
    }

    public LECMEFormat LastSeenAliveDay(SerialField<CharLimitedInteger> LastSeenAliveDay) {
        setLastSeenAliveDay(LastSeenAliveDay);
        return this;
    }

    public LECMEFormat LastSeenAliveYear(SerialField<CharLimitedInteger> LastSeenAliveYear) {
        setLastSeenAliveYear(LastSeenAliveYear);
        return this;
    }

    public LECMEFormat FoundUnresponsiveMonth(SerialField<CharLimitedInteger> FoundUnresponsiveMonth) {
        setFoundUnresponsiveMonth(FoundUnresponsiveMonth);
        return this;
    }

    public LECMEFormat FoundUnresponsiveDay(SerialField<CharLimitedInteger> FoundUnresponsiveDay) {
        setFoundUnresponsiveDay(FoundUnresponsiveDay);
        return this;
    }

    public LECMEFormat FoundUnresponsiveYear(SerialField<CharLimitedInteger> FoundUnresponsiveYear) {
        setFoundUnresponsiveYear(FoundUnresponsiveYear);
        return this;
    }

    public LECMEFormat PreviousOverdose(SerialField<OneOrZero> PreviousOverdose) {
        setPreviousOverdose(PreviousOverdose);
        return this;
    }

    public LECMEFormat Overdose0to2DaysPrior(SerialField<OneOrZero> Overdose0to2DaysPrior) {
        setOverdose0to2DaysPrior(Overdose0to2DaysPrior);
        return this;
    }

    public LECMEFormat Overdose3to7DaysPrior(SerialField<OneOrZero> Overdose3to7DaysPrior) {
        setOverdose3to7DaysPrior(Overdose3to7DaysPrior);
        return this;
    }

    public LECMEFormat RecentOpioidUse(SerialField<OneOrZero> RecentOpioidUse) {
        setRecentOpioidUse(RecentOpioidUse);
        return this;
    }

    public LECMEFormat RecentEmergencyDept(SerialField<OneOrZero> RecentEmergencyDept) {
        setRecentEmergencyDept(RecentEmergencyDept);
        return this;
    }

    public LECMEFormat histDrugNoEvidence(SerialField<OneOrZero> histDrugNoEvidence) {
        sethisdrugNoEvidence(histDrugNoEvidence);
        return this;
    }

    public LECMEFormat histHeroin(SerialField<OneOrZero> histHeroin) {
        sethisheroin(histHeroin);
        return this;
    }

    public LECMEFormat histRxOpioid(SerialField<OneOrZero> histRxOpioid) {
        sethisrxOpioid(histRxOpioid);
        return this;
    }

    public LECMEFormat histAnyOpioid(SerialField<OneOrZero> histAnyOpioid) {
        sethisanyOpioid(histAnyOpioid);
        return this;
    }

    public LECMEFormat histFentanyl(SerialField<OneOrZero> histFentanyl) {
        sethisfentanyl(histFentanyl);
        return this;
    }

    public LECMEFormat histCocaine(SerialField<OneOrZero> histCocaine) {
        sethiscocaine(histCocaine);
        return this;
    }

    public LECMEFormat histMeth(SerialField<OneOrZero> histMeth) {
        sethismeth(histMeth);
        return this;
    }

    public LECMEFormat histBenzo(SerialField<OneOrZero> histBenzo) {
        sethisbenzo(histBenzo);
        return this;
    }

    public LECMEFormat histCannabis(SerialField<OneOrZero> histCannabis) {
        sethiscannabis(histCannabis);
        return this;
    }

    public LECMEFormat histUnspecified(SerialField<OneOrZero> histUnspecified) {
        sethisunspecified(histUnspecified);
        return this;
    }

    public LECMEFormat histOther(SerialField<OneOrZero> histOther) {
        sethisother(histOther);
        return this;
    }

    public LECMEFormat histOtherDesc(SerialField<String> histOtherDesc) {
        sethisotherDesc(histOtherDesc);
        return this;
    }

    public LECMEFormat TreatmentForSubstanceAbuse(SerialField<OneOrZero> TreatmentForSubstanceAbuse) {
        setTreatmentForSubstanceAbuse(TreatmentForSubstanceAbuse);
        return this;
    }

    public LECMEFormat SubstanceTreatmentRehab(SerialField<OneOrZero> SubstanceTreatmentRehab) {
        setSubstanceTreatmentRehab(SubstanceTreatmentRehab);
        return this;
    }

    public LECMEFormat SubstanceTreatmentMATcog(SerialField<OneOrZero> SubstanceTreatmentMATcog) {
        setSubstanceTreatmentMATcog(SubstanceTreatmentMATcog);
        return this;
    }

    public LECMEFormat SubstanceTreatmentMATNoCog(SerialField<OneOrZero> SubstanceTreatmentMATNoCog) {
        setSubstanceTreatmentMATNoCog(SubstanceTreatmentMATNoCog);
        return this;
    }

    public LECMEFormat SubstanceTreatmentMAT(SerialField<OneOrZero> SubstanceTreatmentMAT) {
        setSubstanceTreatmentMAT(SubstanceTreatmentMAT);
        return this;
    }

    public LECMEFormat SubstanceTreatmentCogTherapy(SerialField<OneOrZero> SubstanceTreatmentCogTherapy) {
        setSubstanceTreatmentCogTherapy(SubstanceTreatmentCogTherapy);
        return this;
    }

    public LECMEFormat SubstanceTreatmentNA(SerialField<OneOrZero> SubstanceTreatmentNA) {
        setSubstanceTreatmentNA(SubstanceTreatmentNA);
        return this;
    }

    public LECMEFormat SubstanceTreatmentOther(SerialField<OneOrZero> SubstanceTreatmentOther) {
        setSubstanceTreatmentOther(SubstanceTreatmentOther);
        return this;
    }

    public LECMEFormat SubstanceTreatmentOtherSpecify(SerialField<String> SubstanceTreatmentOtherSpecify) {
        setSubstanceTreatmentOtherSpecify(SubstanceTreatmentOtherSpecify);
        return this;
    }

    public LECMEFormat InvolveCriminalJustice(SerialField<OneOrZero> InvolveCriminalJustice) {
        setInvolveCriminalJustice(InvolveCriminalJustice);
        return this;
    }

    public LECMEFormat HasIndicationsDrugPara(SerialField<OneOrZero> HasIndicationsDrugPara) {
        setHasIndicationsDrugPara(HasIndicationsDrugPara);
        return this;
    }

    public LECMEFormat HasIndicationsNone(SerialField<OneOrZero> HasIndicationsNone) {
        setHasIndicationsNone(HasIndicationsNone);
        return this;
    }

    public LECMEFormat HasIndicationsNonSpecific(SerialField<OneOrZero> HasIndicationsNonSpecific) {
        setHasIndicationsNonSpecific(HasIndicationsNonSpecific);
        return this;
    }

    public LECMEFormat HasRapidOverdoseEvidence(SerialField<OneOrZero> HasRapidOverdoseEvidence) {
        setHasRapidOverdoseEvidence(HasRapidOverdoseEvidence);
        return this;
    }

    public LECMEFormat IsTourniquetAroundArm(SerialField<OneOrZero> IsTourniquetAroundArm) {
        setIsTourniquetAroundArm(IsTourniquetAroundArm);
        return this;
    }

    public LECMEFormat BodyPosition(SerialField<OneOrZero> BodyPosition) {
        setBodyPosition(BodyPosition);
        return this;
    }

    public LECMEFormat NeedleLocation(SerialField<OneOrZero> NeedleLocation) {
        setNeedleLocation(NeedleLocation);
        return this;
    }

    public LECMEFormat RapidOverdoseWitnessReport(SerialField<OneOrZero> RapidOverdoseWitnessReport) {
        setRapidOverdoseWitnessReport(RapidOverdoseWitnessReport);
        return this;
    }

    public LECMEFormat HasRapidOverdoseOther(SerialField<OneOrZero> HasRapidOverdoseOther) {
        setHasRapidOverdoseOther(HasRapidOverdoseOther);
        return this;
    }

    public LECMEFormat RapidOverdoseOtherDescription(SerialField<String> RapidOverdoseOtherDescription) {
        setRapidOverdoseOtherDescription(RapidOverdoseOtherDescription);
        return this;
    }

    public LECMEFormat HasRouteUnknown(SerialField<OneOrZero> HasRouteUnknown) {
        setHasRouteUnknown(HasRouteUnknown);
        return this;
    }

    public LECMEFormat HasRouteInjection(SerialField<OneOrZero> HasRouteInjection) {
        setHasRouteInjection(HasRouteInjection);
        return this;
    }

    public LECMEFormat HasIndicationsTracks(SerialField<OneOrZero> HasIndicationsTracks) {
        setHasIndicationsTracks(HasIndicationsTracks);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionTourniquet(SerialField<OneOrZero> HasEvidenceOfInjectionTourniquet) {
        setHasEvidenceOfInjectionTourniquet(HasEvidenceOfInjectionTourniquet);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionCooker(SerialField<OneOrZero> HasEvidenceOfInjectionCooker) {
        setHasEvidenceOfInjectionCooker(HasEvidenceOfInjectionCooker);
        return this;
    }

    public LECMEFormat HasEvidenceOfinjectionNeedle(SerialField<OneOrZero> HasEvidenceOfinjectionNeedle) {
        setHasEvidenceOfinjectionNeedle(HasEvidenceOfinjectionNeedle);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionFilter(SerialField<OneOrZero> HasEvidenceOfInjectionFilter) {
        setHasEvidenceOfInjectionFilter(HasEvidenceOfInjectionFilter);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionWitnessReport(SerialField<OneOrZero> HasEvidenceOfInjectionWitnessReport) {
        setHasEvidenceOfInjectionWitnessReport(HasEvidenceOfInjectionWitnessReport);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionOther(SerialField<CharLimitedInteger> HasEvidenceOfInjectionOther) {
        setHasEvidenceOfInjectionOther(HasEvidenceOfInjectionOther);
        return this;
    }

    public LECMEFormat HasEvidenceOfInjectionOtherDescription(SerialField<String> HasEvidenceOfInjectionOtherDescription) {
        setHasEvidenceOfInjectionOtherDescription(HasEvidenceOfInjectionOtherDescription);
        return this;
    }

    public LECMEFormat HasRouteSnorting(SerialField<OneOrZero> HasRouteSnorting) {
        setHasRouteSnorting(HasRouteSnorting);
        return this;
    }

    public LECMEFormat SnortingStraw(SerialField<OneOrZero> SnortingStraw) {
        setSnortingStraw(SnortingStraw);
        return this;
    }

    public LECMEFormat SnortingRolled(SerialField<OneOrZero> SnortingRolled) {
        setSnortingRolled(SnortingRolled);
        return this;
    }

    public LECMEFormat SnortingRazor(SerialField<OneOrZero> SnortingRazor) {
        setSnortingRazor(SnortingRazor);
        return this;
    }

    public LECMEFormat SnortingPowderMirror(SerialField<OneOrZero> SnortingPowderMirror) {
        setSnortingPowderMirror(SnortingPowderMirror);
        return this;
    }

    public LECMEFormat SnortingPowderNose(SerialField<OneOrZero> SnortingPowderNose) {
        setSnortingPowderNose(SnortingPowderNose);
        return this;
    }

    public LECMEFormat SnortingWitness(SerialField<OneOrZero> SnortingWitness) {
        setSnortingWitness(SnortingWitness);
        return this;
    }

    public LECMEFormat SnortingOther(SerialField<OneOrZero> SnortingOther) {
        setSnortingOther(SnortingOther);
        return this;
    }

    public LECMEFormat SnortingOtherDesc(SerialField<String> SnortingOtherDesc) {
        setSnortingOtherDesc(SnortingOtherDesc);
        return this;
    }

    public LECMEFormat HasRouteSmoking(SerialField<OneOrZero> HasRouteSmoking) {
        setHasRouteSmoking(HasRouteSmoking);
        return this;
    }

    public LECMEFormat SmokingPipe(SerialField<OneOrZero> SmokingPipe) {
        setSmokingPipe(SmokingPipe);
        return this;
    }

    public LECMEFormat smokingTinfoil(SerialField<OneOrZero> smokingTinfoil) {
        setSmokingTinfoil(smokingTinfoil);
        return this;
    }

    public LECMEFormat smokingVape(SerialField<OneOrZero> smokingVape) {
        setSmokingVape(smokingVape);
        return this;
    }

    public LECMEFormat smokingBongBowl(SerialField<OneOrZero> smokingBongBowl) {
        setSmokingBongBowl(smokingBongBowl);
        return this;
    }

    public LECMEFormat smokingWitness(SerialField<OneOrZero> smokingWitness) {
        setSmokingWitness(smokingWitness);
        return this;
    }

    public LECMEFormat smokingOther(SerialField<OneOrZero> smokingOther) {
        setSmokingOther(smokingOther);
        return this;
    }

    public LECMEFormat smokingOtherDesc(SerialField<String> smokingOtherDesc) {
        setSmokingOtherDesc(smokingOtherDesc);
        return this;
    }

    public LECMEFormat hasRouteTransdermal(SerialField<OneOrZero> hasRouteTransdermal) {
        setHasRouteTransdermal(hasRouteTransdermal);
        return this;
    }

    public LECMEFormat hasRouteIngestion(SerialField<OneOrZero> hasRouteIngestion) {
        setHasRouteIngestion(hasRouteIngestion);
        return this;
    }

    public LECMEFormat hasRouteSuppository(SerialField<OneOrZero> hasRouteSuppository) {
        setHasRouteSuppository(hasRouteSuppository);
        return this;
    }

    public LECMEFormat hasRouteSublingual(SerialField<OneOrZero> hasRouteSublingual) {
        setHasRouteSublingual(hasRouteSublingual);
        return this;
    }

    public LECMEFormat hasRouteBuccal(SerialField<OneOrZero> hasRouteBuccal) {
        setHasRouteBuccal(hasRouteBuccal);
        return this;
    }

    public LECMEFormat nonSpecificRx(SerialField<OneOrZero> nonSpecificRx) {
        setNonSpecificRx(nonSpecificRx);
        return this;
    }

    public LECMEFormat hasEvidenceOfPrescriptionDrug(SerialField<OneOrZero> hasEvidenceOfPrescriptionDrug) {
        setHasEvidenceOfPrescriptionDrug(hasEvidenceOfPrescriptionDrug);
        return this;
    }

    public LECMEFormat isPrescribedToVictim(SerialField<OneOrZero> isPrescribedToVictim) {
        setIsPrescribedToVictim(isPrescribedToVictim);
        return this;
    }

    public LECMEFormat isUnknownWhoPrescribed(SerialField<OneOrZero> isUnknownWhoPrescribed) {
        setIsUnknownWhoPrescribed(isUnknownWhoPrescribed);
        return this;
    }

    public LECMEFormat hasIndicationsRxDrugs(SerialField<OneOrZero> hasIndicationsRxDrugs) {
        setHasIndicationsRxDrugs(hasIndicationsRxDrugs);
        return this;
    }

    public LECMEFormat prescriptionOtherDescription(SerialField<String> prescriptionOtherDescription) {
        setPrescriptionOtherDescription(prescriptionOtherDescription);
        return this;
    }

    public LECMEFormat hasIndicationsDrugatScene(SerialField<OneOrZero> hasIndicationsDrugatScene) {
        setHasIndicationsDrugatScene(hasIndicationsDrugatScene);
        return this;
    }

    public LECMEFormat haveEvidenceIllicitPowder(SerialField<OneOrZero> haveEvidenceIllicitPowder) {
        setHaveEvidenceIllicitPowder(haveEvidenceIllicitPowder);
        return this;
    }

    public LECMEFormat hasEvidenceIllicitTar(SerialField<OneOrZero> hasEvidenceIllicitTar) {
        setHasEvidenceIllicitTar(hasEvidenceIllicitTar);
        return this;
    }

    public LECMEFormat hasEvidenceOfIllicitWitnessReport(SerialField<OneOrZero> hasEvidenceOfIllicitWitnessReport) {
        setHasEvidenceOfIllicitWitnessReport(hasEvidenceOfIllicitWitnessReport);
        return this;
    }

    public LECMEFormat hasEvidenceCrystal(SerialField<OneOrZero> hasEvidenceCrystal) {
        setHasEvidenceCrystal(hasEvidenceCrystal);
        return this;
    }

    public LECMEFormat otherFormDescription(SerialField<String> otherFormDescription) {
        setOtherFormDescription(otherFormDescription);
        return this;
    }

    public LECMEFormat bystandersPresent(SerialField<CharLimitedInteger> bystandersPresent) {
        setBystandersPresent(bystandersPresent);
        return this;
    }

    public LECMEFormat bystanderOtherSpecify(SerialField<String> bystanderOtherSpecify) {
        setBystanderOtherSpecify(bystanderOtherSpecify);
        return this;
    }

    public LECMEFormat witnessedDrugUse(SerialField<OneOrZero> witnessedDrugUse) {
        setWitnessedDrugUse(witnessedDrugUse);
        return this;
    }

    public LECMEFormat bystanderCPR(SerialField<OneOrZero> bystanderCPR) {
        setBystanderCPR(bystanderCPR);
        return this;
    }

    public LECMEFormat bystanderBreathing(SerialField<OneOrZero> bystanderBreathing) {
        setBystanderBreathing(bystanderBreathing);
        return this;
    }

    public LECMEFormat bystanderSternal(SerialField<OneOrZero> bystanderSternal) {
        setBystanderSternal(bystanderSternal);
        return this;
    }

    public LECMEFormat bystanderStimulation(SerialField<OneOrZero> bystanderStimulation) {
        setBystanderStimulation(bystanderStimulation);
        return this;
    }

    public LECMEFormat bystanderIntrvOther(SerialField<OneOrZero> bystanderIntrvOther) {
        setBystanderIntrvOther(bystanderIntrvOther);
        return this;
    }

    public LECMEFormat bystanderIntrvOtherSpecify(SerialField<String> bystanderIntrvOtherSpecify) {
        setBystanderIntrvOtherSpecify(bystanderIntrvOtherSpecify);
        return this;
    }

    public LECMEFormat wasNaloxoneAdministered(SerialField<OneOrZero> wasNaloxoneAdministered) {
        setWasNaloxoneAdministered(wasNaloxoneAdministered);
        return this;
    }

    public LECMEFormat isNaloxoneNotAdmin(SerialField<OneOrZero> isNaloxoneNotAdmin) {
        setIsNaloxoneNotAdmin(isNaloxoneNotAdmin);
        return this;
    }

    public LECMEFormat isNaloxoneUnknown(SerialField<OneOrZero> isNaloxoneUnknown) {
        setIsNaloxoneUnknown(isNaloxoneUnknown);
        return this;
    }

    public LECMEFormat naloxoneTotalResponder(SerialField<OneOrZero> naloxoneTotalResponder) {
        setNaloxoneTotalResponder(naloxoneTotalResponder);
        return this;
    }

    public LECMEFormat naloxoneTotalBystander(SerialField<OneOrZero> naloxoneTotalBystander) {
        setNaloxoneTotalBystander(naloxoneTotalBystander);
        return this;
    }

    public LECMEFormat isNaloxoneAdminUnknown(SerialField<OneOrZero> isNaloxoneAdminUnknown) {
        setIsNaloxoneAdminUnknown(isNaloxoneAdminUnknown);
        return this;
    }

    public LECMEFormat isNaloxoneAdminLaw(SerialField<OneOrZero> isNaloxoneAdminLaw) {
        setIsNaloxoneAdminLaw(isNaloxoneAdminLaw);
        return this;
    }

    public LECMEFormat isNaloxoneAdminEms(SerialField<OneOrZero> isNaloxoneAdminEms) {
        setIsNaloxoneAdminEms(isNaloxoneAdminEms);
        return this;
    }

    public LECMEFormat isNaloxoneAdminHospital(SerialField<OneOrZero> isNaloxoneAdminHospital) {
        setIsNaloxoneAdminHospital(isNaloxoneAdminHospital);
        return this;
    }

    public LECMEFormat isNaloxoneAdminOther(SerialField<OneOrZero> isNaloxoneAdminOther) {
        setIsNaloxoneAdminOther(isNaloxoneAdminOther);
        return this;
    }

    public LECMEFormat isNaloxoneAdminBystander(SerialField<OneOrZero> isNaloxoneAdminBystander) {
        setIsNaloxoneAdminBystander(isNaloxoneAdminBystander);
        return this;
    }

    public LECMEFormat isNaloxoneWhoPerson(SerialField<OneOrZero> isNaloxoneWhoPerson) {
        setIsNaloxoneWhoPerson(isNaloxoneWhoPerson);
        return this;
    }

    public LECMEFormat isNaloxoneWhoPartner(SerialField<OneOrZero> isNaloxoneWhoPartner) {
        setIsNaloxoneWhoPartner(isNaloxoneWhoPartner);
        return this;
    }

    public LECMEFormat isNaloxoneWhoFriend(SerialField<OneOrZero> isNaloxoneWhoFriend) {
        setIsNaloxoneWhoFriend(isNaloxoneWhoFriend);
        return this;
    }

    public LECMEFormat isNaloxoneWhoOtherFamily(SerialField<OneOrZero> isNaloxoneWhoOtherFamily) {
        setIsNaloxoneWhoOtherFamily(isNaloxoneWhoOtherFamily);
        return this;
    }

    public LECMEFormat isNaloxoneWhoRoomate(SerialField<OneOrZero> isNaloxoneWhoRoomate) {
        setIsNaloxoneWhoRoomate(isNaloxoneWhoRoomate);
        return this;
    }

    public LECMEFormat isNaloxoneWhoStranger(SerialField<OneOrZero> isNaloxoneWhoStranger) {
        setIsNaloxoneWhoStranger(isNaloxoneWhoStranger);
        return this;
    }

    public LECMEFormat isNaloxoneWhoOther(SerialField<OneOrZero> isNaloxoneWhoOther) {
        setIsNaloxoneWhoOther(isNaloxoneWhoOther);
        return this;
    }

    public LECMEFormat isNaloxoneWhoOtherDescription(SerialField<String> isNaloxoneWhoOtherDescription) {
        setIsNaloxoneWhoOtherDescription(isNaloxoneWhoOtherDescription);
        return this;
    }

    public LECMEFormat hadPulse(SerialField<OneOrZero> hadPulse) {
        setHadPulse(hadPulse);
        return this;
    }

    public LECMEFormat intrvCPR(SerialField<OneOrZero> intrvCPR) {
        setIntrvCPR(intrvCPR);
        return this;
    }

    public LECMEFormat intrvBreathing(SerialField<OneOrZero> intrvBreathing) {
        setIntrvBreathing(intrvBreathing);
        return this;
    }

    public LECMEFormat intrvEpinephrine(SerialField<OneOrZero> intrvEpinephrine) {
        setIntrvEpinephrine(intrvEpinephrine);
        return this;
    }

    public LECMEFormat intrvTransport(SerialField<OneOrZero> intrvTransport) {
        setIntrvTransport(intrvTransport);
        return this;
    }

    public LECMEFormat intrvOxygen(SerialField<OneOrZero> intrvOxygen) {
        setIntrvOxygen(intrvOxygen);
        return this;
    }

    public LECMEFormat intrvOther(SerialField<OneOrZero> intrvOther) {
        setIntrvOther(intrvOther);
        return this;
    }

    public LECMEFormat intrvOtherSpecify(SerialField<String> intrvOtherSpecify) {
        setIntrvOtherSpecify(intrvOtherSpecify);
        return this;
    }

    public LECMEFormat bystanderNotRecognize(SerialField<OneOrZero> bystanderNotRecognize) {
        setBystanderNotRecognize(bystanderNotRecognize);
        return this;
    }

    public LECMEFormat bystanderUsing(SerialField<OneOrZero> bystanderUsing) {
        setBystanderUsing(bystanderUsing);
        return this;
    }

    public LECMEFormat bystanderPublic(SerialField<OneOrZero> bystanderPublic) {
        setBystanderPublic(bystanderPublic);
        return this;
    }

    public LECMEFormat bystanderNoOverdose(SerialField<OneOrZero> bystanderNoOverdose) {
        setBystanderNoOverdose(bystanderNoOverdose);
        return this;
    }

    public LECMEFormat bystanderSeperated(SerialField<OneOrZero> bystanderSeperated) {
        setBystanderSeperated(bystanderSeperated);
        return this;
    }

    public LECMEFormat bystanderUnaware(SerialField<OneOrZero> bystanderUnaware) {
        setBystanderUnaware(bystanderUnaware);
        return this;
    }

    public LECMEFormat bystanderReasonOther(SerialField<OneOrZero> bystanderReasonOther) {
        setBystanderReasonOther(bystanderReasonOther);
        return this;
    }

    public LECMEFormat bystanderReasonOtherSpecify(SerialField<String> bystanderReasonOtherSpecify) {
        setBystanderReasonOtherSpecify(bystanderReasonOtherSpecify);
        return this;
    }

    public LECMEFormat treatedforPain(SerialField<OneOrZero> treatedforPain) {
        setTreatedforPain(treatedforPain);
        return this;
    }

    public LECMEFormat medhistCopd(SerialField<OneOrZero> medhistCopd) {
        setMedhistCopd(medhistCopd);
        return this;
    }

    public LECMEFormat medhistAsthma(SerialField<OneOrZero> medhistAsthma) {
        setMedhistAsthma(medhistAsthma);
        return this;
    }

    public LECMEFormat medhistApnea(SerialField<OneOrZero> medhistApnea) {
        setMedhistApnea(medhistApnea);
        return this;
    }

    public LECMEFormat medhistHeart(SerialField<OneOrZero> medhistHeart) {
        setMedhistHeart(medhistHeart);
        return this;
    }

    public LECMEFormat medhistObesity(SerialField<OneOrZero> medhistObesity) {
        setMedhistObesity(medhistObesity);
        return this;
    }

    public LECMEFormat medhistInjury(SerialField<OneOrZero> medhistInjury) {
        setMedhistInjury(medhistInjury);
        return this;
    }

    public LECMEFormat medhistMigraine(SerialField<OneOrZero> medhistMigraine) {
        setMedhistMigraine(medhistMigraine);
        return this;
    }

    public LECMEFormat medhistBackpain(SerialField<OneOrZero> medhistBackpain) {
        setMedhistBackpain(medhistBackpain);
        return this;
    }

    public LECMEFormat medicalhistHepc(SerialField<OneOrZero> medicalhistHepc) {
        setMedicalhistHepc(medicalhistHepc);
        return this;
    }

    public LECMEFormat medicalhistHIV(SerialField<OneOrZero> medicalhistHIV) {
        setMedicalhistHIV(medicalhistHIV);
        return this;
    }

    public LECMEFormat medhistOtherpain(SerialField<OneOrZero> medhistOtherpain) {
        setMedhistOtherpain(medhistOtherpain);
        return this;
    }

    public LECMEFormat medhistOtherbreathing(SerialField<OneOrZero> medhistOtherbreathing) {
        setMedhistOtherbreathing(medhistOtherbreathing);
        return this;
    }

    public LECMEFormat prescriptionMorphine(SerialField<OneOrZero> prescriptionMorphine) {
        setPrescriptionMorphine(prescriptionMorphine);
        return this;
    }

    public LECMEFormat prescriptionMorphineNarrative(SerialField<String> prescriptionMorphineNarrative) {
        setPrescriptionMorphineNarrative(prescriptionMorphineNarrative);
        return this;
    }

    public LECMEFormat buprenorphineRx(SerialField<OneOrZero> buprenorphineRx) {
        setBuprenorphineRx(buprenorphineRx);
        return this;
    }

    public LECMEFormat buprenorphineRxForPain(SerialField<OneOrZero> buprenorphineRxForPain) {
        setBuprenorphineRxForPain(buprenorphineRxForPain);
        return this;
    }

    public LECMEFormat buprenorphineRxForMat(SerialField<OneOrZero> buprenorphineRxForMat) {
        setBuprenorphineRxForMat(buprenorphineRxForMat);
        return this;
    }

    public LECMEFormat buprenorphineRxForUnk(SerialField<OneOrZero> buprenorphineRxForUnk) {
        setBuprenorphineRxForUnk(buprenorphineRxForUnk);
        return this;
    }

    public LECMEFormat methadoneRx(SerialField<OneOrZero> methadoneRx) {
        setMethadoneRx(methadoneRx);
        return this;
    }

    public LECMEFormat methadoneRxForPain(SerialField<OneOrZero> methadoneRxForPain) {
        setMethadoneRxForPain(methadoneRxForPain);
        return this;
    }

    public LECMEFormat methadoneRxForMat(SerialField<OneOrZero> methadoneRxForMat) {
        setMethadoneRxForMat(methadoneRxForMat);
        return this;
    }

    public LECMEFormat methadoneRxUnk(SerialField<OneOrZero> methadoneRxUnk) {
        setMethadoneRxUnk(methadoneRxUnk);
        return this;
    }

    public LECMEFormat naltrexoneRx(SerialField<OneOrZero> naltrexoneRx) {
        setNaltrexoneRx(naltrexoneRx);
        return this;
    }

    public LECMEFormat fentanylRx(SerialField<OneOrZero> fentanylRx) {
        setFentanylRx(fentanylRx);
        return this;
    }

    public LECMEFormat numScripsPast30Days(SerialField<CharLimitedInteger> numScripsPast30Days) {
        setNumScripsPast30Days(numScripsPast30Days);
        return this;
    }

    public LECMEFormat numPharmaciesPast30Days(SerialField<CharLimitedInteger> numPharmaciesPast30Days) {
        setNumPharmaciesPast30Days(numPharmaciesPast30Days);
        return this;
    }

    public LECMEFormat numDoctorsPrescribing30Days(SerialField<CharLimitedInteger> numDoctorsPrescribing30Days) {
        setNumDoctorsPrescribing30Days(numDoctorsPrescribing30Days);
        return this;
    }

    public LECMEFormat isAsianIndian(SerialField<OneOrZero> isAsianIndian) {
        setIsAsianIndian(isAsianIndian);
        return this;
    }

    public LECMEFormat isAsianChinese(SerialField<OneOrZero> isAsianChinese) {
        setIsAsianChinese(isAsianChinese);
        return this;
    }

    public LECMEFormat isAsianFilipino(SerialField<OneOrZero> isAsianFilipino) {
        setIsAsianFilipino(isAsianFilipino);
        return this;
    }

    public LECMEFormat isAsianJapanese(SerialField<OneOrZero> isAsianJapanese) {
        setIsAsianJapanese(isAsianJapanese);
        return this;
    }

    public LECMEFormat isAsianKorean(SerialField<OneOrZero> isAsianKorean) {
        setIsAsianKorean(isAsianKorean);
        return this;
    }

    public LECMEFormat isAsianVietnamese(SerialField<OneOrZero> isAsianVietnamese) {
        setIsAsianVietnamese(isAsianVietnamese);
        return this;
    }

    public LECMEFormat isAsianOther(SerialField<OneOrZero> isAsianOther) {
        setIsAsianOther(isAsianOther);
        return this;
    }

    public LECMEFormat isAsianOtherText(SerialField<String> isAsianOtherText) {
        setIsAsianOtherText(isAsianOtherText);
        return this;
    }

    public LECMEFormat isPacificIslanderHawaii(SerialField<OneOrZero> isPacificIslanderHawaii) {
        setIsPacificIslanderHawaii(isPacificIslanderHawaii);
        return this;
    }

    public LECMEFormat isPacificIslanderGuam(SerialField<OneOrZero> isPacificIslanderGuam) {
        setIsPacificIslanderGuam(isPacificIslanderGuam);
        return this;
    }

    public LECMEFormat isPacificIslanderSamoa(SerialField<OneOrZero> isPacificIslanderSamoa) {
        setIsPacificIslanderSamoa(isPacificIslanderSamoa);
        return this;
    }

    public LECMEFormat isPacificIslanderOther(SerialField<OneOrZero> isPacificIslanderOther) {
        setIsPacificIslanderOther(isPacificIslanderOther);
        return this;
    }

    public LECMEFormat isPacificIslanderOtherText(SerialField<OneOrZero> isPacificIslanderOtherText) {
        setIsPacificIslanderOtherText(isPacificIslanderOtherText);
        return this;
    }

    public LECMEFormat americanIndianTribe(SerialField<OneOrZero> americanIndianTribe) {
        setAmericanIndianTribe(americanIndianTribe);
        return this;
    }

    public LECMEFormat americanIndianTribeOther(SerialField<String> americanIndianTribeOther) {
        setAmericanIndianTribeOther(americanIndianTribeOther);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " forceNewRecord='" + getForceNewRecord() + "'" +
            ", overwriteConflicts='" + getOverwriteConflicts() + "'" +
            ", incidentYear='" + getIncidentYear() + "'" +
            ", incidentNumber='" + getIncidentNumber() + "'" +
            ", victimNumber='" + getVictimNumber() + "'" +
            ", lastFourDCNumber='" + getLastFourDCNumber() + "'" +
            ", lastFourCMENumber='" + getLastFourCMENumber() + "'" +
            ", initialOfLastName='" + getInitialOfLastName() + "'" +
            ", birthDayOfMonth='" + getBirthDayOfMonth() + "'" +
            ", deathMannerAbstractor='" + getDeathMannerAbstractor() + "'" +
            ", deathMannerDC='" + getDeathMannerDC() + "'" +
            ", deathMannerCME='" + getDeathMannerCME() + "'" +
            ", deathMannerLE='" + getDeathMannerLE() + "'" +
            ", deathDateYear='" + getDeathDateYear() + "'" +
            ", deathDateMonth='" + getDeathDateMonth() + "'" +
            ", deathDateDay='" + getDeathDateDay() + "'" +
            ", deathState='" + getDeathState() + "'" +
            ", deathCounty='" + getDeathCounty() + "'" +
            ", deathPronouncedDateYear='" + getDeathPronouncedDateYear() + "'" +
            ", deathPronouncedDateMonth='" + getDeathPronouncedDateMonth() + "'" +
            ", deathPronouncedDateDay='" + getDeathPronouncedDateDay() + "'" +
            ", deathPlace='" + getDeathPlace() + "'" +
            ", deathPlaceText='" + getDeathPlaceText() + "'" +
            ", autopsyPerformed='" + getAutopsyPerformed() + "'" +
            ", injuryDateYear='" + getInjuryDateYear() + "'" +
            ", injuryDateMonth='" + getInjuryDateMonth() + "'" +
            ", injuryDateDay='" + getInjuryDateDay() + "'" +
            ", injuryTime='" + getInjuryTime() + "'" +
            ", survivalTime='" + getSurvivalTime() + "'" +
            ", survivalTimeUnit='" + getSurvivalTimeUnit() + "'" +
            ", injuryLocation='" + getInjuryLocation() + "'" +
            ", injuredAtWork='" + getInjuredAtWork() + "'" +
            ", injuredAtVictimHome='" + getInjuredAtVictimHome() + "'" +
            ", eMSPresent='" + getEMSPresent() + "'" +
            ", victimInCustody='" + getVictimInCustody() + "'" +
            ", alcoholUseSuspected='" + getAlcoholUseSuspected() + "'" +
            ", injuryState='" + getInjuryState() + "'" +
            ", injuryCounty='" + getInjuryCounty() + "'" +
            ", injuryCity='" + getInjuryCity() + "'" +
            ", injuryZip='" + getInjuryZip() + "'" +
            ", censusTract='" + getCensusTract() + "'" +
            ", censusBlock='" + getCensusBlock() + "'" +
            ", sexVictim='" + getSexVictim() + "'" +
            ", sexualOrientation='" + getSexualOrientation() + "'" +
            ", transgender='" + getTransgender() + "'" +
            ", age='" + getAge() + "'" +
            ", ageUnit='" + getAgeUnit() + "'" +
            ", ethnicityVictim='" + getEthnicityVictim() + "'" +
            ", raceWhiteVictim='" + getRaceWhiteVictim() + "'" +
            ", raceBlackVictim='" + getRaceBlackVictim() + "'" +
            ", raceAmericanIndianVictim='" + getRaceAmericanIndianVictim() + "'" +
            ", raceAsianVictim='" + getRaceAsianVictim() + "'" +
            ", racePacificIslanderVictim='" + getRacePacificIslanderVictim() + "'" +
            ", raceOtherVictim='" + getRaceOtherVictim() + "'" +
            ", raceUnspecifiedVictim='" + getRaceUnspecifiedVictim() + "'" +
            ", heightFeet='" + getHeightFeet() + "'" +
            ", heightInches='" + getHeightInches() + "'" +
            ", weight='" + getWeight() + "'" +
            ", pregnant='" + getPregnant() + "'" +
            ", maritalStatus='" + getMaritalStatus() + "'" +
            ", military='" + getMilitary() + "'" +
            ", homeless='" + getHomeless() + "'" +
            ", recentRelease='" + getRecentRelease() + "'" +
            ", educationLevel='" + getEducationLevel() + "'" +
            ", educationYears='" + getEducationYears() + "'" +
            ", industry='" + getIndustry() + "'" +
            ", industryText='" + getIndustryText() + "'" +
            ", occupationText='" + getOccupationText() + "'" +
            ", usualOccupation='" + getUsualOccupation() + "'" +
            ", occupationCurrentText='" + getOccupationCurrentText() + "'" +
            ", birthPlace='" + getBirthPlace() + "'" +
            ", birthCountryOther='" + getBirthCountryOther() + "'" +
            ", country='" + getCountry() + "'" +
            ", residenceState='" + getResidenceState() + "'" +
            ", residenceCounty='" + getResidenceCounty() + "'" +
            ", residenceCity='" + getResidenceCity() + "'" +
            ", residenceZip='" + getResidenceZip() + "'" +
            ", residenceCensusTract='" + getResidenceCensusTract() + "'" +
            ", residenceCensusBlock='" + getResidenceCensusBlock() + "'" +
            ", toxicologyNotAvailable='" + getToxicologyNotAvailable() + "'" +
            ", specimensDateYear='" + getSpecimensDateYear() + "'" +
            ", specimensDateMonth='" + getSpecimensDateMonth() + "'" +
            ", specimensDateDay='" + getSpecimensDateDay() + "'" +
            ", specimensTime='" + getSpecimensTime() + "'" +
            ", alcoholTested='" + getAlcoholTested() + "'" +
            ", alcoholResult='" + getAlcoholResult() + "'" +
            ", alcoholLevel='" + getAlcoholLevel() + "'" +
            ", amphetamineTested='" + getAmphetamineTested() + "'" +
            ", amphetamineResult='" + getAmphetamineResult() + "'" +
            ", anticonvulsantsTested='" + getAnticonvulsantsTested() + "'" +
            ", anticonvulsantsResult='" + getAnticonvulsantsResult() + "'" +
            ", antidepressantTested='" + getAntidepressantTested() + "'" +
            ", antidepressantResult='" + getAntidepressantResult() + "'" +
            ", antipsychoticTested='" + getAntipsychoticTested() + "'" +
            ", antipsychoticResult='" + getAntipsychoticResult() + "'" +
            ", barbituratesTested='" + getBarbituratesTested() + "'" +
            ", barbituratesResult='" + getBarbituratesResult() + "'" +
            ", benzodiazepinesTested='" + getBenzodiazepinesTested() + "'" +
            ", benzodiazepinesResult='" + getBenzodiazepinesResult() + "'" +
            ", carbonMonoxideTested='" + getCarbonMonoxideTested() + "'" +
            ", carbonMonoxideResult='" + getCarbonMonoxideResult() + "'" +
            ", carbonMonoxideSource='" + getCarbonMonoxideSource() + "'" +
            ", cocaineTested='" + getCocaineTested() + "'" +
            ", cocaineResult='" + getCocaineResult() + "'" +
            ", marijuanaTested='" + getMarijuanaTested() + "'" +
            ", marijuanaResult='" + getMarijuanaResult() + "'" +
            ", muscleRelaxorTested='" + getMuscleRelaxorTested() + "'" +
            ", muscleRelaxorResult='" + getMuscleRelaxorResult() + "'" +
            ", opiateTested='" + getOpiateTested() + "'" +
            ", opiateResult='" + getOpiateResult() + "'" +
            ", numberWounds='" + getNumberWounds() + "'" +
            ", numberBullets='" + getNumberBullets() + "'" +
            ", woundToHead='" + getWoundToHead() + "'" +
            ", woundToFace='" + getWoundToFace() + "'" +
            ", woundToNeck='" + getWoundToNeck() + "'" +
            ", woundToUpperExtremity='" + getWoundToUpperExtremity() + "'" +
            ", woundToSpine='" + getWoundToSpine() + "'" +
            ", woundToThorax='" + getWoundToThorax() + "'" +
            ", woundToAbdomen='" + getWoundToAbdomen() + "'" +
            ", woundToLowerExtremity='" + getWoundToLowerExtremity() + "'" +
            ", circumstancesKnownCME='" + getCircumstancesKnownCME() + "'" +
            ", abusedAsChildCME='" + getAbusedAsChildCME() + "'" +
            ", alcoholProblemCME='" + getAlcoholProblemCME() + "'" +
            ", argumentCME='" + getArgumentCME() + "'" +
            ", argumentOtherCME='" + getArgumentOtherCME() + "'" +
            ", argumentTimingCME='" + getArgumentTimingCME() + "'" +
            ", brawlCME='" + getBrawlCME() + "'" +
            ", bulletRicochetCME='" + getBulletRicochetCME() + "'" +
            ", bystanderCME='" + getBystanderCME() + "'" +
            ", celebratoryFiringCME='" + getCelebratoryFiringCME() + "'" +
            ", circumstancesOtherCME='" + getCircumstancesOtherCME() + "'" +
            ", circumstancesOtherTextCME='" + getCircumstancesOtherTextCME() + "'" +
            ", crisisProstitutionCME='" + getCrisisProstitutionCME() + "'" +
            ", crisisAlcoholProblemCME='" + getCrisisAlcoholProblemCME() + "'" +
            ", crisisCivilLegalCME='" + getCrisisCivilLegalCME() + "'" +
            ", crisisCriminalCME='" + getCrisisCriminalCME() + "'" +
            ", crisisDisasterExposureCME='" + getCrisisDisasterExposureCME() + "'" +
            ", crisisEvictionCME='" + getCrisisEvictionCME() + "'" +
            ", crisisFamilyStressorCME='" + getCrisisFamilyStressorCME() + "'" +
            ", crisisFinancialCME='" + getCrisisFinancialCME() + "'" +
            ", crisisIntimatePartnerProblemCME='" + getCrisisIntimatePartnerProblemCME() + "'" +
            ", crisisJealousyCME='" + getCrisisJealousyCME() + "'" +
            ", crisisJobCME='" + getCrisisJobCME() + "'" +
            ", crisisMentalHealthCME='" + getCrisisMentalHealthCME() + "'" +
            ", crisisOtherAddictionCME='" + getCrisisOtherAddictionCME() + "'" +
            ", crisisPhysicalHealthCME='" + getCrisisPhysicalHealthCME() + "'" +
            ", crisisRelatedDeathFriendOrFamilyOtherCME='" + getCrisisRelatedDeathFriendOrFamilyOtherCME() + "'" +
            ", crisisRelatedSuicideFriendOrFamilyCME='" + getCrisisRelatedSuicideFriendOrFamilyCME() + "'" +
            ", crisisRelationshipProblemOtherCME='" + getCrisisRelationshipProblemOtherCME() + "'" +
            ", crisisSchoolCME='" + getCrisisSchoolCME() + "'" +
            ", crisisStalkingCME='" + getCrisisStalkingCME() + "'" +
            ", crisisSubstanceAbuseCME='" + getCrisisSubstanceAbuseCME() + "'" +
            ", deathAbuseCME='" + getDeathAbuseCME() + "'" +
            ", deathFriendOrFamilyOtherCME='" + getDeathFriendOrFamilyOtherCME() + "'" +
            ", depressedMoodCME='" + getDepressedMoodCME() + "'" +
            ", disasterExposureCME='" + getDisasterExposureCME() + "'" +
            ", disclosedIntentToWhomCME='" + getDisclosedIntentToWhomCME() + "'" +
            ", driveByShootingCME='" + getDriveByShootingCME() + "'" +
            ", drugInvolvementCME='" + getDrugInvolvementCME() + "'" +
            ", evictionOrLossOfHomeCME='" + getEvictionOrLossOfHomeCME() + "'" +
            ", fightBetweenTwoPeopleCME='" + getFightBetweenTwoPeopleCME() + "'" +
            ", financialProblemCME='" + getFinancialProblemCME() + "'" +
            ", unused1='" + getUnused1() + "'" +
            ", gangRelatedCME='" + getGangRelatedCME() + "'" +
            ", gunCleaningCME='" + getGunCleaningCME() + "'" +
            ", gunDefectMalfunctionCME='" + getGunDefectMalfunctionCME() + "'" +
            ", gunDroppedCME='" + getGunDroppedCME() + "'" +
            ", gunFiredHolsteringCME='" + getGunFiredHolsteringCME() + "'" +
            ", gunFiredLoadingUnloadingCME='" + getGunFiredLoadingUnloadingCME() + "'" +
            ", gunFiredOperatingSafetyLockCME='" + getGunFiredOperatingSafetyLockCME() + "'" +
            ", gunPlayingCME='" + getGunPlayingCME() + "'" +
            ", gunShowingCME='" + getGunShowingCME() + "'" +
            ", gunThoughtSafetyEngagedCME='" + getGunThoughtSafetyEngagedCME() + "'" +
            ", gunThoughtToyCME='" + getGunThoughtToyCME() + "'" +
            ", gunThoughtUnloadedMagazineDisengagedCME='" + getGunThoughtUnloadedMagazineDisengagedCME() + "'" +
            ", gunThoughtUnloadedOtherCME='" + getGunThoughtUnloadedOtherCME() + "'" +
            ", gunUnintentionallyPulledTriggerCME='" + getGunUnintentionallyPulledTriggerCME() + "'" +
            ", hateCrimeCME='" + getHateCrimeCME() + "'" +
            ", hisoryMentalIllnessTreatmentCME='" + gethisryMentalIllnessTreatmentCME() + "'" +
            ", huntingCME='" + getHuntingCME() + "'" +
            ", interpersonalViolencePerpetratorCME='" + getInterpersonalViolencePerpetratorCME() + "'" +
            ", interpersonalViolenceVictimCME='" + getInterpersonalViolenceVictimCME() + "'" +
            ", intervenerAssistingVictimCME='" + getIntervenerAssistingVictimCME() + "'" +
            ", intimatePartnerProblemCME='" + getIntimatePartnerProblemCME() + "'" +
            ", intimatePartnerViolenceCME='" + getIntimatePartnerViolenceCME() + "'" +
            ", jealouslyCME='" + getJealouslyCME() + "'" +
            ", jobProblemCME='" + getJobProblemCME() + "'" +
            ", justifiableSelfDefenseCME='" + getJustifiableSelfDefenseCME() + "'" +
            ", legalProblemOtherCME='" + getLegalProblemOtherCME() + "'" +
            ", mentalHealthDiagnosis1CME='" + getMentalHealthDiagnosis1CME() + "'" +
            ", mentalHealthDiagnosis2CME='" + getMentalHealthDiagnosis2CME() + "'" +
            ", mentalHealthDiagnosisOtherCME='" + getMentalHealthDiagnosisOtherCME() + "'" +
            ", mentalHealthProblemCME='" + getMentalHealthProblemCME() + "'" +
            ", mentalIllnessTreatmentCurrentCME='" + getMentalIllnessTreatmentCurrentCME() + "'" +
            ", mercyKillingCME='" + getMercyKillingCME() + "'" +
            ", natureOtherCrime1CME='" + getNatureOtherCrime1CME() + "'" +
            ", natureOtherCrime2CME='" + getNatureOtherCrime2CME() + "'" +
            ", otherAddictionCME='" + getOtherAddictionCME() + "'" +
            ", otherContextInjuryCME='" + getOtherContextInjuryCME() + "'" +
            ", otherCrimeInProgressCME='" + getOtherCrimeInProgressCME() + "'" +
            ", otherMechanismInjuryCME='" + getOtherMechanismInjuryCME() + "'" +
            ", precipitatedByOtherCrimeCME='" + getPrecipitatedByOtherCrimeCME() + "'" +
            ", physicalHealthProblemCME='" + getPhysicalHealthProblemCME() + "'" +
            ", prostitutionCME='" + getProstitutionCME() + "'" +
            ", randomViolenceCME='" + getRandomViolenceCME() + "'" +
            ", recentCriminalLegalProblemCME='" + getRecentCriminalLegalProblemCME() + "'" +
            ", recentSuicideFriendFamilyCME='" + getRecentSuicideFriendFamilyCME() + "'" +
            ", relationshipProblemOtherCME='" + getRelationshipProblemOtherCME() + "'" +
            ", schoolProblemCME='" + getSchoolProblemCME() + "'" +
            ", selfDefenseCME='" + getSelfDefenseCME() + "'" +
            ", stalkingCME='" + getStalkingCME() + "'" +
            ", substanceAbuseOtherCME='" + getSubstanceAbuseOtherCME() + "'" +
            ", suicideAttempthisoryCME='" + getsuicideAttempthisoryCME() + "'" +
            ", suicideIntentDisclosedCME='" + getSuicideIntentDisclosedCME() + "'" +
            ", suicideNoteCME='" + getSuicideNoteCME() + "'" +
            ", suicideThoughthisoryCME='" + getsuicideThoughthisoryCME() + "'" +
            ", targetShootingCME='" + getTargetShootingCME() + "'" +
            ", terroristAttackCME='" + getTerroristAttackCME() + "'" +
            ", traumaticAnniversaryCME='" + getTraumaticAnniversaryCME() + "'" +
            ", victimPoliceOfficerOnDutyCME='" + getVictimPoliceOfficerOnDutyCME() + "'" +
            ", victimUsedWeaponCME='" + getVictimUsedWeaponCME() + "'" +
            ", walkByAssaultCME='" + getWalkByAssaultCME() + "'" +
            ", circumstancesOtherLE='" + getCircumstancesOtherLE() + "'" +
            ", abusedAsChildLE='" + getAbusedAsChildLE() + "'" +
            ", alcoholProblemLE='" + getAlcoholProblemLE() + "'" +
            ", argumentLE='" + getArgumentLE() + "'" +
            ", argumentOtherLE='" + getArgumentOtherLE() + "'" +
            ", argumentTimingLE='" + getArgumentTimingLE() + "'" +
            ", brawlLE='" + getBrawlLE() + "'" +
            ", bulletRicochetLE='" + getBulletRicochetLE() + "'" +
            ", bystanderLE='" + getBystanderLE() + "'" +
            ", celebratoryFiringLE='" + getCelebratoryFiringLE() + "'" +
            ", isCircumstancesKnown='" + getIsCircumstancesKnown() + "'" +
            ", circumstancesOtherTextLE='" + getCircumstancesOtherTextLE() + "'" +
            ", cririsProstitutionLE='" + getCririsProstitutionLE() + "'" +
            ", crisisAlcoholProblemLE='" + getCrisisAlcoholProblemLE() + "'" +
            ", crisisCivilLegalLE='" + getCrisisCivilLegalLE() + "'" +
            ", crisisCriminalLE='" + getCrisisCriminalLE() + "'" +
            ", crisisDisasterExposureLE='" + getCrisisDisasterExposureLE() + "'" +
            ", crisisEvictionLE='" + getCrisisEvictionLE() + "'" +
            ", crisisFamilyStressorLE='" + getCrisisFamilyStressorLE() + "'" +
            ", crisisFinancialLE='" + getCrisisFinancialLE() + "'" +
            ", crisisIntimatePartnerProblemLE='" + getCrisisIntimatePartnerProblemLE() + "'" +
            ", crisisJealousyLE='" + getCrisisJealousyLE() + "'" +
            ", crisisJobLE='" + getCrisisJobLE() + "'" +
            ", crisisMentalHealthLE='" + getCrisisMentalHealthLE() + "'" +
            ", crisisOtherAddictionLE='" + getCrisisOtherAddictionLE() + "'" +
            ", crisisPhysicalHealthLE='" + getCrisisPhysicalHealthLE() + "'" +
            ", crisisRelatedDeathFriendOrFamilyOtherLE='" + getCrisisRelatedDeathFriendOrFamilyOtherLE() + "'" +
            ", crisisRelatedSuicideFriendOrFamilyLE='" + getCrisisRelatedSuicideFriendOrFamilyLE() + "'" +
            ", crisisRelationshipProblemOtherLE='" + getCrisisRelationshipProblemOtherLE() + "'" +
            ", crisisSchoolLE='" + getCrisisSchoolLE() + "'" +
            ", crisisStalkingLE='" + getCrisisStalkingLE() + "'" +
            ", crisisSubstanceAbuseLE='" + getCrisisSubstanceAbuseLE() + "'" +
            ", deathAbuseLE='" + getDeathAbuseLE() + "'" +
            ", deathFriendOrFamilyOtherLE='" + getDeathFriendOrFamilyOtherLE() + "'" +
            ", depressedMoodLE='" + getDepressedMoodLE() + "'" +
            ", disasterExposureLE='" + getDisasterExposureLE() + "'" +
            ", disclosedIntentToWhomLE='" + getDisclosedIntentToWhomLE() + "'" +
            ", driveByShootingLE='" + getDriveByShootingLE() + "'" +
            ", drugInvolvementLE='" + getDrugInvolvementLE() + "'" +
            ", evictionOrLossOfHomeLE='" + getEvictionOrLossOfHomeLE() + "'" +
            ", fightBetweenTwoPeopleLE='" + getFightBetweenTwoPeopleLE() + "'" +
            ", financialProblemLE='" + getFinancialProblemLE() + "'" +
            ", unused2='" + getUnused2() + "'" +
            ", gangRelatedLE='" + getGangRelatedLE() + "'" +
            ", gunCleaningLE='" + getGunCleaningLE() + "'" +
            ", gunDefectMalfunctionLE='" + getGunDefectMalfunctionLE() + "'" +
            ", gunDroppedLE='" + getGunDroppedLE() + "'" +
            ", gunFiredHolsteringLE='" + getGunFiredHolsteringLE() + "'" +
            ", gunFiredLoadingUnloadingLE='" + getGunFiredLoadingUnloadingLE() + "'" +
            ", gunFiredOperatingSafetyLockLE='" + getGunFiredOperatingSafetyLockLE() + "'" +
            ", gunPlayingLE='" + getGunPlayingLE() + "'" +
            ", gunShowingLE='" + getGunShowingLE() + "'" +
            ", gunThoughtSafetyEngagedLE='" + getGunThoughtSafetyEngagedLE() + "'" +
            ", gunThoughtToyLE='" + getGunThoughtToyLE() + "'" +
            ", gunThoughtUnloadedMagazineDisengagedLE='" + getGunThoughtUnloadedMagazineDisengagedLE() + "'" +
            ", gunThoughtUnloadedOtherLE='" + getGunThoughtUnloadedOtherLE() + "'" +
            ", gunUnintentionallyPulledTriggerLE='" + getGunUnintentionallyPulledTriggerLE() + "'" +
            ", hateCrimeLE='" + getHateCrimeLE() + "'" +
            ", hisoryMentalIllnessTreatmentLE='" + gethisryMentalIllnessTreatmentLE() + "'" +
            ", huntingLE='" + getHuntingLE() + "'" +
            ", interpersonalViolencePerpetratorLE='" + getInterpersonalViolencePerpetratorLE() + "'" +
            ", interpersonalViolenceVictimLE='" + getInterpersonalViolenceVictimLE() + "'" +
            ", intervenerAssistingVictimLE='" + getIntervenerAssistingVictimLE() + "'" +
            ", intimatePartnerProblemLE='" + getIntimatePartnerProblemLE() + "'" +
            ", intimatePartnerViolenceLE='" + getIntimatePartnerViolenceLE() + "'" +
            ", jealouslyLE='" + getJealouslyLE() + "'" +
            ", jobProblemLE='" + getJobProblemLE() + "'" +
            ", justifiableSelfDefenseLE='" + getJustifiableSelfDefenseLE() + "'" +
            ", legalProblemOtherLE='" + getLegalProblemOtherLE() + "'" +
            ", mentalHealthDiagnosis1LE='" + getMentalHealthDiagnosis1LE() + "'" +
            ", mentalHealthDiagnosis2LE='" + getMentalHealthDiagnosis2LE() + "'" +
            ", mentalHealthDiagnosisOtherLE='" + getMentalHealthDiagnosisOtherLE() + "'" +
            ", mentalHealthProblemLE='" + getMentalHealthProblemLE() + "'" +
            ", mentalIllnessTreatmentCurrentLE='" + getMentalIllnessTreatmentCurrentLE() + "'" +
            ", mercyKillingLE='" + getMercyKillingLE() + "'" +
            ", natureOtherCrime1LE='" + getNatureOtherCrime1LE() + "'" +
            ", natureOtherCrime2LE='" + getNatureOtherCrime2LE() + "'" +
            ", otherAddictionLE='" + getOtherAddictionLE() + "'" +
            ", otherContextInjuryLE='" + getOtherContextInjuryLE() + "'" +
            ", otherCrimeInProgressLE='" + getOtherCrimeInProgressLE() + "'" +
            ", otherMechanismInjuryLE='" + getOtherMechanismInjuryLE() + "'" +
            ", precipitatedByOtherCrimeLE='" + getPrecipitatedByOtherCrimeLE() + "'" +
            ", physicalHealthProblemLE='" + getPhysicalHealthProblemLE() + "'" +
            ", prostitutionLE='" + getProstitutionLE() + "'" +
            ", randomViolenceLE='" + getRandomViolenceLE() + "'" +
            ", recentCriminalLegalProblemLE='" + getRecentCriminalLegalProblemLE() + "'" +
            ", recentSuicideFriendFamilyLE='" + getRecentSuicideFriendFamilyLE() + "'" +
            ", relationshipProblemOtherLE='" + getRelationshipProblemOtherLE() + "'" +
            ", schoolProblemLE='" + getSchoolProblemLE() + "'" +
            ", selfDefenseLE='" + getSelfDefenseLE() + "'" +
            ", stalkingLE='" + getStalkingLE() + "'" +
            ", substanceAbuseOtherLE='" + getSubstanceAbuseOtherLE() + "'" +
            ", suicideAttempthisoryLE='" + getSuicideAttempthisoryLE() + "'" +
            ", suicideIntentDisclosedLE='" + getSuicideIntentDisclosedLE() + "'" +
            ", suicideNoteLE='" + getSuicideNoteLE() + "'" +
            ", suicideThoughthisoryLE='" + getsuicideThoughthisoryLE() + "'" +
            ", targetShootingLE='" + getTargetShootingLE() + "'" +
            ", terroristAttackLE='" + getTerroristAttackLE() + "'" +
            ", TraumaticAnniversaryLE='" + getTraumaticAnniversaryLE() + "'" +
            ", VictimPoliceOfficeOnDutyLE='" + getVictimPoliceOfficeOnDutyLE() + "'" +
            ", VictimUsedWeaponLE='" + getVictimUsedWeaponLE() + "'" +
            ", WalkByAssaultLE='" + getWalkByAssaultLE() + "'" +
            ", WeaponType='" + getWeaponType() + "'" +
            ", FirearmType='" + getFirearmType() + "'" +
            ", FirearmCaliber='" + getFirearmCaliber() + "'" +
            ", FirearmGauge='" + getFirearmGauge() + "'" +
            ", FirearmMake='" + getFirearmMake() + "'" +
            ", FirearmModel='" + getFirearmModel() + "'" +
            ", GunLoaded='" + getGunLoaded() + "'" +
            ", GunOwner='" + getGunOwner() + "'" +
            ", GunStoredLocked='" + getGunStoredLocked() + "'" +
            ", FirearmStolen='" + getFirearmStolen() + "'" +
            ", SuspectSex='" + getSuspectSex() + "'" +
            ", VictimSuspectRelationshipPrimary='" + getVictimSuspectRelationshipPrimary() + "'" +
            ", VictimSuspectRelationshipSecondary='" + getVictimSuspectRelationshipSecondary() + "'" +
            ", HasAbusehistory='" + getHasAbusehistory() + "'" +
            ", IsCareTaker='" + getIsCareTaker() + "'" +
            ", HasAttemptedSuicide='" + getHasAttemptedSuicide() + "'" +
            ", IsSuspectAlsoVictim='" + getIsSuspectAlsoVictim() + "'" +
            ", IsSuspectMentallyIll='" + getIsSuspectMentallyIll() + "'" +
            ", HasSuspectDevelopmentDisability='" + getHasSuspectDevelopmentDisability() + "'" +
            ", IsSuspectAlcoholUseSuspected='" + getIsSuspectAlcoholUseSuspected() + "'" +
            ", IsSuspectSubstanceUseSuspected='" + getIsSuspectSubstanceUseSuspected() + "'" +
            ", IsSuspectContactPolice='" + getIsSuspectContactPolice() + "'" +
            ", SuspectRecentRelease='" + getSuspectRecentRelease() + "'" +
            ", IsSuspectCaucasian='" + getIsSuspectCaucasian() + "'" +
            ", IsSuspectAfricanAmerican='" + getIsSuspectAfricanAmerican() + "'" +
            ", IsSuspectAsian='" + getIsSuspectAsian() + "'" +
            ", IsSuspectPacificIslander='" + getIsSuspectPacificIslander() + "'" +
            ", IsSuspectAmericanIndian='" + getIsSuspectAmericanIndian() + "'" +
            ", IsSuspectRaceUnspecified='" + getIsSuspectRaceUnspecified() + "'" +
            ", SuspectEthnicity='" + getSuspectEthnicity() + "'" +
            ", IsTreatmentNonAdherenceCME='" + getIsTreatmentNonAdherenceCME() + "'" +
            ", IsTraumaticBrainInjuryhistoryCME='" + getIsTraumaticBrainInjuryhistoryCME() + "'" +
            ", IsFamilyStressorsCME='" + getIsFamilyStressorsCME() + "'" +
            ", IsCrisisFamilyStressorCME='" + getIsCrisisFamilyStressorCME() + "'" +
            ", IsCaregiverBurdenCME='" + getIsCaregiverBurdenCME() + "'" +
            ", IsFamilyStressorCME='" + getIsFamilyStressorCME() + "'" +
            ", IsHouseholdKnownCME='" + getIsHouseholdKnownCME() + "'" +
            ", IsPriorCPSReportCME='" + getIsPriorCPSReportCME() + "'" +
            ", IsHouseholdSubstanceAbuseCME='" + getIsHouseholdSubstanceAbuseCME() + "'" +
            ", IsLivingTransitionCME='" + getIsLivingTransitionCME() + "'" +
            ", IsCorporalPunishmentCME='" + getIsCorporalPunishmentCME() + "'" +
            ", IshistorySelfHarmCME='" + getIshistorySelfHarmCME() + "'" +
            ", IsTreatmentNonAdherenceLE='" + getIsTreatmentNonAdherenceLE() + "'" +
            ", IsTraumaticBrainInjuryhistoryLE='" + getIsTraumaticBrainInjuryhistoryLE() + "'" +
            ", IsFamilyStressorsLE='" + getIsFamilyStressorsLE() + "'" +
            ", IsCrisisFamilyStressorLE='" + getIsCrisisFamilyStressorLE() + "'" +
            ", IsCaregiverBurdenLE='" + getIsCaregiverBurdenLE() + "'" +
            ", IsFamilyStressorLE='" + getIsFamilyStressorLE() + "'" +
            ", IsHouseholdKnownLE='" + getIsHouseholdKnownLE() + "'" +
            ", IsPriorCPSReportLE='" + getIsPriorCPSReportLE() + "'" +
            ", IsHouseholdSubstanceAbuseLE='" + getIsHouseholdSubstanceAbuseLE() + "'" +
            ", IsLivingTransitionLE='" + getIsLivingTransitionLE() + "'" +
            ", IsCorporalPunishmentLE='" + getIsCorporalPunishmentLE() + "'" +
            ", IshistorySelfHarmLE='" + getIshistorySelfHarmLE() + "'" +
            ", TypeOfPoisoning='" + getTypeOfPoisoning() + "'" +
            ", LastSeenAliveTime='" + getLastSeenAliveTime() + "'" +
            ", FoundUnresponsiveTime='" + getFoundUnresponsiveTime() + "'" +
            ", LastSeenAliveMonth='" + getLastSeenAliveMonth() + "'" +
            ", LastSeenAliveDay='" + getLastSeenAliveDay() + "'" +
            ", LastSeenAliveYear='" + getLastSeenAliveYear() + "'" +
            ", FoundUnresponsiveMonth='" + getFoundUnresponsiveMonth() + "'" +
            ", FoundUnresponsiveDay='" + getFoundUnresponsiveDay() + "'" +
            ", FoundUnresponsiveYear='" + getFoundUnresponsiveYear() + "'" +
            ", PreviousOverdose='" + getPreviousOverdose() + "'" +
            ", Overdose0to2DaysPrior='" + getOverdose0to2DaysPrior() + "'" +
            ", Overdose3to7DaysPrior='" + getOverdose3to7DaysPrior() + "'" +
            ", RecentOpioidUse='" + getRecentOpioidUse() + "'" +
            ", RecentEmergencyDept='" + getRecentEmergencyDept() + "'" +
            ", histDrugNoEvidence='" + gethisdrugNoEvidence() + "'" +
            ", histHeroin='" + gethisheroin() + "'" +
            ", histRxOpioid='" + gethisrxOpioid() + "'" +
            ", histAnyOpioid='" + gethisanyOpioid() + "'" +
            ", histFentanyl='" + gethisfentanyl() + "'" +
            ", histCocaine='" + gethiscocaine() + "'" +
            ", histMeth='" + gethismeth() + "'" +
            ", histBenzo='" + gethisbenzo() + "'" +
            ", histCannabis='" + gethiscannabis() + "'" +
            ", histUnspecified='" + gethisunspecified() + "'" +
            ", histOther='" + gethisother() + "'" +
            ", histOtherDesc='" + gethisotherDesc() + "'" +
            ", TreatmentForSubstanceAbuse='" + getTreatmentForSubstanceAbuse() + "'" +
            ", SubstanceTreatmentRehab='" + getSubstanceTreatmentRehab() + "'" +
            ", SubstanceTreatmentMATcog='" + getSubstanceTreatmentMATcog() + "'" +
            ", SubstanceTreatmentMATNoCog='" + getSubstanceTreatmentMATNoCog() + "'" +
            ", SubstanceTreatmentMAT='" + getSubstanceTreatmentMAT() + "'" +
            ", SubstanceTreatmentCogTherapy='" + getSubstanceTreatmentCogTherapy() + "'" +
            ", SubstanceTreatmentNA='" + getSubstanceTreatmentNA() + "'" +
            ", SubstanceTreatmentOther='" + getSubstanceTreatmentOther() + "'" +
            ", SubstanceTreatmentOtherSpecify='" + getSubstanceTreatmentOtherSpecify() + "'" +
            ", InvolveCriminalJustice='" + getInvolveCriminalJustice() + "'" +
            ", HasIndicationsDrugPara='" + getHasIndicationsDrugPara() + "'" +
            ", HasIndicationsNone='" + getHasIndicationsNone() + "'" +
            ", HasIndicationsNonSpecific='" + getHasIndicationsNonSpecific() + "'" +
            ", HasRapidOverdoseEvidence='" + getHasRapidOverdoseEvidence() + "'" +
            ", IsTourniquetAroundArm='" + getIsTourniquetAroundArm() + "'" +
            ", BodyPosition='" + getBodyPosition() + "'" +
            ", NeedleLocation='" + getNeedleLocation() + "'" +
            ", RapidOverdoseWitnessReport='" + getRapidOverdoseWitnessReport() + "'" +
            ", HasRapidOverdoseOther='" + getHasRapidOverdoseOther() + "'" +
            ", RapidOverdoseOtherDescription='" + getRapidOverdoseOtherDescription() + "'" +
            ", HasRouteUnknown='" + getHasRouteUnknown() + "'" +
            ", HasRouteInjection='" + getHasRouteInjection() + "'" +
            ", HasIndicationsTracks='" + getHasIndicationsTracks() + "'" +
            ", HasEvidenceOfInjectionTourniquet='" + getHasEvidenceOfInjectionTourniquet() + "'" +
            ", HasEvidenceOfInjectionCooker='" + getHasEvidenceOfInjectionCooker() + "'" +
            ", HasEvidenceOfinjectionNeedle='" + getHasEvidenceOfinjectionNeedle() + "'" +
            ", HasEvidenceOfInjectionFilter='" + getHasEvidenceOfInjectionFilter() + "'" +
            ", HasEvidenceOfInjectionWitnessReport='" + getHasEvidenceOfInjectionWitnessReport() + "'" +
            ", HasEvidenceOfInjectionOther='" + getHasEvidenceOfInjectionOther() + "'" +
            ", HasEvidenceOfInjectionOtherDescription='" + getHasEvidenceOfInjectionOtherDescription() + "'" +
            ", HasRouteSnorting='" + getHasRouteSnorting() + "'" +
            ", SnortingStraw='" + getSnortingStraw() + "'" +
            ", SnortingRolled='" + getSnortingRolled() + "'" +
            ", SnortingRazor='" + getSnortingRazor() + "'" +
            ", SnortingPowderMirror='" + getSnortingPowderMirror() + "'" +
            ", SnortingPowderNose='" + getSnortingPowderNose() + "'" +
            ", SnortingWitness='" + getSnortingWitness() + "'" +
            ", SnortingOther='" + getSnortingOther() + "'" +
            ", SnortingOtherDesc='" + getSnortingOtherDesc() + "'" +
            ", HasRouteSmoking='" + getHasRouteSmoking() + "'" +
            ", SmokingPipe='" + getSmokingPipe() + "'" +
            ", smokingTinfoil='" + getSmokingTinfoil() + "'" +
            ", smokingVape='" + getSmokingVape() + "'" +
            ", smokingBongBowl='" + getSmokingBongBowl() + "'" +
            ", smokingWitness='" + getSmokingWitness() + "'" +
            ", smokingOther='" + getSmokingOther() + "'" +
            ", smokingOtherDesc='" + getSmokingOtherDesc() + "'" +
            ", hasRouteTransdermal='" + getHasRouteTransdermal() + "'" +
            ", hasRouteIngestion='" + getHasRouteIngestion() + "'" +
            ", hasRouteSuppository='" + getHasRouteSuppository() + "'" +
            ", hasRouteSublingual='" + getHasRouteSublingual() + "'" +
            ", hasRouteBuccal='" + getHasRouteBuccal() + "'" +
            ", nonSpecificRx='" + getNonSpecificRx() + "'" +
            ", hasEvidenceOfPrescriptionDrug='" + getHasEvidenceOfPrescriptionDrug() + "'" +
            ", isPrescribedToVictim='" + getIsPrescribedToVictim() + "'" +
            ", isUnknownWhoPrescribed='" + getIsUnknownWhoPrescribed() + "'" +
            ", hasIndicationsRxDrugs='" + getHasIndicationsRxDrugs() + "'" +
            ", prescriptionOtherDescription='" + getPrescriptionOtherDescription() + "'" +
            ", hasIndicationsDrugatScene='" + getHasIndicationsDrugatScene() + "'" +
            ", haveEvidenceIllicitPowder='" + getHaveEvidenceIllicitPowder() + "'" +
            ", hasEvidenceIllicitTar='" + getHasEvidenceIllicitTar() + "'" +
            ", hasEvidenceOfIllicitWitnessReport='" + getHasEvidenceOfIllicitWitnessReport() + "'" +
            ", hasEvidenceCrystal='" + getHasEvidenceCrystal() + "'" +
            ", otherFormDescription='" + getOtherFormDescription() + "'" +
            ", bystandersPresent='" + getBystandersPresent() + "'" +
            ", bystanderOtherSpecify='" + getBystanderOtherSpecify() + "'" +
            ", witnessedDrugUse='" + getWitnessedDrugUse() + "'" +
            ", bystanderCPR='" + getBystanderCPR() + "'" +
            ", bystanderBreathing='" + getBystanderBreathing() + "'" +
            ", bystanderSternal='" + getBystanderSternal() + "'" +
            ", bystanderStimulation='" + getBystanderStimulation() + "'" +
            ", bystanderIntrvOther='" + getBystanderIntrvOther() + "'" +
            ", bystanderIntrvOtherSpecify='" + getBystanderIntrvOtherSpecify() + "'" +
            ", wasNaloxoneAdministered='" + getWasNaloxoneAdministered() + "'" +
            ", isNaloxoneNotAdmin='" + getIsNaloxoneNotAdmin() + "'" +
            ", isNaloxoneUnknown='" + getIsNaloxoneUnknown() + "'" +
            ", naloxoneTotalResponder='" + getNaloxoneTotalResponder() + "'" +
            ", naloxoneTotalBystander='" + getNaloxoneTotalBystander() + "'" +
            ", isNaloxoneAdminUnknown='" + getIsNaloxoneAdminUnknown() + "'" +
            ", isNaloxoneAdminLaw='" + getIsNaloxoneAdminLaw() + "'" +
            ", isNaloxoneAdminEms='" + getIsNaloxoneAdminEms() + "'" +
            ", isNaloxoneAdminHospital='" + getIsNaloxoneAdminHospital() + "'" +
            ", isNaloxoneAdminOther='" + getIsNaloxoneAdminOther() + "'" +
            ", isNaloxoneAdminBystander='" + getIsNaloxoneAdminBystander() + "'" +
            ", isNaloxoneWhoPerson='" + getIsNaloxoneWhoPerson() + "'" +
            ", isNaloxoneWhoPartner='" + getIsNaloxoneWhoPartner() + "'" +
            ", isNaloxoneWhoFriend='" + getIsNaloxoneWhoFriend() + "'" +
            ", isNaloxoneWhoOtherFamily='" + getIsNaloxoneWhoOtherFamily() + "'" +
            ", isNaloxoneWhoRoomate='" + getIsNaloxoneWhoRoomate() + "'" +
            ", isNaloxoneWhoStranger='" + getIsNaloxoneWhoStranger() + "'" +
            ", isNaloxoneWhoOther='" + getIsNaloxoneWhoOther() + "'" +
            ", isNaloxoneWhoOtherDescription='" + getIsNaloxoneWhoOtherDescription() + "'" +
            ", hadPulse='" + getHadPulse() + "'" +
            ", intrvCPR='" + getIntrvCPR() + "'" +
            ", intrvBreathing='" + getIntrvBreathing() + "'" +
            ", intrvEpinephrine='" + getIntrvEpinephrine() + "'" +
            ", intrvTransport='" + getIntrvTransport() + "'" +
            ", intrvOxygen='" + getIntrvOxygen() + "'" +
            ", intrvOther='" + getIntrvOther() + "'" +
            ", intrvOtherSpecify='" + getIntrvOtherSpecify() + "'" +
            ", bystanderNotRecognize='" + getBystanderNotRecognize() + "'" +
            ", bystanderUsing='" + getBystanderUsing() + "'" +
            ", bystanderPublic='" + getBystanderPublic() + "'" +
            ", bystanderNoOverdose='" + getBystanderNoOverdose() + "'" +
            ", bystanderSeperated='" + getBystanderSeperated() + "'" +
            ", bystanderUnaware='" + getBystanderUnaware() + "'" +
            ", bystanderReasonOther='" + getBystanderReasonOther() + "'" +
            ", bystanderReasonOtherSpecify='" + getBystanderReasonOtherSpecify() + "'" +
            ", treatedforPain='" + getTreatedforPain() + "'" +
            ", medhistCopd='" + getMedhistCopd() + "'" +
            ", medhistAsthma='" + getMedhistAsthma() + "'" +
            ", medhistApnea='" + getMedhistApnea() + "'" +
            ", medhistHeart='" + getMedhistHeart() + "'" +
            ", medhistObesity='" + getMedhistObesity() + "'" +
            ", medhistInjury='" + getMedhistInjury() + "'" +
            ", medhistMigraine='" + getMedhistMigraine() + "'" +
            ", medhistBackpain='" + getMedhistBackpain() + "'" +
            ", medicalhistHepc='" + getMedicalhistHepc() + "'" +
            ", medicalhistHIV='" + getMedicalhistHIV() + "'" +
            ", medhistOtherpain='" + getMedhistOtherpain() + "'" +
            ", medhistOtherbreathing='" + getMedhistOtherbreathing() + "'" +
            ", prescriptionMorphine='" + getPrescriptionMorphine() + "'" +
            ", prescriptionMorphineNarrative='" + getPrescriptionMorphineNarrative() + "'" +
            ", buprenorphineRx='" + getBuprenorphineRx() + "'" +
            ", buprenorphineRxForPain='" + getBuprenorphineRxForPain() + "'" +
            ", buprenorphineRxForMat='" + getBuprenorphineRxForMat() + "'" +
            ", buprenorphineRxForUnk='" + getBuprenorphineRxForUnk() + "'" +
            ", methadoneRx='" + getMethadoneRx() + "'" +
            ", methadoneRxForPain='" + getMethadoneRxForPain() + "'" +
            ", methadoneRxForMat='" + getMethadoneRxForMat() + "'" +
            ", methadoneRxUnk='" + getMethadoneRxUnk() + "'" +
            ", naltrexoneRx='" + getNaltrexoneRx() + "'" +
            ", fentanylRx='" + getFentanylRx() + "'" +
            ", numScripsPast30Days='" + getNumScripsPast30Days() + "'" +
            ", numPharmaciesPast30Days='" + getNumPharmaciesPast30Days() + "'" +
            ", numDoctorsPrescribing30Days='" + getNumDoctorsPrescribing30Days() + "'" +
            ", isAsianIndian='" + getIsAsianIndian() + "'" +
            ", isAsianChinese='" + getIsAsianChinese() + "'" +
            ", isAsianFilipino='" + getIsAsianFilipino() + "'" +
            ", isAsianJapanese='" + getIsAsianJapanese() + "'" +
            ", isAsianKorean='" + getIsAsianKorean() + "'" +
            ", isAsianVietnamese='" + getIsAsianVietnamese() + "'" +
            ", isAsianOther='" + getIsAsianOther() + "'" +
            ", isAsianOtherText='" + getIsAsianOtherText() + "'" +
            ", isPacificIslanderHawaii='" + getIsPacificIslanderHawaii() + "'" +
            ", isPacificIslanderGuam='" + getIsPacificIslanderGuam() + "'" +
            ", isPacificIslanderSamoa='" + getIsPacificIslanderSamoa() + "'" +
            ", isPacificIslanderOther='" + getIsPacificIslanderOther() + "'" +
            ", isPacificIslanderOtherText='" + getIsPacificIslanderOtherText() + "'" +
            ", americanIndianTribe='" + getAmericanIndianTribe() + "'" +
            ", americanIndianTribeOther='" + getAmericanIndianTribeOther() + "'" +
            "}";
    }
    
}