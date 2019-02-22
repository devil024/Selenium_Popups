package Handling_POpus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divison 
{
	
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		
		driver.findElement(By.className("cd-popup-trigger")).click();
		Thread.sleep(3000);
		// send text to Name field on overlay
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
	  }
}
