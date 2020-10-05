package com.testcase;

import org.testng.annotations.Test;

import com.testpage.WebLoginPage;
import com.utility.WebBasePage;

public class WebPageLoginTestCase extends WebBasePage {
	WebLoginPage webpagelogin;
	@Test
	public void UserLogin() throws InterruptedException
	{
		webpagelogin = new WebLoginPage(driver);
		webpagelogin.clickonLoginbtn();
		Thread.sleep(4000);
		webpagelogin.dhgc();
		Thread.sleep(3000);
		webpagelogin.useridandPass("9136342965","ADVIK@2019");
	}
	

}
