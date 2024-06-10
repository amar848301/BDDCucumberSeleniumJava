package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.CommonFunction;
import util.Base;

public class LoginPageObjects extends CommonFunction {

	public WebDriver driver = Base.driver;

	@FindBy(xpath = "//a[text()='Log In']")
	WebElement loginBtn;
	@FindBy(xpath = "//input[@type='email']")
	static WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	static WebElement password;
	@FindBy(xpath = "(//button[@type='submit']) [1]")
	static WebElement submitBtn;

	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void getLogin(String userName, String passWord) throws InterruptedException, IOException {
		driver.navigate().to(Base.getData().getProperty("url"));
		clickElement(loginBtn);
		sendTextToElement(username, userName);
		sendTextToElement(password, passWord);
		clickElement(submitBtn);
	}
}
