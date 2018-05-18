import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.findElement(By.id("email")).sendKeys("this is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		
		
		driver.close(); //closes the current browser
		//driver.quit(); //closes all the browsers opened by selenium script
	}

}
