package apiTestingPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class HTTPURLConnectionExample {
	
	public void getmethod() {
		
		try {
			URL url= new URL("https://reqres.in/api/users/2");
			
			HttpURLConnection connection= (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();// This step is optional
			
			int Responsecode = connection.getResponseCode();
			System.out.println("Response code is "+Responsecode);
			
			String Responsemesssage= connection.getResponseMessage();
			System.out.println("Response Message is "+Responsemesssage);
			
			InputStream inputstream =connection.getInputStream();
			InputStreamReader inputStreamReader=  new InputStreamReader(inputstream);
			
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			
			//bufferedReader.readLine();
			String line;
			StringBuffer buffer= new StringBuffer();
			while ((line = bufferedReader.readLine())!= null) {
				buffer.append(line);
			}
			
			System.out.println(buffer);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void postmethodExample() {
		
		try {
			URL url= new  URL("https://dummy.restapiexample.com/api/v1/create");
			
			HttpURLConnection connection=  (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			
			connection.setRequestProperty("Content-Type", "application/JSON");
			connection.setDoOutput(true);
			
			String JsonBody= "{\r\n"
					+ "    \"name\": \"stew\",\r\n"
					+ "    \"job\": \"Doctor\"\r\n"
					+ "}";
			
			byte[] inputJSON= JsonBody.getBytes();
			
			OutputStream outputStream= connection.getOutputStream();
			outputStream.write(inputJSON);
			
			System.out.println("Response code "+ connection.getResponseCode());
			System.out.println("Response message "+ connection.getResponseMessage());
		
			//Below steps used to retrieve above posted JSON bodys
			InputStream inputStream= connection.getInputStream();
			InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
			
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			
			String line;
			StringBuffer buffer= new StringBuffer();
			
			while((line= bufferedReader.readLine())!= null) {
				buffer.append(line);
			}
			
			System.out.println(buffer);
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void putmethodExample() {
		
		try {
			URL url= new  URL("https://dummy.restapiexample.com/api/v1/update/21/");
			
			HttpURLConnection connection=  (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("PUT");
			
			connection.setRequestProperty("Content-Type", "application/JSON");
			connection.setDoOutput(true);
			
			String JsonBody= "{\r\n"
					+ "    \"name\": \"stew\",\r\n"
					+ "    \"job\": \"Dean\"\r\n"
					+ "}";
			
			byte[] inputJSON= JsonBody.getBytes();
			
			OutputStream outputStream= connection.getOutputStream();
			outputStream.write(inputJSON);
			
			System.out.println("Response code "+ connection.getResponseCode());
			System.out.println("Response message "+ connection.getResponseMessage());
		
			//Below steps used to retrieve above posted JSON bodys
			InputStream inputStream= connection.getInputStream();
			InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
			
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			
			String line;
			StringBuffer buffer= new StringBuffer();
			
			while((line= bufferedReader.readLine())!= null) {
				buffer.append(line);
			}
			
			System.out.println(buffer);
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deletemethodExample() {
		
		try {
			URL url= new  URL("https://dummy.restapiexample.com/api/v1/delete/2/");
			
			HttpURLConnection connection=  (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("DELETE");
			
			connection.setRequestProperty("Content-Type", "application/JSON");
			connection.setDoOutput(true);
			/* This piece of code is not needed in delete request
			 * String JsonBody= "{\r\n" + "    \"name\": \"stew\",\r\n" +
			 * "    \"job\": \"Dean\"\r\n" + "}";
			 * 
			 * byte[] inputJSON= JsonBody.getBytes();
			 * 
			 * OutputStream outputStream= connection.getOutputStream();
			 * outputStream.write(inputJSON);
			 */
			
			System.out.println("Response code "+ connection.getResponseCode());
			System.out.println("Response message "+ connection.getResponseMessage());
		
			//Below steps used to retrieve above posted JSON bodys
			InputStream inputStream= connection.getInputStream();
			InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
			
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			
			String line;
			StringBuffer buffer= new StringBuffer();
			
			while((line= bufferedReader.readLine())!= null) {
				buffer.append(line);
			}
			
			System.out.println(buffer);
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HTTPURLConnectionExample connectionExample= new HTTPURLConnectionExample();
		connectionExample.getmethod();
		connectionExample.postmethodExample();
		connectionExample.putmethodExample();
		connectionExample.deletemethodExample();
		

	}

}
