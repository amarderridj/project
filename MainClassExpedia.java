package MAIN;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainClassExpedia {
	public WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
	}
	
  @Test(enabled =false)
  public void f() {
	  
	  
  }
}
