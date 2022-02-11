import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		WebElement helloText = driver.findElement(By.cssSelector("div[id='finish'] h4"));
		
		
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(Exception.class);

		/*	
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			      
			    	 if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
			    		 return driver.findElement(By.cssSelector("div[id='finish'] h4"));
			    	 }
			    	 else {
			    		 return null;
			    	 }
			    	 
			     }
			   });
			   
			   */
		
		
		
		
        
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
		

	}

}
