package com.mindtree.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mindtree.Pages.SearchBookAppointment;

@Listeners(com.mindtree.Utility.Listeners.class)

public class TC010_SelectCenterByCountry extends TC009_ValidatePreview {

	SearchBookAppointment search;

	@Test(dependsOnMethods = "clickContinueInPreview")
	public void checkFullName() {
		log.info("******* TC010_SelectCenterByCountry is started *********");
		search = new SearchBookAppointment(driver);
		if (search.checkcenter()) {
			log.info(" # Book Appointment by center # - page is displayed");
		} else {
			log.error("Book Appointment by center page is not displayed");
		}
	}

	@Test(dependsOnMethods = "checkFullName")
	public void selectCenterByCountry() throws Exception {

		search.clickSearchMaincenter();
		log.info("Clicked the main search button");
		search.clickCenterDropdown();
		log.info("Clicked the dropdown to select center by type");
		search.selectCenterCountry();
		log.info("selected country as the type");
		search.enterCountry(readConfig.getCountryForCenter());
		log.info("Entered the country name");
		search.searchCenterAfterUserEntersValue();
		log.info("Clicked the inner search button to get the list of center that matches the criteria");
		search.clickCenter();
		log.info("selected the desire center");
		search.clickContinue();
		log.info("Clicked continue in book appointment page");
		Thread.sleep(4000);
		/*WebElement date = driver.findElement(By.xpath("//p[1][contains(text(),'28 Feb 2020')]"));

		while (true) {
			if (date.isDisplayed()) {
				date.click();
				break;
			} else {
				driver.findElement(By.xpath("//div/div/div[4]/a/img")).click();
			}

		}
		driver.findElement(By.xpath("//a[contains(text(),'Morning')]")).click();
		driver.findElement(By.xpath("//div[2]/mat-card/mat-card-content/p[1]")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr/td[2]/mat-icon"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1100,1500);");
		while (true) {
			if (element1.isDisplayed()) {
				System.out.println("Displayed..");
				driver.manage().window().maximize();
				element1.click();
				break;
			} else {
				System.out.println("Getting inside");
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,1300);", element1);
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//button/span[contains(text(),'Ok')]")).click();
		WebElement PRID = driver
				.findElement(By.xpath("//tr[2]/td[1][contains(text(),'Pre Registration ID')]/following::td[2]"));
		String PRIDtext = PRID.getText().toString();
		System.out.println(PRIDtext);
		// clicking your application button
		driver.findElement(By.xpath("//mat-nav-list[2]/a[1]/div")).click();
		Thread.sleep(4000);
		
		 * WebDriverWait wait = new WebDriverWait(driver,30); WebElement pridInDashboard
		 * = driver.findElement(By.xpath("//strong[contains(text(),'"+PRIDtext+
		 * "')]/preceding::div[1]"));
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//strong[contains(text(),'\"+PRIDtext+\"')]/preceding::div[1]")));
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 * js1.executeScript("arguments[0].scrollIntoView(pridInDashboard);",
		 * pridInDashboard);
		 
		 //Use the below element to click the checkbox before an PRID in dashboard
		WebElement checkBox = driver
				.findElement(By.xpath("//strong[contains(text(),'" + PRIDtext + "')]/preceding::span[2]"));
		if (checkBox.isEnabled()) {
			System.out.println("Check box is clickable");
			checkBox.click();
			
			// use the below element to get the PRID status
			String status = driver
					.findElement(By.xpath("//strong[contains(text(),'" + PRIDtext + "')]/following::td[6]")).getText()
					.toString();
			System.out.println(status);
			String a[] = status.split(" ");
			System.out.println("The status of the application is : " + a[1]);
			// strong[contains(text(),'23528493695867')]/following::img[1]
		} else {
			System.out.println("Checkbox is not enabled. Please use the correct locator techique");
		}

		// The status won't changed for a booked appointment

		WebElement bookApp = driver.findElement(By.xpath("//button[contains(text(),' Book/Modify Appointment ')]"));
		if (bookApp.isEnabled()) {
			System.out.println("Book Appointment button is enabled");
			bookApp.click();
			WebElement bookLater = driver.findElement(By.xpath("//button[contains(text(),'Book Later')]"));
			if (bookLater.isDisplayed()) {
				bookLater.click();
			} else {
				System.out.println("please recheck the page");
			}
		}

		// to change the status from booked to pending
		Thread.sleep(4000);
		//checkBox.click();
		WebElement discardAppointment = driver
				.findElement(By.xpath("//strong[contains(text(),'" + PRIDtext + "')]/following::img[1]"));
		discardAppointment.click();
		driver.findElement(By.xpath("//label//div[contains(text(),'Cancel appointment and save the details')]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),' Submit ')]")).click();
		driver.findElement(By.xpath("//div[2]/span[1]/button/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Ok ')]")).click();
		checkBox.click();
		String status = driver.findElement(By.xpath("//strong[contains(text(),'" + PRIDtext + "')]/following::td[6]"))
				.getText().toString();
		System.out.println(status);
		String a[] = status.split(" ");
		System.out.println("The status of the application is : " + a[1] + " " + a[2]);*/

	}
}
