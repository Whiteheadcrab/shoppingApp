package whiteheadcrab.springframework.shoppingApp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSteps {

    @Before("@Login")
    public void beforeScenario()
    {
        System.out.println("This is before hook");
    }

    @After("@Login")
    public void afterScenrario()
    {
        System.out.println("This is after scenario");
    }

    @Given("User launch application")
    public void userLaunchApplication()
    {
        System.out.println("User launch application");
    }

    @Then("^User enter correct username and password$")
    public void userEnterCorrectUsernameAndPassword()
    {
        System.out.println("User enter correct username and password");
    }

    @And("^Clicked on Login Button$")
    public void clickedOnLoginButton()
    {
        System.out.println("Clicked on Login Button");
    }

    @Then("^User login into application$")
    public void userLoginIntoApplication()
    {
        System.out.println("User login into application");
    }

    @Given("User launch Chrome browser")
    public void userLaunchChromeBrowser()
    {
        System.out.println("User launch Chrome browser");
    }
}
