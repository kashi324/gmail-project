package glue;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 {
	
	//declare objects as global to use in all step definition methods 
	
		public Shared sh;
		//Dependency injection via constructor
		public StepDef2(Shared sh)
		{
			this.sh=sh;
		}
	
	
	

	@Then("compose is displayed")
	public void compose_is_displayed() {
		
		if(sh.obj1.isComposePageDisplayed()) {
			System.out.println("compose page is displayed");
		}else {
			System.out.println("compose page is not displayed");
			System.exit(0);
		}
		
	}

	@When("click on compose and fill fields and send mail and check response")
	public void click_on_compose_and_fill_fields_and_send_mail_and_check_response(DataTable dt)throws Exception {
		
		// take data from data table
		List<Map<String,String>> l=dt.asMaps();
		for(int i=0; i<l.size(); i++)
		{
			//click on compose
			sh.obj3.clickOncompose();
			//obj3.clickOnTo();
			//fill fields
			sh.obj3.fillToAdress(l.get(i).get("to"));
			sh.obj3.fillSubjectBox(l.get(i).get("subject"));
			sh.obj3.fillBody(l.get(i).get("body"));
			// send mail
			sh.obj3.clicksend();
			
		}
	    
	}

	@When("do logout")
	public void do_logout()throws Exception {
	   sh. obj4.clickOnProfile();
	    sh.obj4.clickOnSigOut(sh.driver);
	    
	}

	@Then("login page should be redisplayed")
	public void login_page_should_be_redisplayed() {
	    if(sh.obj4.isReloginPageDisplayed()) {
	    	System.out.println("Relogin page is displayed");
	    }else {
	    	System.out.println("Relogin page is not displayed");
	    }
	}

	@When("close site")
	public void close_site() {
	    sh.driver.close();
	}


}
