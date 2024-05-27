package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Base;

public class Hooks {

	@Before
	public void openBrowser() throws IOException {
		Base.initilizeDriver();
		Base.launchUrl();
	}

	@After
	public void tearDown() {
		Base.driver.quit();
	}
}
