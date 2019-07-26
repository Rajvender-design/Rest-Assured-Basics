package apitests;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.Assert;
//import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

 import org.testng.annotations.Test;

//import static io.restassured.RestAssured.*;
//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.given;
//given set cookies,	add auth ,add param,set header
//when get post delete put
//then validate status code,extract response,header, cookies and response body
public class StatusCode {
	
	//@Test(retryAnalyzer = analyzer.Retryanalyzer.class)
	

	@Test
	public void status() {
		
	Response response =	given()
		.when()
		.get("http://restapi.demoqa.com/Utilities/weather/city/Hyderabad")
		
		.then()
		//.log().all()
		//.statusCode(200)
		.extract().response();
	String resString =response.asString();
	System.out.println(resString);
	
	//JsonPath js = new JsonPath(resString);
	//System.out.print(js);
		//.statusLine("HTTP/1.1 200 OK")
		//.assertThat().body("City", equalTo("Hyderabad"))
		//.header("Content-Type", "application/json");		
				
		
	}

}

//need to debug about assertThat line not working now.