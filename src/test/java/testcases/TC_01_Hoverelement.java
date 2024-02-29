package testcases;

import org.testng.annotations.Test;

import pages.googlesignin;
import pages.hover;
import pages.upcomingbikes;
import pages.usedcars;
import testbase.BaseClass;

public class TC_01_Hoverelement extends BaseClass{
	
  @Test(groups= {"sanity"})
  public void hoverelement() throws InterruptedException {
	  BaseClass.getLogger().info("--------Hovering to bikes---------");
	  hover hv=new hover(driver);
	  hv.hoverelement();
  }
  
  
  
  
}
