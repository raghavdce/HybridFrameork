package com.mindtree.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentUploadPage {

	WebDriver ldriver;

	public DocumentUploadPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//span[contains(text(),'POI')]")
	WebElement poiDropdown;
	
	@FindBy(xpath="//span[contains(text(),' CNIE card ')]")
	WebElement poiDropdownValue;
	
	@FindBy(xpath="//div[1]/span/input[2]")
	WebElement poiBrowse;
	
	@FindBy(xpath="//span[contains(text(),'POA')]")
	WebElement poaDropdown;
	
	@FindBy(xpath="//span[contains(text(),' Rental contract ')]")
	WebElement poaDropdownValue;
	
	@FindBy(xpath="//div[2]/span/input[2]")
	WebElement poaBrowse;
	
	@FindBy(xpath="//span[contains(text(),'POB')]")
	WebElement pobDropdown;
	
	@FindBy(xpath="//span[contains(text(),' Certificate of Birth ')]")
	WebElement pobDropdownValue;
	
	@FindBy(xpath="//div[3]/span/input[2]")
	WebElement pobBrowse;
	
	@FindBy(xpath="//button[contains(text(),'BACK')]")
	WebElement backButton;
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE')]")
	WebElement continueButton;
	
	@FindBy(xpath="//p[contains(text(),'Preview')]")
	WebElement preview;
	
	public void clickPOI() {
		poiDropdown.click();
	}
	
	public void selectPOI() {
		poiDropdownValue.click();
	}
	
	public void poiBrowse() {
		poiBrowse.click();
	}
	
	public void clickPOA() {
		poaDropdown.click();
	}
	
	public void selectPOA() {
		poaDropdownValue.click();
	}
	
	public void poaBrowse() {
		poaBrowse.click();
	}
	
	public void clickPOB() {
		pobDropdown.click();
	}
	
	public void selectPOB() {
		pobDropdownValue.click();
	}
	
	public void poBBrowse() {
		pobBrowse.click();
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	
	public void clickBack() {
		backButton.click();
	}
	
	public boolean showPreview() {
		 return preview.isDisplayed();
	}
	
	
	

}
