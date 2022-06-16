package com.mindtree.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Raghav\\201-training\\RestAsured\\Pre-Registration\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/home");
		driver.findElement(By.name("checkin")).click();
		//driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).click();
		WebElement php = driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]"));
		String phpDate = php.getText();
		System.out.println(phpDate);

	}

}
