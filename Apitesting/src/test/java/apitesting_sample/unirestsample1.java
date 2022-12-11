package apitesting_sample;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class unirestsample1 {

	public void unirestsample() throws UnirestException {
		
    HttpResponse<JsonNode> jasonnode1= Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		int statuscode=jasonnode1.getStatus();
		System.out.println(statuscode);
		
	}
	
	public static void main(String[] args) throws UnirestException {
		unirestsample1 unirestsample1=new unirestsample1();
		unirestsample1.unirestsample();
	}
	
	
	
}
