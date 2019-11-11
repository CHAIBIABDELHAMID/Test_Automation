package common.JsonParserclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Menu {

@SerializedName("Role")
@Expose
private String role;
@SerializedName("DefaultMenu")
@Expose
private DefaultMenu defaultMenu;
@SerializedName("MoreMenu")
@Expose
private MoreMenu moreMenu;

public String getRole() {
return role;
}

public void setRole(String role) {
this.role = role;
}

public DefaultMenu getDefaultMenu() {
return defaultMenu;
}

public void setDefaultMenu(DefaultMenu defaultMenu) {
this.defaultMenu = defaultMenu;
}

public MoreMenu getMoreMenu() {
return moreMenu;
}

public void setMoreMenu(MoreMenu moreMenu) {
this.moreMenu = moreMenu;
}

}