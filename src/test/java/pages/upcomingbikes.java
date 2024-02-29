package pages;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class upcomingbikes extends BasePage {
	
	public upcomingbikes(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//select[@id='makeId']") 
	WebElement manufacturer;
	
	@FindBy(xpath="//li[@class='txt-c clr moreModels mb-20']/span") 
	WebElement viewmorebike;
	
	@FindBy(xpath="//*[@id='carModels']/ul") 
	WebElement hondaBikeModels;
	
public void upcomingbike() {
	Select objSelect=new Select(manufacturer);
	objSelect.selectByVisibleText("Honda");
}

public void viewMoreBikes() throws Exception {
  try {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    //WebElement el=driver.findElement(By.xpath("//li[@class='txt-c clr moreModels mb-20']/span"));
    executor.executeScript("scroll(0,1000)");
    executor.executeScript("arguments[0].click();", viewmorebike);
    executor.executeScript("scroll(0,-1000)");
} 
  catch (Exception e) {
    e.printStackTrace();
} 
}

public void hondabikes() throws ParseException {
	//WebElement hondaBikeModels=driver.findElement(By.xpath("//*[@id='carModels']/ul"));
	// Get text of all bike models available on the page
	String bikeModels = hondaBikeModels.getText();
	// Split the text by new line character and store it in an ArrayList
	ArrayList<String> bikeModelsElements = new ArrayList<String>();
	Collections.addAll(bikeModelsElements, bikeModels.split("\n"));
	        
	// Initialize ArrayLists to store names, launch dates and prices of bikes
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<String> dateList = new ArrayList<String>();
	ArrayList<String> priceList = new ArrayList<String>();
	String[] arr = null;
	// Iterate through the list of bike models and extract the required information
	for (int i = 0; i < bikeModelsElements.size(); i++) {
	String s = bikeModelsElements.get(i);
	if (s.contains("Honda")) {
	nameList.add(s);
	}
	if (s.contains("Rs. ")) {
	arr = s.split(" ");
	priceList.add(arr[1]);
	}
	if (s.contains("Launch Date : ")) {
	dateList.add(s);
	}
	}
	// Wait for page elements to load
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	        
	// Initialize an ArrayList to store upcoming bikes with price less than 4 Lakhs
	ArrayList<String> upcomingBikes = new ArrayList<String>();
	if(nameList.size()>0) {for (int i = 0; i <nameList.size(); i++) {
	String temp = nameList.get(i);
	// Convert bike price to a double value
	NumberFormat format = NumberFormat.getInstance(Locale.FRANCE); // parse numbers in French-style format
	Number number = format.parse(priceList.get(i));
	double price = number.doubleValue();
	// Combine bike name, price and launch date to a single string
	String info = temp + "  " + priceList.get(i) + " Lakh  " + dateList.get(i);
	// Check if bike name is present in the string and price is less than 4 Lakhs
	if (info.contains(temp)) {
	if (Double.compare(price, 4d) < 0) {
	upcomingBikes.add(info);
	}
	}
	  }
	}
	// Print the list of upcoming bikes to the console
	System.out.println("Upcoming Honda Bikes Below 4 Lakhs are as follows:");
	
	for (int i = 0; i < upcomingBikes.size(); i++) {
	System.out.println(upcomingBikes.get(i));
	}
	 
	}
}
