package common.JsonParserclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

	
@SerializedName("RoleName")
@Expose
private String roleName;

@SerializedName("DefaultMenu")
@Expose
private List<DefaultMenu> defaultMenu = null;

@SerializedName("MoreMenu")
@Expose
private List<MoreMenu> moreMenu = null;


/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////
public String getRoleName() {
return roleName;
}

public void setRoleName(String roleName) {
this.roleName = roleName;
}

public List<DefaultMenu> getDefaultMenu() {
return defaultMenu;
}

public void setDefaultMenu(List<DefaultMenu> defaultMenu) {
this.defaultMenu = defaultMenu;
}

public List<MoreMenu> getMoreMenu() {
return moreMenu;
}

public void setMoreMenu(List<MoreMenu> moreMenu) {
this.moreMenu = moreMenu;
}

}