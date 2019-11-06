
package common.JsonParserclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Configuration {

@SerializedName("Environment")
@Expose
private String environment;

@SerializedName("Path")
@Expose
private String path;

@SerializedName("Username")
@Expose
private String username;

@SerializedName("Password")
@Expose
private String password;


/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////

public String getEnvironment() {
return environment;
}
public void setEnvironment(String environment) {
this.environment = environment;
}


public String getPath() {
return path;
}
public void setPath(String path) {
this.path = path;
}


public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}



public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}






}