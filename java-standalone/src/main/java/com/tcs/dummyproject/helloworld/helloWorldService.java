package com.tcs.dummyproject.helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.codehaus.jackson.map.ObjectMapper;

import com.kirat.solutions.domain.BinderList;

public class helloWorldService {
	@GET
	@Path("sayHello")
	public String getConfigurationParameterValue() {
		return "Hello World";
	}
	
	@GET
	@Path("getMasterJson")
	public String getMasterJson() throws FileNotFoundException {

		FileReader reader=new FileReader("FileInfo.properties");  
	      
	    Properties p=new Properties();  
	    try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String filePath = p.getProperty("masterjson.file.path");
	    
		return filePath;  
		
		
		
	}
	
	public String readJson(String filePath){
		/*byte[] jsonData = Files.;
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		BinderList emp = objectMapper.readValue(jsonData, BinderList.class);
		
		System.out.println("Employee Object\n"+emp);
		
		//convert Object to json string
		BinderList emp1 = createEmployee();
		//configure Object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, emp1);
		System.out.println("Employee JSON is\n"+stringEmp);
	}*/
		return filePath;
		
		
	}
	
	
}
