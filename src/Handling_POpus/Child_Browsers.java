package Handling_POpus;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browsers {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='bc3322a9']/span/div/div[1]/a/img")).click();
		
		String parentWindowHandle = driver.getWindowHandle();
		//
		

				//clickElement.click();
			Thread.sleep(3000);
		

		Set<String> allWindowHandles = driver.getWindowHandles();

		for(String handle : allWindowHandles)
		{
			driver.switchTo().window(handle);
			//driver.findElement(By.xpath("/html/body/header/div/div[2]/div[3]/div[2]/div/a[5]")).click();
			
			Thread.sleep(5000);

			driver.switchTo().window(parentWindowHandle);
		}

	}

}    // Switching to Parent window i.e Main Window.
       	



	


