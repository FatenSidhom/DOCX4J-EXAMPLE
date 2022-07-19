package docx4jExample;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.HashMap;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "doc")
public class ApiController {
    static Logger log = Logger.getLogger(GenerateDocuments.class.getName());

	@PostMapping(value = "/generate")
	public void generateDOCDocument (@RequestParam String nom,@RequestParam String templatePath, @RequestParam String outputPath){
		File template= new File(templatePath);
		String outputDocument = outputPath;
		HashMap<String, String> parameters = new HashMap<String,String>();
		parameters.put("Name", nom);
		parameters.put("Name.upper", nom.toUpperCase());
		
		Boolean success = GenerateDocuments.generateDocument(template, parameters, outputDocument);
		if (success == true){
			log.info("generation of file successful");
		}else{
			log.error("generation of file successful");
		}
			
	}   
}
