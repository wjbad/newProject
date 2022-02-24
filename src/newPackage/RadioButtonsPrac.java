package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set some varibles
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch chrome and direct to base URL
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//Get the element locators for the radio buttons
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		// Select the radio button 1
		radio1.click();
		System.out.println("Radio Button Option 1 selected");
		
		// Select the radio button 2
		radio2.click();
		System.out.println("Radio Button Option 2 selected");
		
		//Toggle
		radio1.click();
		System.out.println("Radio Button Option 1 selected");
		
		//Located the option 1 check box
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));
		
		// check the option 1
		option1.click();
		option2.click();
		
		//Check whether the check box is toggle on
		if(option1.isSelected()) {
			System.out.println("CheckBx is toggled on");
		} else {
			System.out.println("CheckBx is toggled off");
			
		}
		
	}

}
