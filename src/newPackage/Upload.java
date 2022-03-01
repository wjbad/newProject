package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch chrome and direct to base URL
		String baseUrl = "https://www.monsterindia.com/seeker/registration";
		
		driver.manage().window().maximize(); //always write wait code after this
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
		driver.get(baseUrl); // Testing webpage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait
		
		//File Uploading using sendkeys
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//click on 'Choose file" to upload the desired file
		browse.sendKeys("C:\\Users\\wessel.badenhorst\\OneDrive - Spinnaker Software\\Wessel\\Test Automation Course\\notes.docx"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Succesfully");
		
		
		
		
		
	}

}
