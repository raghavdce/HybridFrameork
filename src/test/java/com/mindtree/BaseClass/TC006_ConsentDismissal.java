package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.DemographicPage;

public class TC006_ConsentDismissal extends TC001_ValidLoginTest {

	@Test(priority = 0)
	public void runLoginTest() {
		log.info("********TC006_Consent dismissal test case is started **********");
		try {
			TC001_ValidLoginTest login = new TC001_ValidLoginTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Logged into Pre-reg and navigated to demo screen");
	}
	
	@Test(priority=1)
	public void dismissConsent() {
		DemographicPage dp = new DemographicPage(driver);
		log.info("Consent is displayed for applicant.");
		dp.clickCloseButtonInConsent();
		log.info("Applicant clicked close button in consent");
		try {
			dp.checkOkButton();
			log.info("OK button in consent dismissal is displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("Consent dismissal message with ok button is not displayed");
		}
		dp.clickOkButtonInConsent();
		log.info("Applicant clicked ok button to dismiss the consent");
		try {
			dp.checkCreateApp();
			log.info("Create new application button is displayed for applicant");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("Application is not routed to Dashboard after applicant clicked ok in consent dismissal");
		}
		
	}

}
