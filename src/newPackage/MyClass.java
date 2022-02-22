package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
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
			System.out.println("Test Fialed");
		}
		
		//close
		driver.close();
		
		
		//play
		driver.findElement(By.id("firstName"));
		driver.findElement(By.name("gender"));
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.linkText("SUPPORT"));
		driver.findElement(By.partialLinkText("SU"));
		driver.findElement(By.tagName("a"));
		driver.findElement(By.cssSelector("input[id='userName'][type = 'test']"));
		driver.findElement(By.xpath("//input[@id='userName']"));
		
	}

}
