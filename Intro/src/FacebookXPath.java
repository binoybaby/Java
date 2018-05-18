import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Facebook.com");
		
//		Custom XPath: //tagname[@attribute='value']
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
//		Custom CSS: tagname[attribute='value']
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");;
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		driver.close();
	}

}
