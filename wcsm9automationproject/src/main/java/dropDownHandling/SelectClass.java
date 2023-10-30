package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass
{

public static void main(String[] args, WebElement dropDown4) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.id("idddd"));

	Select sel4 =new Select(dropDown4);
	//sel4.selectByIndex(5);
	//select multiple option from multiselectdropdown
	Thread.sleep(2000);
	for(int i=0;i<=5;i++)
	{
		sel4.selectByIndex(i);
		
	}
	
}
}
