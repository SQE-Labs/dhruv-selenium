package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
		
		driver.get("https://testautomationpractice.blogspot.com/"); //
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// zoom in and zoom out
		
		js.executeScript("document.body.style.zoom='50%'");
		
		//to send the text 
		
	     WebElement username = 	driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
	     
		js.executeScript("arguments[0].setAttribute('value', 'Prince')",username);
		
		
		// To perform click operation
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"male\"]"));
		
		js.executeScript("arguments[0].click()", button);
		
		// to find the domain of the webpage 
		
	    String domain =	js.executeScript("return document.domain;").toString();
	    
	    System.out.println(domain);
	    
	    // to find the url of the page
	    
	  String url =   js.executeScript("return document.URL;").toString();
	  
	  System.out.println(url);
	  
         String title =   js.executeScript("return document.title;").toString();
	  
	  System.out.println(title);
	  
	  js.executeScript("alert('Alert message to.');");
	  
       Thread.sleep(2000);
	  
	  // naviagte to different web page
	  
	  js.executeScript("window.location ='https://www.google.com/'");
	  
	  
	  // 
	  
	  js.executeScript("alert('Alert message to.');");
	  
	  
	  
	}

}
