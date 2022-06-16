package com.mindtree.BaseClass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.Pages.DemographicPage;
import com.mindtree.Pages.PreviewPage;
import com.mindtree.Utility.DateFormat;
import com.mindtree.Utility.ReadConfig;

public class TC009_ValidatePreview extends TC008_UploadDocuments {

	PreviewPage pp;
	DemographicPage dp;

	@Test(dependsOnMethods = "docUpload",priority=0)
	public void checkFullName() {
		log.info("******* TC009_ValidatePreview is started *********");
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getFullName(), readConfig.getPrimaryName());
		log.info("Full Name is verified");
	}

	@Test(dependsOnMethods = "docUpload",priority=1)
	public void checkDOB() {
		pp = new PreviewPage(driver);
		String DOB = readConfig.getDate() + " " + DateFormat.getMonth() + " " + readConfig.getYear();
		Assert.assertEquals(pp.getDOB(), DOB);
		log.info("DOB is verified");
	}

	@Test(dependsOnMethods = "docUpload",priority=2)
	public void checkAge() {
		pp = new PreviewPage(driver);
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(Integer.parseInt(readConfig.getYear()),
				Integer.parseInt(readConfig.getMonth()), Integer.parseInt(readConfig.getDate()));
		int age = Period.between(birthDate, today).getYears();
		Assert.assertEquals(pp.getAge(), age + " Years");
		log.info("Age is verified");
	}

	@Test(dependsOnMethods = "docUpload",priority=3)
	public void checkGender() {
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getGender(), readConfig.getGender());
		log.info("Gender is verified");
	}

	@Test(dependsOnMethods = "docUpload",priority=4)
	public void checkResident() {
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getResident(), readConfig.getResident());
		log.info("Resident is verified");
	}

	@Test(dependsOnMethods = "docUpload",priority=5)
	public void checkAddress() {
		pp = new PreviewPage(driver);
		String address123 = readConfig.getPrimaryAdd1() + ", " + readConfig.getPrimaryAdd2() + ", "
				+ readConfig.getPrimaryAdd3();
		String address12 = readConfig.getPrimaryAdd1() + ", " + readConfig.getPrimaryAdd2();
		String address13 = readConfig.getPrimaryAdd1() + ", " + readConfig.getPrimaryAdd3();
		if (readConfig.getPrimaryAdd1() != null && readConfig.getPrimaryAdd2() != null
				&& readConfig.getPrimaryAdd3() != null) {
			Assert.assertEquals(pp.getAdd1(), address123);
			log.info("Address is verified");
		} else if (readConfig.getPrimaryAdd1() != null && readConfig.getPrimaryAdd2() != null
				&& readConfig.getPrimaryAdd3() == null) {
			Assert.assertEquals(pp.getAdd1(), address12);
			log.info("Address is verified");
		} else if (readConfig.getPrimaryAdd1() != null && readConfig.getPrimaryAdd2() == null
				&& readConfig.getPrimaryAdd3() != null) {
			Assert.assertEquals(pp.getAdd1(), address13);
			log.info("Address is verified");
		} else {
			String address = readConfig.getPrimaryAdd1();
			Assert.assertEquals(pp.getAdd1(), address);
			log.info("Address is verified");
		}

	}
	
	@Test(dependsOnMethods = "docUpload",priority=6)
	public void checkRegion() {
		pp = new PreviewPage(driver);
		dp = new DemographicPage(driver);
		Assert.assertEquals(pp.getRegion(), region);
		log.info("Region is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=7)
	public void checkProvince() {
		pp = new PreviewPage(driver);
		dp = new DemographicPage(driver);
		Assert.assertEquals(pp.getProvince(), province);
		log.info("Province is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=8)
	public void checkCity() {
		pp = new PreviewPage(driver);
		dp = new DemographicPage(driver);
		Assert.assertEquals(pp.getCity(), city);
		log.info("City is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=9)
	public void checkZone() {
		pp = new PreviewPage(driver);
		dp = new DemographicPage(driver);
		Assert.assertEquals(pp.getZone(), zone);
		log.info("Zone is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=10)
	public void checkMobile() {
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getMobile(), readConfig.getMobile());
		log.info("Mobile number is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=11)
	public void checkEmail() {
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getEmail(), readConfig.getEmail());
		log.info("Email address is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=12)
	public void checkReference() {
		pp = new PreviewPage(driver);
		Assert.assertEquals(pp.getReference(), readConfig.getReference());
		log.info("Reference number is verified");
	}
	
	@Test(dependsOnMethods = "docUpload",priority=13)
	public void clickContinueInPreview() {
		pp = new PreviewPage(driver);
		pp.clickContinue();
		if(pp.centerList()) {
			log.info("Applicant navigated to center selection page");
		}
		else {
			log.error("Application stuck at preview screen");
		}
	}

}
