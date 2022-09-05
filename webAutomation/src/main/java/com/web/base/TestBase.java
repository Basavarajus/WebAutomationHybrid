package com.web.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
		public static WebDriver driver;
	
	public TestBase() throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("/Users/nagarajs/eclipse-workspace/webAutomation/Resources./webAutomation/Resources/properties.txt");
		Properties prop = new Properties();
		
		if(prop.getProperty("driver")=="chrome") {
			System.setProperty("webdriver.chrome.driver", "/");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("driver")== "Firefox") {
			System.setProperty("webdriver.geckodriver", "/Users/nagarajs/eclipse-workspace/webAutomation/Resources");
				driver = new FirefoxDriver();
		}
		else {
			System.out.println("Setting here default browser if property file is having value other than chrme& firefox");
			System.setProperty("driver", "chrome");
		}
	}
	
	
	
	public void initialization() {
		driver.get("https://google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	

	
	public void quite() {
		driver.quit();
	}
	

}
