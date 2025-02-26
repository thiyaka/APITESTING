package com.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class restassuredPUTexample {
	
	@Test
	public void putmethod() {
		
		JSONObject jsonObject= new JSONObject();
		
		jsonObject.put("Name", "Thiyaka");
		jsonObject.put("Place", "Madurai");
		
		System.out.println(jsonObject.toJSONString());
		
		RestAssured.baseURI="https://reqres.in";
		
		RestAssured.given()
		.body(jsonObject.toJSONString())
		.put("/api/users/2")
		.then().statusCode(200);
		
		
		
	}
	
	public void patchmethod() {
		
		JSONObject jsonObject= new JSONObject();
		
		jsonObject.put("Name", "Thiyaka");
		jsonObject.put("Place", "Chennai");
		
		System.out.println(jsonObject.toJSONString());
		
		RestAssured.baseURI="https://reqres.in";
		
		RestAssured.given()
		.body(jsonObject.toJSONString())
		.patch("/api/users/2")
		.then().statusCode(200);
		
		
		
	}
	
	

}
