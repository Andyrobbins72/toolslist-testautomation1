package co.uk.safebear;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

    @Given("I am logged out")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is unsuccessful")
    public void the_user_is_informed_that_the_login_is_unsuccessful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("i enter a username {string} only")
    public void i_enter_a_username_only(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the password is required")
    public void the_user_is_informed_that_the_password_is_required() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
