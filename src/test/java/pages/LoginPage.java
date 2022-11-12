package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Define Element Locators
	
	@FindBy(xpath="//input[@type='email']") public WebElement username;
	@FindBy(xpath="//span[text()='Next']/parent::button") public WebElement nextButton;
	@FindBy(xpath="//input[@type='password']") public WebElement password;
	@FindBy(xpath="//span[text()='Next']/parent::button") public WebElement next;
	
	//Constructor method 
	
	public LoginPage(RemoteWebDriver driver) {
		
		// connect "driver" object to above defined location
		PageFactory.initElements(driver, this);
	}
	public void fillUserId(String x) {
		// Locate and operate element
		username.sendKeys(x);
	}
	public void clickNext()throws Exception {
		nextButton.click();
		Thread.sleep(5000);
	}
	public void fillPassword(String x) {
		// Locate and operate element 
		password.sendKeys(x);
	}
	public void clickLogin()throws Exception {
		 next.click();
		 Thread.sleep(5000);
	}
	

}
