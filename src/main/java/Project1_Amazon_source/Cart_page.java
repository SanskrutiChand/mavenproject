package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DDT;

public class Cart_page extends DDT
{
	//step 1
			ChromeDriver driver;
			@FindBy(id="nav-link-accountList")
			WebElement accountandlist;
			
			@FindBy(xpath="(//span[.='Sign in'])[1]")
			WebElement signinbutton;
			
			@FindBy(name="email")
			WebElement username;
			
			@FindBy(id="continue")
			WebElement continue_button;
			
			@FindBy(id="ap_password")
			WebElement password;
			
			@FindBy(id="signInSubmit")
			WebElement signin_button;
			
			@FindBy(id="twotabsearchtextbox")
			WebElement search;
			
			@FindBy(xpath="(//span[.='s for man'])")
			WebElement s_man;
			
			@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
			WebElement shoe2;
			
			@FindBy(id="add-to-cart-button")
			WebElement addcart;
			
			//step 2
			public void accountlist(ChromeDriver driver)
			{
				Actions a1=new Actions(driver);
				a1.moveToElement(accountandlist).perform();
			}
			public void sign_in()
			{
				signinbutton.click();
			}
			public void un()
			{
				username.sendKeys(un);
			}
			public void cnt()
			{
				continue_button.click();
			}
			public void pwd()
			{
				password.sendKeys(pwd);
			}
			public void signin()
			{
				signin_button.click();
			}
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
			public void shoes2()
			{
				shoe2.click();
			}
			
			public void add_cart()
			{
				addcart.click();
			}
			
			//step 3
			public Cart_page(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
