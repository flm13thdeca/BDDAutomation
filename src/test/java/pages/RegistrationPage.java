package pages;

import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class RegistrationPage extends BasePage{

	static WebDriver driver;
	
	public RegistrationPage()
	{
		super(driver=BaseTest.getDriver());
	}
}
