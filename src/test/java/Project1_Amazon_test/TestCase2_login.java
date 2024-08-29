package Project1_Amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Login_page_correct;
import Utility.DDT;

@Listeners(Utility.Listener.class)
public class TestCase2_login extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_login() throws EncryptedDocumentException, IOException
	{
		DDT d1=new DDT();
		d1.credentials();
	Login_page_correct l1=new Login_page_correct(driver);
	l1.accountlist(driver);
	l1.sign_in();
	l1.un();
	l1.cnt();
	l1.pwd();
	l1.signin();
	}
}
