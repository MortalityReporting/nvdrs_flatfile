package edu.gatech.mapping;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import edu.gatech.model.BaseSerializedFormat;
import edu.gatech.model.DCFormat;
import edu.gatech.model.LECMEFormat;
import edu.gatech.model.SerialField;
import edu.gatech.model.enumvalueset.BaseSerialEnum;

public class JsonMapping {

    public static ObjectNode mapModelToJson(BaseSerializedFormat baseModel) {
        ObjectNode returnNode = JsonNodeFactory.instance.objectNode();
        ArrayNode schemaReport = JsonNodeFactory.instance.arrayNode();
        ArrayNode errors = JsonNodeFactory.instance.arrayNode();
        if(!baseModel.ordered){
            try{
                baseModel.organizeFields();
            }
            catch(IllegalArgumentException | IllegalAccessException e){
                errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
            }
        }
        if(baseModel instanceof DCFormat){
            returnNode.put("version", "2024");
            returnNode.put("type", "DCFormat");
            returnNode.put("length", "3921");
        }
        else if(baseModel instanceof LECMEFormat){
            returnNode.put("version", "2024");
            returnNode.put("type", "LECMEFormat");
            returnNode.put("length", "1985");
        }
        for(SerialField sf:baseModel.orderedSerialFieldList){
            ObjectNode fieldNode = JsonNodeFactory.instance.objectNode();
            fieldNode.put("name", sf.getName());
            fieldNode.put("firstColumn", sf.getFirstColumn());
            fieldNode.put("lastColumn", sf.getLastColumn());
            fieldNode.put("value", sf.getValue() != null ? sf.getValue().toString() : "");
            schemaReport.add(fieldNode);
        }
        returnNode.set("data", schemaReport);
        try{
            StringWriter stringWriter = new StringWriter();
            baseModel.writeSerializedFormat(stringWriter);
            returnNode.put("serializedFormat", stringWriter.toString());
        }
        catch(IOException e){
            errors.add(JsonNodeFactory.instance.textNode(e.getMessage()));
        }
        returnNode.set("errors", errors);
        return returnNode;
    }

    /**
     * Read json object as written in "mapToJson" to change back into a model class.
     * @param rootNode
     * @return
     */
    public static BaseSerializedFormat readJsonToModel(JsonNode rootNode){
        BaseSerializedFormat returnModel = new DCFormat();
        if(rootNode.get("type").asText().equalsIgnoreCase("DCFormat")){
            returnModel = new DCFormat();
        }
        else if(rootNode.get("type").asText().equalsIgnoreCase("LECMEFormat")){
            returnModel = new LECMEFormat();
        }
        try {
            returnModel.organizeFields();
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException("Something is wrong with the data model when trying to organize fields" + e.getMessage());
        }
        String serializeString = mapJsonToSerialField(rootNode);
        try {
            returnModel.readSerializedFormat(new StringReader(serializeString));
        } catch (IOException | RuntimeException e) {
            throw new RuntimeException("Could not read serialized string to model." + e.getMessage());
        }
        return returnModel;
    }

    public static String mapJsonToSerialField(JsonNode rootNode){
        List<JsonNode> entriesSorted = sortJsonByFirstColumn(rootNode);
        String returnString = "";
        for(JsonNode entryNode:entriesSorted){
            int firstColumn = entryNode.get("firstColumn").asInt();
            int lastColumn = entryNode.get("lastColumn").asInt();
            int length = lastColumn - firstColumn + 1;
            String formatString = "%"+length+"s"; //Should look like '%4s' or "4 length of string". Left padding happens automatically
            String serializedField = String.format(formatString, entryNode.get("value").asText());
            returnString = returnString + serializedField;
        }
        return returnString;
    }

    private static List<JsonNode> sortJsonByFirstColumn(JsonNode rootNode){
        List<JsonNode> listOfEntryNodes = rootNode.get("schemaReport").findParents("firstColumn");
        return listOfEntryNodes.stream()
            .sorted(Comparator.comparing(entry -> entry.get("firstColumn").asInt()))
            .collect(Collectors.toList());
    }
}