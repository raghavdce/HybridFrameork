package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.ValidateDemoPage;

public class TC007_ValidateDemoFields extends TC001_ValidLoginTest {

	@Test(priority = 0)
	public void runLoginTest() {
		log.info("********TC007_validate Demographic mandatory field is strated **********");
		try {
			TC001_ValidLoginTest login = new TC001_ValidLoginTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Logged into Pre-reg and navigated to demo screen");
	}

	@Test(priority = 1)
	public void validateDemoFields() {

		ValidateDemoPage validateDemo = new ValidateDemoPage(driver);
		log.info("Applicant's consent is displayed");
		validateDemo.checkTerms();
		log.info("Applicant selected the check box");
		try {
			validateDemo.acceptEnabled();
		} catch (Exception e) {
			log.debug("Accept button in consent is not enabled");
		}
		validateDemo.clickAccept();
		log.info("Applicant clicked the accept button in consent");
		validateDemo.clickContinueButton();
		log.info("Applicant clicked the continue button without entering any mandate fields in demo");
		try {
			validateDemo.checkValidName();
			log.info("Mandatory error message for Full name is displayed");

		} catch (Exception e) {
			log.debug("Mandatory error message for full name is not displayed");
		}
		try {
			validateDemo.getFullNameErrorMsg();
			log.info("Error message content for full name matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for full name does not match the requirement");
		}
		try {
			validateDemo.checkValidDOB();
			log.info("Mandatory error message for DOB is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for DOB is not displayed");
		}

		try {
			validateDemo.getDOBErrorMsg();
			log.info("Error message content for DOB matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for DOB does not match the requirement");
		}
		try {
			validateDemo.checkGender();
			log.info("Mandatory error message for Gender is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Gender is not displayed");
		}
		try {
			validateDemo.getGenderErrorMsg();
			log.info("Error message content for Gender matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Gender does not match the requirement");
		}
		try {
			validateDemo.checkResident();
			log.info("Mandatory error message for Resident is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Resident is not displayed");
		}
		try {
			validateDemo.getResidentErrorMsg();
			log.info("Error message content for Resident matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Resident does not match the requirement");
		}
		try {
			validateDemo.checkAddress1();
			log.info("Mandatory error message for Address1 is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Address1 is not displayed");
		}
		try {
			validateDemo.getAdd1ErrorMsg();
			log.info("Error message content for Address1 matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Address1 matches the requirement");
		}
		try {
			validateDemo.checkAddress2();
			log.info("Mandatory error message for Address2 is not displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Address2 is displayed");
		}
		try {
			validateDemo.checkAddress3();
			log.info("Mandatory error message for Address3 is not displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Address3 is displayed");
		}
		try {
			validateDemo.checkRegion();
			log.info("Mandatory error message for Region is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Region is not displayed");
		}
		try {
			validateDemo.getRegionErrorMsg();
			log.info("Error message content for Region matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Region does not match the requirement");
		}
		try {
			validateDemo.checkProvince();
			log.info("Mandatory error message for Province is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Province is not displayed");
		}
		try {
			validateDemo.getProvinceErrorMsg();
			log.info("Error message content for Province matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Province does not match the requirement");
		}
		try {
			validateDemo.checkCity();
			log.info("Mandatory error message for City is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for City is not displayed");
		}
		try {
			validateDemo.getCityErrorMsg();
			log.info("Error message content for City matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for City does not match the requirement");
		}
		try {
			validateDemo.checkZone();
			log.info("Mandatory error message for Zone is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Zone is not displayed");
		}
		try {
			validateDemo.getZoneErrorMsg();
			log.info("Error message content for Zone matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Zone does not match the requirement");
		}
		try {
			validateDemo.checkPostal();
			log.info("Mandatory error message for postal code is displayed");

		} catch (Exception e) {
			log.debug("Mandatory error message for postal code is not displayed");
		}
		try {
			validateDemo.getPostalCodeErrorMsg();
			log.info("Error message content for postal code matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for postal code does not match the requirement");
		}
		try {
			validateDemo.checkMobile();
			log.info("Mandatory error message for mobile number is not displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for mobile is displayed");
		}
		try {
			validateDemo.checkEmail();
			log.info("Mandatory error message for email id is not displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for email id is displayed");
		}
		try {
			validateDemo.checkReference();
			log.info("Mandatory error message for Reference Num is displayed");
		} catch (Exception e) {
			log.debug("Mandatory error message for Reference Number is not displayed");
		}
		try {
			validateDemo.getReferenceErrorMsg();
			log.info("Error message content for Reference Num matches the requirement");
		} catch (Exception e) {
			log.error("Error message content for Reference Num does not match the requirement");
		}


	}

}
