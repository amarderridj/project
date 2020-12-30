package Expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeExp {
	public WebDriver driver;
	
	@FindBy(xpath="(//li[@class='uitk-tab uitk-tab-icon-text '])[1]")
	WebElement flight;
	//@FindBy(xpath="(//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder'])[1]")
	@FindBy(xpath="//*[@aria-label='Leaving from']")
	WebElement source;
	//@FindBy (id="location-field-leg1-origin")
	@FindBy(xpath="//*[text()='New York (JFK - John F. Kennedy Intl.)']")
	WebElement countryS;
	
	@FindBy(xpath="(//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder'])[2]")
	WebElement destination;
	@FindBy(id="location-field-leg1-destination")
	WebElement countryD;
	
	@FindBy(xpath="//*[@id='d1-btn']")
	WebElement depart;
	@FindBy(xpath="(//*[@data-day='12'])[1]")
	WebElement departdate;
	
	@FindBy(xpath="(//*[@data-day='12'])[2]")
	WebElement retour;
	
	@FindBy(xpath="(//*[text()='Done'])[2]")
	WebElement retourdate;
	
	@FindBy(xpath="//*[text()='Search']")
	WebElement search;
	
	
	@FindBy(xpath="(//button[@class='uitk-card-link'])[1]")
	WebElement flightpage;
	@FindBy(xpath="//*[text()='Continue']")
	WebElement continu;
	
	@FindBy(xpath="(//*[@data-test-id='select-link'])[1]")
	WebElement confirmflyght;
	@FindBy(xpath="//button[@data-test-id='select-button']")
	WebElement continuconfirmation;
	@FindBy(linkText="No Thanks")
	WebElement continutopassengerinfo;
	//@FindBy(xpath="//*[text()='Check out']")
	@FindBy(xpath="//button[@aria-label='Continue to checkout']")
	WebElement checkout;
	
	public  HomeExp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Flights() {
		flight.click();
	}
	public void Source() {
		//source.click();
		source.sendKeys("NYC");
	}
	public void CountryS() {
       WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder'])[2]")));
//		countryS.sendKeys("NYC");
//		countryS.sendKeys(Keys.ARROW_DOWN);
//		countryS.sendKeys(Keys.ARROW_DOWN);
//		countryS.sendKeys(Keys.RETURN);
		countryS.click();
	}
	public void Destination() {
		destination.click();
	}
	public void CountryD() {
		countryD.sendKeys("France");
		//countryD.sendKeys(Keys.ARROW_DOWN);
		countryD.sendKeys(Keys.RETURN);
	}
	public void Depart() {
		depart.click();
	}
	public void DepartDate() {
		departdate.click();
		//departdate.sendKeys(Keys.RETURN);
	}
	public void Retour() {
		retour.click();
	}
	public void RetourDate() {
		retourdate.click();
	}
	
	public void Search() {
		search.click();
	}
	public void FlightPage() {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//button[@class='uitk-card-link'])[1]")));
		flightpage.click();
	}
	public void Continu() {
		continu.click();
	}
	public void ConfirmFlyght() {
		confirmflyght.click();
	}
	public void ContinuConfirmation() {
		continuconfirmation.click();
	}
	public void ContinuToPassengerInfo() {
		continutopassengerinfo.click();
	}
	public void CheckOut() {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Check out']")));
		checkout.click();
	}
}
