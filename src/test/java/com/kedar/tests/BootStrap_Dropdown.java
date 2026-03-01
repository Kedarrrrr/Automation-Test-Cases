package com.kedar.tests;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Kedar");
		
		Thread.sleep(3000);
		
		List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
	
		System.out.println(options.size());
		
		for(WebElement x:options) {
			String name=(x.getText());
			if(name.contains("Kedarnath")) {
				//System.out.println("True");
				x.click();
				break;
			}else {
				System.out.println(x.getText());
			}
		}
		
	}
	

}
