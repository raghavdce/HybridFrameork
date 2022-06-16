package com.mindtree.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemographicPage {

	WebDriver ldriver;

	public DemographicPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//button[contains(text(),'Create New Application')]")
	WebElement createNewApplication;

	@FindBy(xpath = "//*[@id='mat-checkbox-1']/label")  //mat-checkbox-1-input
	WebElement termsChxbox;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	WebElement acceptButton;

	@FindBy(xpath = "//mat-icon[contains(text(),'close')]")
	WebElement closeButton;
	
	@FindBy(xpath = "//span[contains(text(),' Ok ')]")
	WebElement okButtonInConsent;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement primaryFullName;

	@FindBy(xpath = "//input[@placeholder='الاسم الكامل']")
	WebElement secondaryFullname;

	@FindBy(xpath = "//input[@placeholder='DD']")
	WebElement date;

	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement month;

	@FindBy(xpath = "//input[@placeholder='YYYY']")
	WebElement year;

	@FindBy(xpath = "//input[@placeholder='Age']")
	WebElement age;

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	WebElement maleGender;

	@FindBy(xpath = "//div[contains(text(),'Female')]")
	WebElement femaleGender;

	@FindBy(xpath = "//div[contains(text(),'Foreigner')]")
	WebElement foreigner;

	@FindBy(xpath = "//div[contains(text(),'Non-Foreigner')]")
	WebElement nonForeigner;

	@FindBy(xpath = "//input[@placeholder='Address Line 1']") 
	WebElement primaryAddress1;

	@FindBy(xpath = "//input[@placeholder='Address Line 2']")
	WebElement primaryAddress2;

	@FindBy(xpath = "//input[@placeholder='Address Line 3']")
	WebElement primaryAddress3;

	@FindBy(xpath = "//input[@placeholder='العنوان السطر 1']")
	WebElement secondaryAddress1;

	@FindBy(xpath = "//input[@placeholder='العنوان السطر 2']")
	WebElement secondaryAddress2;

	@FindBy(xpath = "//input[@placeholder='العنوان السطر 3']")
	WebElement secondaryAddress3;

	@FindBy(xpath = "//mat-select[@aria-label='Region']") //*[@id="mat-select-1"]/div/div[1]/span
	WebElement region;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	WebElement regionValue;
	
	
	@FindBy(xpath = "//span[@class='ng-tns-c12-15 ng-star-inserted']")
	WebElement selectedRegionValue;
	
	
	@FindBy(xpath = "//mat-select[@aria-label='Province']")
	WebElement province;
	
	@FindBy(xpath = "//Span[starts-with(@class,'mat-option-text') and contains(text(),'Kenitra')]")
	WebElement provinceValue;
	
	@FindBy(xpath = "//span[@class='ng-tns-c12-17 ng-star-inserted']")
	WebElement selectedProvinceValue;

	@FindBy(xpath = "//mat-select[@aria-label='City']")
	WebElement city;
	
	@FindBy(xpath = "//Span[starts-with(@class,'mat-option-text') and contains(text(),'Kenitra')]") 
	WebElement cityValue;
	
	@FindBy(xpath = "//span[@class='ng-tns-c12-19 ng-star-inserted']")
	WebElement selectedCityValue;

	@FindBy(xpath = "//mat-select[@aria-label='Zone']")
	WebElement zone;
	
	@FindBy(xpath = "//Span[starts-with(@class,'mat-option-text') and contains(text(),'Assam')]")
	WebElement zoneValue;
	
	@FindBy(xpath = "//span[@class='ng-tns-c12-21 ng-star-inserted']")
	WebElement selectedZoneValue;

	@FindBy(xpath = "//input[@placeholder='Postal Code']")
	WebElement primaryPostCode;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement primaryMobile;

	@FindBy(xpath = "//input[@placeholder='Email ID']")
	WebElement primaryEmail;

	@FindBy(xpath = "//input[@placeholder='Reference Identity Number']")
	WebElement primaryReferenceNum;
	
	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	WebElement continueButton;

	public void checkTerms() {
		termsChxbox.click();
	}

	public boolean acceptEnabled() {
		return acceptButton.isEnabled();
	}

	public void clickAccept() {
		acceptButton.click();
	}

	public void setPrimaryName(String primaryName) {
		primaryFullName.sendKeys(primaryName);
	}

	public void setDate(String dd) {
		date.sendKeys(dd);
	}

	public void setMonth(String mm) {
		month.sendKeys(mm);
	}

	public void setYear(String yy) {
		year.sendKeys(yy);
	}

	public void setAge(String age1) {
		age.sendKeys(age1);
	}

	public void setMGender() {
		maleGender.click();
	}

	public void setFGender() {
		femaleGender.click();
	}

	public void setForeignResident() {
		foreigner.click();
	}

	public void setNationResident() {
		nonForeigner.click();
	}

	public void setPrimAdd1(String pAddress1) {
		primaryAddress1.sendKeys(pAddress1);
	}

	public void setPrimAdd2(String pAddress2) {
		primaryAddress2.sendKeys(pAddress2);
	}

	public void setPrimAdd3(String pAddress3) {
		primaryAddress3.sendKeys(pAddress3);
	}
	
	public void setSecondAdd1(String sAddress1) {
		secondaryAddress1.sendKeys(sAddress1);
	}

	public void setSecondAdd2(String sAddress2) {
		secondaryAddress2.sendKeys(sAddress2);
	}

	public void setSecondAdd3(String sAddress3) {
		secondaryAddress3.sendKeys(sAddress3);
	}
	
	public void clickRegion() {
		region.click();
	}
	
	public void setRegion() {
		regionValue.click();
		
	}
	
	public String getRegion() {
		String region = selectedRegionValue.getText().toString();
		return region;
	}
	
	public void clickProvince() {
		province.click();
	}
	
	public void setProvince() {
		provinceValue.click();
	}
	
	public String getProvince() {
		String province = selectedProvinceValue.getText().toString();
		return province;
	}
	
	public void clickCity() {
		city.click();
	}
	
	public void setCity() {
		cityValue.click();
	}
	
	public String getCity() {
		String city = selectedCityValue.getText().toString();
		return city;
	}
	
	public void clickZone() {
		zone.click();
	}
	
	public void setZone() {
		zoneValue.click();
	}
	
	public String getZone() {
		String zone = selectedZoneValue.getText().toString();
		return zone;
	}
	
	public void setPrimaryPost(String primaryPost) {
		primaryPostCode.sendKeys(primaryPost);
	}
	
	public void setPrimaryMobile(String primaryMobile1) {
		primaryMobile.sendKeys(primaryMobile1);
	}
	
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail.sendKeys(primaryEmail);
	}
	
	public void setPrimaryReference(String primaryReference1) {
		primaryReferenceNum.sendKeys(primaryReference1);
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public void clickCloseButtonInConsent() {
		closeButton.click();
	}
	
	public boolean checkOkButton() {
		return okButtonInConsent.isDisplayed();
	}
	
	public void clickOkButtonInConsent() {
		okButtonInConsent.click();
	}
	
	public boolean checkCreateApp() {
		return createNewApplication.isDisplayed();
	}
	

}
