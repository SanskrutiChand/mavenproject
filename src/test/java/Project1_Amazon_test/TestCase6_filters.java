package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Filters_page;

@Listeners(Utility.Listener.class)
public class TestCase6_filters extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_filters()
	{
		Filters_page f1=new Filters_page(driver);
		f1.searchbox();
		f1.shirt();
		f1.shirt_women();
		f1.color();
		f1.s_size();
	}
}
