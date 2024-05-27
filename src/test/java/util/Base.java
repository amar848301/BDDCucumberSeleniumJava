package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static WebDriver initilizeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}

	public static void launchUrl() throws IOException {
		driver.get(getData().getProperty("url"));
	}

	public static Properties getData() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amarv\\eclipse-workspace\\BDDCucumberSeleniumJava\\src\\test\\resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}

	public String getScreenshot(String testCaseName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dir = new File("/target/extentReports/" + testCaseName + ".png");
		FileUtils.copyFile(file, dir);
		return "/target/extentReports/" + testCaseName + ".png";
	}

}
