package takeScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenshotOfWebElement {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.bluestone.com/");
    driver.findElement(By.id("denyBtn")).click();
    Thread.sleep(2000);
    
    WebElement coinTargetElement = driver.findElement(By.xpath("//a[text()='Coins ']"));
    Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(coinTargetElement).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	
	Thread.sleep(2000);
	WebElement coinScreenshot = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));	
	File src = coinScreenshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/coinScreenshot.png");
	Files.copy(src, dest);
	Thread.sleep(2000);
	driver.quit();
}
}
