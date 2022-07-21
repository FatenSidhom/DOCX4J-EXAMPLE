package com.wevioo.generator;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.HashMap;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "doc")
public class ApiController {
    static Logger log = Logger.getLogger(GenerateDocuments.class.getName());

	@PostMapping(value = "/generate")
	public void generateDOCDocument (@RequestBody Model model){
		File template= new File(model.getTemplatePath());
		String outputDocument = model.getOutputPath();
		HashMap<String, String> parameters = new HashMap<String,String>();
		parameters.put("Company", model.getNom());
		parameters.put("Adresse", model.getAdresse());
		parameters.put("Capital", model.getCapital());
		Boolean success = GenerateDocuments.generateDocument(template, parameters, outputDocument);
		if (success == true){
			log.info("generation of file successful");
		}else{
			log.error("generation of file successful");
		}
			
	}   
}
