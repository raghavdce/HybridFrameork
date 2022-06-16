package com.mindtree.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver ldriver;

	public Dashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//button[contains(text(),' Book/Modify Appointment')]")
	WebElement modifyAppointment;

	@FindBy(xpath = "//button[contains(text(),'Create New Application')]")
	WebElement createNewApplication;

	@FindBy(xpath = "//mat-nav-list[2]/a[1]/div")
	WebElement yourApplications;

	@FindBy(xpath = "//mat-nav-list[2]/a[2]/div")
	WebElement logout;
	
	@FindBy(xpath = "//span[contains(text(),'Application ID')]")
	List<WebElement> appCheckBox;
	
	@FindBys(@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::strong"))
	List<WebElement> prid;
	
	@FindBys(@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::img[1]"))
	List<WebElement> delImageList;
	
	@FindBys(@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::td[6]"))
	List<WebElement> pridStatusList;
	
	@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::td[2]")
	WebElement pridName;

	@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::td[4]")
	WebElement pridDateAndTime;

	@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::td[6]")
	WebElement pridStatus;

	@FindBy(xpath = "//span[contains(text(),'Modify Information ')]")
	WebElement modifyInfoInPRID;

	@FindBy(xpath = "//span[contains(text(),'View Acknowledgement')]")
	WebElement viewAck;

	@FindBy(xpath = "//span[contains(text(),'Application ID ')]/following::img[1]")
	WebElement deleteImage;
	
	@FindBy(xpath = "//label//div[contains(text(),'Cancel appointment and save the details')]")
	WebElement cancelApp;
	
	@FindBy(xpath = "//label//div[contains(text(),'Discard entire application')]")
	WebElement discardApp;
	
	@FindBy(xpath = "//span[contains(text(),' Submit ')]")
	WebElement submitButton;
	
	@FindBy(xpath = "//div[2]/span[1]/button/span")
	WebElement confirmButton;
	
	@FindBy(xpath = "//div[2]/span[2]/button/span")
	WebElement cancelButton;
	
	@FindBy(xpath = "//span[contains(text(),' Ok ')]")
	WebElement okButton;
	
	public int getPRIDSize() {
		return prid.size();
	}
	
	public int getchkboxSize() {
		return appCheckBox.size();
	}
	
	public int getDelImgSize() {
		return delImageList.size();
	}
	
	public int getPridStatusSize() {
		return pridStatusList.size();
	}
	
	public WebElement listPRID(int a) {
		return prid.get(a);
	}
	
	public WebElement listChkBox(int b) {
		return appCheckBox.get(b);
	}
	
	public WebElement listDelImage(int c) {
		return delImageList.get(c);
	}
	
	public WebElement listPridStatus(int d) {
		return pridStatusList.get(d);
	}
	
	public void clickYourApp() {
		yourApplications.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public void clickCreateNewApp() {
		createNewApplication.click();
	}
	
	public boolean checkCreateNewApp() {
		return createNewApplication.isDisplayed();
	}
	
	public void clickBookOrModifyApp() {
		modifyAppointment.click();
	}
	
	/*public void clickAppCheckBox() {
		appCheckBox.click();
	}*/
	
	public void clickDelete() {
		deleteImage.click();
	}
	
	public void clickDiscardOption() {
		discardApp.click();
	}
	
	public void clickCancelAppOption() {
		cancelApp.click();
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void clickConfirm() {
		confirmButton.click();
	}
	
	public void clickCancel() {
		cancelButton.click();
	}
	
	public void clickOk() {
		okButton.click();
	}
	
	public void clickmodify() {
		modifyInfoInPRID.click();
	}
	
	public void clickViewAck() {
		viewAck.click();
	}
	
}
