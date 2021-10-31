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

    @When("User browse basket without buying product")
    public void userViewBasketNoProducts()
    {
        System.out.println("User browse basket without buying product");
    }

    @Then("User's basket should not be empty")
    public void userViewBasketNotEmpty()
    {
        System.out.println("User's basket should not be empty");
    }

    @And("User can buy an item")
    public void userCanBuyItem()
    {
        System.out.println("User can buy an item");
    }

    @When("^User browse basket with buying product$")
    public void userViewBasketWithProducts()
    {
        System.out.println("User browse basket with buying product");
    }

    @Then("^User's basket should be empty$")
    public void userViewBasketEmpty()
    {
        System.out.println("User's basket should be empty");
    }

    @And("^User cannot buy an item$")
    public void userCannotBuyItem()
    {
        System.out.println("User cannot buy an item");
    }

}
