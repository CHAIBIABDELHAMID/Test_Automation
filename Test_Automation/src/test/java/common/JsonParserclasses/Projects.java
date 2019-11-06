package common.JsonParserclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Projects {

@SerializedName("Projects")
@Expose
private List<Project> projects = null;


/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////

public List<Project> getProjects() {
return projects;
}

public void setProjects(List<Project> projects) {
this.projects = projects;
}

}