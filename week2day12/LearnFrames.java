package week2day12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		////div[@id='wrapframe']/iframe
		long random = (long)Math.random();
		System.out.println(random);
	
		driver.switchTo().frame(0);
		WebElement firstFrame = driver.findElement(By.id("Click"));
		firstFrame.click();
		File screenshotAs1 = firstFrame.getScreenshotAs(OutputType.FILE);		
		File dest1=new File("./snap/img1.jpg");		
		FileUtils.copyFile(screenshotAs1, dest1);
		String text = firstFrame.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		File screenshotAs2 = driver.getScreenshotAs(OutputType.FILE);		
		File dest2=new File("./snap/img"+random+".jpg");		
		FileUtils.copyFile(screenshotAs2, dest2);		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");		
		driver.findElement(By.id("Click1")).click();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);		
		File dest=new File("./snap/img.jpg");		
		FileUtils.copyFile(screenshotAs, dest);
		
		
	

	}

}
