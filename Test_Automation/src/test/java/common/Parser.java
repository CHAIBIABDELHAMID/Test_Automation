package common;
import common.JsonParserclasses.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;



public class Parser {

	
//					deserializeProjects variables					//
	public String projectName;
	public String cookieName;
	public String cookieValue;
	public String environment;
	public String path;
	public String userName;
	public String password;

	
	
//					deserializeMenus variables						//
	public String role;
	
	public List<String> default_menu = new ArrayList<String>();
	public List<String> more_menu = new ArrayList<String>() ;
	
	
	
	
	
	
	
	
	public void deserializeProjects(String jsonProject, String jsonEnvironment) {
	
		
		
	
		Gson gson_projects = new Gson();
		BufferedReader br_projects = null;
		Projects projects = null;
		
		
		//Reading Json file
		try {
				br_projects = new BufferedReader(new FileReader("src/test/java/ressources/Parameter.json"));
				projects = gson_projects.fromJson(br_projects, Projects.class);
			
				//if (projects != null) {for(Project project : projects.getProjects());}

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
	
	
	
	public void deserializeMenu(String jsonRole) {
		
		Gson gson_roles = new Gson();
		BufferedReader br_roles = null;
		Roles roles = null;
		
		//Reading Json file
				try {
						br_roles = new BufferedReader(new FileReader("src/test/java/ressources/Menu.json"));
						roles = gson_roles.fromJson(br_roles, Roles.class);
					
					

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		
				
		int rolesIndex = 0;
		
		do {
			
			if(roles.getRoles().get(rolesIndex).getRoleName().toLowerCase().equals(jsonRole.toLowerCase())) {
				
				int menuSize = roles.getRoles().get(rolesIndex).getDefaultMenu().size();
				for(int i = 0; i < menuSize ; i++) {
					if (!roles.getRoles().get(rolesIndex).getDefaultMenu().get(i).getDefaultMenu().equalsIgnoreCase("N/A"))
					default_menu.add(i, roles.getRoles().get(rolesIndex).getDefaultMenu().get(i).getDefaultMenu());
					if(!roles.getRoles().get(rolesIndex).getMoreMenu().get(i).getMoreMenu().equalsIgnoreCase("N/A"))
					more_menu.add(i, roles.getRoles().get(rolesIndex).getMoreMenu().get(i).getMoreMenu());
				}
				
				
			}else rolesIndex ++;
			
		}while(roles.getRoles().size() > rolesIndex && default_menu.isEmpty());
	
		
	
	}
	
	
	
	


	
	
}