package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helpers.CommonFunction;
import util.Base;
import util.DateTimePattern;

public class UsersPageObject extends CommonFunction {

	WebDriver driver = Base.driver;
	public String datetime = DateTimePattern.getDateTime();

	@FindBy(xpath = "//select[@name='on_behalf']")
	WebElement onbehalf;
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath = "//select[@name='gender']")
	WebElement usergender;
	@FindBy(xpath = "//input[@name='date_of_birth']")
	WebElement dateofbirth;
	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement emailaddress;
	@FindBy(xpath = "(//input[@name='password']) [1]")
	WebElement passwords;
	@FindBy(xpath = "//input[@name='password_confirmation']")
	WebElement cnfpassword;
	@FindBy(xpath = "//span[@class='aiz-square-check']")
	WebElement termscheckbox;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement createaccountbutton;

	public UsersPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void createUser(String onBehalf, String firstName, String lastName, String gender, String dob, String email,
			String password) {

		Select behalf = new Select(onbehalf);
		behalf.selectByVisibleText(onBehalf + " ");
		sendTextToElement(firstname, datetime + firstName);
		sendTextToElement(lastname, lastName);
		Select gen = new Select(usergender);
		gen.selectByVisibleText(gender);
		sendTextToElement(dateofbirth, dob);
		clickElement(dateofbirth);
		sendTextToElement(emailaddress, datetime + email);
		sendTextToElement(passwords, password);
		sendTextToElement(cnfpassword, password);
		clickElement(termscheckbox);
		clickElement(createaccountbutton);
	}
}
