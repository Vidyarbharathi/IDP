package mavenProject;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// communicate with the driver
		WebDriverManager.chromedriver().setup();
		/*
		 * String property = System.getProperty("webdriver.chrome.driver");
		 * System.out.println(property);
		 */
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		System.out.println(driver); // print the session id
		driver.get("https://www.google.com/");		
		driver.close();	
		
		
		
		

	}

}
