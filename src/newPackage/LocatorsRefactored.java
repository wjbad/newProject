package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRefactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "https://demoqa.com/";
		//String praticeURL = "https://demoqa.com/automation-practice-form";
		String guruURL = "https://demo.guru99.com/test/newtours/";
		//driver.get(baseUrl);
		
		//Locate by ID attribute
		//driver.get(praticeURL);
		
		//driver.findElement(By.id("firstName"));
		//driver.findElement(By.id("lastName")).sendKeys("Badenhorst");;
		//driver.findElement(By.id("lastName")).clear();
		
		//Locate by Name Attribute
		
		//driver.findElement(By.name("gender"));
		
		//Locate by Class Name
		
		//driver.findElement(By.className("practice-form-wrapper"));
		//driver.findElement(By.className("left-panel"));
		
		//Locate by cssSelector attribute
		
		//driver.findElement(By.cssSelector("input[id='firstName']"));
		//driver.findElement(By.cssSelector("input[id='userEmail']"));
		
		//Locate by xpath attribute
		
		//driver.findElement(By.xpath("//input[@id='firstName']"));
		//driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		// Locate by Linktext and particallinktext attribute
		driver.get(guruURL);
		
		//driver.findElement(By.linkText("SUPPORT"));
		//driver.findElement(By.partialLinkText("SU"));
		driver.findElement(By.linkText("SIGN-ON")).click();
		//driver.findElement(By.partialLinkText("RE"));
		driver.findElement(By.name("userName")).sendKeys("Wessel");
		
		//driver.close();

	}

}
