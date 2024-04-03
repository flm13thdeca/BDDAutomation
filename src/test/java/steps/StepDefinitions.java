package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.SearchHotelPage;

public class StepDefinitions extends BaseTest{

	BasePage page=null;
	
	@Before
	public void setUp()
	{
		launchApplication();
	}

	@Given("user is on {string}")
	public void user_is_on(String pageName) {
	    
		if(pageName.equalsIgnoreCase("LoginPage"))
		{
			page=new LoginPage();
		}
		else if(pageName.equalsIgnoreCase("RegistrationPage"))
		{
			page=new RegistrationPage();
		}
		else if(pageName.equalsIgnoreCase("SearchHotelPage"))
		{
			page=new SearchHotelPage();
		}
		
	}

	
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	}

	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {

		driver.get(url);

		driver.manage().window().maximize();

	}

	//@When("user enters text {string} into textbox using xpath {string}")
	public void user_enters_text_into_textbox_using_xpath(String text, String xpath) {

		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	//@When("user clicks on button using xpath {string}")
	public void user_clicks_on_button_using_xpath(String string) {

		driver.findElement(By.xpath(string)).click();
	}

	//@Then("user verify the title to be {string}")
	public void user_verify_the_title_to_be(String expTitle) {

		Assert.assertEquals(expTitle, driver.getTitle());

	}

	@When("user clicks link using linktext {string}")
	public void user_clicks_link_using_linktext(String linkText) {

		driver.findElement(By.linkText(linkText)).click();
	}

	@When("user enters details in New User Registration Form")
	public void user_enters_details_in_new_user_registration_form(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<List<String>> dataList = dataTable.asLists();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataList.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataList.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(dataList.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(dataList.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(dataList.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(dataList.get(0).get(5));

	}

	@When("user clicks on checkbox using xpath {string}")
	public void user_clicks_on_checkbox_using_xpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
	}

	@When("user enters details in New User Registration Form2")
	public void user_enters_details_in_new_user_registration_form2(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		
		List<Map<String, String>> dataMapList=dataTable.asMaps();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(dataMapList.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMapList.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(dataMapList.get(0).get("confirm password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(dataMapList.get(0).get("full name"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(dataMapList.get(0).get("email"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(dataMapList.get(0).get("captcha"));
		
	}

	@Then("user validates title to be title to be {string}")
	public void user_validates_title_to_be_title_to_be(String expTitle) {
		
		page.validateTitle(expTitle);
	    
	}
	@When("user enters into textbox {string} {string}")
	public void user_enters_into_textbox(String logicalName, String text) {
	    
		page.type(logicalName, text);
	}
	@When("user clicks {string}")
	public void user_clicks(String logicalName) {
		
		page.click(logicalName);
	    
	}

	@After
	public void teardown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
