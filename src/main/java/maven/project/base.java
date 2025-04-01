package maven.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

ChromeOptions options = new ChromeOptions();

options.addArguments("--remote-allow-origins=*");
options.addArguments("--start-maximized");
WebDriver driver = new ChromeDriver(options);
driver.get("https://www.saucedemo.com/v1/index.html");



	}

}
