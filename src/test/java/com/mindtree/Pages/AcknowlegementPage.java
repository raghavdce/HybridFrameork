package com.mindtree.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcknowlegementPage {

	WebDriver ldriver;

	public AcknowlegementPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//tr[1]/td[1][contains(text(),'Name')]/following::td[2]")
	WebElement applicantName;

	@FindBy(xpath = "//tr[2]/td[1][contains(text(),'Pre Registration ID')]/following::td[2]")
	WebElement applicantPRID;

	@FindBy(xpath = "//tr[5]/td[1][contains(text(),'Appointment Date & Time')]/following::td[2]")
	WebElement appointmentDate;

	@FindBy(xpath = "//span[contains(text(),'SEND EMAIL/SMS')]")
	WebElement sendSmsEmailButton;

	@FindBy(xpath = "//span[contains(text(),'DOWNLOAD PDF')]")
	WebElement downloadPdfButton;

	@FindBy(xpath = "//span[contains(text(),'PRINT')]")
	WebElement printButton;

	@FindBy(xpath = "//mat-icon[contains(text(),'power_settings_new')]//preceding::a[1]")
	WebElement yourApplicaiton;

	@FindBy(xpath = "//a[2]/div/mat-icon")
	WebElement logout;

	@FindBy(xpath = "//input[@placeholder='Enter email ID']")
	WebElement emailAck;

	@FindBy(xpath = "//input[@placeholder='Enter mobile number']")
	WebElement smsAck;

	@FindBy(xpath = "//span[contains(text(),' OK ')]")
	WebElement okButton;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid Email ID')]")
	WebElement invalidEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid Mobile Number')]")
	WebElement invalidMobile;
	
	@FindBy(xpath = "//h1[contains(text(),'Email / SMS Acknowledgement')]")
	WebElement checkAddAckPopUp;
	
	public boolean addAckpopup() {
		return checkAddAckPopUp.isDisplayed();
	}

	public boolean checkSMSButton() {
		return sendSmsEmailButton.isDisplayed();
	}

	public String getUserName() {
		String name = applicantName.getText().toString();
		return name;
	}
	
	public String getPRID() {
		String prid = applicantPRID.getText().toString();
		return prid;
	}
	
	public void clickSendSmsEmailButton() {
		sendSmsEmailButton.click();
	}
	
	public void clickPrint() {
		printButton.click();
	}
	
	public void clickDownloadPdf() {
		downloadPdfButton.click();
	}
	
	public void enterEmail(String email) {
		emailAck.sendKeys(email);
	}
	
	public void enterMobile(String mobile) {
		smsAck.sendKeys(mobile);
	}
	
	public void clearMobile() {
		smsAck.clear();
	}
	
	public void clickOK() {
		okButton.click();
	}
	
	public boolean checkOkButton() {
		return okButton.isEnabled();
	}
	
	public void clickYourApp() {
		yourApplicaiton.click();
	}
	
	public boolean checkYourApp() {
		return yourApplicaiton.isDisplayed();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public String invalidEmailText() {
		String email = invalidEmail.getText().toString();
		return email;
	}
	
	public boolean checkInvalidEmailText() {
		return invalidEmail.isDisplayed();
	}
	
	public String invalidMobileText() {
		String mobile = invalidMobile.getText().toString();
		return mobile;
	}
	
	public boolean checkInvalidSmsText() {
		return invalidMobile.isDisplayed();
	}
	
	public String enteredEmailInAck() {
		String email = emailAck.getText().toString();
		return email;
	}
	
	public String enteredMobileInAck() {
		String mobile = smsAck.getText().toString();
		return mobile;
	}
}
