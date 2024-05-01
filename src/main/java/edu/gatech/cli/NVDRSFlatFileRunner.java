package edu.gatech.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;

import edu.gatech.mapping.JsonMapping;
import edu.gatech.model.BaseSerializedFormat;
import edu.gatech.model.CharLimitedInteger;
import edu.gatech.model.DCFormat;
import edu.gatech.model.LECMEFormat;
import edu.gatech.model.enumvalueset.AgeUnits;
import edu.gatech.model.enumvalueset.EducationLevel;
import edu.gatech.model.enumvalueset.Ethnicity;
import edu.gatech.model.enumvalueset.Ethnicity;
import edu.gatech.model.enumvalueset.FIPSCodes;
import edu.gatech.model.enumvalueset.MaritalStatus;
import edu.gatech.model.enumvalueset.OneOrZero;

@Command(name = "nvdrs_flatfile", description = "CLI tool for NVDRS flatfile operations", version = "0.1.0", mixinStandardHelpOptions = true)
public class NVDRSFlatFileRunner implements Runnable {

    @Option(names = {"-a", "--action"}, description = "Action to perform: example, json-to-flat, flat-to-json", required = true)
    private String action;

    @Option(names = {"-t", "--filetype"}, description = "Type of file being used. DC = Death Certificate File, LECME = Law Enforcement/Coroner Medical Examiner File", defaultValue = "DC", required = true)
    private String fileType;

    @Option(names = {"-i", "--input"}, description = "Input file path")
    private File inputFile;

    @Option(names = {"-o", "--output"}, description = "Output file path")
    private File outputFile;

    @Option(names = {"ot", "--outputtype"}, description = "Type of output to write, either 'json' or 'flatfile'", defaultValue = "flatfile")
    private String outputFileType;

    @Option(names = {"i", "--includeSerialFormat"}, description = "When writing the json format; this option checks", defaultValue = "false")
    private boolean includeSerial;
    
