package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminDashboardPageObject;
import pageObjects.UsersPageObject;

public class UsersStepDefinition {

	public UsersPageObject users;

	@Given("create user with given details")
	public void create_user_with_given_details(DataTable dataTable) {
		List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> userDetail : userDetails) {
			String onBehalf = userDetail.get("onBehalf");
			String firstName = userDetail.get("firstName");
			String lastName = userDetail.get("lastName");
			String gender = userDetail.get("gender");
			String dob = userDetail.get("dob");
			String email = userDetail.get("email");
			String password = userDetail.get("password");

			users = new UsersPageObject();
			users.createUser(onBehalf, firstName, lastName, gender, dob, email, password);
		}
	}

	@When("approve user from admin panel")
	public void approve_user_from_admin_panel() {
		AdminDashboardPageObject dashboard = new AdminDashboardPageObject();
		dashboard.approveMember();
	}

	@Then("verify the user details")
	public void verify_the_user_details() {
		System.out.println("Test");
	}

}
