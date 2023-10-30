package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/HP/Desktop/WebElement/singleselecteddropdown.html");
	
	WebElement dropDownEle=driver.findElement(By.id("menu"));
	Select sel=new Select(dropDownEle);
	//use Selection Methods 
	Thread.sleep(2000);
	sel.selectByIndex(3);
	Thread.sleep(2000);
	sel.selectByVisibleText("");
	Thread.sleep(2000);
	sel.selectByValue("v2");
	
	
	
}
}
