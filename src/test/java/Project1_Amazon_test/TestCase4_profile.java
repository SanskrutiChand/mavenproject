package Project1_Amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Profile_page;
import Utility.DDT;

@Listeners(Utility.Listener.class)
public class TestCase4_profile extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_profile() throws EncryptedDocumentException, IOException
	{
		DDT d1=new DDT();
		d1.credentials();
		Profile_page p1=new Profile_page(driver);
		p1.accountlist(driver);
		p1.sign_in();
		p1.un();
		p1.cnt();
		p1.pwd();
		p1.signin();
		p1.manageprofile();
		p1.view();
	}
}
