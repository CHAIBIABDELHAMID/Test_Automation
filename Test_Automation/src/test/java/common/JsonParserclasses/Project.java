package common.JsonParserclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Project {

	
@SerializedName("ProjectName")
@Expose
private String projectName;

@SerializedName("Cookie")
@Expose
private Cookie cookie;

@SerializedName("Configuration")
@Expose
private List<Configuration> configuration = null;


/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////

public String getProjectName() {
return projectName;
}
public void setProjectName(String projectName) {
this.projectName = projectName;
}


public Cookie getCookie() {
return cookie;
}
public void setCookie(Cookie cookie) {
this.cookie = cookie;
}


public List<Configuration> getConfiguration() {
return configuration;
}
public void setConfiguration(List<Configuration> configuration) {
this.configuration = configuration;
}





}