package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerExp {
	public WebDriver driver;
	
	@FindBy(id="title[0]")
	WebElement title;
	@FindBy(id="firstname[0]")
    WebElement	firstname;
	@FindBy(id="lastname[0]")
	WebElement lastname;
	@FindBy(id="phone-number[0]")
	WebElement phonenumber;
	@FindBy(id="gender_male[0]")
	WebElement gender;
	@FindBy(id="date_of_birth_month0")
	WebElement birthmonth;
	@FindBy(id="date_of_birth_day[0]")
	WebElement birthday;
	@FindBy (id="date_of_birth_year[0]")
	WebElement birthyear;
	
	@FindBy(xpath="(//input[@name='creditCards[0].cardholder_name'])[2]")
	WebElement cardname;
	@FindBy(xpath="//input[@id='creditCardInput']")
	WebElement creditcardnumber;
	@FindBy(name="creditCards[0].expiration_month")
	WebElement creditexpirationmonth;
	@FindBy(name="creditCards[0].expiration_year")
	WebElement creditexpirationyear;
	@FindBy(id="new_cc_security_code")
	WebElement securitycode;
	@FindBy(name="creditCards[0].street")
	WebElement street;
	@FindBy(name="creditCards[0].city")
	WebElement city;
	@FindBy(name="creditCards[0].state")
	WebElement state;
	@FindBy(name="creditCards[0].zipcode")
	WebElement zipcode;
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement email;
	@FindBy(id="complete-booking")
	WebElement booking;
	
	public PassengerExp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Title() {
		Select sel = new Select(title);
		sel.selectByVisibleText(" Mr.");}
	public void FirstName(String fname) {
		firstname.sendKeys(fname);}
	public void LastName(String  lname) {
		lastname.sendKeys(lname);}
	public void PhoneNumber(String pnumber) {
		phonenumber.sendKeys(pnumber);}
	public void Gender() {
		gender.click();}
	public void BirthMonth() {
		Select sel=new Select(birthmonth);
		sel.selectByVisibleText("05 - May");}
	public void BirthDate() {
		Select sel=new Select(birthday);
		sel.selectByVisibleText("19");}
	public void BirthYear() {
		Select sel =new Select(birthyear);
		sel.selectByVisibleText("1992");}
	public void CardName(String cname) {
		cardname.sendKeys(cname);}
	public void CreditCardNumber(String ccnumber) {
		creditcardnumber.sendKeys(ccnumber);}
	public void CreditExpirationMonth() {
		Select sel=new Select(creditexpirationmonth);
		sel.selectByVisibleText("02-Feb");}
	public void CreditExpirationYear() {
		Select sel=new Select(creditexpirationyear);
		sel.selectByVisibleText("2023");}
	public void SecurityCode(String scode) {
		securitycode.sendKeys(scode);}
	public void Street(String streetaddress) {
		street.sendKeys(streetaddress);}
	public void City(String cityaddress) {
		city.sendKeys(cityaddress);}
	public void State() {
		Select sel=new Select(state);
		sel.selectByVisibleText("NY");}
	public void ZipCode(String zcode) {
		zipcode.sendKeys(zcode);}
	public void Email(String mail) {
		email.sendKeys(mail);}
	public void Booking() {
		booking.click();}
	
	
	
}
