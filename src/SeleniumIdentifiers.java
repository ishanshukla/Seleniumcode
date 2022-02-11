import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIdentifiers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ishan");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Ishan");
		//driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(100);
		driver.findElement(By.cssSelector("input[placeholder = 'Name']")).sendKeys("ishan");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("shuklaishan70@gmail.com");
	    driver.findElement(By.cssSelector("input[placeholder *= 'Phone']")).sendKeys("6825526842");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    String tempText =  driver.findElement(By.className("infoMsg")).getText();
	    String[] pwd = tempText.split("'");
	    String pwd1 = pwd[1];
	    System.out.println(pwd1);
	    driver.findElement(By.className("go-to-login-btn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#inputUsername")).clear();
	    driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ishan");
	    driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(pwd1);
	    driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
	    
	  
		
		
		
	}

}
