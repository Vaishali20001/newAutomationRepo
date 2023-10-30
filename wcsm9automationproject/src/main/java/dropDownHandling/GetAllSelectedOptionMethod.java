package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/multiselectdropdown.html");
		WebElement dropDownEle=driver.findElement(By.name("menu"));
		Select sel=new Select(dropDownEle);
		//select single option
		for(int i=0; i<4; i++) {
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		//to read options
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		//
		for(WebElement opt:allOpts) {
		Thread.sleep(2000);
		
		System.out.println(opt.getText());
	}

}
}
