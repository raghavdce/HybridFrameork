package com.mindtree.BaseClass;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.Pages.AcknowlegementPage;

public class TC012_Acknowledgement extends TC011_SelectTimeSlot {

	
	AcknowlegementPage ack;
	
	
	@Test(dependsOnMethods = "selectDateAndTime")
	public void checkAckPage() {
		log.info("********TC012_Acknowledgement Test is started **********");
		ack = new AcknowlegementPage(driver);
		if (ack.checkSMSButton()) {
			log.info("The application displays the acknowledgement screen");
		} else {
			log.error("The application is not displaying acknowledgement screen");
		}

	}
	
	private String destinationValue;

	@Test(dependsOnMethods = "checkAckPage")
	public void verifyAppName() {
		ack = new AcknowlegementPage(driver);
		log.info("verifying the applicant name matches in acknowledgement screen");
		String appName = readConfig.getPrimaryName();
		String ackName = ack.getUserName();
		//System.out.println(getDestinationValue());
		if (appName.equals(ackName)) {
			log.info("Applicant name matches in acknowledgement screen");
		} else {
			log.error("Applicant name does not matches the acknowledgement screen");
		}
		// Assert.assertEquals(ack.getUserName(), readConfig.getPrimaryName());

	}

	public String getDestinationValue() {
		return destinationValue;
	}


	public void setDestinationValue(String destinationValue) {
		this.destinationValue = destinationValue;
	}



	@Test(dependsOnMethods = "verifyAppName", alwaysRun = true)
	public void pdfNameCheck() throws Exception {
		ack = new AcknowlegementPage(driver);
		ack.clickDownloadPdf();
		log.info("clicked download pdf button");
		Thread.sleep(2000);
		String pdfName = ack.getPRID();
		setDestinationValue(pdfName);
		System.out.println("From getters and setters : " + getDestinationValue());
		System.out.println("From TC0012 --> PRID is : "+pdfName);
		String downloadPath = "C:\\Users\\M1030042\\Downloads";
		File getLatestFile = getLatestFilefromDir(downloadPath);
		String fileName = getLatestFile.getName();
		log.info("Verifying the pdf name matches the PRID");
		Assert.assertTrue(fileName.equals(pdfName + ".pdf"),
				"Downloaded file name is not matching with expected file name");
		log.info("PDF name matches the PRID");
	}

	private File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 0; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	@Test(dependsOnMethods = "pdfNameCheck", alwaysRun = true)
	public void sendSmsEmail() {
		ack = new AcknowlegementPage(driver);
		log.info("From sendSmsEmail method");
		ack.clickSendSmsEmailButton();
		log.info("Clicked the send sms/email button and verifying the ok button is enabled");
		if (ack.checkOkButton()) {
			log.info("In sendSmsEmail method");
			ack.enterEmail(readConfig.setEmail1());
			log.info("Entered valid email address");
			ack.enterMobile(readConfig.setSMS1());
			log.info("Entered valid mobile number");
			ack.clickOK();
			log.info("Ok button is clicked and the ack is sent to the given address");
		} else {
			log.error("Please check the send sms/mobile number field");
		}

	}

	@Test(dependsOnMethods = "sendSmsEmail", alwaysRun = true)
	public void checkInvalidEmailAddress() throws Exception {
		ack = new AcknowlegementPage(driver);
		Thread.sleep(2000);
		log.info("In checkInvalidEmailAddress method");
		ack.clickSendSmsEmailButton();
		log.info("Send SMS/Email button is clicked");
		if (ack.addAckpopup()) {
			log.info("Verified additional ack screen is displayed");
			ack.enterEmail(readConfig.setEmail1() + ",");
			log.info("Entered Invalid email address");
			ack.enterMobile(readConfig.setSMS1());
			log.info("Entered valid mobile number");
		} else
			log.error("Please check the send sms/mobile number field");

		if (ack.checkOkButton()) {
			log.info("Checking the ok button is enabled");
			ack.clickOK();
			log.info("ok button is clicked");
			if (ack.checkInvalidEmailText()) {
				String email = ack.enteredEmailInAck();
				log.info("Please re-check the entered email address. The entered email id is : " + email);
			} else
				log.error("Please check the send sms/mobile number field");
		}

	}
	
	@Test(dependsOnMethods = "checkInvalidEmailAddress", alwaysRun = true)
	public void checkInvalidMobileNumber() throws Exception {
		ack = new AcknowlegementPage(driver);
		Thread.sleep(2000);
		log.info("In checkInvalidMobileNumber method");
		ack.clickSendSmsEmailButton();
		log.info("Send SMS/Email button is clicked");
		Thread.sleep(2000);
		if (ack.addAckpopup()) {
			log.info("Verified additional ack screen is displayed");
			ack.enterEmail(readConfig.setEmail1());
			log.info("Entered valid email address");
			ack.enterMobile(readConfig.setSMS1()+ ",");
			log.info("Entered invalid mobile number");
		} else
			log.error("Please check the send sms/mobile number field");

		if (ack.checkOkButton()) {
			log.info("Checking the ok button is enabled");
			if (ack.checkInvalidSmsText()) {
				log.info("Please re-enter the valid mobile number");
				ack.clearMobile();
				log.info("Cleared the invalid mobile number");
				ack.enterMobile(readConfig.setSMS1());
				log.info("Entered valid mobile number");
				ack.clickOK();
				log.info("Clicked Ok button");
				/*driver.navigate().refresh();
				Thread.sleep(3000);*/
				ack.clickYourApp();
				log.info("Clicked your app button in ack screen");
			} else
				log.error("Please check the send sms/mobile number field");
		}

	}
}
