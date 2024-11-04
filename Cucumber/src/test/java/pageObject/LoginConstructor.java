package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginConstructor {
	
	WebDriver driver;
	
	LoginConstructor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	WebElement user;

	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btn;
	
	
	
	public void setUserName(String username)
	{
		user.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn.click();
	}
}
