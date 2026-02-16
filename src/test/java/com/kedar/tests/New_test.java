package com.kedar.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_test {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		String act_title = driver.getTitle();
		if(act_title.equals("Welcome to Prime Video")) {
			System.out.println("TEST PASSED");
		}
		else {
			System.out.println(act_title);
		}
		driver.close();
	}

}
