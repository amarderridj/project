package BootCamp.PIIT2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccount {
	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy (id="password-input-field")
	WebElement pass;
	@FindBy (id="zipCode")
	WebElement zip;
	@FindBy (id="phone")
	WebElement phone;
	@FindBy (xpath="//label[@class='checkbox-btn__label-test u__text-align--left']")
	WebElement keepsignin;
	@FindBy (xpath="(//label[@class='checkbox-btn__label-test u__text-align--left'])[2]")
	WebElement verifynbr;
	@FindBy (xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement robot;
	
	public NewAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void emailfield(String Email) {
	email.sendKeys(Email);
}
public void Password(String Pass) {
	pass.sendKeys(Pass);
}
public void ZipCode(String Zip) {
	zip.sendKeys(Zip);
}
public void Phone(String number) {
	phone.sendKeys(number);
}
public void KeepMeSignedIn() {
//	WebDriverWait wait= new WebDriverWait(driver, 5);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='kmsi-checkbox']")));
	keepsignin.click();
}
public void VerifyPhoneNumber() {
	verifynbr.click();
}
public void Robot() {
	driver.switchTo().frame(0);
	robot.click();
}

}
