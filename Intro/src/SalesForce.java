import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();  //to show spaces should not be there in classes
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println("Error: "+driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		driver.close();
		
	}

}
