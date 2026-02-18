package com.kedar.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]")).click();
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Fancode']"));
		System.out.println(logo.isDisplayed());
	
	}

}
