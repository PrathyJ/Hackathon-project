package testcases;

import org.testng.annotations.Test;

import pages.googlesignin;
import pages.hover;
import pages.upcomingbikes;
import pages.usedcars;
import testbase.BaseClass;

public class TC_02_Upcomingbikes extends BaseClass{
	
  
  
  @Test(groups= {"sanity"})
  public void upcomingbike() throws Exception {
	  hover hv=new hover(driver);
	  hv.hoverelement();
	  BaseClass.getLogger().info("--------Hovering to upcoming bikes---------");
	  upcomingbikes ub=new upcomingbikes(driver);
	  ub.upcomingbike();
	  BaseClass.getLogger().info("--------View more bikes---------");
	  ub.viewMoreBikes();
	  BaseClass.getLogger().info("-------View Honda bikes---------");
	  ub.hondabikes();
  }
  
  
  
}
