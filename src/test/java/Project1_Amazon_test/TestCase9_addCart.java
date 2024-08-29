package Project1_Amazon_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Cart_page;
import Utility.DDT;

@Listeners(Utility.Listener.class)
public class TestCase9_addCart extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_addcart() throws EncryptedDocumentException, IOException
	{
		DDT d1=new DDT();
		d1.credentials();
		Cart_page c1=new Cart_page(driver);
		c1.accountlist(driver);
		c1.sign_in();
		c1.un();
		c1.cnt();
		c1.pwd();
		c1.signin();
		c1.searchbox();
		c1.shoe();
		c1.shoeforman();
		c1.shoes2();
		c1.add_cart();
	}
}
