package RUN;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.get;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;


public class API {
  @Test
  public void Get() {
	  Response resp=get("https://reqres.in/api/users?page=2");
	  resp.prettyPrint();
	  System.out.println("The Status Code is "+resp.getStatusCode());
	  System.out.println("The Response Time is "+resp.getTime());
	  
	  
	  //Let's put an Assertion to make sure the return code is 200==>OK
	  int status=resp.getStatusCode();
	  Assert.assertEquals(status, 200);
	  
	  //Let's fail the Assertion
	  //Make sure that the status code twill come back in under 200ms
	  double time = resp.getTime();
	  Assert.assertEquals(time, 200);
	  
  }
  
  @Test
  public void Post() {
	  File file= new File("/home/kali/eclipse-workspace/PIIT2020/POST.json");
	  Response resp = given().contentType(ContentType.JSON).body(file).post("http://dummy.restapiexample.com/api/v1/create");
	  
	  resp.prettyPrint();
	 
	  
  }
}
