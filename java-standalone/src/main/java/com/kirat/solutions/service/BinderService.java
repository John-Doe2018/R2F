package com.kirat.solutions.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.transform.TransformerException;

import com.kirat.solutions.domain.CreateBinderRequest;

public class BinderService {

	
	@POST
	@Path("create")
	public String createBinder(CreateBinderRequest createBinderRequest) throws TransformerException {
		String binderName = createBinderRequest.getBinderName();
		String htmlContent = createBinderRequest.getHtmlContent();
		String classification =  createBinderRequest.getClassification();
		
		//append in MasterJson 
		
		return null;
	}
}
