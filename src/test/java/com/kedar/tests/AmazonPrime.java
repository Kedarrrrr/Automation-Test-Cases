package com.kedar.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonPrime {

    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.primevideo.com/");
    	driver.findElement(By.cssSelector("[data-testid='pv-nav-search-dropdown-trigger']")).click();
        //driver.findElement(By.id("")).sendKeys("Pushpa: The Rise (Hindi)");
        WebElement searchBox = driver.findElement(By.id("pv-search-nav")); 
        searchBox.sendKeys("Pushpa: The Rise (hindi)");
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Done!");
        
    }
}

