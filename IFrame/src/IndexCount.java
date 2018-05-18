import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");	
		System.out.println(driver.findElements(By.tagName("iframe")).size());   //to take a count of number of frames present
	
		driver.close();
	}

}
