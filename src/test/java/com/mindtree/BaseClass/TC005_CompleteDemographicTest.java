package com.mindtree.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.mindtree.Pages.DemographicPage;
import com.mindtree.Pages.LoginPage;
import com.mindtree.Utility.ReadOTP;

public class TC005_CompleteDemographicTest extends TC001_ValidLoginTest {
	
	
	/*@Test(priority=0)
	public void runLoginTest()  {
		log.info("********TC005_validate Demographic page is started **********");
		try {
			TC001_ValidLoginTest login = new TC001_ValidLoginTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Logged into Pre-reg and navigated to demo screen");
	}*/

	@Test(dependsOnMethods="validLoginTest")
	public void validateDemoscreen() throws Exception {
		log.info("********TC005_validate Demographic page is started **********");
		DemographicPage dp = new DemographicPage(driver);
		dp.checkTerms();
		log.info("Accepted terms and conditions of pre-reg");
		if (dp.acceptEnabled()) {
			dp.clickAccept();
			log.info("Demographic fields are displayed");
			Thread.sleep(3000);
			dp.setPrimaryName(readConfig.getPrimaryName());
			log.info("Full Name is entered");
			dp.setDate(readConfig.getDate());
			log.info("Date is entered");
			dp.setMonth(readConfig.getMonth());
			log.info("Month is entered");
			dp.setYear(readConfig.getYear());
			log.info("Year is entered");
			dp.setMGender();
			log.info("Gender is set");
			dp.setNationResident();
			log.info("Resident is set");
			dp.setPrimAdd1(readConfig.getPrimaryAdd1());
			log.info("Address line 1 is entered");
			dp.setPrimAdd2(readConfig.getPrimaryAdd2());
			log.info("Address line 2 is entered");
			dp.setPrimAdd3(readConfig.getPrimaryAdd3());
			log.info("Address line 3 is entered");
			WebElement webElement = driver.findElement(By.xpath("//input[@placeholder='Address Line 3']"));
			webElement.sendKeys(Keys.TAB);
			Thread.sleep(2000);
			dp.clickRegion();
			dp.setRegion();
			log.info("Region is set");
			Thread.sleep(2000);
			dp.clickProvince();
			dp.setProvince();
			log.info("province is set");
			Thread.sleep(2000);
			dp.clickCity();
			dp.setCity();
			log.info("City is set");
			Thread.sleep(2000);
			dp.clickZone();
			dp.setZone();
			log.info("Zone is set");
			dp.setPrimaryPost(readConfig.getPostCode());
			log.info("Postal code is entered");
			dp.setPrimaryMobile(readConfig.getMobile());
			log.info("Mobile number is entered");
			dp.setPrimaryEmail(readConfig.getEmail());
			log.info("Email address is entered");
			dp.setPrimaryReference(readConfig.getReference());
			log.info("Reference number is entered");
			region = dp.getRegion();
			province = dp.getProvince();
			city = dp.getCity();
			zone = dp.getZone();
			dp.clickContinueButton();
			log.info("Clicked continue button in demographic screen");
		} else {
			log.error("Accept terms is not enabled");
		}

	}

}
