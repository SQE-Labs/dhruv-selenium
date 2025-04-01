package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
			
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			//alert accept and dismiss
//			driver.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			
//			String s1=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
//			System.out.println(s1);	
			driver.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
			driver.switchTo().alert().sendKeys("Dhruv");
			driver.switchTo().alert().accept();
			String s2=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
			System.out.println(s2);
			}

}
