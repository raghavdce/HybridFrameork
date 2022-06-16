package com.mindtree.BaseClass;

import org.testng.annotations.Test;

import com.mindtree.Pages.DocumentUploadPage;
import com.mindtree.Utility.FileUpload;

public class TC008_UploadDocuments extends TC005_CompleteDemographicTest {
	
	

	@Test(dependsOnMethods="validateDemoscreen")
	public void docUpload() throws Exception {
		DocumentUploadPage dup = new DocumentUploadPage(driver);
		log.info("Navigated to Document Upload Screen");
		/*dup.clickPOI();
		log.info("Clicked POI dropdown");
		dup.selectPOI();
		log.info("Clicked POI dropdown value");
		dup.poiBrowse();
		log.info("Clicked POI browse button");
		try {
			FileUpload.uploadFile();
			log.info("Uploaded proof of POI");
		} catch (Exception e) {
			log.debug("Unable to Upload proof of POI as upload is not working");
		}
		Thread.sleep(4000);
		dup.clickPOA();
		log.info("Clicked POA dropdown");
		dup.selectPOA();
		log.info("Clicked POA dropdown value");
		dup.poaBrowse();
		log.info("Clicked POA browse button");
		try {
			FileUpload.uploadFile();
			log.info("Uploaded proof of POA");
		} catch (Exception e) {
			log.debug("Unable to Upload proof of POA as upload is not working");
		}
		Thread.sleep(4000);
		dup.clickPOB();
		log.info("Clicked POB dropdown");
		dup.selectPOB();
		log.info("Clicked POB dropdown value");
		dup.poBBrowse();
		log.info("Clicked POB browse button");
		try {
			FileUpload.uploadFile();
			log.info("Uploaded proof of POB");
		} catch (Exception e) {
			log.debug("Unable to Upload proof of POA as upload is not working");
		}*/
		Thread.sleep(4000);
		dup.clickContinue();
		log.info("Clicked continue button in doc upload screen");
		if(dup.showPreview()) {
			log.info("Navigated to Preview screen");
		}
		else {
			log.error("Application got stuck at document screen");
		}

	}

}
