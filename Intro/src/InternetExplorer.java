import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Selenium Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.getTitle();
		System.out.println("Title is: " +driver.getTitle());
	}

}
