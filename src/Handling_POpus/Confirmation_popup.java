package Handling_POpus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 // This step will result in an alert on screen
		 driver.get("D:\\cnfrm.html");
		 driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		 
		 Thread.sleep(3000);
		 Alert confirmationAlert = driver.switchTo().alert();
		 String alertText = confirmationAlert.getText();
		
		 System.out.println("Alert text is " + alertText);
		 confirmationAlert.dismiss();

	}

}
