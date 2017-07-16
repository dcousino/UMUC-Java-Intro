/**
* File: Student.java
* Author: Daniel Cousino
* Date: 07-09-2017
* Purpose: Just to have an object to iterate over.
*/
package week3;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sun.security.jca.GetInstance.Instance;

import java.lang.Object;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;

public class Student {

	public String name;
	public Major major;
	public int age;
	public double gradePointAverage;
	
	public Student(){		
	}
	
	public Student(String name, Major major, int age, double gradePointAverage) {
		this.name = name;
		this.major = major;
	    this.age = age;
	    this.gradePointAverage = gradePointAverage;
	}
	
	public void serializeToXML(){
		XMLEncoder encoder=null;
		try{
		encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("c:\\users\\daniel\\desktop\\javatest.xml")));
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While Creating or Opening the File dvd.xml");
		}
		encoder.writeObject(this);
		encoder.close();
	}

	public void getWeather(){
		HttpClient httpclient = HttpClientBuilder.create().build();
		    try {
		      // specify the host, protocol, and port
		      HttpHost target = new HttpHost("query.yahooapis.com", 443 , "https");

		      // specify the get request
		      HttpGet getRequest = new HttpGet("/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");

		      System.out.println("executing request to " + target);

		      HttpResponse httpResponse = httpclient.execute(target, getRequest);
		      HttpEntity entity = httpResponse.getEntity();

		      System.out.println("----------------------------------------");
		      System.out.println(httpResponse.getStatusLine());
		      Header[] headers = httpResponse.getAllHeaders();
		      for (int i = 0; i < headers.length; i++) {
		        System.out.println(headers[i]);
		      }
		      System.out.println("----------------------------------------");

		      if (entity != null) {
		    	  BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent()));

		    	  StringBuffer result = new StringBuffer();
		    	  String line = "";
		    	  while ((line = rd.readLine()) != null) {
		    	      result.append(line);
		    	  }
		    	  query d = new query();
		    	  
		    	  Gson gson = new GsonBuilder().create();
		    	  gson.fromJson(result.toString(), d.getClass());
		    	  System.out.println(gson);
		      }

		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      // When HttpClient instance is no longer needed,
		      // shut down the connection manager to ensure
		      // immediate deallocation of all system resources
		     
		    }
	}
	
	public void serializeToJson(){
		Gson gson = new GsonBuilder().create();
		
		System.out.println(gson.toJson(this));
	}
	public void printProperties(){
		System.out.println(String.format("Name: %s", name));
		System.out.println(String.format("Major: %s", major));
		System.out.println(String.format("Age: %d", age));
		System.out.println(String.format("GPA: %.2f", gradePointAverage));
		System.out.println();
	}
	

}
