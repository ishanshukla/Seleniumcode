import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[contains(text(),'Multiple Windows')]")).click();
		String currentWindowHandle = driver.getWindowHandle();
		Set<String>windowhandles =  driver.getWindowHandles();
		
		
		Iterator<String> I1= windowhandles.iterator();
		while(I1.hasNext()){
			 
			String childWindow = I1.next();
			driver.switchTo().window(childWindow);
		}
		
		
		
	}

}
