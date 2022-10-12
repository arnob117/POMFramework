package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	
	//Getting the variables
	String userName = "demo@techfios.com";
	String password = "abc123";

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUsername(userName);
		Thread.sleep(3000);
		loginPage.insertPasssword(password);
		Thread.sleep(3000);
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		
		Thread.sleep(3000);
		
		BrowserFactory.tearDown();

	}

}
