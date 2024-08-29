package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page 
{
	//step 1
			ChromeDriver driver;
			@FindBy(id="nav-link-accountList")
			WebElement accountandlist;
			
			@FindBy(xpath="//a href[.='Start here']")
			WebElement starthere;
			
			@FindBy(id="ap_customer_name")
			WebElement name;
			
			@FindBy(id="ap_phone_number")
			WebElement mobile_no;
			
			@FindBy(id="ap_password")
			WebElement password;
			
			@FindBy(id="continue")
			WebElement verify;
			
			@FindBy(id="twotabsearchtextbox")
			WebElement search_tf;
			
			//step 2
			public void accountlist(ChromeDriver driver)
			{
				Actions a1=new Actions(driver);
				a1.moveToElement(accountandlist).perform();
			}
			public void start()
			{
				starthere.click();
			}
			public void custname()
			{
				name.sendKeys("Sanskruti");;
			}
			public void number()
			{
				mobile_no.sendKeys("8377802332");;
			}
			public void pw()
			{
				password.sendKeys("");;
			}
			public void verify()
			{
				verify.click();
			}
			//step 3
			public Registration_page(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
