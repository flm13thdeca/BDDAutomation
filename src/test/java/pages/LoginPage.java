package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BasePage {
	
	static WebDriver driver;
	
	public LoginPage() {
		
		super(driver=BaseTest.getDriver());
		
		addObject("username_textbox", By.xpath("//input[@name='username']"));
		addObject("password_textbox", By.xpath("//input[@name='password']"));
		addObject("login_button", By.xpath("//input[@name='login']"));
		addObject("newUserRegistration_link", By.linkText("New User Register Here"));
		
	}
	

}
