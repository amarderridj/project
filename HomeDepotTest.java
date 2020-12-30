package RUN;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import BootCamp.PIIT2020.HomeHD;
import BootCamp.PIIT2020.NewAccount;
import MAIN.MainClassHomeDepot;

public class HomeDepotTest extends MainClassHomeDepot{
  @Test(priority=1)
  public void homepage() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  HomeHD obj=new HomeHD(driver);
	  obj.Acc();
	  obj.Register();
	  
  }
  
  @Test (priority=2)
  public void newaccountpage() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  HomeHD obj1=new HomeHD(driver);
	  obj1.CreateAccount();
	  Thread.sleep(3000);
	  NewAccount obj2=new NewAccount(driver);
	  obj2.emailfield("xyz@gmail.com");
	  obj2.Password("admin123");
	  obj2.ZipCode("11220");
	  obj2.Phone("7186876798");
	  Thread.sleep(3000);
	  obj2.KeepMeSignedIn();
	  obj2.VerifyPhoneNumber();
	  obj2.Robot();
	  
	  
  }
}
