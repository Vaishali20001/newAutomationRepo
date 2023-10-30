package takeScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	// call the method
	File src = ts.getScreenshotAs(OutputType.FILE);
	//define way for storing Screenshot
	File dest = new File("./Screenshots/demoapps.png");
	//store the screenshot into destination
	Files.copy(src, dest);
	
	
	
}
}