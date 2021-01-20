package stepDefenitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefenetion {
	
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
       System.out.println("validating browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	 System.out.println("browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
   	 System.out.println("browser is started");

    }
    
    @Given("^User is in NetBanking landing page$")
    public void user_is_in_netbanking_landing_page() throws Throwable {
        System.out.println("Test1");
    }

    @When("^User login into application with \"([^\"]*)\" name and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_name_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Username is "+ strArg1);
    	System.out.println("password is "+ strArg2);
    }

    @Then("^Home Page is Populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Test3");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
System.out.println("is cards displayed ? "+ strArg1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List<List<String>> obj=data.asLists();
    
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) name and (.+)$")
    public void user_login_into_application_with_name_and(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
    }

}
