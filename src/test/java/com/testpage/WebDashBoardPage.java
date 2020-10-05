package com.testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDashBoardPage {
	WebDriver driver;
	@FindBy (xpath = "//a[@class='name']")WebElement dashboard;
	

}
