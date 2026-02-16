package com.kedar.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening site");
		driver.get("https://www.saucedemo.com");

		System.out.println("Finding username field");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		System.out.println("Finding password field");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		System.out.println("Clicking login");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Done clicking");

		driver.quit();

	}

}
