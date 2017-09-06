// Based on official Selenium tutorial
// Creating a linkedin account using selenium

package selenium.linkedin;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App  {
    public static void main(String[] args) {
    	// Give machine access to gecko driver for firefox tests
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\wookie\\Documents\\seleniumDriverExecs\\geckodriver.exe");
    	
    	// Set browser capabilities for firefox testing
    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    	
    	// Necessary to run firefox test
        capabilities.setCapability("marionette", true);
        
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new FirefoxDriver();
        
        // Create new wait for pages to load
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        
        // Import custom js functionality
        JavascriptExecutor js = null;
        if (driver instanceof JavascriptExecutor) {
            js = (JavascriptExecutor)driver;
        }
        
        // ** Automation starts here ** //
        
        // ip blocked - will uncomment in an hour
        
//        // Go to 10minutemail to create disposable email account
//        driver.get("https://10minutemail.com/");
//        
//        // wait for page to load
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mailAddress")));
//        
//        // Store created email account
//        String email = driver.findElement(By.id("mailAddress")).getAttribute("value"); // m66304@mvrht.net
//        
//        // Log email to make sure it exists
//        System.out.println("Page email is: " + email);
        
        // go to google for testing while ip blocked from 10minutemail // REMOVE LATER
        driver.get("https://google.com/");                             // REMOVE LATER
        
        // wait 5 seconds for google to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // open linkedin in a new tab         
        js.executeScript("window.open('https://linkedin.com/','_blank'); ");
        
        // Create an array of the current tabs to switch between them
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        
        // This is a hacky way to set focus on the new tab, otherwise you can't modify the new tab
        driver.switchTo().window(tabs.get(1));
        
        // Make sure linkedin is loaded
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reg-firstname")));
        System.out.println("element located ");
        
        // When loaded grab form elements
        WebElement firstName = driver.findElement(By.id("reg-firstname"));
        System.out.println("web element: " + firstName);
//        WebElement lastName = driver.findElement(By.id("reg-lastname"));
//        WebElement linkedinEmail = driver.findElement(By.id("reg-email"));
//        WebElement password = driver.findElement(By.id("reg-password"));
        
        // Fill in form
        firstName.sendKeys("Bobby");
//        lastName.sendKeys("Boucher");
//        linkedinEmail.sendKeys("Testing@what.com"); // Give email from 10 minute mail
//        password.sendKeys("superSecretTotally01");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        // Pause program to test switching tabs
//        try{
//        	Thread.sleep(5000);
//        	}
//        	catch(InterruptedException ie){
//        	}
//        
//        // test switching tabs
//        driver.switchTo().window(tabs.get(0));
        
        // create linkedin account with created email       
        
        
        //Close the browser
//        driver.quit();
    }
}