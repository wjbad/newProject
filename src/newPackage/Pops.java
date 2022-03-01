package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
		// setting up the explicite waits
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Launch chrome and direct to base URL
		String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[2]/td/[1])")));
		System.out.println(wait1);
		driver.findElement(By.name("cusid")).sendKeys("34234234");
		driver.findElement(By.name("submit")).submit();
		
		// switch to the alert
		Alert alert = driver.switchTo().alert();
		
		// Capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		//Display message on console
		System.out.println(alertMessage);
		//Thread.sleep(5000);
		
		// accept the alert
		//alert.accept();
		alert.dismiss();
		
	}

}
