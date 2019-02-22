package Handling_POpus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException
	

	{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		
		driver.findElement(By.className("cd-popup-trigger")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("	/html/body/div/div/ul[2]/li/input")).sendKeys("D:\\cnfrm.txt");
		
		

	}

}
