package week2day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.findElement(By.tagName("title")).getAttribute("textContent");
		System.out.println(title);

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// typed value in the text box
		String uname = username.getAttribute("value");
		System.out.println(uname);

		// to get the location of the webelement
		Point location = username.getLocation();
		System.out.println(location);

		//get the size of the webElement
		Rectangle rect = username.getRect();
		int height = rect.height;
		int width = rect.width;
		System.out.println(height + " is the height and the width is  " + width);

		String cssValue = username.getCssValue("style");
		System.out.println(cssValue);

		String title2 = driver.getTitle();
		System.out.println(title2);

		if (title.equals(title2)) {
			System.out.println("Landed in the right page");
		}

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// to navigate between the pages driver.navigate().back();

		driver.navigate().to(currentUrl);
		
		
		// to get the Dom in the console
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
