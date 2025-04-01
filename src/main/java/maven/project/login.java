package maven.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\Chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	        
			
		    options.addArguments("--remote-allow-origins=*");
		    options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.saucedemo.com/v1/index.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement username =driver.findElement(By.id("user-name"));
			System.out.println(username);
			username.sendKeys("standard_user");
//			driver.findElement(By.id("user-name")).sendKeys("standard_user"); above 2 lines are same as this.
//          either we can call by storing variable or by direct call.
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
	}

}
