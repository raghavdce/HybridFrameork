package com.mindtree.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ValidateDemoPage extends DemographicPage {

	public ValidateDemoPage(WebDriver rdriver) {
		super(rdriver);

	}

	@FindBy(xpath = "//button[contains(text(),'Create New Application')]")
	WebElement createNewApplication;

	@FindBy(xpath = "//*[@id='mat-checkbox-1']/label") // mat-checkbox-1-input
	WebElement termsChxbox;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	WebElement acceptButton;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	WebElement continueButton;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid name')]")
	WebElement enterValidName;

	@FindBy(xpath = "//div[contains(text(),' Enter Valid date of birth or age ')]")
	WebElement entervalidDOB;

	@FindBy(xpath = "//div[contains(text(),'Please select gender')]")
	WebElement selectGender;

	@FindBy(xpath = "//div[contains(text(),' Please select Residence Status ')]")
	WebElement selectResident;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid address')]")
	WebElement enterAddress1;

	@FindBy(id = "mat-error-2")
	WebElement enterAddress2;

	@FindBy(id = "mat-error-3")
	WebElement enterAddress3;

	@FindBy(xpath = "//mat-error[contains(text(),'Please select a Region')]")
	WebElement selectRegion;

	@FindBy(xpath = "//mat-error[contains(text(),'Please select a Province')]")
	WebElement selectProvince;

	@FindBy(xpath = "//mat-error[contains(text(),'Please select a city')]")
	WebElement selectCity;

	@FindBy(xpath = "//mat-error[contains(text(),'Please select zone')]")
	WebElement selectZone;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid postalCode')]")
	WebElement enterPostalCode;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid mobile number')]")
	WebElement enterMobile;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid email id')]")
	WebElement enterEmail;

	@FindBy(xpath = "//mat-error[contains(text(),'Please enter valid Reference Identity Number')]")
	WebElement enterReference;

	public void clickCreateNewApplication() {
		createNewApplication.click();
	}

	public void checkTerms() {
		termsChxbox.click();
	}

	public boolean acceptEnabled() {
		return acceptButton.isEnabled();
	}

	public void clickAccept() {
		acceptButton.click();
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public boolean checkValidName() {
		return enterValidName.isDisplayed();
	}

	public void getFullNameErrorMsg() {
		Assert.assertEquals(enterValidName.getText().trim(), "Please enter valid name");
	}

	public boolean checkValidDOB() {
		return entervalidDOB.isDisplayed();
	}
	
	public void getDOBErrorMsg() {
		Assert.assertEquals(entervalidDOB.getText().trim(), "Enter Valid date of birth or age");
	}

	public boolean checkGender() {
		return selectGender.isDisplayed();
	}
	
	public void getGenderErrorMsg() {
		Assert.assertEquals(selectGender.getText().trim(), "Please select gender");
	}

	public boolean checkResident() {
		return selectResident.isDisplayed();
	}
	
	public void getResidentErrorMsg() {
		Assert.assertEquals(selectResident.getText().trim(), "Please select Residence Status");
	}

	public boolean checkAddress1() {
		return enterAddress1.isDisplayed();
	}
	
	public void getAdd1ErrorMsg() {
		Assert.assertEquals(enterAddress1.getText().trim(), "Please enter valid address");
	}

	public boolean checkAddress2() {
		return !enterAddress2.isDisplayed();
	}
	
	public void getAdd2ErrorMsg() {
		Assert.assertEquals(enterAddress2.getText().trim(), "Please enter valid address");
	}

	public boolean checkAddress3() {
		return !enterAddress3.isDisplayed();
	}
	
	public void getAdd3ErrorMsg() {
		Assert.assertEquals(enterAddress3.getText().trim(), "Please enter valid address");
	}

	public boolean checkRegion() {
		return selectRegion.isDisplayed();
	}
	
	public void getRegionErrorMsg() {
		Assert.assertEquals(selectRegion.getText().trim(), "Please select a Region");
	}

	public boolean checkProvince() {
		return selectProvince.isDisplayed();
	}
	
	public void getProvinceErrorMsg() {
		Assert.assertEquals(selectProvince.getText().trim(), "Please select a Province");
	}

	public boolean checkCity() {
		return selectCity.isDisplayed();
	}
	
	public void getCityErrorMsg() {
		Assert.assertEquals(selectCity.getText().trim(), "Please select a city");
	}

	public boolean checkZone() {
		return selectZone.isDisplayed();
	}
	
	public void getZoneErrorMsg() {
		Assert.assertEquals(selectZone.getText().trim(), "Please select zone");
	}
	
	public boolean checkPostal() {
		return enterPostalCode.isDisplayed();
	}
	
	public void getPostalCodeErrorMsg() {
		Assert.assertEquals(enterPostalCode.getText().trim(), "Please enter valid postalCode");
	}
	
	public boolean checkMobile() {
		return !enterMobile.isDisplayed();
	}
	
	public void getMobileErrorMsg() {
		Assert.assertEquals(enterMobile.getText().trim(), "Please enter valid mobile number");
	}
	
	public boolean checkEmail() {
		return !enterEmail.isDisplayed();
	}
	
	public void getEmailErrorMsg() {
		Assert.assertEquals(enterEmail.getText().trim(), "Please enter valid email id");
	}
	
	public boolean checkReference() {
		return enterReference.isDisplayed();
	}
	
	public void getReferenceErrorMsg() {
		Assert.assertEquals(enterReference.getText().trim(), "Please enter valid Reference Identity Number");
	}
	
	

}
