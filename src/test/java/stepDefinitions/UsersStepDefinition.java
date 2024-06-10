package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminDashboardPageObject;
import pageObjects.UserProfile;
import pageObjects.UsersPageObject;

public class UsersStepDefinition {
	
	public static String onBehalf;
	public static String firstName;
	public static String lastName;
	public static String gender;
	public static String dob;
	public static String email;
	public static String password;

	public UsersPageObject users;

	@Given("create user with given details")
	public void create_user_with_given_details(DataTable dataTable) {
		List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> userDetail : userDetails) {
			onBehalf = userDetail.get("onBehalf");
			firstName = userDetail.get("firstName");
			lastName = userDetail.get("lastName");
			gender = userDetail.get("gender");
			dob = userDetail.get("dob");
			email = userDetail.get("email");
			password = userDetail.get("password");

			users = new UsersPageObject();
			users.createUser(onBehalf, firstName, lastName, gender, dob, email, password);
		}
	}

	@When("approve user from admin panel")
	public void approve_user_from_admin_panel() throws InterruptedException {
		AdminDashboardPageObject dashboard = new AdminDashboardPageObject();
		dashboard.approveMember();
	}

	@Then("verify the user details")
	public void verify_the_user_details() {
		UserProfile userprofile = new UserProfile();
		userprofile.validateUserDetails();
	}
}
