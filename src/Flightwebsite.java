import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flightwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("DFW");
		driver.findElement(By.xpath("//input[@name='destinationAirport']")).sendKeys("Seattle");
		WebElement numPassangerDropdown = driver.findElement(By.name("adultOrSeniorPassengerCount"));
	    Select numPassangers = new Select(numPassangerDropdown);
	    numPassangers.selectByVisibleText("9");
	

	}

}
