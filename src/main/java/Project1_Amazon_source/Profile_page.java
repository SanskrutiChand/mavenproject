package Project1_Amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DDT;

public class Profile_page extends DDT
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
	
	@FindBy(xpath="(//span[.='Manage Profiles'])")
	WebElement manage_profile;
	
	@FindBy(xpath="//a[@class='sc-hBxehG sc-dmctIk jPpkrn fbRspv']")
	WebElement view;
	
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
	public void manageprofile()
	{
		manage_profile.click();
	}
	public void view()
	{
		view.click();
	}
	
	//step 3
	public Profile_page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
