package Project1_Amazon_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Project1_Amazon_source.Sorting_page;

@Listeners(Utility.Listener.class)
public class TestCase8_sorting extends LaunchAndQuit
{
	@Test(retryAnalyzer=Utility.Retry.class)
	public void amazon_sort()
	{
		Sorting_page s1=new Sorting_page(driver);
		s1.searchbox();
		s1.shoe();
		s1.shoeforman();
		s1.sorting();
		s1.new_arrivals();
				
	}
}
