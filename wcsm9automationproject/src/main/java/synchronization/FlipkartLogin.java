package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//apply implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.flipkart.com/");

driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
driver.findElement(By.xpath("//a[@class='_1krdK5' and (@title='Cart')]")).click();
driver.findElement(By.xpath("//a[text()='Login']")).click();
}
}

