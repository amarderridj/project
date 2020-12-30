package RUN;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import Expedia.HomeExp;
import Expedia.PassengerExp;
import MAIN.MainClassExpedia;

public class ExpediaTest extends MainClassExpedia{
  @Test(enabled=true)
  public void HomePage() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  HomeExp obj=new HomeExp(driver);
	  obj.Flights();
	  obj.Source();
	  Thread.sleep(3000);
	  obj.CountryS();
	  obj.Destination();
	  Thread.sleep(3000);
	  obj.CountryD();
	  Thread.sleep(3000);
	  obj.Depart();
	  Thread.sleep(3000);
	  obj.DepartDate();
	  Thread.sleep(3000);
	  obj.Retour();
	  Thread.sleep(3000);
	  obj.RetourDate();
	  Thread.sleep(3000);
	  obj.Search();
	  Thread.sleep(6000);
	  obj.FlightPage();
	  Thread.sleep(3000);
	  obj.Continu();
	  Thread.sleep(3000);
	  obj.ConfirmFlyght();
	  Thread.sleep(3000);
	  obj.ContinuConfirmation();
	  obj.ContinuToPassengerInfo();
	  Thread.sleep(3000);
	 
  }
  
  @Test(enabled=true)
  public void PassengerInformations() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String parentwindowhandle = driver.getWindowHandle();
	  Set<String> multiplewindows=driver.getWindowHandles();
	  for(String window : multiplewindows) {
			if (window.equalsIgnoreCase(parentwindowhandle)) { System.out.println("this is my parent window");}
			else { driver.switchTo().window(window);
			       Thread.sleep(3000);
			       HomeExp obj=new HomeExp(driver);
			       obj.CheckOut();}
			}
//	  HomeExp obj1 = new HomeExp(driver);
//	  obj1.CheckOut();
	  Thread.sleep(4000);
	  PassengerExp obj2=new PassengerExp(driver);
	  //obj2.Title();
	  obj2.FirstName("Amar");
	  obj2.LastName("Derridj");
	  Thread.sleep(2000);
	  obj2.PhoneNumber("7186876798");
	  Thread.sleep(2000);
	  obj2.Gender();
	  Thread.sleep(2000);
	  obj2.BirthMonth();
	  Thread.sleep(3000);
	  obj2.BirthDate();
	  Thread.sleep(3000);
	  obj2.BirthYear();
	  Thread.sleep(3000);
	  obj2.CardName("Amar Derridj");
	  Thread.sleep(2000);
	  obj2.CreditCardNumber("2720995093510796");
	  obj2.CreditExpirationMonth();
	  Thread.sleep(2000);
	  obj2.CreditExpirationYear();
	  obj2.SecurityCode("123");
	  Thread.sleep(2000);
	  obj2.Street("6711 5th ave");
	  obj2.City("Brooklyn");
	  Thread.sleep(2000);
	  obj2.State();
	  obj2.ZipCode("11220");
	  Thread.sleep(2000);
	  obj2.Email("derridj_a@yahoo.fr");
	  obj2.Booking();
	  
  }
  
  
}
