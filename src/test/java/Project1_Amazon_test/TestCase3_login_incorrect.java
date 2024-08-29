package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Project1_Amazon_source.Login_page_incorrect;

@Listeners(Utility.Listener.class)
public class TestCase3_login_incorrect extends LaunchAndQuit
{
	//public ChromeDriver driver;

	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_login_with_incorrect() 
	{
	Login_page_incorrect l2=new Login_page_incorrect(driver);
	l2.accountlist(driver);
	l2.sign_in();
	l2.un();
	l2.cnt();
	l2.pwd();
	l2.signin();
	}
}
