package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Registration_page;

@Listeners(Utility.Listener.class)
public class TestCase1_registration extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void registration()
	{
	Registration_page r1=new Registration_page(null);
	r1.accountlist(driver);
	r1.start();
	r1.custname();
	r1.number();
	r1.pw();
	r1.verify();
	}
}
