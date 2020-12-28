package practice.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	public static Hashtable<String,Object> browserLaunch(Object[] inputpara)
	{
		try {
		String webdrive=(String) inputpara[0];
		String exefile=(String) inputpara[1];
		
		if(webdrive.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exefile);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(webdrive.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exefile);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Browser launch,input data:" +inputpara[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:Browser launch,input data:" +inputpara[0].toString());
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return outputParameters;
	}
	public static Hashtable<String, Object> openApplication(Object[] inputpara) throws Exception
	{
		try {
		String url=(String) inputpara[0];
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:openApplication,input data:" +inputpara[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:openApplication,input data:" +inputpara[0].toString());
		
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> sendKeys(Object[] inputpara) throws Exception
	{
		try {
		String xpath=(String) inputpara[0];
		String value=(String) inputpara[1];
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:sendkeys,input data:" +inputpara[1].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:sendkeys,input data:" +inputpara[1].toString());
			
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> click(Object[] inputpara) throws Exception
	{
		try {
		String xpath=(String) inputpara[0];
		
		driver.findElement(By.xpath(xpath)).click();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:click,input data:" +inputpara[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:click,input data:" +inputpara[0].toString());
		}
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return outputParameters;
	}
	public static void click1(Object[] inputpara) throws Exception
	{
		try {
		String text=(String) inputpara[0];
		
		driver.findElement(By.linkText(text)).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public static void dropDown(Object[] inputpara) throws Exception
	{
		try {
		String xpath=(String) inputpara[0];
		String text=(String) inputpara[1];
		
		Select abc=new Select(driver.findElement(By.xpath(xpath)));
		abc.selectByVisibleText(text);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void mouse(Object[] inputpara)
	{
		try {
		String xpath=(String) inputpara[0];
		String xpath1=(String) inputpara[1];
		String value=(String) inputpara[2];
		
		Actions xyz=new Actions(driver);
		xyz.doubleClick(driver.findElement(By.xpath(xpath))).build().perform();
		
		driver.findElement(By.xpath(xpath1)).sendKeys(value);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	}
	public static Hashtable<String, Object> Validation()
	{
		String Title = null;
		try {
		Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equalsIgnoreCase("Addresses - My Store"))
		{
			System.out.println("Test case is passed");
		}else 
		{
			System.out.println("Test case is failed");
			
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:validation,input data:" + Title);
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:validation,input data:" + Title);
		}
		return outputParameters;
		
	}
	
	

}
