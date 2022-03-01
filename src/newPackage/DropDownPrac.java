package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set some varibles
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				//Create the instance of chrome driver
				WebDriver driver = new ChromeDriver();
				
				//Launch chrome and direct to base URL
				driver.get("https://demo.guru99.com/test/newtours/");
				//driver.get("https://demo.guru99.com/test/newtours/reservation.php");
				
		
				driver.findElement(By.linkText("Flights")).click();
				
				//Get the element locators for the radio buttons - Type
				driver.findElement(By.cssSelector("input[name='tripType'][value='oneway']")).click();
				
			
				
				// select Departing From option as New York using visible text
				Select select = new Select(driver.findElement(By.name("fromPort")));
				select.selectByVisibleText("New York");
				
				//Get the element locators for the radio buttons -Preferences
				driver.findElement(By.cssSelector("input[name='servClass'][value='First']")).click();
				
				driver.findElement(By.name("findFlights")).click();
	}

}
