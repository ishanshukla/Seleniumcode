import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("Dallas");
		driver.findElement(By.className("aaAutoComplete ui-autocomplete-input")).sendKeys("New York");

	}

}
