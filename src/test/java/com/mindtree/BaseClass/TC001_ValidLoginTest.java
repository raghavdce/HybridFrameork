package com.mindtree.BaseClass;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mindtree.Pages.LoginPage;
import com.mindtree.Utility.ReadOTP;


@Listeners(com.mindtree.Utility.Listeners.class)

public class TC001_ValidLoginTest extends BaseClass {

	@Test(priority=0)
	public void validLoginTest() throws Exception {

		log.info("********TC001_validLoginTest is strated **********");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username1);
		log.info("Entered username");
		lp.clickSendOTP();
		log.info("Awaiting for valid OTP");
		Thread.sleep(3000);
		lp.setOTP(ReadOTP.getOTP());
		log.info("OTP is entered");
		
		String buttonTExt = driver.findElement(By.xpath("//div[3]/button")).getText().toString();
		
		if(buttonTExt.equalsIgnoreCase("Verify")) {
			lp.clickLogin();
			log.info("clicked login button");
			if (lp.checkCreateApp()) {
				log.info("TC001_ValidLogin test case is passed");
				captureScreenShot(driver, "TC001_ValidLoginTest");
				lp.clickCreateNewApp();
				Thread.sleep(4000);
			} 
			else
				log.info("Create app button is not displayed");
		}
		
		else {
			captureScreenShot(driver, "TC001_ValidLoginTest");
			Assert.assertTrue(false);
			log.error("TC001_ValidLogin test case is failed");
		}
		
		/*if (lp.checkLogin()) {
			lp.clickLogin();
			log.info("clicked login button");
			if (lp.checkCreateApp()) {
				log.info("TC001_ValidLogin test case is passed");
				captureScreenShot(driver, "TC001_ValidLoginTest");
				lp.clickCreateNewApp();
				Thread.sleep(4000);
			} 
			else
				log.info("Create app button is not displayed");
		}
		
		else
			log.error("TC001_ValidLogin test case is failed");
			
			captureScreenShot(driver, "TC001_ValidLoginTest");
	
		

	}
*/
}
	
}
