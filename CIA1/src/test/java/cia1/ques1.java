package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ques1 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/Ambrane-Multi-Layer-Protection-Li-Polymer-Stylo-10k/dp/B09MZCQYHZ/ref=sr_1_1_sspa?crid=RPIDKO6C469U&keywords=power%2Bbank&qid=1681305647&sprefix=powerbank%2Caps%2C351&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in: Ambrane 10000mAh Slim Power Bank, 20W Fast Charging, Dual Output, Type C PD (Input & Output), Quick Charge, Li-Polymer, Multi-Layer Protection for iPhone, Anrdoid & Other Devices (Stylo 10K, Green)")) {
			System.out.println("Verified title of the page");
		}else {
			System.out.println("Title not matched");
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
    	
    	
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("Verified Add to Cart button");
		
		String lnk=driver.findElement(By.id("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")).getText();
		if(lnk.equals("Sign in")) {
			System.out.println("Sign in page landed");
		}else {
			System.out.println("Wrong page landed");
		}
		
    	driver.quit();
    }
}


