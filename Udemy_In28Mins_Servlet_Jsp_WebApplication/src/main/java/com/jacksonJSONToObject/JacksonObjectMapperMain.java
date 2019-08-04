package com.jacksonJSONToObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonObjectMapperMain {

	public static void main(String[] args) {

		byte[] jsonData;

		//read json file data to String
		try {
			jsonData = Files.readAllBytes(Paths.get("employee.txt"));

			//create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();

			//convert json string to object
			Employee emp = objectMapper.readValue(jsonData, Employee.class);
			
			System.out.println("Employee Object\n"+emp);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
