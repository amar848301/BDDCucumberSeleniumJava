package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import stepDefinitions.UsersStepDefinition;

public class UserProfile {
	
	String userName = UsersStepDefinition.firstName+" "+UsersStepDefinition.lastName;
	
	@FindBy(xpath = "(//h4[@class='h5 fw-600']) [1]")
	WebElement username;
	
	public void validateUserDetails()
	{
		String name = username.getText();
		System.out.println(name);
		Assert.assertEquals(name, userName);
	}
}
