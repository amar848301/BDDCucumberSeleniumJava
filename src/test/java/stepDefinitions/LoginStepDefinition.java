package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import pageObjects.LoginPageObjects;
import pageObjects.UsersPageObject;
import util.Base;

public class LoginStepDefinition {

	@And("login into application with {string} username and password")
	public void login_into_application_with_username_and_password(String usertype) {
		LoginPageObjects login = new LoginPageObjects();
		switch (usertype) {
	    case "admin":
	        try {
				login.getLogin(Base.getData().getProperty("adminusername"), Base.getData().getProperty("adminpassword"));
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        break;
	    case "user":
	        try {
				login.getLogin(UsersPageObject.customizeEmail, UsersStepDefinition.password);
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        break;
	    default:
	        throw new Error("Invalid username");
	}

	}
}
