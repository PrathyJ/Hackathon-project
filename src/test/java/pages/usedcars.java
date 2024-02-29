package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class usedcars extends BasePage {
	
	
	public usedcars(WebDriver driver)
	{
		super(driver);
	} 
	
	//locators
	@FindBy(xpath="//div[@class='col-lg-12 pl-0']/ul/li[7]") 
	WebElement usedcars;
	
	@FindBy(xpath="//div[@class='h-dd-r']/ul/li[4]/span[text()='Chennai']")
	//@FindBy(xpath="//div[@class='h-dd-l']/ul/li[1]")
	WebElement location;
	
	@FindBy(xpath="//ul[@class='zw-sr-secLev usedCarMakeModelList popularModels ml-20 mt-10']/li") 
	List <WebElement> modelName;

	public void usedcarshover() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			usedcars.click();			
		}
		catch(Exception e) {
			location.click();
		}
		Thread.sleep(3000);
		//BaseClass.captureScreen("userinfo");	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,500)");
		System.out.println("Following are the list of popular models:");
		for(int i=0;i<modelName.size();i++) {
		System.out.println(modelName.get(i).getText());
		}
	}
	}
	
	


