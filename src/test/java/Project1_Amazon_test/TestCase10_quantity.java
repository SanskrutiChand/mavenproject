package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Quantity_page;

@Listeners(Utility.Listener.class)
public class TestCase10_quantity extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_quanity()
	{
		Quantity_page q1=new Quantity_page(driver);
		q1.searchbox();
		q1.bottle();
		q1.b();
		q1.quantity();
		q1.addcart();
	}
	
}
