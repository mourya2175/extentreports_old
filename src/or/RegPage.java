package or;

import org.openqa.selenium.By;

public class RegPage {

	//element definitions
	public static By txtFn=By.id("firstname");
	public static By txtLn=By.id("lastname");
	public static By txtEmail=By.id("email_address");
	public static By ddHear=By.name("hear_about_us");
	public static By btnContinue=By.xpath("//button[@class='button btn_shipping']");
	public static By msgErr = By.id("advice-required-entry-password");

}
