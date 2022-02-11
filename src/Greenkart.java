import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] productClick = {"Tomato", "Potato"};
		List<WebElement> productList = driver.findElements(By.className("product-name"));
		for(int i=0; i< productList.size(); i++) {
			
			String productName = productList.get(i).getText();
			for(int j=0; i<productClick.length; j++) {
				
				if(productName.contains(productClick[j]))
				{
								driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
								break;
							
				}
				
				
			}	
			
		}
		
	}

}
