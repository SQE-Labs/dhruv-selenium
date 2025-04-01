package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://demo.opencart.com.gr/");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			WebElement desktop=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
			WebElement mac=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
			act.moveToElement(desktop).moveToElement(mac).click().build().perform();
			
			
	}

}
