package com.mindtree.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.Utility.ReadConfig;

public class DateAndTimeSlotPage {

	WebDriver ldriver;

	public DateAndTimeSlotPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/*@FindBy(xpath = "//p[1][contains(text(),'30 Apr 2020')]")
	WebElement appointmentDate;*/
	
	@FindBy(xpath = "//p[2]")
	List<WebElement> weekDay;
	
	@FindBy(xpath = "//p[3]")
	List<WebElement> appointmentLeft;
	
	@FindBy(xpath = "//p[4]")
	List<WebElement> availableBookings;
	
	@FindBy(xpath = "//a[contains(text(),'Morning')]")
	WebElement morningSlot;

	@FindBy(xpath = "//a[contains(text(),'Afternoon')]")
	WebElement afternoonSlot;

	@FindBy(xpath = "//a[contains(text(),'Morning')]//following::p[1]")
	WebElement morningTimeSlot1;

	@FindBy(xpath = "//a[contains(text(),'Morning')]//following::p[3]")
	WebElement morningTimeSlot2;

	@FindBy(xpath = "//a[contains(text(),'Morning')]//following::p[5]")
	WebElement morningTimeSlot3;

	@FindBy(xpath = "//a[contains(text(),'Morning')]//following::p[7]")
	WebElement morningTimeSlot4;

	@FindBy(xpath = "//a[contains(text(),'Afternoon')]//following::p[1]")
	WebElement noonTimeSlot1;

	@FindBy(xpath = "//a[contains(text(),'Afternoon')]//following::p[3]")
	WebElement noonTimeSlot2;

	@FindBy(xpath = "//a[contains(text(),'Afternoon')]//following::p[5]")
	WebElement noonTimeSlot3;

	@FindBy(xpath = "//a[contains(text(),'Afternoon')]//following::p[7]")
	WebElement noonTimeSlot4;

	@FindBy(xpath = "//div/div/div[4]/a/img")
	WebElement dateSelectorNext;

	@FindBy(xpath = "//div/div/div[2]/a/img")
	WebElement dateSelectorPrevious;

	@FindBy(xpath = "//div[2]/div[2]/table/tbody/tr/td[2]/mat-icon")
	WebElement addApplicant;

	@FindBy(xpath = "//button[contains(text(),'Back')]")
	WebElement backButton;

	@FindBy(xpath = "//button[contains(text(),' Continue ')]")
	WebElement continueButton;

	@FindBy(xpath = "//button[contains(text(),'  Book Later ')]")
	WebElement bookLaterButton;
	
	@FindBy(xpath="//button/span[contains(text(),'Ok')]")
	WebElement okButton;
	
	// remove till line number 100 if new logic is not working
	public int getAvailableBookings() {
		return availableBookings.size();
	}
	
	public int getAppointmentLeft() {
		return appointmentLeft.size();
	}
	
	public int getWeekDay() {
		return weekDay.size();
	}
	
	public WebElement listWeekDay(int a) {
		return weekDay.get(a);
	}
	
	public WebElement listBookings(int a) {
		return availableBookings.get(a);
	}
	
	/*public void selectDate() {
		appointmentDate.click();
	}

	public boolean checkDateDisplayed() {
		return appointmentDate.isDisplayed();
	}*/

	public void clickNext() {
		dateSelectorNext.click();
	}

	public void clickPrevious() {
		dateSelectorPrevious.click();
	}

	public void clickMorning() {
		morningSlot.click();
	}

	public void morningSlot1() {
		morningTimeSlot1.click();
	}

	public void morningSlot2() {
		morningTimeSlot2.click();
	}

	public void morningSlot3() {
		morningTimeSlot3.click();
	}

	public void morningSlot4() {
		morningTimeSlot4.click();
	}

	public void noonSlot() {
		afternoonSlot.click();
	}

	public boolean noonDisplayed() {
		return afternoonSlot.isDisplayed();
	}

	public void noonSlot1() {
		noonTimeSlot1.click();
	}

	public void noonSlot2() {
		noonTimeSlot2.click();
	}

	public void noonSlot3() {
		noonTimeSlot3.click();
	}

	public void noonSlot4() {
		noonTimeSlot4.click();
	}

	public void clickContinue() {
		continueButton.click();
	}

	public void clickBack() {
		backButton.click();
	}

	public void clickBookLater() {
		bookLaterButton.click();
	}

	public void clickAddApplicant() {
		addApplicant.click();
	}

	public boolean checkAddApp() {
		return addApplicant.isEnabled();
	}
	
	public void clickOkButton() {
		okButton.click();
	}

}