    @Option(names = {"-c", "--console"}, description = "Write output to console")
    private boolean console;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new NVDRSFlatFileRunner()).execute(args); 
        System.exit(exitCode); 
    }

    @Override
    public void run() {
        switch (action) {
            case "example":
                BaseSerializedFormat model = createExampleNVDRSFile(fileType);
                if(console){
                    writeModelToConsole(model);
                    return;
                }
                if(outputFile != null){
                    writeModelToFile(outputFile, model, outputFileType);
                }
                break;
            case "json-to-flat":
                if (inputFile != null && outputFile != null) {
                    jsonToFlat(inputFile, outputFile);
                } else {
                    System.out.println("Input and output files are required for the 'json-to-flat' action.");
                }
                break;
            case "flat-to-json":
                if (inputFile != null && outputFile != null && fileType != null) {
                    flatToJson(inputFile, outputFile, fileType);
                } else {
                    System.out.println("Input file, output file, and fileType are required for the 'flat-to-json' action.");
                }
                break;
            default:
                System.out.println("Unknown action: " + action);
        }
    }

    private BaseSerializedFormat createExampleNVDRSFile(String fileType) {
        // Implementation to create an example NVDRS file
        if(fileType.equalsIgnoreCase("DC")){
            System.out.println("Creating example NVDRS DC file....");
            DCFormat sampleDC = new DCFormat();
            sampleDC.getIncidentYear().setValue(new CharLimitedInteger(2024,4));
            sampleDC.getLast4CharactersOfDC().setValue("1234");
            sampleDC.getLast4CharactersOfCME().setValue("5678");
            sampleDC.getSex().setValue("M");
            sampleDC.getStateOrTerritoryOfDeath().setValue(FIPSCodes.GA);
            sampleDC.getAge().setValue(new CharLimitedInteger(23,2));
            sampleDC.getAgeUnit().setValue(AgeUnits.YEARS);
            sampleDC.getMaritalStatus().setValue(MaritalStatus.MARRIED);
            sampleDC.getHispanicLatinoSpanish1().setValue(Ethnicity.HISPANIC);
            sampleDC.getEducationByNumberOfYears().setValue(new CharLimitedInteger(5,1));
            return sampleDC;
        }
        // Implementation to create an example NVDRS file
        if(fileType.equalsIgnoreCase("LECME")){
            System.out.println("Creating example NVDRS LECME file....");
            LECMEFormat sampleLECME = new LECMEFormat();
            sampleLECME.getIncidentYear().setValue(new CharLimitedInteger(2024,4));
            sampleLECME.getLastFourDCNumber().setValue("1234");
            sampleLECME.getLastFourCMENumber().setValue("5678");
            sampleLECME.getSexVictim().setValue(OneOrZero.ONE);
            sampleLECME.getDeathState().setValue(new CharLimitedInteger(Integer.valueOf(FIPSCodes.GA.getCode()),2));
            sampleLECME.getAge().setValue(new CharLimitedInteger(23,2));
            sampleLECME.getAgeUnit().setValue(AgeUnits.YEARS);
            sampleLECME.getMaritalStatus().setValue(MaritalStatus.MARRIED);
            sampleLECME.getEthnicityVictim().setValue(OneOrZero.ONE);
            sampleLECME.getEducationLevel().setValue(EducationLevel.BACHELORS_DEGREE);
            return sampleLECME;
        }
        return new DCFormat();
    }

    private void writeModelToConsole(BaseSerializedFormat model){
        System.out.println("=========== NVDRS FLATFILE BELOW ==============");
        try {
            PrintWriter outWriter = new PrintWriter(System.out, true);
            model.writeSerializedFormat(outWriter);
            outWriter.close();
        } catch (IOException | RuntimeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void writeModelToFile(File outputFile, BaseSerializedFormat model, String fileType){
        if(fileType.equalsIgnoreCase("flatfile")){
            writeModelToFlatFile(outputFile, model);
        }
        if(fileType.equalsIgnoreCase("json")){
            ObjectNode rootNode = JsonMapping.mapModelToJson(model);
            writeJsonToFile(outputFile, rootNode);
        }
    }

    private void writeModelToFlatFile(File outputFile, BaseSerializedFormat model){
        try {
            System.out.println("Writing flatfile to " + outputFile.getCanonicalPath()+" ....");
            FileWriter fileWriter = new FileWriter(outputFile);
            model.writeSerializedFormat(fileWriter);
            fileWriter.close();
        } catch (IOException | RuntimeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void writeJsonToFile(File outputFile, JsonNode rootNode){
        try {
            System.out.println("Writing json to " + outputFile.getCanonicalPath()+" ....");
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(rootNode.toPrettyString());
            fileWriter.close();
        } catch (IOException | RuntimeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void jsonToFlat(File inputFile, File outputFile) {
        // Implementation to read JSON file and create NVDRS flatfile
        System.out.println("Converting JSON to NVDRS flatfile...");
        try {
            System.out.println("Input file: " + inputFile.getCanonicalPath());
            System.out.println("Output file: " + outputFile.getCanonicalPath());
            Scanner scanner = new Scanner(inputFile);
            scanner.useDelimiter("\\Z");
            String jsonString = scanner.next(); //Get the whole string;
            scanner.close();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(jsonString);
            BaseSerializedFormat model = JsonMapping.readJsonToModel(rootNode);
            model.writeSerializedFormat(new FileWriter(outputFile));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    private void flatToJson(File inputFile, File outputFile, String fileType) {
        // Implementation to read NVDRS flatfile and create JSON file
        System.out.println("Converting NVDRS flatfile to JSON...");
        
        try {
            System.out.println("Input file: " + inputFile.getCanonicalPath());
            System.out.println("Output file: " + outputFile.getCanonicalPath());
            Scanner scanner = new Scanner(inputFile);
            scanner.useDelimiter("\\z");
            String serialString = scanner.next(); //Get the whole string;
            BaseSerializedFormat model = new DCFormat();
            if(fileType.equalsIgnoreCase("DCFormat")){
                model = new DCFormat();
            }
            else if(fileType.equalsIgnoreCase("LECMEFormat")){
                model = new LECMEFormat();
            }
            model.readSerializedFormat(new StringReader(serialString));
            JsonNode rootNode = JsonMapping.mapModelToJson(model);
            writeJsonToFile(outputFile, rootNode);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}