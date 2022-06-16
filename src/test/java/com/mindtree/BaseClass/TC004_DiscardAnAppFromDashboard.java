package com.mindtree.BaseClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.Pages.AcknowlegementPage;
import com.mindtree.Pages.Dashboard;

public class TC004_DiscardAnAppFromDashboard extends TC012_Acknowledgement {

	Dashboard dash;

	/*
	 * @Test(dependsOnMethods="checkInvalidMobileNumber") public String getPRID()
	 * throws Exception {
	 * log.info("********TC004_DiscardApp Test is started **********"); ack = new
	 * AcknowlegementPage(driver); String PRIDNumber = ack.getPRID();
	 * log.info("PRID is fetched and stored in a variable successfully"); return
	 * PRIDNumber; }
	 */

	@Test(dependsOnMethods = "checkInvalidMobileNumber")
	public void deleteBookedPRID() throws Exception {
		log.info("********From Deleting a booked Prid method **********");
		String PRIDNumber = super.getDestinationValue();
		System.out.println("PRID from ack is and printing from dashboard test class : " + PRIDNumber);
		dash = new Dashboard(driver);
		int j = dash.getPRIDSize();
		System.out.println("The size of PRID is : " + dash.getPRIDSize());
		System.out.println("The size of chkbox is : " + dash.getchkboxSize());
		for (int i = 0; i < j - 1; i++) {
			String prid = dash.listPRID(i).getText().toString();
			if (prid.equals(PRIDNumber)) {
				System.out.println("In if loop of prid match");
				dash.listChkBox(i).click();
				dash.listDelImage(i).click();
			}
		}
		dash.clickDiscardOption();
		dash.clickSubmit();
		dash.clickConfirm();
		dash.clickOk();
	}

	@Test(dependsOnMethods = "deleteBookedPRID")
	public void expiredToBooked() throws Exception {
		log.info("********From Expired to Booked Prid method **********");
		dash = new Dashboard(driver);
		int j = dash.getPridStatusSize();
		System.out.println("The size of the status in dashboard screen is : " + j);
		int k = dash.getchkboxSize();
		System.out.println("The size of the status in dashboard screen is : " + k);
		log.info("Getting the list of PRID status");
		for (int i = 0; i <j; i++) {
			//dash.listChkBox(i).click();
			log.info("Getting into for loop of expired to booked method");
			String prid = dash.listPridStatus(i).getText().toString();
			String prid1[] = prid.split(" ");
			log.info("Getting the PRID status");
			String pridStatus = prid1[1];
			System.out.println("The prid status at " + i + "th position is " + pridStatus );
			log.info("PRID status is assigned to a variable");
			if (pridStatus.equals(readConfig.getExpiredPrid())) {
				log.info("Verifying the PRID status matches Expired");
				dash.listChkBox(i+1).click();
				log.info("Selecting the respective prid");
				/*dash.clickBookOrModifyApp();
				log.info("Clicking the Book or Modify App button");
				TC010_SelectCenterByCountry select = new TC010_SelectCenterByCountry();
				log.info("Calling the select by country method from TC010");
				select.selectCenterByCountry();
				log.info("TC010 method is running");*/
			}
			else {
				log.info("The status of PRID is not Expired");
			}
		}
	}

}
