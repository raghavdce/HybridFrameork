package com.mindtree.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBookAppointment {
	
	WebDriver ldriver;
	
	public SearchBookAppointment(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Recommended Centres')]")
	WebElement centerList;
	
	@FindBy(xpath="//button[@class='search-btn mat-icon-button']")
	WebElement centerSearchButton;
	
	@FindBy(xpath="//span[contains(text(),'Select Location Types')]")
	WebElement centerByTypeDropdown;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//form/mat-card[2]/button[1]")
	WebElement searchAfterUserEntersText;
	
	@FindBy(xpath="//form/mat-card[2]/button[2]")
	WebElement searchCloseButton;
	
	@FindBy(xpath="//span[contains(text(),'City')]")
	WebElement searchByCity;
	
	@FindBy(xpath="//span[contains(text(),'Region')]")
	WebElement searchByRegion;
	
	@FindBy(xpath="//span[contains(text(),'Province')]")
	WebElement searchByProvince;
	
	@FindBy(xpath="//span[contains(text(),'Zone')]")
	WebElement searchByZone;
	
	@FindBy(xpath="//span[contains(text(),'Postal Code')]")
	WebElement searchByPostal;
	
	@FindBy(xpath="//span[contains(text(),' Country ')]")
	WebElement searchByCountry;
	
	@FindBy(xpath="//button[contains(text(),'Book Later')]")
	WebElement bookLaterButton;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continueButton;
	
	@FindBy(xpath="//button[contains(text(),'Back')]")
	WebElement backButton;
	
	@FindBy(xpath="//strong[contains(text(),'Center Sidi Allal Tazi, National Road, Alla Tazi, Morocco')]//preceding::input[1]")
	WebElement selectCenter;
	
	@FindBy(xpath="//div[contains(text(),'Available Applicants')]")
	WebElement appointmentSlot;
	
	public boolean checkcenter() {
		return centerList.isDisplayed();
	}
	
	public void clickSearchMaincenter() {
		centerSearchButton.click();
	}
	
	public void clickCenterDropdown() {
		centerByTypeDropdown.click();
	}
	
	public void selectCenterCountry() {
		searchByCountry.click();
	}
	
	public void enterCountry(String country) {
		searchTextBox.sendKeys(country);
	}
	
	public void clickBackInCenterSelection() {
		backButton.click();
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	
	public void clickBookLater() {
		bookLaterButton.click();
	}
	
	public void clickCenter() {
		selectCenter.click();
	}
	
	public void searchCenterAfterUserEntersValue() {
		searchAfterUserEntersText.click();
	}
	
	
	
	
	
	

}
