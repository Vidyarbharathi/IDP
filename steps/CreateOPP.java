package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOPP extends SalesforceMethods {
	@Given("Enter the usname as {string}")
	public void enterTheUsnameAs(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the pword as {string}")
	public void enterThePwordAs(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click the Login button")
	public void clickTheLoginButton() {
		driver.findElement(By.id("Login")).click();

	}

	@Then("Verify the Homepage is displayed")
	public void verifyTheHomepageIsDisplayed() {
		System.out.println(driver.getTitle());

	}

	@When("click the toggle button")
	public void clickTheToggleButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-r4']/following-sibling::div[1]")).click();
	}

	@When("Click viewAll")
	public void clickViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();

	}

	@When("Search for Opportunity and enter")
	public void searchForOpportunityAndEnter() {
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Opportunities");
	}

	@Then("Click the Opportunity")
	public void clickTheOpportunity() {
		driver.findElement(By.xpath("//mark[text()='Opportunities']")).click();
	}

	@When("click the new button")
	public void clickTheNewButton() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}

	@When("Enter the opportunity name as {string}")
	public void enterTheOpportunityNameAs(String name) {
		WebElement oppname = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		oppname.click();
		oppname.sendKeys(name);
	}

	@When("choose the date")
	public void chooseTheDate() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='22']")).click();

	}

	@When("Select the stage as Need Analysis")
	public void selectTheStageAsNeedAnalysis() {
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}

	@When("Click the save button")
	public void clickTheSaveButton() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	}

	@Then("Verify the new opportunity")
	public void verifyTheNewOpportunity() {
		String successOpp = driver
				.findElement(By.xpath("//div[contains(@class,'toastContainer slds-notify_container')]//div")).getText();
		System.out.println(successOpp);
	}
}
