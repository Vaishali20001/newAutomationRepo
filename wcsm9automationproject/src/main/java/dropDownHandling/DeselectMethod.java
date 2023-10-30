package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("file:///C:/Users/HP/Desktop/WebElement/multiselectdropdown.html");
WebElement dropDownEle=driver.findElement(By.name("menu"));
Select sel=new Select(dropDownEle);
//select single option
sel.selectByIndex(2);
Thread.sleep(2000);
//deselect single option from multiselect dropdown
sel.deselectByIndex(2);

//select multiple option
for (int i =0; i<3;i++) {
	Thread.sleep(2000);
	sel.selectByIndex(i);
}
Thread.sleep(2000);
for (int i =0; i<3;i++) {
	Thread.sleep(2000);
	sel.deselectByIndex(i);
}



}
}
