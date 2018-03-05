package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	 private WebDriver driver;		
   @BeforeTest
   public void beforetest() {
	   System.setProperty("webdriver.gecko.driver", "/home/admin1/Desktop/geckodriver");
	   driver = new FirefoxDriver();
   }
   @AfterTest
   public void aftertest() {
	   driver.quit();	
   }
   @Test
   public void testeasy() {
	   driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
   }
   
}
