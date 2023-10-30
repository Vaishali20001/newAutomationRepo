package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
     WebElement moveToElement = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
     //perform mouse over action
 	Actions act = new Actions(driver);
 	Thread.sleep(2000);
 	act.moveToElement(moveToElement).perform();
 	//click on band option
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//a[text()='Band']")).click();
}
}
