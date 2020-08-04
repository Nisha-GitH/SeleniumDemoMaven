package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComedyShow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NishaKothari\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("file:///C:/Users/Admin/Downloads/ComedyShow.html");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		WebElement Button1=driver.findElement(By.id("Button4"));
		Button1.click();
		String popup=driver.switchTo().alert().getText();
		System.out.println(popup);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text24")).sendKeys("1234");
		
		Button1.click();
		String popup1=driver.switchTo().alert().getText();
		System.out.println(popup1);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text1")).sendKeys("1234");
		
		Button1.click();
		String popup2=driver.switchTo().alert().getText();
		System.out.println(popup2);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text12")).sendKeys("1234");
		
		Button1.click();
		String popup3=driver.switchTo().alert().getText();
		System.out.println(popup3);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text12")).sendKeys("1234");
		
		Button1.click();
		String popup4=driver.switchTo().alert().getText();
		System.out.println(popup4);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text14")).sendKeys("1234");
		
		Button1.click();
		String popup5=driver.switchTo().alert().getText();
		System.out.println(popup5);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text15")).sendKeys("09");
		
		Button1.click();
		String popup6=driver.switchTo().alert().getText();
		System.out.println(popup6);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("Text15")).sendKeys("09");
		
		Button1.click();
		String popup7=driver.switchTo().alert().getText();
		System.out.println(popup7);
		driver.switchTo().alert().accept();
		Select select=new Select(driver.findElement(By.id("Select12")));
		select.selectByVisibleText("English");
		
		Button1.click();
		String popup8=driver.switchTo().alert().getText();
		System.out.println(popup8);
		driver.switchTo().alert().accept();
		Select select1=new Select(driver.findElement(By.id("Select9")));
		select1.selectByVisibleText("4");
		Button1.click();
		String popup9=driver.switchTo().alert().getText();
		System.out.print(popup9);
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
