package co.uk.safebear;

import co.uk.safebear.utils.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    @Before
    public void setUp(){
        //get the driver for the browser that you defined in driver
        driver = Driver.getDriver();
        //navigate to the url you defined in driver
        driver.get(Driver.getUrl());
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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
    public void i_enter_a_username_only(String username) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the password is required")
    public void the_user_is_informed_that_the_password_is_required() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I search for tool {string}")
    public void i_search_for_tool(String toolname) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is shown the tools that match")
    public void the_user_is_shown_the_tools_that_match() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that no tools are found")
    public void the_user_is_informed_that_no_tools_are_found() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I add a new tool")
    public void i_add_a_new_tool_called(String newtool) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the new tool is successfully created")
    public void the_new_tool_is_successfully_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I delete a new tool")
    public void i_delete_tool(String newtool) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the tool is successfully deleted")
    public void the_tool_is_successfully_deleted_from_my_toolslist() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
