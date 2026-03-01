package com.kedar.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String tablename= driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[1]")).getText();
		System.out.println(tablename);
		
		List<WebElement> headings=driver.findElements(By.xpath("//table[@name=BookTable]//tr[1]//td"));
		System.out.println(headings.size());
		for(WebElement x: headings) {
			System.out.println(x.getText());
		}
	}

}
