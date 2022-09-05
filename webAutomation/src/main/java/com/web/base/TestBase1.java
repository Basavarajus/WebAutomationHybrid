package com.web.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
	protected static ExtentReports extent;
	
	public static WebDriver driver;
	
	
	public TestBase1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	
	
	@BeforeTest
	public void startReport(){
	//ExtentReports(String filePath,Boolean replaceExisting)
	//filepath - path of the file, in .htm or .html format - path where your report needs to generate.
	//replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
	//True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
	//False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	//extent.addSystemInfo("Environment","Environment Name")
	
	                extent.addSystemInfo("Host Name", "SoftwareTestingMaterial")
	                .addSystemInfo("Environment", "Automation Testing")
	                .addSystemInfo("User Name", "Rajkumar SM");
	                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	 
	        //This method is to capture the screenshot and return the path of the screenshot.
	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
	}
	public void initialization() {
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/TestScreenshots/"+result.getName()+".png"));
	System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	}
	
	
	@AfterClass
	public void quite() {
		driver.quit();
	}

}
