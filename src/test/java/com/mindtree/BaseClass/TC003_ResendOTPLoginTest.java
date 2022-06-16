package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.LoginPage;
import com.mindtree.Utility.ReadOTP;

public class TC003_ResendOTPLoginTest extends BaseClass{

	@Test
	public void resendOTP() throws Exception {

		log.info("********TC003_ResendOTPLoginTest is strated **********");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username1);
		log.info("Entered username");
		lp.clickSendOTP();
		log.info("Awaiting for valid OTP");
		Thread.sleep(3000);
		lp.setOTP(ReadOTP.getOTP() + 1);
		log.info("OTP is entered");
		if (lp.checkResend()) {
			lp.clickResend();
			Thread.sleep(3000);
			lp.setOTP(ReadOTP.getOTP());
			log.info("OTP is entered");
			if (lp.checkLogin()) {
				lp.clickLogin();
				log.info("clicked login button");
				if (lp.checkCreateApp()) {
					log.info("TC003_ValidLogin test case is passed");
				} else {
					log.error("TC003_ValidLogin test case is failed");

				}
			}
			
		}
	}

}
