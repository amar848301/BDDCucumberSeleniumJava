package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import pageObjects.LoginPageObjects;

public class LoginStepDefinition {

	@And("login into application with username and password")
	public void login_into_application_with_username_and_password() {
		LoginPageObjects login = new LoginPageObjects();
		try {
			login.getLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
