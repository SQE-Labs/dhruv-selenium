package maven.project;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class capturescreeshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://testautomationpractice.blogspot.com/");
			TakesScreenshot ts =(TakesScreenshot)driver;  //downcasting
	//TakesScreenshot is a specific interface that extends the capabilities
	//		of WebDriver class to allow for screenshot functionality.		
			File sourcefile=ts.getScreenshotAs(OutputType.FILE);
File targetfile=new File("C:\\Users\\ASUS\\eclipse-workspace\\selenium\\project\\screenshot\\fullpage.png");
			sourcefile.renameTo(targetfile);
	}

}
