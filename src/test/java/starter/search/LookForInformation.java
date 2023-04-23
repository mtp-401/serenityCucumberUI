package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.navigation.HomePage;

public class LookForInformation {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(SearchForm.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable searchFor(String productToSearch) {
        return Task.where("{0} searches for '" + productToSearch + "'",
                Enter.theValue(productToSearch)
                        .into(HomePage.txtSearchBox)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable click(String itemInteract){
        return Task.where("Users click" + itemInteract,
                Click.on("//img[@alt='Tai nghe Apple EarPods Lightning (MMTN2) Chính hãng Apple Việt Nam']"));
    }
}
