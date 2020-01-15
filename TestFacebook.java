package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class TestFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinit\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("email");
	    
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys("password");
	    
	    pass.submit();
		/* searchBox.submit(); */
	    //Thread.sleep(5000);  // Let the user actually see something!
	    driver.quit();
	}

}
