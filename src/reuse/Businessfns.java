package reuse;

import custWebdrivercmds.ActionDriver;
import or.HomePage;
import or.LoginPage;

public class Businessfns extends ActionDriver{

	public static void register() throws Exception
	{
		launchUrl("http://www.rightstart.com/");
		click(HomePage.lnkSignIn);
		click(LoginPage.btnContinue);
	}

}
