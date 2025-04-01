package maven.project;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class partialscreeenchot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        
		
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
		WebElement ss =	driver.findElement(By.xpath("//*[@id=\"header-inner\"]"));
		File featured=ss.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\ASUS\\eclipse-workspace\\selenium\\project\\screenshot\\partial.png");
		featured.renameTo(target);
	}

}
