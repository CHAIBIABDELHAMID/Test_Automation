package common.JsonParserclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoreMenu {

@SerializedName("More_menu")
@Expose
private String moreMenu;

/////////////////////////////////////////////Getter&Setter/////////////////////////////////////////////
public String getMoreMenu() {
return moreMenu;
}

public void setMoreMenu(String moreMenu) {
this.moreMenu = moreMenu;
}

}