package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^select the browser type to open$")
	public void select_the_browser_type_to_open() throws Throwable {
	    System.out.println("Select the browser to open");
	}

	@When("^browser is triggered$")
	public void browser_is_triggered() throws Throwable {
	   System.out.println("Trigger the browser");
	}

	@Then("^verify if browser is displayed$")
	public void verify_if_browser_is_displayed() throws Throwable {
	    System.out.println("Verify the browser is launched successfully.");
	}
	
    @Given("^MdesManager is launched in Chrome browser$")
    public void mdesmanager_is_launched_in_chrome_browser() throws Throwable {
        System.out.println("Launch application on chrome browser.");
    }

    @When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" and click login$")
    public void user_enters_username_and_password_and_click_login(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username is: " + arg1);
        System.out.println("password is: " + arg2);
    }

    @Then("^Login should be successful$")
    public void login_should_be_successful() throws Throwable {
        System.out.println("Verifying the login status");
    }

    @Then("^Project Dashboard page displayed is \"([^\"]*)\"$")
    public void project_Dashboard_page_displayed_is(String arg1) throws Throwable {
        System.out.println("result is: " + arg1);
    }
    
    @When("^User enters below details for SignUp$")
    public void user_enters_below_details_for_SignUp(DataTable data) throws Throwable {
        List<List<String>> obj = data.raw();
        System.out.println("Username is: " + obj.get(0).get(0));
        System.out.println("Password is: " + obj.get(0).get(1));
        System.out.println("Email id is: " + obj.get(0).get(2));
    }
    
    @When("^User enters (.+) and (.+) on login page and click login$")
    public void user_enter_credentials_and_click_login(String username, String password) throws Throwable {
        System.out.println("username is: " + username);
        System.out.println("password is: " + password);
    }

}