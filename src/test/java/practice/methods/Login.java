package practice.methods;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import practice.UnitSteps.HTMLReportGenerator;

public class Login {

	@Given("^User opens \"([^\"]*)\" browser using exe file \"([^\"]*)\"$")
	public void user_opens_browser_using_exe_file(String arg1, String arg2) throws Throwable 
	{
		Object[] input=new Object[2];
		input[0]=arg1;
		input[1]=arg2;
		SeleniumOperations.browserLaunch(input);
	    
	}

	@Given("^User opens website using url$")
	public void user_opens_website_using_url() throws Throwable 
	{
		Object[] input1=new Object[1];
		input1[0]="http://automationpractice.com/index.php?controller=authentication&back=addresses";
		SeleniumOperations.openApplication(input1);
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable 
	{
		Object[] input2=new Object[2];
		input2[0]="//*[@id='email']";
		input2[1]=arg1;
		Hashtable<String,Object>input2op=SeleniumOperations.sendKeys(input2);
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"^user enters \"([^\"]*)\" as username$" , input2op.get("MESSAGE").toString());   
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable 
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@id='passwd']";
		input3[1]=arg1;
		Hashtable<String,Object>input3op=SeleniumOperations.sendKeys(input3);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(), "^user enters \"([^\"]*)\" as password$", input3op.get("MESSAGE").toString());
	    
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable 
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@class='icon-lock left']";
		Hashtable<String,Object>input4op=SeleniumOperations.click(input4);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(), "^user clicks on login button$", input4op.get("MESSAGE").toString());
	    
	}

	@Then("^user is on my account page$")
	public void user_is_on_account_details_page() throws Throwable 
	{
		Hashtable<String,Object>input5op=SeleniumOperations.Validation();
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"^user is on my account page$" , input5op.get("MESSAGE").toString());
	    
	}
}
