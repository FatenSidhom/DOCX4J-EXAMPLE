package docx4jExample;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "doc")
public class ApiController {
    static Logger log = Logger.getLogger(GenerateDocuments.class.getName());

	@PostMapping(value = "/generate")
	void generateDOCDocument (){
		File template= new File("test/TestTemplate.docx");
		String var = "Faten";
		String outputDocument = "test/Output.docx";
		
		HashMap<String, String> parameters = new HashMap<String,String>();
		parameters.put("Name", var);
		parameters.put("Name.upper", var.toUpperCase());
		
		Boolean success = GenerateDocuments.generateDocument(template, parameters, outputDocument);
		if (success == true){
			log.info("generation of file successful");
		}else{
			log.error("generation of file successful");
		}
			
	}   
}
