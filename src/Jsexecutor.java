import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor jsexec = (JavascriptExecutor)driver;
		jsexec.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		jsexec.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		
		
		
	}

}
