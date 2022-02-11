import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Nested Frames')]")).click();
		System.out.println(driver.findElements(By.name("frame-top")).size());
		WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleFrame);
		String middleText = driver.findElement(By.xpath("//frame[@name='frame-middle']")).getText();
		System.out.println(middleText);
		driver.close();
		
		
		
		
	}

}
