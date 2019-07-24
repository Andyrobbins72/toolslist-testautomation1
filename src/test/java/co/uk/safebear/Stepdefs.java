package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;
    LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setUp(){
        //get the driver for the browser that you defined in driver
        driver = Driver.getDriver();
        //create objects
        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);
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
        //assert that we're on the 'login page'
        assertEquals("We're not on the Login Page","Login Page",loginPage.getPageTitle());
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {

        assertThat("Login failed or the Login Successful message didn't appear",
                toolsPage.checkForLoginSuccessfulMessage(), containsString("Login Successful"));

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
