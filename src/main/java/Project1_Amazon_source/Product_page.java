package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page 
{
	//step 1
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="(//span[.='s for man'])")
	WebElement s_man;
	
	//step 2
	public void searchbox()
	{
		search.click();
	}
	public void shoe()
	{
		search.sendKeys("shoe");;
	}
	public void shoeforman()
	{
		s_man.click();
	}
	
	//step 3
	public Product_page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
