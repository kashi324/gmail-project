package glue;



import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ComposePage;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;


public class StepDef {
	
	//declare objects as global to use in all step definition methods 
	
	public Shared sh;
	//Dependency injection via constructor
	public StepDef(Shared sh)
	{
		this.sh=sh;
	}
	
	
	@Given("open an {string} browser")
	public void open_an_chrome_browser(String bn) {
		
		if(bn.equalsIgnoreCase("chrome"));
		{
			WebDriverManager.chromedriver().setup();
			//define objects
			sh.driver=new ChromeDriver();
			sh.obj1=new HomePage(sh.driver);
			sh.obj2=new LoginPage(sh.driver);
			sh.obj3=new ComposePage(sh.driver);
			sh.obj4=new LogOutPage(sh.driver);
			
			
		}
	    
	}

	@Given("lauch site using {string}")
	public void lauch_site_using(String url)throws Exception {
		
		sh.driver.get(url);
		Thread.sleep(5000);
	    
	}
	@When("do login using {string} and {string} credentials")
	public void do_login_using_and_credentials(String uid, String pwd)throws Exception {
		
		sh.obj2.fillUserId(uid);
		sh.obj2.clickNext();
		sh.obj2.fillPassword(pwd);
		sh.obj2.clickLogin(); 
	}
	
}
