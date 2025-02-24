package apiTestingPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class HTTPURLConnectionExample {
	
	public void getmethod() {
		
		try {
			URL url= new URL("https://www.google.com/");
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HTTPURLConnectionExample connectionExample= new HTTPURLConnectionExample();
		connectionExample.getmethod();

	}

}
