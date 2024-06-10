package helpers;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Base;

public class CommonFunction {
	
	public static WebDriverWait wait;

	public static void sendTextToElement(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public static void clickElement(WebElement element)
	{
		waitForElementToBeClickable(element);
		element.click();
	}
	
	public static void waitForElementToBeClickable(WebElement element)
	{
		wait = new WebDriverWait(Base.driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
//	public static void waitForVisibilityOfElement(WebElement element)
//	{
//		wait = new WebDriverWait(Base.driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
//	}

}
