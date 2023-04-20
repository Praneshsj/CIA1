//package cia1;
//
// 
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.Keys;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.chrome.ChromeOptions;
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class ques3 {
//	   public static void main(String[] args) {
//		   WebDriverManager.chromedriver().setup();
//		   WebDriver driver;
//		   ChromeOptions co=new ChromeOptions();
//		   co.addArguments("--remote-allow-origins=*");
//		   driver=new ChromeDriver();
//		   driver.navigate().to("https://www.amazon.in/");
//		   WebElement powerbank=driver.findElement(By.name("field-keywords"));
//		   powerbank.sendKeys("seagate"+Keys.ENTER);
//		   WebElement submitBtn = driver.findElement(By.name("submit"));
//		   submitBtn.click();
//		       }
//		   
//
//}
//	
package cia1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class ques3 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Verified title of the page");
		}else {
			System.out.println("Title not matched");
		
		driver.findElement(By.id("nav-link-accountList")).click();
    	
    	
		driver.findElement(By.id("ap_email")).sendKeys("162004sjp@gmail.com");
		driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys("skcet123*");
		driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String name=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		if(name.equals("Hello, pranesh")) {
			System.out.println("Successfully, signed in");
		}else {
			System.out.println("Sign in failed");
		}
		System.out.println("Testing Ended");
		
    	driver.quit();
    }
    }
}

