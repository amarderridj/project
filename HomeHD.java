package BootCamp.PIIT2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeHD {
	public WebDriver driver;
@FindBy (xpath="(//*[text()='My Account'])[1]")
WebElement myacc;
@FindBy (xpath="//*[text()='Register']")
WebElement regist;
@FindBy(xpath="//*[text()='Select & Continue']")
WebElement NewAcc;

public HomeHD(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Acc() {
	myacc.click();
}
public void Register() {
	regist.click();
}
public void CreateAccount() {
	NewAcc.click();
}
}
