package apitests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

import java.util.HashMap;




//http://restapi.demoqa.com/customer

// /register

//validations "SuccessCode" : "OPERATION_SUCCESS"


public class Postrequest {
	public static HashMap<String,String> map = new HashMap<String, String>();
	
	@BeforeClass
	
	public void postvalidation() {
		map.put("FirstName", RestUtils.getFirstname());
		
		map.put("LastName", RestUtils.getLasttname());
		map.put("UserName", RestUtils.getUsername());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		
       /* map.put("FirstName", "Rajven");
		
		map.put("LastName", "kumar");
		map.put("UserName", "rajkk");
		map.put("Password", "nmlp123");
		map.put("Email", "123ere@gmail.com");
		*/
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";
		
		
	}
	
	@Test
	public void Testpost() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201);
	}



}
