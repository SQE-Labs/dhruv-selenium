package maven.project;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);   // launch the browser0
			
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette"); //
			
			driver.manage().window().maximize();
			WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
			WebElement italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
			Actions act=new Actions(driver);
			act.dragAndDrop(rome, italy).build().perform();
			
	}

}
