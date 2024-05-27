package helpers;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Base;

public class CommonFunction {

	public static void sendTextToElement(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public static void clickElement(WebElement element)
	{
		element.click();
	}

}
