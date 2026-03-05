package com.kedar.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement m:links) {
			
			String hrefatvalue = m.getAttribute("href");
			
			if(hrefatvalue==null || hrefatvalue.isEmpty()) {
				
				System.out.print("link is Empty");
			}
			URL linkurl = new URL(hrefatvalue);
			HttpURLConnection conn= (HttpURLConnection) linkurl.openConnection();
			
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println("Broken Link");
			}
			else {
				System.out.println("Working Link");
			}
			
		}
}
