import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdownMenu = new Select(dropDown);
		dropdownMenu.selectByVisibleText("USD");
		driver.findElement(By.id("autosuggest")).sendKeys("US");
		List<WebElement> li = driver.findElements(By.className("ui-menu-item"));
		for(int i=0;i<li.size();i++) {
			
			System.out.println(li.get(i).getText());
			
			if(li.get(i).getText().equalsIgnoreCase("Australia")){
				li.get(i).click();
				
			}
		}
		
		
	}

}
