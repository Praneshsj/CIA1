//
//package cia1;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import dev.failsafe.internal.util.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
//public class ques2 {
//    public static void main( String[] args ) throws InterruptedException
//    {
//    	        WebDriverManager.chromedriver().setup();
//    	    	ChromeOptions co=new ChromeOptions();
//    	    	co.addArguments("--remote-allow-origins=*");
//    	    	WebDriver driver=new ChromeDriver(co);
//    	    	driver.manage().window().maximize();
//    	    	driver.get("https://www.amazon.in/Ambrane-Multi-Layer-Protection-Li-Polymer-Stylo-10k/dp/B09MZCQYHZ/ref=sr_1_1_sspa?crid=V65BUZKL1EFD&keywords=power+bank&qid=1681294271&sprefix=power+bank%2Caps%2C2589&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
//    	    	driver.findElement(By.id("add-to-cart-button")).submit();
//    	    	String t=driver.getTitle();
//    	    	System.out.println(t);
//    	    	
//    	    	
//    	    	String cart=driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
//    	     	if(cart.equals("Added to cart"));
//    	     		System.out.println("1.  Verified that Product added to cart ");
//    	     		
//    	     		driver.navigate().back();
//        	    	
//        	    	WebElement sort1=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
//                	sort1.click();
//                	Select select=new Select(sort1);
//                	select.selectByIndex(1);
//                	
//                	String drop=driver.findElement(By.xpath("//*[@id=\"quantity\"]")).getText();
//        	     	if(drop.equals("2"));
//        	     		System.out.println("3.  Verified that Product is updated to cart ");	
//    }
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
public class ques2 
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
		}
		
    	
    	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("powerbank");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		System.out.println("Searched Item successfully");
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[2]/span/div/div[2]/div[1]/a"));
		for(WebElement link:li) {
			System.out.println(link.getText());
		}
		System.out.println("User is able to filter by search");

		System.out.println("Testing Ended");
		
    	driver.quit();
    }
}
