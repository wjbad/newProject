package newPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		
		//Launch chrome and direct to base URL
		driver.get(baseUrl);
	}

}
