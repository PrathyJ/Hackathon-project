package testcases;

import org.testng.annotations.Test;

import pages.googlesignin;
import pages.hover;
import pages.upcomingbikes;
import pages.usedcars;
import testbase.BaseClass;

public class TC_03_Usedcars extends BaseClass{
	
 
  
  @Test(groups= {"sanity","regression"})
  public void hoverelements() throws InterruptedException {
	  BaseClass.getLogger().info("--------Hovering to used cars---------");
	  usedcars uc=new usedcars(driver);
	  uc.usedcarshover();
  }
  
  
  
  
}
