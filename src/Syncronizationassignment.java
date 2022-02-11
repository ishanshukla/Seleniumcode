import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronizationassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//String passwordText = driver.findElement(By.className("text-center text-white")).getText();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		//driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropDown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select obj = new Select(dropDown);
		obj.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		List<WebElement> addCart = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0; i<addCart.size(); i++) {
			
			addCart.get(i).click();
		}
		System.out.println("All items added in cart");
		//driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}
	
		
        
}
