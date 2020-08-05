package com.cg.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NishaKothari\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://practice.automationtesting.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(100);
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement ele:list) {
			System.out.println("Tags:"+ele.getText());
			System.out.print("Changes made");
			
		}
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		driver.findElement(By.xpath("//div[@id='site-logo']//img")).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		driver.close();
		/*String as=element;
		as.scrollIntoView();*/
		

	}

}
