package Handling_POpus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		// This step will result in an alert on screen
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Thread.sleep(5000);
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		
		Thread.sleep(3000);
		
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();

	}

}
