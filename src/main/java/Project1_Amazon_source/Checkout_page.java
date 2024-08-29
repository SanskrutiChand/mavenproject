package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DDT;

public class Checkout_page extends DDT
{
	//step 1
			ChromeDriver driver;
			@FindBy(id="twotabsearchtextbox")
			WebElement search;
			
			@FindBy(xpath="(//span[.='s for man'])")
			WebElement s_man;
			
			@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
			WebElement shoe2;
			
			@FindBy(xpath="(//span[.=' Buy Now ']")
			WebElement buy;
			
			@FindBy(name="email")
			WebElement username;
			
			@FindBy(id="continue")
			WebElement continue_button;
			
			@FindBy(id="ap_password")
			WebElement password;
			
			@FindBy(id="signInSubmit")
			WebElement signin_button;
			
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
			public void shoes2()
			{
				shoe2.click();
			}
			public void buy_now()
			{
				buy.click();
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
			
			//step 3
			public Checkout_page(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
