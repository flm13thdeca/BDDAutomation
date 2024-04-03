package pages;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	WebDriver driver;
	
	HashMap<String,By> objectRepo=new HashMap<String,By>();
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addObject(String logicalName,By by)
	{
		objectRepo.put(logicalName, by);
	}
	
	public void click(String logicalName)
	{
		getElement(logicalName).click();
	}
	
	public void type(String logicalName,String text)
	{
		getElement(logicalName).sendKeys(text);
	}
	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(expTitle, driver.getTitle());
	}

	private WebElement getElement(String logicalName) {
		
		By by=objectRepo.get(logicalName);
		
		WebElement element =driver.findElement(by);
		
		return element;
		
	}

}
