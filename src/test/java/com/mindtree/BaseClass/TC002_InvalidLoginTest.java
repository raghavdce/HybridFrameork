package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.LoginPage;
import com.mindtree.Utility.ReadOTP;

public class TC002_InvalidLoginTest extends BaseClass{
	
	@Test
	public void TC002_invalidOTPLength() throws Exception {
		
		log.info("********TC002_InvalidLogin Test is strated **********");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username1);
		log.info("Entered username");
		lp.clickSendOTP();
		log.info("Awaiting for valid OTP");
		Thread.sleep(3000);
		lp.setOTP(ReadOTP.getOTP() + 1);
		log.info("OTP is entered");
		if(lp.checkResend()) {
			log.error("The entered otp does not meet the specified length. Please re-enter valid OTP");
			log.info("TC002_InValidLogin test case is passed since error message is logged as expected");
		}
		
		
	}

}
