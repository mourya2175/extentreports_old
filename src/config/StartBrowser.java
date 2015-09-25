package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.GridType;

public class StartBrowser {
	
	public static WebDriver driver;
	public static ExtentReports extent = ExtentReports.get(StartBrowser.class);
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		extent.init("reports1/myreportv1.html", true);
		extent.init("reports1/myreportv1.html", false, GridType.STANDARD);
		extent.config().documentTitle("Rightstart ExtentReports report");
		extent.config().reportHeadline("Test report for Rightstart");
		
		
	}

	@AfterClass
	public void afterClass() {
		
		extent.endTest();
		driver.quit();
		
		 
	}
	//@AfterSuite
	public void afterSuite() throws Exception
	{
		
		/*System.out.println("In After suite");
		System.out.println("Preparing report");*/
//		Thread.sleep(5000);
		/*SendMail sm = new SendMail();
    	sm.sendEmail();*/
		
	}

}
