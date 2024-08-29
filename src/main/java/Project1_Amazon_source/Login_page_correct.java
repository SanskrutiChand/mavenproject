package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import Utility.DDT;

//@Listeners(Utility.Listener.class)
public class Login_page_correct extends DDT
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
			
			//step 3
			public Login_page_correct(ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
