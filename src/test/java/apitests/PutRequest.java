package apitests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
	//http://dummy.restapiexample.com/api/v1
// /update/EMPID
//http://dummy.restapiexample.com/api/v1/employees-- where employees is path parameter

public class PutRequest {
	public static HashMap map = new HashMap();
	
	@BeforeClass
	
	public void PutData() {
		
	

			map.put("name", RestUtils.getEmpName());
			
			map.put("age", RestUtils.getAge());
			map.put("Salary", RestUtils.getSalary());
			int emp_id = 89170;

RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

RestAssured.basePath= "/update/"+emp_id;

	
}
@Test
	public void putTest() {
		
		
	 	given()
		.when()
		.body(map)
		.put()
		.then().extract().response();
		//.statusCode(200)
		//.log().all();
	
		
	}
	

}
