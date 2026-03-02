package com.kedar.tests;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Events {
	
	public static void main(String[] arg) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		Actions act= new Actions(driver);
		
		WebElement x = driver.findElement(By.xpath(""));
		
		Action myaction = driver.moveToElement(x).click().build();
		
		myaction.perform();
	}
}
