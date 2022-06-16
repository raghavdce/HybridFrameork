package com.mindtree.Utility;

import java.awt.image.SampleModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BugReports {

	public static void main(String[] args) throws Exception {
		
		String query = "\"Epic Link\" in (MOS-14575, MOS-2, MOS-4) AND issuetype = Bug AND status in (\"In Progress\",Reopened,\"To Do\") ORDER BY \"EPIC LINK\" ASC";
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		String repName = "Defect List - " + timeStamp + ".csv";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Raghav\\201-training\\RestAsured\\Pre-Registration\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://mosip.atlassian.net");
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"profileGlobalItem\"]")).click();
		driver.findElement(By.id("username")).sendKeys("Ragavendran.Venkatesan@mindtree.com");
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]/span/span/span")).click();
		driver.findElement(By.id("password")).sendKeys("Rumble@12");
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='quickSearchGlobalItem']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Advanced search for issues')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Switch to JQL')]")).click();
		driver.findElement(By.id("advanced-search")).clear();
		driver.findElement(By.id("advanced-search")).sendKeys(query);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Export Excel CSV (current fields)')]")).click();
		Thread.sleep(3000);
		File oldName = new File("C:\\Users\\M1030042\\Downloads\\MOSIP Issue Tracker.csv");
	    File newName = new File("C:\\Users\\M1030042\\Downloads\\" + repName);
	    if(oldName.renameTo(newName)) {
	         System.out.println("The report name is renamed successfully");
	      } else {
	         System.out.println("Error");
	      }
		

	}

}
