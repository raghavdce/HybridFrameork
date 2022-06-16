package com.mindtree.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewPage {

	WebDriver ldriver;

	public PreviewPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[1]/td[3]")
	WebElement fullNameValue;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[2]/td[3]")
	WebElement dobValue;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[3]/td[3]")
	WebElement ageValue;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[4]/td[3]")
	WebElement genderValue;
	
	@FindBy(xpath="//div[1]/div[2]/table/tbody/tr[5]/td[3]")
	WebElement residentValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[1]/td[3]")
	WebElement address1Value;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[2]/td[3]")
	WebElement regionValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[3]/td[3]")
	WebElement provinceValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[4]/td[3]")
	WebElement cityValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[5]/td[3]")
	WebElement zoneValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[6]/td[3]")
	WebElement mobileValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[7]/td[3]")
	WebElement emailValue;
	
	@FindBy(xpath="//div[1]/div[4]/table/tbody/tr[8]/td[3]")
	WebElement referenceValue;
	
	@FindBy(xpath="//button[contains(text(),'BACK')]")
	WebElement previewBackButton;
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE')]")
	WebElement previewContinueButton;
	
	@FindBy(xpath="//button[contains(text(),'ADD APPLICANT')]")
	WebElement addAppButton;
	
	@FindBy(xpath="//div[2]/div[1]/div/span[2]")
	WebElement demoModify;
	
	@FindBy(xpath="//div/mat-card/div/span[2]")
	WebElement docModify;
	
	@FindBy(xpath="//b[contains(text(),'Recommended Centres')]")
	WebElement centerList;
	
	public String getFullName() {
		String fullName = fullNameValue.getText();
		return fullName;
	}
	
	public String getDOB() {
		String dob = dobValue.getText();
		return dob;
	}
	
	public String getAge() {
		String age = ageValue.getText();
		return age;
	}
	
	public String getGender() {
		String gender = genderValue.getText();
		return gender;
	}
	
	public String getResident() {
		String resident = residentValue.getText();
		return resident;
	}
	
	public String getAdd1() {
		String add1 = address1Value.getText();
		return add1;
	}
	
	public String getRegion() {
		String region = regionValue.getText();
		return region;
	}
	
	public String getProvince() {
		String province = provinceValue.getText();
		return province;
	}
	
	public String getCity() {
		String city = cityValue.getText();
		return city;
	}
	
	public String getZone() {
		String zone = zoneValue.getText();
		return zone;
	}
	
	public String getMobile() {
		String mobile = mobileValue.getText();
		return mobile;
	}
	
	public String getEmail() {
		String email = emailValue.getText();
		return email;
	}
	
	public String getReference() {
		String reference = referenceValue.getText();
		return reference;
	}
	
	public void clickDemoModify() {
		demoModify.click();
	}
	
	public void clickDocModify() {
		docModify.click();
	}
	
	public void clickContinue() {
		previewContinueButton.click();
	}
	
	public void clickBack() {
		previewBackButton.click();
	}
	
	public void clickAddApp() {
		addAppButton.click();
	}
	
	public boolean centerList() {
		return centerList.isDisplayed();
	}
	
	

}
