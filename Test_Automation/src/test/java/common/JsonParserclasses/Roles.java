package common.JsonParserclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Roles {

@SerializedName("Roles")
@Expose
private List<Role> roles = null;

/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////
public List<Role> getRoles() {
return roles;
}

public void setRoles(List<Role> roles) {
this.roles = roles;
}

}