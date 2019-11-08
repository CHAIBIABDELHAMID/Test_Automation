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
	
	
	
	public void deserializeProjects(String jsonProject, String jsonEnvironment) {
	
		
	
		Gson gson = new Gson();
		BufferedReader br = null;
		Projects projects = null;
		
		
		//Reading Json file
		try {
				br = new BufferedReader(new FileReader("src/test/java/ressources/Parameter.json"));
				projects = gson.fromJson(br, Projects.class);
			
				if (projects != null) {for(Project project : projects.getProjects());}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		 
		
		 int projectIndex = 0;
		 int configurationIndex = 0;
		 //Searching for the Project
		 do {
			 if (projects.getProjects().get(projectIndex).getProjectName().toString().toLowerCase().equals(jsonProject.toLowerCase())) {
				  projectName =	projects.getProjects().get(projectIndex).getProjectName();
				 cookieName =	projects.getProjects().get(projectIndex).getCookie().getName();
				 cookieValue =	projects.getProjects().get(projectIndex).getCookie().getValue();	 
				 	
				 
				 //Searching for the Environment
				 	do {
				 		if(projects.getProjects().get(projectIndex).getConfiguration().get(configurationIndex).getEnvironment().toString().toLowerCase().equals(jsonEnvironment.toLowerCase())) {
				 			environment=	projects.getProjects().get(projectIndex).getConfiguration().get(configurationIndex).getEnvironment();
				 			path=			projects.getProjects().get(projectIndex).getConfiguration().get(configurationIndex).getPath();
				 			userName=		projects.getProjects().get(projectIndex).getConfiguration().get(configurationIndex).getUsername();
				 			password=		projects.getProjects().get(projectIndex).getConfiguration().get(configurationIndex).getPassword();
				 	
				 		}else configurationIndex ++ ;
				 	}while(projects.getProjects().get(projectIndex).getConfiguration().size() > configurationIndex && environment == null);
				 	
				 	
			 }else projectIndex ++ ;
		 }while(projects.getProjects().size() > projectIndex && projectName == null);
		 
		
		 
		
		
		
		
		
		
		
	
	}

	
	
}
