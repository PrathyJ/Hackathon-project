package testcases;

import org.testng.annotations.Test;

import pages.googlesignin;
import pages.hover;
import pages.upcomingbikes;
import pages.usedcars;
import testbase.BaseClass;

public class TC_04_Signin extends BaseClass{
	
 
  
  @Test(groups= {"sanity","regression"}) 
  public void signin() throws InterruptedException {
	  BaseClass.getLogger().info("--------Signing in to the google---------");
	  googlesignin si=new googlesignin(driver);
	  si.login();
	  BaseClass.getLogger().info("--------Giving the email input---------");
	  si.emailinput(null);
	  BaseClass.getLogger().info("--------Capturing the error message---------");
	  si.getErrorMessage();
  }
  
  
}
