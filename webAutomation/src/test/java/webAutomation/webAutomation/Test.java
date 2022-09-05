package webAutomation.webAutomation;

import java.awt.event.ActionEvent;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nagarajs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phpworld.co.in/");
		driver.manage().window().maximize();
		WebElement service = driver.findElement(By.xpath("//*[@class=\"pull-left\"]"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(service).perform();
//		builder.moveToElement(service).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", service);
		driver.findElement(By.xpath("//*[@href=\"web_designing.php\" and @class=\"btn btn-link hvr-shutter-out-horizontal\"]"));
		Thread.sleep(3000);
		//driver.close();
		
	}

}
