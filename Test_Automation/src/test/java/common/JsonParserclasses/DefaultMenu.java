package common.JsonParserclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DefaultMenu {

@SerializedName("Default_menu")
@Expose
private String defaultMenu;

/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////
public String getDefaultMenu() {
return defaultMenu;
}

public void setDefaultMenu(String defaultMenu) {
this.defaultMenu = defaultMenu;
}

}