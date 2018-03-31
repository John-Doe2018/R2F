package com.kirat.solutions.processor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.print.DocFlavor.STRING;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.kirat.solutions.Constants.BinderConstants;

public class TransformationProcessor {

	public String processHtmlToBinderXml (String htmlContent) throws TransformerException{
		//Create xml with the help xslt transformer
		String sucessMsg = BinderConstants.SUCCESS_MSG;
		InputStream contentStream = new ByteArrayInputStream(htmlContent.getBytes(StandardCharsets.UTF_8));
		
		 TransformerFactory factory = TransformerFactory.newInstance();
	        Source xslt = new StreamSource(new File("transform.xslt"));
	        Transformer transformer = factory.newTransformer(xslt);

	        Source text = new StreamSource(contentStream);
	        
	        transformer.transform(text, new StreamResult(new File("output.xml")));
		
		return sucessMsg;
		
	}
}
