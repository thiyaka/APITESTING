package com.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class restassuredDELETEexample {
	
	
	@Test
	public void deletemethod() {
		
		JSONObject jsonObject= new JSONObject();
		
		jsonObject.put("Name", "Thiyaka");
		jsonObject.put("Place", "Chennai");
		
		System.out.println(jsonObject.toJSONString());
		
		baseURI="https://reqres.in";
		
		given()
		.body(jsonObject.toJSONString())
		.patch("/api/users/2")
		.then().statusCode(200);
		
		
		
	}

}
