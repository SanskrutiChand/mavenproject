package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Product_page;

@Listeners(Utility.Listener.class)
public class TestCase5_product extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_product()
	{
		Product_page product=new Product_page(driver);
		product.searchbox();
		product.shoe();
		product.shoeforman();
				
	}
}
