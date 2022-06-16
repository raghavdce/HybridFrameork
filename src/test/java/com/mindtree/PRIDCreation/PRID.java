package com.mindtree.PRIDCreation;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.Utility.ReadOTP;

public class PRID {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Raghav\\MediaFiles\\Training\\201-Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa.mosip.io/pre-registration-ui/#/");
		/*
		 * driver.findElement(By.xpath("//div[@class='mat-select-value']")).click();;
		 * driver.findElement(By.xpath("//span[contains(text(),'Arabic')]")).click();
		 */
		driver.findElement(By.id("inputFieldContact")).sendKeys("Ragavendran.Venkatesan@mindtree.com");
		driver.findElement(By.xpath("//span[contains(text(),' Send OTP ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputFieldOTP")).sendKeys(ReadOTP.getOTP());
		driver.findElement(By.xpath("//span[contains(text(),' Verify ')]")).click();
		
		WebElement createapp = driver.findElement(By.xpath("//button[contains(text(),' Create New Application')]"));
		if(createapp.isDisplayed()) {
			System.out.println("Test is passed");
		}
		// driver.close();

	}

}
