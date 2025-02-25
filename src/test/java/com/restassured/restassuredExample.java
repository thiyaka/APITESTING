package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restassuredExample {
	
	public void restassuredGETmethod() {
		
		Response response=  RestAssured.get("https://www.youtube.com/");
		
		int statuscode=  response.getStatusCode();
		System.out.println("Status code :"+ statuscode);
		
		String statusline= response.getStatusLine();
		System.out.println("Status line: "+statusline);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		restassuredExample example= new restassuredExample();
		example.restassuredGETmethod();

	}

}
