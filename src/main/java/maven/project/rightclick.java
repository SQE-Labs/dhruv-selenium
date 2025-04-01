package maven.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //
		
		driver.manage().window().maximize();
		
		Actions act2 = new Actions(driver);
		WebElement rc=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act2.contextClick(rc).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		driver.switchTo().alert().accept();
	}

}
