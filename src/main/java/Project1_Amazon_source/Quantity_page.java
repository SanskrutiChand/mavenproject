package Project1_Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity_page 
{
	//step 1
			ChromeDriver driver;
			@FindBy(id="twotabsearchtextbox")
			WebElement search;
			
			@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'])[1])")
			WebElement bottle;
			
			@FindBy(xpath="(//select[@id='quantity'])")
			WebElement quant;
			
			@FindBy(id="add-to-cart-button")
			WebElement add_cart;
			
			//step 2
			public void searchbox()
			{
				search.click();
			}
			public void bottle()
			{
				search.sendKeys("bottles");
			}
			public void b()
			{
				bottle.click();
			}
			public void quantity()
			{
				quant.sendKeys(Keys.ARROW_DOWN);
				quant.click();
			}
			public void addcart()
			{
				add_cart.click();
				
			}
			
			//step 3
			public Quantity_page(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
