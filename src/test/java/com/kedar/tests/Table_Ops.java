package com.kedar.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		/*List<WebElement> row_data=driver.findElements(By.xpath(""));
		int rows= row_data.size();
		
		List<WebElement> col_data= driver.findElements(By.xpath(""));
		int col=col_data.size();
		*/
		
		WebElement x =driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td[1]"));
		String name= x.getText();
		System.out.println(name);
		
		
	}

}
