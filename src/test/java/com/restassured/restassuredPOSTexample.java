package com.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class restassuredPOSTexample {

	@Test
	public void postmenthod1() {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("name", "Thiyaka");
		jsonObject.put("Place", "Madiera");

		System.out.println(jsonObject);

		
		  RestAssured.baseURI="https://reqres.in";
		  
		  RestAssured.given() .header("","") 
		  .body(jsonObject.toJSONString())
		  .post("/api/users")
		  .then().statusCode(201);
		 
	}

}
