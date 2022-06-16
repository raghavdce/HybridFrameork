package com.mindtree.BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//a[@qa='offersDD']")).click();
		/*WebElement inputID =driver.findElement(By.id("inputFieldContact"));
		WebElement sendOTP = driver.findElement(By.xpath("//span[contains(text(),'Send OTP')]"));*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*js.executeScript("arguments[0].value='Ragavendran.Venkatesan@mindtree.com';",inputID);
		js.executeScript("arguments[0].click();", sendOTP);*/
		//js.executeScript("alert('hello world');");
		String sText =  js.executeScript("return document.title;").toString();
		System.out.println(sText);
		List<WebElement> elements = driver.findElements(By.xpath("//h6[@class='ng-binding']"));
		System.out.println("Number of elements:" +elements.size());
		//driver.findElement(By.linkText("Active Baby New - 24 Diaper Pants")).click();
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("scroll(0, 250)");
		int i = elements.size();
		WebElement element1 = elements.get(i-2);
		Thread.sleep(3000);
		element1.click();
	}

}
