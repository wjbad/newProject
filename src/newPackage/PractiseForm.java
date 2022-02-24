package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set some varibles
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				//Create the instance of chrome driver
				WebDriver driver = new ChromeDriver();
				
				//Launch chrome and direct to base URL
				driver.get("https://demoqa.com/automation-practice-form");
		
		// Validate isSelected and click
	    WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1'][class='custom-control-label']"));
		boolean isSelected = checkBoxSelected.isSelected();
		Thread.sleep(10);
		
		
		//perform the click operation if the element is not selected
		if(isSelected == false) {
			checkBoxSelected.click();
		}
		Thread.sleep(10);
		
		// Validate isDisplyed and click
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
		
		
		//perform the click operation if the element is Displayed
		if(isDisplayed == true) {
			checkBoxDisplayed.click();
		}
		
		//Validate isEnabled and click
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();
			
		//perform the click operation if the element is Enabled
		if(isEnabled == true) {
			checkBoxEnabled.click();
			
		}
	}

}
