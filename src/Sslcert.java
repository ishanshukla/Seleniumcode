import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setting up a capability to browser
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//chrome options
		ChromeOptions ob = new ChromeOptions();
		ob.merge(capabilities);
		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(ob);
		
		driver.get("https://expired.badssl.com/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Proceed')]")).click();
		
		
		
		
	}
	

}
