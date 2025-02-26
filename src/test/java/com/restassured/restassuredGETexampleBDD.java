package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class restassuredGETexampleBDD {
	
	
	@Test
	public void getexamplemethod() {
		
		Response response= RestAssured.get("https://reqres.in/api/users?page=2");
	
		ResponseBody responsebody= response.getBody();
		
		System.out.println(responsebody.asPrettyString());
		
	}
	
	
	@Test 
	public void getexamplemethod2() {
		
		RestAssured.baseURI= "https://reqres.in/api";
		

		ValidatableResponse response= RestAssured
		.given()
			.param("", "")
		.when()
			.get("/users?page=2")
		.then()
			.statusCode(200);
		
		System.out.println(response);
		
	}

}
