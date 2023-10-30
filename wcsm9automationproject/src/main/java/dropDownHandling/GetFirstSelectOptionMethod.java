package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectOptionMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/HP/Desktop/WebElement/multiselectdropdown.html");
	WebElement dropDownEle=driver.findElement(By.name("menu"));
	Select sel=new Select(dropDownEle);
	//select multiple option 
	for(int i=3;i<4; i++) {
		Thread.sleep(2000);
		sel.selectByIndex(i);
	}
// get option that is selected first
	WebElement firstOpt = sel.getFirstSelectedOption();	
	System.out.println(firstOpt.getText());
	
}


}

