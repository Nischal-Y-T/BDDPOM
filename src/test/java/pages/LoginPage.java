package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
    
	//PageFactory Pattern
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotlink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Action
	public void login(String strName, String strPwd) {
		uname.sendKeys(strName);
		pwd.sendKeys(strPwd);
		loginbtn.click();
	}
	public void forgotPwd() {
		forgotlink.click();
	}
	

}
