package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {
	
	//Define Elements 
	@FindBy(xpath="//div[text()='Compose']")public WebElement clickCompose;
	@FindBy(xpath="//div[text()='Recipients']/parent::div")public WebElement recipients;
	@FindBy(xpath="//input[@aria-expanded='false']")public WebElement to;
	@FindBy(xpath="//input[@aria-label='Subject']")public WebElement subject;
	@FindBy(xpath="//div[@aria-label='Message Body']")public WebElement body;
	@FindBy(xpath="//div[text()='Send']")public WebElement send;
	
	//Constructor method 
	public ComposePage(RemoteWebDriver driver){
		
	//connect "driver" object to above define locators
		PageFactory.initElements(driver, this);
	}
	//Operational and observation methods
	public void clickOncompose()throws Exception {
		clickCompose.click();
		Thread.sleep(5000);
	}
	public void clickOnTo()throws Exception {
		
		recipients.click();
		Thread.sleep(3000);
		
	}
	public void fillToAdress(String meil) {
		to.sendKeys(meil);
	}
	public void fillSubjectBox(String sub) {
		subject.sendKeys(sub);
	}
	public void fillBody(String x) {
		body.sendKeys(x);
	}
	
	public void clicksend() {
		send.click();
	}
			
}
