package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hover extends BasePage {
	
	
	public hover(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//div[@class='col-lg-12 pl-0']/ul/li[3]") 
	WebElement hover;
	
	@FindBy(xpath="//div[@class='col-lg-12 pl-0']/ul/li[3]/ul/li[5]") 
	WebElement hover1;
	
	public void hoverelement() throws InterruptedException {
		
			Actions action=new Actions(driver);
			action.moveToElement(hover).build().perform();
			hover1.click();
		
		//BaseClass.captureScreen("userinfo");
	
	}
}
