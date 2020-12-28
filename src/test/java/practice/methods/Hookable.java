package practice.methods;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import practice.UnitSteps.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\ST\\AP\\practice.html", "automationpractice");
	    HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	    System.out.println("-----------------Scenario Starts-----------");
	}
	@After
	public void after(Scenario scenario)
	{
		System.out.println("-----------------------Scenatio Ends---------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
