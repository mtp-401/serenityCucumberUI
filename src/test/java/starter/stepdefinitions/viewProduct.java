package starter.stepdefinitions;

//import actions.common;
//import actions.navigateTo;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class viewProduct {

    @Given("Users search for product")
    public void users_search_product(){
        NavigateTo.homePage();
        LookForInformation.searchFor("apple");
    }

    @When("Users click product")
    public void user_clickProduct(){
        LookForInformation.click("product");
    }

    @Then("User should see the detailed information of product")
    public void user_see_detail(){
        Target detail = Target.the("boxDetailed").locatedBy("//div[@class='box-detail-product__box-left column is-one-third']");
        Target productHeading = Target.the("heading").locatedBy("//h1[contains(text(),'Tai nghe Apple EarPods Lightning (MMTN2) Chính hãn')]");
//        Ensure.that(detail.isVisibleFor(new Actor("users")));
        Ensure.that(productHeading).hasText("Tai nghe Apple EarPods Lightning");
    }

}
