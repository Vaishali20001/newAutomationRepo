package assignmentPackage;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ebaylogging {
public static void main(String[] args, EdgeDriver driver) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("pass browser");
	String browserValue = sc.next();	
	if(browserValue.equalsIgnoreCase("Chrome")) {
		WebDriver driver1 = new ChromeDriver();
	}

	else if(browserValue.equalsIgnoreCase("edge")) {
		WebDriver driver1 = new EdgeDriver();
	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Apple Watches");
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
}
}
