package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	//Define Element locater
	@FindBy(xpath="//a[contains(@aria-label,'Google Account')]")public WebElement profile;
	@FindBy(xpath="//div[text()='Sign out']")public WebElement sinout;
	@FindBy(xpath="//span[text()='Choose an account']")public WebElement reLoginPage;
	
	//Constructor method 
	public LogOutPage(RemoteWebDriver driver)
	{
		//connect "driver" object to above define locators
		PageFactory.initElements(driver, this);
	}
	//Operational and observation methods
	
	public void clickOnProfile()throws Exception {
		profile.click();
		Thread.sleep(5000);
	}
	public void clickOnSigOut(RemoteWebDriver driver) {
		WebElement e= driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]"));
		driver.switchTo().frame(e);
		sinout.click();
		driver.switchTo().defaultContent();
	}
	public boolean isReloginPageDisplayed() {
		if(reLoginPage.isDisplayed()) {
			return(true);
		}else {
			return(false);
		}
	}
	

}
