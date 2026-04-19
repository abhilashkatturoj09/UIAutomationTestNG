package stepDefinitions;

import RunTime.SharedDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login {

    @Given("login url")
    public void login_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("in url");
    }

    @When("enter username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("in username");
    }

    @When("enter password")
    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("in password");

    }

    @Then("Login to home page")
    public void login_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("in homepage");
//        Assert.fail("failed");

    }

}
