import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Frames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty(("webdriver.chrome.driver"), "/Users/ishanshukla/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameOne = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frameOne);
		driver.findElement(By.id("draggable")).click();
		System.out.println("Element clicked");
		
		driver.manage().window().maximize();
		
		Screenshot sc= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(sc.getImage(), "jpg", new File("//Users//ishanshukla//Documents//Screenshots"));
		
	
		driver.close();
	}

}
