package com.rai.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rai.model.Student;
import com.rai.repository.StudentRepo;

import lombok.extern.java.Log;



@Component
@Log
public class StartupUtility implements CommandLineRunner {
	
	@Value("${demo.json.string}") private String json;
	@Autowired private StudentRepo repo;
	
	@Override
	public void run(String ...arrs)throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		Student value = mapper.readValue(json, Student.class);
		Student save = repo.save(value);
		
		log.info("Student info " + save.toString());
	}

}
