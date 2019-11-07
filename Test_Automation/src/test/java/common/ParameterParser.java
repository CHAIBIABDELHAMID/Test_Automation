package common;
import common.JsonParserclasses.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;



public class ParameterParser {

	public String projectName;
	public String cookieName;
	public String cookieValue;
	public String environment;
	public String path;
	public String userName;
	public String password;
	
	
	
	public void deserializeProjects() {
	
		//Projects projects = new Projects();
	
		Gson gson = new Gson();
		BufferedReader br = null;
		
		try {
			 br = new BufferedReader(new FileReader("src/test/java/ressources/Parameter.json"));
			 Projects projects = gson.fromJson(br, Projects.class);
		
			 if (projects != null) {
					
					for(Project project : projects.getProjects()) {
						
						System.out.println("Project Environments: "+project.getConfiguration().size());
						
					}
			}
			 
			 cookieName = projects.getProjects().get(0).getCookie().getName();
			 cookieValue = projects.getProjects().get(0).getCookie().getValue();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
	}
	
}
