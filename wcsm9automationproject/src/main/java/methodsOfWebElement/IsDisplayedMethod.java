package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("admin123");
	driver.findElement(By.name("password")).sendKeys("134566");
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	//logout link verify
	WebElement logoutLinkElement = driver.findElement(By.partialLinkText(""));
	
	boolean status =logoutLinkElement.isDisplayed();
	System.out.println(status);
}
}
