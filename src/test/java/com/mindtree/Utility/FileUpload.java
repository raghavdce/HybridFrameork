package com.mindtree.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {
	
	
	public static void uploadFile() throws Exception {
		
		String fileImagePath = "C:\\Raghav\\201-training\\Files\\";
		String fileUploadPath = "C:\\Raghav\\201-training\\Files\\";
		
		Screen s = new Screen();
		
		Pattern fileTextBox = new Pattern(fileImagePath+"FilePath.PNG");
		Pattern openButton = new Pattern(fileImagePath+"OpenButton.PNG");
		
		Thread.sleep(3000);
		
		s.wait(fileTextBox,20);
		s.type(fileTextBox,fileUploadPath+"AgroStock.pdf");
		s.click(openButton);
		
	}

	/*public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).click();
		
		String fileImagePath = "C:\\Raghav\\201-training\\Files\\";
		String fileUploadPath = "C:\\Raghav\\201-training\\Files\\";
		
		Screen s = new Screen();
		
		Pattern fileTextBox = new Pattern(fileImagePath+"FilePath.PNG");
		Pattern openButton = new Pattern(fileImagePath+"OpenButton.PNG");
		
		Thread.sleep(3000);
		
		s.wait(fileTextBox,20);
		s.type(fileTextBox,fileUploadPath+"AgroStock.pdf");
		s.click(openButton);
		
	}*/
}
