package com.cg.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\NishaKothari\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions action=new Actions(driver);
		WebElement Mensaction=driver.findElement(By.xpath("//div[@class='desktop-navContent']//a[text()='Men']"));
		action.moveToElement(Mensaction).perform();
		WebElement Backs=driver.findElement(By.xpath("//li[14]//a[text()='Bags & Backpacks']"));
		action.moveToElement(Backs).click().perform();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div")).click();
	}

}
