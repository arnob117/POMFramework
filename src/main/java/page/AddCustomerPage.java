package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	
	//add methods to use the elements above
	public void insertFullName(String fullName) {
		
		String insertedName = fullName + generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyDropDown(String company) {
		
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
		
	}
	
	public void insertEmail(String email) {
		
		String insertedEmail = generateRandomNum(999) + email;
		EMAIL_ELEMENT.sendKeys(insertedEmail);
	}
	
	public void insertPhone(String phone) {
		
		PHONE_ELEMENT.sendKeys(phone + generateRandomNum(9999));
	}

	

}
