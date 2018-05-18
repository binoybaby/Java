import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");	
		System.out.println(driver.findElements(By.tagName("iframe")).size());   //to take a count of number of frames present
		driver.switchTo().frame(0);                                             //Searching for frame index to 0
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));   // switching from HTML to iframe
//		driver.findElement(By.id("draggable")).click();                         //to get an error
	
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();;
		
//		driver.switchTo().defaultContent()
	}

}
