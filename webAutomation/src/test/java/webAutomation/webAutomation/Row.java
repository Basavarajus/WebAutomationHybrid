package webAutomation.webAutomation;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.web.base.TestBase;
import com.web.base.TestBase1;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Row extends TestBase1{
	
	
	
	static ExtentTest logger;

	
	public Row() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@org.testng.annotations.Test(enabled = true)
	public static void print() {
		
		
//		WebDriverManager.chromedriver().setup();
//		//System.setProperty("webdriver.chrome.driver", "/Users/nagarajs/Desktop/chromedriver");
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> Theader = driver.findElements(By.xpath("//*[@id=\"customers\"]//th"));
		
		for(WebElement header : Theader) {
			System.out.println(header.getText());
			
		}
		
		logger = extent.startTest("TestPass");
		Assert.assertEquals(Theader.size(),2);
		logger.log(LogStatus.PASS, "Test Cases is passed for the size of the element");
		
		
		driver.quit();
	}
	
	@org.testng.annotations.Test(enabled = true)
	public void FindValueinTable() {
		List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr//td"));
		String ExpectedItem = "Giovanni Rovelli";
		boolean result = false;
		for(WebElement item: items) {
			if(item.getText().equalsIgnoreCase("Giovanni Rovelli")) {
				result=true;
			}
			else {
				result =false;
			}
		Assert.assertTrue(result);
			
		}
		
	}

}
