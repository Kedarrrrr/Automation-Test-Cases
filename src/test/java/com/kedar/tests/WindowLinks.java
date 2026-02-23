package com.kedar.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		List<String> windowID = new ArrayList<String>();
		
		for(WebElement x: links) {
			WebElement tx=driver.findElement(By.tagName("a"));
			tx.click();
			driver.switchTo().window(x.toString());
			
		}
		windowID = driver.getWindowHandles();
	}

}
