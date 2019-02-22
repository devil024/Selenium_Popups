package Handling_POpus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownlod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\workspace\\Selenium\\Exe\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[26]/a"));
		
		ele.click();
		
		
		
		
		ele.sendKeys(Keys.DOWN);

		
	}

}
