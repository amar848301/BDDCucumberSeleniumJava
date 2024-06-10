package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.CommonFunction;
import util.Base;

public class AdminDashboardPageObject extends CommonFunction {

	WebDriver driver = Base.driver;

	@FindBy(xpath = "//span[text()='Members']")
	WebElement membersMenu;
	@FindBy(xpath = "//span[text()='Free Members']")
	WebElement freeMembersSubMenu;
	@FindBy(xpath = "//td[@style='display: table-cell;'] [3]")
	List<WebElement> memberCode;
	@FindBy(xpath = "//td[@style='display: none;'] [1]")
	List<WebElement> memberName;
	@FindBy(xpath = "//i[@class='las la-ellipsis-v']")
	WebElement optionBtn;
	@FindBy(xpath = "(//a[text()='Approve']) [1]")
	WebElement approveBtn;
	@FindBy(xpath = "//form[@method='POST'] //*[contains(text(), 'Approve')]")
	WebElement approvebutton;
	@FindBy(xpath = "//span[text()='staff']")
	WebElement adminprofile;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logoutBtn;

	public AdminDashboardPageObject() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * public void getFreeMembers() { clickElement(membersMenu);
	 * clickElement(freeMembersSubMenu); for (int i = 0; i < memberCode.size(); i++)
	 * { System.out.println(memberCode.get(i).getText());
	 * System.out.println(memberName.get(i).getText()); } }
	 */

	public void approveMember() throws InterruptedException {
		clickElement(membersMenu);
		clickElement(freeMembersSubMenu);
		clickElement(optionBtn);
		clickElement(approveBtn);
		clickElement(approvebutton);
		clickElement(adminprofile);
		clickElement(logoutBtn);
	}
}
