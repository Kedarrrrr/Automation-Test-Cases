package com.kedar.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_locator {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://primevideo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label='Categories']//span[@class='Jsgzgo']")).click();
		driver.findElement(By.xpath("//ul[@aria-label='Genres']//img[@alt='Kids']")).click();
		driver.findElement(By.xpath("//div[@class='lGQKzX']//div[@class='BQq9f6 dLpl11 UbbSrD']//span[@class='Jsgzgo']")).click();
		//driver.findElement(By.xpath()).sendKeys("Hanuman the immortal");
		
		WebElement searchbox=driver.findElement(By.xpath("//div[@class='ewIjb9 ri2mVD VKApW2 Xg7vaX _7dM8XV _0d+1Fx']//input[@id='pv-search-nav']"));
		searchbox.sendKeys("Hanuman the immortal");
		searchbox.sendKeys(Keys.ENTER);
	}
}
