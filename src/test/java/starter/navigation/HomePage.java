package starter.navigation;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://cellphones.com.vn/")
public class HomePage extends PageObject {
    public static Target txtSearchBox = Target.the("txtSearchBox").locatedBy("//input[@id='inp$earch']");
}
