package com.mindtree.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.BaseClass.BaseClass;
import com.mindtree.Utility.ReadOTP;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "inputFieldContact")
	WebElement userName;

	@FindBy(xpath = "//span[contains(text(),' Send OTP ')]")
	WebElement clickSendOTP;

	@FindBy(id = "inputFieldOTP")
	WebElement sendOTP;

	@FindBy(xpath = "//span[contains(text(),' Verify ')]")
	WebElement login;
	
	@FindBy(xpath="//span[contains(text(),'Resend')]")
	WebElement resend;
	
	@FindBy(xpath="//button[contains(text(),'Create New Application')]")
	WebElement createNewApplication;
	
	public String verifyText() {
		return login.getText();
	}

	public void setUserName(String mail) {
		userName.sendKeys(mail);
	}

	public void clickSendOTP() {
		clickSendOTP.click();
	}

	public void setOTP(String OTP) {
		sendOTP.sendKeys(OTP);
	}

	public void clickLogin() {
		login.click();
	}
	
	public boolean checkCreateApp() {
		return createNewApplication.isDisplayed();
	}
	
	public boolean checkResend() {
		return resend.isDisplayed();
	}
	
	public boolean checkLogin() {
		return login.isDisplayed();
	}
	
	public void clickResend() {
		resend.click();
	}
	
	public void clickCreateNewApp() {
		createNewApplication.click();
	}

}
