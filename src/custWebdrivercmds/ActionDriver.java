package custWebdrivercmds;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import config.StartBrowser;

public class ActionDriver extends StartBrowser{

	/**
	 * Navigates to specified URL
	 * @param url --Application URL
	 */
	public static void launchUrl(String url)
	{
		driver.get(url);
		extent.log(LogStatus.INFO, "Successfully Launched Application");
	}
	/**
	 * Perform click operation on buttons, links, Radio buttons and check boxes
	 * @param locator -Get it from OR
	 * @throws Exception 
	 */
	public static void click(By locator) throws Exception
	{
		driver.findElement(locator).click();
		extent.log(LogStatus.INFO, "Successfully Clicked");
		captureScreenshot("./click.png");
		extent.log(LogStatus.INFO, "Image", "Image example:", "./click.png");
//		extent.attachScreenshot("D:/Projects/Webdriver_Framework_Mine/reports1/click.png");

		
	}
	/**
	 * Perform type operation on text box
	 * @param locator --Get it from OR
	 * @param text --Hard code it or get it from Test data
	 */
	public static void type(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
		
	}
	/**
	 * Select a value from dropdown using visibleText
	 * @param locator --Get it from OR
	 * @param selectByVisibleText --test data
	 */
	public static void selectByVisibleText(By locator, String selectByVisibleText)
	{
		WebElement dd=driver.findElement(locator);
		Select s = new Select(dd);
		s.selectByVisibleText(selectByVisibleText);
		
	}
	
	public static void captureScreenshot(String path) throws Exception
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scrFile, new File(path));
	}
}
