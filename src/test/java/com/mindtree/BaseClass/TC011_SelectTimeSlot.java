package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.DateAndTimeSlotPage;

public class TC011_SelectTimeSlot extends TC010_SelectCenterByCountry {

	DateAndTimeSlotPage date;

	@Test(dependsOnMethods = "selectCenterByCountry")
	public void checkTimeSlotPage() {
		log.info("************* TC011_SelectTimeSlot is started *************");
		date = new DateAndTimeSlotPage(driver);
		if (date.noonDisplayed()) {
			log.info("Time and date slot page is displayed");
		} else {
			log.error("Time and slot page is not displayed");
		}

	}

	@Test(dependsOnMethods = "checkTimeSlotPage")
	public void selectDateAndTime() {
		date = new DateAndTimeSlotPage(driver);
		/*while (true) {
			if (date.checkDateDisplayed()) {
				log.info("Selecting the desired date");
				date.selectDate();
				log.info("Desired date for appointment is selected");
				break;
			} else {
				log.info("since the date is not in view, clicking next to see the desire date");
				date.clickNext();
			}
		}*/
		int slots = date.getAvailableBookings();
		log.info("Getting the list of available slots as on Today");
		for(int i=0;i<slots;i++) {
			log.info("Checking the slot avilable today is not Saturday and Sunday");
			if(!(date.listWeekDay(i).getText().toString().equalsIgnoreCase("Saturday") || date.listWeekDay(i).getText().toString().equalsIgnoreCase("Sunday"))) {
				log.info("Confirmed the slot available today is a weekday");
				date.listBookings(i).click();
				log.info("Desired date for appointment is selected");
				break;
			}
			
		}
		
		date.clickMorning();
		log.info("Morning slot is selected");
		date.morningSlot1();
		log.info("Time for morning slot is selected");
		if (date.checkAddApp()) {
			date.clickAddApplicant();
			log.info("Add Applicant button is clicked");
			date.clickContinue();
			log.info("Continue button is clicked");
			date.clickOkButton();
			log.info("Ok button is clicked to see the ack screen");
		}
		// need to add one more condition with OR operator to see if current time stamp is > = 12 PM
		else if (!date.checkAddApp()) {
			date.noonSlot();
			log.info("Noon slot is selected since no morning slot is available");
			date.noonSlot1();
			log.info("Time for noon slot is selected");
			date.clickAddApplicant();
			log.info("Add Applicant button is clicked");
			date.clickContinue();
			log.info("Continue button is clicked");
			date.clickOkButton();
			log.info("Ok button is clicked to see the ack screen");
		}


	}

}
