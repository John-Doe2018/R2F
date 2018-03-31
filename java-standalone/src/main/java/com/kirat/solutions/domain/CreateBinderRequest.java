package com.kirat.solutions.domain;

import java.util.List;

public class CreateBinderRequest {

	String binderName;
	String classification;
	String htmlContent; 

	public String getBinderName() {
		return binderName;
	}
	public void setBinderName(String binderName) {
		this.binderName = binderName;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getHtmlContent() {
		return htmlContent;
	}
	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}


}
