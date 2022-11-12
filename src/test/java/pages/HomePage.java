package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Define Element Locater
	@FindBy(xpath="//div[text()='Compose']") public WebElement compose;

	//Constructor method 
		public HomePage(RemoteWebDriver driver)
		{
			//connect "driver" object to above define locators
			PageFactory.initElements(driver, this);
		}
		//Operational and observation methods
		public boolean isComposePageDisplayed() {
			if(compose.isDisplayed()) {
				return(true);
			}else {
				return(false);
			}
		}
				
}
