package maven.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statictable {

	public static void main(String[] args) {
	
//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\Chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	        
			
		 options.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
			System.out.println(rows+" "+columns);
			for(int r=2;r<=rows;r++) {
				for(int c=1;c<=columns;c++) {
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+" ");
				}
				System.out.println(" ");
			}
			System.out.println();




			
	}

}
