package com.rai;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();

			Employee employee = new Employee("Santosh", "Chandragadi", "Sports", "Striker");

			objectMapper.writeValue(new File("target/emp.json"), employee);

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}

}
