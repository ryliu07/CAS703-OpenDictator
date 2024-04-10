package org.xtext.example.openDictatorDsl.validation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonHelper {

    public JsonNode getRootNode(String jsonFilePath) {
    	try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(new File(jsonFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return null;
    }

    public Boolean isValidJson(String jsonFilePath) {
    	try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readTree(new File(jsonFilePath));
        } catch (Exception e) {
            return false;
        }
    	return true;
    }
}