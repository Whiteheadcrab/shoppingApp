package whiteheadcrab.springframework.shoppingApp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingSteps {

    @Given("^User start the application$")
    public void userStartApp() {
        System.out.println("I start an application");
    }

    @Then("^In basket should be see selection of products$")
    public void userViewBasketSelectionOfProducts()
    {
        System.out.println("In basket should be see selection of products");
    }

    @When("User browse basket {string} buying product")
    public void userBrowseBasketBuyingProduct(String data)
    {
        System.out.println("User browse basket "+data+" buying product");
    }

    @Then("User's basket should {string} be empty")
    public void userSBasketShouldBeEmpty(String data)
    {
        System.out.println("User's basket should "+data+" be empty");
    }

    @And("User {string} buy an item")
    public void userBuyAnItem(String action)
    {
        System.out.println("User "+action+" buy an item");
    }

    @Then("In shop should be see selection of products")
    public void inShopShouldBeSeeSelectionOfProducts()
    {
        System.out.println("In shop should be see selection of products");
    }


    @When("User browse shop with items")
    public void userBrowseShopWithItems() {
        System.out.println("User browse shop with items");
    }

    @Then("Shop has several items")
    public void shopHasSeveralItems() {
        System.out.println("Shop has several items");
    }

    @When("User add item {string}")
    public void userAddItem(String itemName) {
        System.out.println("User add item "+itemName);
    }
}
