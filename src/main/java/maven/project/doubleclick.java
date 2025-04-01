package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			WebElement dobclick=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
			act.doubleClick(dobclick).build().perform();
	}

}
