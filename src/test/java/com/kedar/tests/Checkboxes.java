package com.kedar.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//System.out.println(checkbox.size());
		
		for(int i=checkbox.size()-3; i<checkbox.size();i++) {
			WebElement x=checkbox.get(i);
			x.click();
		}
	}
}
