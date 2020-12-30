package MAIN;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class MainClassHomeDepot {
  
	public WebDriver driver;
	@Parameters({"URL"})
  @BeforeClass
  public void beforeClass(String URL) {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/kali/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
}
  }


