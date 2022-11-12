package glue;

import org.openqa.selenium.remote.RemoteWebDriver;



import io.cucumber.java.Scenario;
import pages.ComposePage;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;



public class Shared {
	
	//declare common objects
		public RemoteWebDriver driver;
		public HomePage obj1;
		public LoginPage obj2;
		public ComposePage obj3;
		public LogOutPage obj4;
		
		public Scenario s; //to customize results file
	
		
		

}
