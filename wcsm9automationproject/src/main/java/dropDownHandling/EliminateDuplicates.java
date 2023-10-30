package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/HP/Desktop/WebElement/singleselecteddropdown.html");
	//
	WebElement menuDropDown =  driver.findElement(By.id("menu"));
	//get all the options of menuDropDown
	Select sel = new Select(menuDropDown);
	List<WebElement> allOps = sel.getOptions();
	
	//
	HashSet<String> hs=new HashSet<String> () ;
	//read option using for loop
	for(int i=0; i<allOps.size(); i++) 
	{
		WebElement op = allOps.get(i);
		
		//get text of web element
		String dropDownOption = op.getText();
		
		//add then dropdownOption into HasgSet and remove duplicate from DropDown
		hs.add(dropDownOption);
	}
	Thread.sleep(2000);
	//read option using for each loop
	for(String opt:hs)
        {
		Thread.sleep(2000);
		}
	}
}

