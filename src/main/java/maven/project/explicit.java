package maven.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //
		
		driver.manage().window().maximize();
		
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		
		username.sendKeys("Admin");
		
		button.click();
		
	}

}
