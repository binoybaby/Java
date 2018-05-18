import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoundElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");	
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //tagname.classname
		driver.switchTo().frame(0);
//		driver.switchTo().f
		
		driver.close();
	}

}
