package week2day12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNotifications {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("disbale-notification");		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.axisbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[name()='svg']")).click();
		

	}

}
