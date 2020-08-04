package com.cg.test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\NishaKothari\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		/*driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		WebElement Frame1=driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(Frame1);
		WebElement Deprecated=driver.findElement(By.xpath("//a[text()='Deprecated']"));
		Deprecated.click();
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equalsIgnoreCase("Deprecated List")) {
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not correct");
		}*/
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Nisha");
		driver.findElement(By.name("lastName")).sendKeys("Kothari");
		driver.findElement(By.name("phone")).sendKeys("1111111111");
		driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("401202");
		Select select=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("ABCHUoh");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		driver.findElement(By.name("userName")).sendKeys("ABCHUoh");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	
		
		
		
		/*public static void takeSnapShot(WebDriver webdriver, String filewithpath) {
		TakesScreenshot scrShot=((TakesScreenshot)webdriver);
		File file=scrShot.getScreenshotAs(OutputType.FILE);
		}*/
		
		
		/*driver.get("file:///C:/Users/Admin/Downloads/Alert.html");
		String popup=driver.switchTo().alert().getText();
		System.out.print(popup);
		driver.switchTo().alert().accept();*/
		/*driver.get("http://www.popuptest.com/popuptest2.html");*/
		/*driver.manage().window().maximize();
		String Title=driver.getTitle();
		System.out.println(Title);*/
		/*List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement ele:list) {
			System.out.println("Tags:"+ele.getText());
		}*/
		
		/*WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Capgemini India");
		search.submit();
		String Title1=driver.getTitle();
		System.out.println(Title1);
		if(Title1.equalsIgnoreCase("capgemini India - Google Search")) {
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not correct");
		}
		//File file=((TakeScreenshot)driver).getScreenshotAs(OutputType<T>.FILE)
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();*/
		/*Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();*/
	}

}
