package pages;

import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class SearchHotelPage extends BasePage{

	static WebDriver driver;
	
	public SearchHotelPage()
	{
		super(driver=BaseTest.getDriver());
	}
}
