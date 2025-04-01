package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.rediff.com/");
			driver.manage().window().maximize();
//			driver.switchTo().frame("moneyiframe");
//			driver.switchTo().frame(0);
			WebElement e1=driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]"));
			driver.switchTo().frame(e1);
			
			
		
			WebElement e=driver.findElement(By.xpath("//*[@id=\"nseindex\"]"));
//			System.out.println(e);
			String s1=e.getText();
			System.out.println(s1);
	}

}
