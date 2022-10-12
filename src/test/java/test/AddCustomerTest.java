package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
WebDriver driver;
	
	//Getting the variables
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	//Test Data
	String fullName = "Java Selenium";
	String company = "Amazon";
	String email = "abc@techfios.com";
	String phoneNum = "123456";

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUsername(userName);
		loginPage.insertPasssword(password);
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage= PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName(fullName);
		Thread.sleep(3000);
		addCustomerPage.selectCompanyDropDown(company);
		Thread.sleep(3000);
		addCustomerPage.insertEmail(email);
		Thread.sleep(3000);
		addCustomerPage.insertPhone(phoneNum);
		Thread.sleep(3000);
		
		BrowserFactory.tearDown();

	}

}
