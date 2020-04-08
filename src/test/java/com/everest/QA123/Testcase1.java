package com.everest.QA123;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agadiyappanavar\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
  public void test1() {
	  driver.navigate().to("https://automationtalks.com/");
	  System.out.println("Test 1 title is" +driver.getTitle());
  }
  
  public void test2() {
	  driver.navigate().to("https://automationtalks.com/");
	  System.out.println("Test 1 title is" +driver.getTitle());
	  
  }
  
  public void test3() {
	  driver.navigate().to("https://automationtalks.com/");
	  System.out.println("Test 1 title is" +driver.getTitle());
	  
  }
  
  @AfterMethod
  public void quit() {
	  driver.quit();
  }
}
