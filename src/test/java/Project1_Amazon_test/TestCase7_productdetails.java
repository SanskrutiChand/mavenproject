package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.ProductDetails_page;

@Listeners(Utility.Listener.class)
public class TestCase7_productdetails extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_productDetails()
	{
		ProductDetails_page pd=new ProductDetails_page(driver);
		pd.searchbox();
		pd.shoe();
		pd.shoeforman();
		pd.shoes2();
		
	}
}
