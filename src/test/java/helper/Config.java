package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver ;
	public static Actions actions ;
	
	public static void confEdge () {
		
		System.setProperty("webdriver.edge.driver", "c:/msedgedriver.exe");
	}
	
	public static void maximize () {
		
		driver.manage().window().maximize();
	
	}
	
	public static void attente (int s) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

	public void quit () {
		
		driver.quit();
	}
}
