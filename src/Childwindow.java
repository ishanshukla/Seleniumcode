import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> allWindowHandles = driver. getWindowHandles(); 
		//System.out.println(allWindowHandles);
		Iterator<String>I1= allWindowHandles.iterator();
		String parentWindow = I1.next();
		String childWindow = I1.next();
		System.out.println(driver.switchTo().window(childWindow).getTitle());
		String userId = driver.findElement(By.xpath("//a[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("#username")).sendKeys(userId);
		
		
		
	}

}
