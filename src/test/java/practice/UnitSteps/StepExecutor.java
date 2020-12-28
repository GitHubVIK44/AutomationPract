package practice.UnitSteps;

import practice.methods.SeleniumOperations;

public class StepExecutor 
{
	public static void main(String[] args) throws Exception 
	{
		Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="E:\\ST\\Selenium\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		Object[] input1=new Object[1];
		input1[0]="http://automationpractice.com/index.php?controller=authentication&back=addresses";
		SeleniumOperations.openApplication(input1);
		
		Object[] input2=new Object[2];
		input2[0]="//*[@id='email']";
		input2[1]="manojvip259@gmail.com";
		SeleniumOperations.sendKeys(input2);
		
		Object[] input3=new Object[2];
		input3[0]="//*[@id='passwd']";
		input3[1]="practicevik";
		SeleniumOperations.sendKeys(input3);
		
		Object[] input4=new Object[1];
		input4[0]="//*[@class='icon-lock left']";
		SeleniumOperations.click(input4);
		
		Object[] input5=new Object[1];
		input5[0]="My addresses";
		SeleniumOperations.click1(input5);
		
		Object[] input6=new Object[1];
		input6[0]="Update";
		SeleniumOperations.click1(input6);
		
		Object[] input7=new Object[2];
		input7[0]="//*[@id='id_state']";
		input7[1]="Colorado";	
		SeleniumOperations.dropDown(input7);
		
		Object[] input8=new Object[3];
		input8[0]="//*[@id='postcode']";
		input8[1]="//*[@id='postcode']";
		input8[2]="80533";
		SeleniumOperations.mouse(input8);
		
		Object[] input9=new Object[1];
		input9[0]="//*[@id='submitAddress']";
		SeleniumOperations.click(input9);
			
		
	}

}
