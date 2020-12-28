package practice.methods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Address {
	@When("^user clicks on my addresses$")
	public void user_clicks_on_my_addresses() throws Throwable 
	{
		Object[] input5=new Object[1];
		input5[0]="My addresses";
		SeleniumOperations.click1(input5);
	    
	}

	@When("^user clicks on update$")
	public void user_clicks_on_update() throws Throwable 
	{
		Object[] input6=new Object[1];
		input6[0]="Update";
		SeleniumOperations.click1(input6);	
	}

	@When("^user selects \"([^\"]*)\" under state$")
	public void user_selects_under_state(String arg1) throws Throwable 
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@id='id_state']";
		input7[1]="Colorado";	
		SeleniumOperations.dropDown(input7);    
	}


	@When("^user enters \"([^\"]*)\" as zipcode$")
	public void user_enters_as_zipcode(String arg1) throws Throwable 
	{
		Object[] input8=new Object[3];
		input8[0]="//*[@id='postcode']";
		input8[1]="//*[@id='postcode']";
		input8[2]="80533";
		SeleniumOperations.mouse(input8);
	}

	@When("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable 
	{
		Object[] input9=new Object[1];
		input9[0]="//*[@id='submitAddress']";
		SeleniumOperations.click(input9);
	}

	@Then("^user is on Addresses-My Store page$")
	public void user_is_on_Addresses_My_Store_page() throws Throwable 
	{
	    SeleniumOperations.Validation();
	}

}
