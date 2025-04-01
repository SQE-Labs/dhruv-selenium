package maven.project;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwait {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriverManager.chromedriver().setup();
		
         ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //
		
		driver.manage().window().maximize();
//		withTimeout:
//
//		    Sets the maximum amount of time to wait (e.g., 30 seconds).
//
//		pollingEvery:
//
//		    Specifies the frequency at which the condition will be checked (e.g., every 500 milliseconds).
//
//		ignoring:
//
//		    Allows you to specify exceptions to be ignored while waiting for the condition.
		
		//Declaration
		
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
                   
         WebElement username =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		username.sendKeys("Admin");
		
		
	}

}
