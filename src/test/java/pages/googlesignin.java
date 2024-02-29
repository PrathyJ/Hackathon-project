package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlesignin extends BasePage {
	 
		
		public googlesignin(WebDriver driver)
		{
			super(driver);
		} 
		
		//locators
		@FindBy(xpath="/html/body/header/div/div[1]/div[3]/div/div[2]/div[1]/div/div[1]/div") 
		WebElement login;
		
		@FindBy(xpath="//div[@class='lgn-sc c-p txt-l pl-30 pr-30 googleSignIn']") 
		WebElement google;
		
		@FindBy(id="identifierId") 
		WebElement email;
		
		@FindBy(xpath="//span[contains(text(),'Next')]") 
		WebElement Next;
		
		@FindBy(xpath="//div[@class='o6cuMc Jj6Lae']") 
		WebElement errormessage;
		
		public void login() throws InterruptedException {
			driver.navigate().to("https://www.zigwheels.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login.click();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			Thread.sleep(40000);
			google.click();
		}
		
		public void emailinput(String emailid) {
			try {
				Set<String> windows = driver.getWindowHandles();
				new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.numberOfWindowsToBe(2));	
				Iterator<String> iterator =windows.iterator();
				@SuppressWarnings("unused")
				String parent=iterator.next();
				String child=iterator.next();
				driver.switchTo().window(child);
				//WebElement email=driver.findElement(By.id("identifierId"));
				email.sendKeys("abc@gmail.com");
				//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				Next.click();
				}
				catch(NoSuchElementException e) {
					System.err.println("Exception occured:" +e.getMessage());
				}
		}
		
		public void getErrorMessage() {
			//WebElement errormessage=driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']"));
			String message=errormessage.getText();
			System.out.println(message);
		}
}
