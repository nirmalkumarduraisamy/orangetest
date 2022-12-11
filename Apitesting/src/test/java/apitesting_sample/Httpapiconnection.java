package apitesting_sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Httpapiconnection {
	
	
	String readline;
	public void Urlconnection() throws IOException {
		
	
	URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
	HttpURLConnection newurl= (HttpURLConnection) url.openConnection();
	newurl.setRequestMethod("GET");
	newurl.connect();
	int responcecode= newurl.getResponseCode();
	String message= newurl.getResponseMessage();
	System.out.println("the responce code was "+ responcecode+ "the message was"+message);
	 InputStreamReader inputstream= new InputStreamReader (newurl.getInputStream());
	 BufferedReader newbuffer=new BufferedReader(inputstream);
	 while ((readline=newbuffer.readLine())!=null) {
		 System.out.println("the bulid was" + readline);
		
		
	}
	}
	
	public static void main(String[] args) throws IOException {
		Httpapiconnection httpcont=new Httpapiconnection();
		httpcont.Urlconnection();
	}
}
