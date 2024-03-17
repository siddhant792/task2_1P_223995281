package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement firstNameField = driver.findElement(By.id("firstname"));
		// Send first name
		firstNameField.sendKeys("Siddhant");
		
		WebElement lastNameField = driver.findElement(By.id("lastname"));
        lastNameField.sendKeys("Gupta");
        
        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        phoneNumberField.sendKeys("0480512920");
        
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("siddhantgupta792000@gmail.com");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password@1");
        
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        confirmPasswordField.sendKeys("Password1");
        
        // Click on the create account button
        WebElement createAccountButton = driver.findElement(By.xpath("//button[@type='submit']"));
        createAccountButton.click();
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void gumtree_registration_page(String url) {
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		driver.get(url);
		
		WebElement firstNameField = driver.findElement(By.id("form.firstName"));
		
		firstNameField.sendKeys("Siddhant");
		
		WebElement lastNameField = driver.findElement(By.id("form.lastName"));
        lastNameField.sendKeys("Gupta");
        
        WebElement emailField = driver.findElement(By.id("form.emailAddress"));
        emailField.sendKeys("siddhantgupta792000@gmail.com");
        
        WebElement passwordField = driver.findElement(By.id("form.password"));
        passwordField.sendKeys("Password1");
        
        WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        createAccountButton.click();
		
		sleep(2);
		
		driver.close();	
	}
	
	
}
