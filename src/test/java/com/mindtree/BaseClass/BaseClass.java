package com.mindtree.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import com.android.dx.util.FileUtils;
import com.mindtree.Utility.ReadConfig;
import com.mindtree.Utility.ReadOTP;

public class BaseClass {

	public WebDriver driver;
	ReadConfig readConfig = new ReadConfig();
	public String url = readConfig.getBaseURL();
	public String username1 = readConfig.getUsername();
	public String appDate = readConfig.getAppointmentDate();
	public Logger log;
	public String region;
	public String province;
	public String city;
	public String zone;

	@BeforeClass
	public void openBrowser() throws Exception {
		log = LogManager.getLogger(BaseClass.class.getName());
		/*System.setProperty("webdriver.ie.driver", readConfig.getDriverPath());
		driver = new InternetExplorerDriver();*/
		System.setProperty("webdriver.chrome.driver", readConfig.getDriverPath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
	}

	/*
	 * @AfterClass public void closeBrowser() { driver.close(); }
	 */
	
	
	public void captureScreenShot(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"//Screenshots//"+tname+".png");
		//org.apache.commons.io.FileUtils.copyFile(source, target);
		FileHandler.copy(source, target);
		System.out.println("screenShot Taken");
		
		
	}

}
