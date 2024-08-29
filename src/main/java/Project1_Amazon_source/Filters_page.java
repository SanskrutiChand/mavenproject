package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters_page 
{
	//step 1
		ChromeDriver driver;
		@FindBy(id="twotabsearchtextbox")
		WebElement search;
		
		@FindBy(xpath="(//span[.='s for women stylish western'])")
		WebElement s_women;
		
		@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[1]")
		WebElement colour;
		
		@FindBy(xpath="(//span[.='M'])")
		WebElement size;
		
		//step 2
		public void searchbox()
		{
			search.click();
		}
		public void shirt()
		{
			search.sendKeys("shirt");;
		}
		public void shirt_women()
		{
			s_women.click();
		}
		public void color()
		{
			colour.sendKeys("800");
		}
		public void s_size()
		{
			size.click();
		}
		
		//step 3
		public Filters_page(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
