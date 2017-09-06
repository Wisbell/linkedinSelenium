// Based on official Selenium tutorial
// Creating a linkedin account using selenium

package selenium.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
        
        // Test to make sure selenium is loaded and works

        // And now use this to visit Google
        driver.get("http://www.google.com");
        
        // End of test
        
        // Plan flow of program here
        
        //Close the browser
//        driver.quit();
    }
}