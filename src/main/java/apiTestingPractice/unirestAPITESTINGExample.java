package apiTestingPractice;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class unirestAPITESTINGExample {
	
	
	public void getmethod() {
		
		try {
			HttpResponse <JsonNode> jsonResponse= Unirest.get("https://reqres.in/api/users/2").asJson();
			
			System.out.println("Response code "+ jsonResponse.getStatus());
			System.out.println("Response message "+jsonResponse.getStatusText());
			System.out.println("Resonse body"+jsonResponse.getBody());
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void postmethod() {
		
		try {
			HttpResponse <JsonNode> jsonResponse=  Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\\r\\n\"\r\n"
					+ "					+ \"    \\\"name\\\": \\\"stew\\\",\\r\\n\"\r\n"
					+ "					+ \"    \\\"job\\\": \\\"Doctor\\\"\\r\\n\"\r\n"
					+ "					+ \"}").asJson();
			System.out.println("Response code "+ jsonResponse.getStatus());
			System.out.println("Response message "+jsonResponse.getStatusText());
			System.out.println("Resonse body"+jsonResponse.getBody());
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void putmethod() {
		
		try {
			HttpResponse <JsonNode> jsonResponse= 	Unirest.put("https://dummy.restapiexample.com/api/v1/update/21/").body("{\\r\\n\"\r\n"
						+ "					+ \"    \\\"name\\\": \\\"stew\\\",\\r\\n\"\r\n"
						+ "					+ \"    \\\"job\\\": \\\"Doctor\\\"\\r\\n\"\r\n"
						+ "					+ \"}").asJson();
			System.out.println("Response code "+ jsonResponse.getStatus());
			System.out.println("Response message "+jsonResponse.getStatusText());
			System.out.println("Resonse body"+jsonResponse.getBody());
			
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void deletemethod() {
		
		try {
			HttpResponse <JsonNode> jsonResponse= Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/2/").asJson();
			
			System.out.println("Response code "+ jsonResponse.getStatus());
			System.out.println("Response message "+jsonResponse.getStatusText());
			System.out.println("Resonse body"+jsonResponse.getBody());
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unirestAPITESTINGExample apitestingExample= new unirestAPITESTINGExample();
		apitestingExample.getmethod();
		apitestingExample.postmethod();
		apitestingExample.putmethod();
		apitestingExample.deletemethod();

	}

}
