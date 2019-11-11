package common;
import common.JsonParserclasses.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
	
	public String default_menu0;		public String more_menu0;
	public String default_menu1;		public String more_menu1;
	public String default_menu2;		public String more_menu2;
	public String default_menu3;		public String more_menu3;
	public String default_menu4;		public String more_menu4;
	public String default_menu5;		public String more_menu5;
	public String default_menu6;		public String more_menu6;
	public String default_menu7;		public String more_menu7;
	public String default_menu8;		public String more_menu8;
	public String default_menu9;		public String more_menu9;
	
	
	
	
	
	
	
	
	public void deserializeProjects(String jsonProject, String jsonEnvironment) {
	
		
		
	
		Gson gson_projects = new Gson();
		BufferedReader br_projects = null;
		Projects projects = null;
		
		
		//Reading Json file
		try {
				br_projects = new BufferedReader(new FileReader("src/test/java/ressources/Parameter.json"));
				projects = gson_projects.fromJson(br_projects, Projects.class);
			
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
	
	
	
	
	
	public void deserializeMenus(String jsonRole) {
		
		
		
		
		Gson gson_menus = new Gson();
		BufferedReader br_menus = null;
		Menus menus = null;
		
		
		//Reading Json file
		try {
				br_menus = new BufferedReader(new FileReader("src/test/java/ressources/Menu.json"));
				menus = gson_menus.fromJson(br_menus, Menus.class);
			
				if (menus != null) {for(Menu menu : menus.getMenu());}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		int roleIndex = 0;
		do {
			 if (menus.getMenu().get(roleIndex).getRole().toLowerCase().equals(jsonRole.toLowerCase())) {
				
				role = menus.getMenu().get(roleIndex).getRole();
				default_menu0 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu0();
				default_menu1 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu1();
				default_menu2 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu2();
				default_menu3 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu3();
				default_menu4 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu4();
				default_menu5 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu5();
				default_menu6 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu6();
				default_menu7 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu7();
				default_menu8 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu8();
				default_menu9 	= menus.getMenu().get(roleIndex).getDefaultMenu().getNavbarMenu9();
				
				more_menu0 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu0();
				more_menu1 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu1();
				more_menu2 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu2();
				more_menu3 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu3();
				more_menu4 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu4();
				more_menu5 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu5();
				more_menu6 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu6();
				more_menu7 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu7();
				more_menu8 		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu8();
				more_menu9		= menus.getMenu().get(roleIndex).getMoreMenu().getMoreMenu9();
				
				 	
			 }else roleIndex ++ ;
		 }while(menus.getMenu().size() > roleIndex && role == null);
		 
		
	
	}


	
	
}
