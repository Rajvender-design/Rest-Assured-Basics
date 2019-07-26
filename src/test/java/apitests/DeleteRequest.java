package apitests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {

	
	

		
	
	@Test
		public void putTest() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        int emp_id = 89170;
		RestAssured.basePath= "/delete/"+emp_id;

			
	Response response =	 	given()
			.when()
	
			.delete()
			.then().extract().response();
	String respstring = response.asString();
	AssertJUnit.assertEquals(respstring.contains("successfully! deleted Records"),true);
	
			//.statusCode(200)
			//.log().all();
}
}
