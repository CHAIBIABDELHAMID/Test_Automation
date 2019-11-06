package common;
import common.JsonParserclasses.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;



public class ParameterParser {

	
	
	
	public void deserializeProjects() {
	
		//Projects projects = new Projects();
	
		Gson gson = new Gson();
		BufferedReader br = null;
		
		try {
			 br = new BufferedReader(new FileReader("src/test/java/ressources/Parameter.json"));
			 Projects projects = gson.fromJson(br, Projects.class);
		
		if (projects != null) {
			
				for(Project project : projects.getProjects()) {
					
					System.out.println("Project Name: "+project.getProjectName()+"Environment"+project.getConfiguration().get(0).getEnvironment());
					
				}
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
	}
	
}
