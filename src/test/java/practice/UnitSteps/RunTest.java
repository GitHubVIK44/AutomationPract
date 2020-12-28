package practice.UnitSteps;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions
               (
            	 plugin="pretty",
            	 features="src/test/resources/BUSINESS_LOGIC",
                 tags="@SmokeTest",
            	 glue="practice.methods",
            	 monochrome=true
            	 	 	   
               )

public class RunTest 
{
	

}
