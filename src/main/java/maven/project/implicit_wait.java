package maven.project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
WebDriverManager.chromedriver().setup();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
		
		//implicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

}
