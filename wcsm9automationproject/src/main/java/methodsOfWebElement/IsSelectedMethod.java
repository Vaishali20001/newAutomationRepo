package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	
 driver.findElement(By.xpath("//section[text()='Check Box']")).click();
WebElement checkBoxElement = driver.findElement(By.xpath("(//input[@name='Domain'])[1]"));
boolean status = checkBoxElement.isSelected();
System.out.println(status);

checkBoxElement.click();
boolean status1 = checkBoxElement.isSelected();
System.out.println(status1);

	
	
	
}
}
