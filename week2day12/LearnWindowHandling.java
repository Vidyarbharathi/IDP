package week2day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		System.out.println(driver);		
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.id("home")).click();
		
	//	System.out.println(windowHandles.size());	
		
		/*
		 * for (String string : windowHandles) { System.out.println(string); }
		 */
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();					
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
	    System.out.println(windowHandles1.size());
		List<String> window1=new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(window1.get(1));
		System.out.println(driver.getTitle());			
		System.out.println(driver.getWindowHandle());		
		
		driver.switchTo().window(window1.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.close();
		
		//driver.executeScript("arguments[0],click:", WebElement);
		driver.quit();
		
		
		
	}

}
