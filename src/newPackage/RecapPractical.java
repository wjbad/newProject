package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapPractical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/login.html";
		String expectedTitle = "Login Page";
		String actualTitle = "";
		
		//Launch chrome and direct to base URL
		driver.get(baseUrl);
		
		// get the actual value of the title
		actualTitle = driver.getTitle();
		
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("wesselb@live.co.za");
		driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys("test1234");
		driver.findElement(By.cssSelector("input[id='SubmitLogin']")).submit();
		driver.findElement(By.cssSelector("input.error-copy"));
		
		//close
		driver.close();
		
		
		
		
	}

}
