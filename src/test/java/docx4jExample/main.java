package docx4jExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.HashMap;
@SpringBootApplication
public class main {

	public static void main(final String[] args) { SpringApplication.run(main.class, args);
		
		//Try with test/test.txt
		File template= new File("test/TestTemplate.docx");
		String var = "Faten";
		String outputDocument = "test/Output.docx";
		
		HashMap<String, String> parameters = new HashMap<String,String>();
		parameters.put("Name", var);
		parameters.put("Name.upper", var.toUpperCase());
		
		GenerateDocuments.generateDocument(template, parameters, outputDocument);

	}

}
