package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	
		 options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--start-maximized");  will start already maximized
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://testautomationpractice.blogspot.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
//			driver.findElement(By.linkText("Posts (Atom)")).click();
			String s1=driver.getTitle();
			System.out.println(s1);
			driver.navigate().to("https://fast.com/");
			
			Thread.sleep(2000);
			driver.quit();
			}

	
}
