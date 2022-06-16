package com.mindtree.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
	@FindBy(xpath="//mat-nav-list[2]/a[2]/div/text()")
	WebElement logout;
	
	@FindBy(xpath="//button[contains(text(),'Create New Application')]")
	WebElement createNewApplication;
	
	

}
