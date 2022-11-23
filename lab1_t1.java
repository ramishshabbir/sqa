package Task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lab1_t1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\4426\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// To maximize the browser window
		driver.manage().window().maximize();		
		String baseurl="https://www.way2automation.com/";
		
		// Launch the application
		driver.get(baseurl);
		
		Actions builder = new Actions(driver);
		WebElement ac= driver.findElement(By.linkText("All Courses"));
		
		// To click and hold at the location 
		builder.clickAndHold(ac).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-27582']")));
		WebElement sub_ac= driver.findElement(By.linkText("Selenium"));
		builder.clickAndHold(sub_ac).build().perform();
		WebElement sub_ac0= driver.findElement(By.linkText("Selenium with Java"));
		builder.click(sub_ac0).build().perform();
		
		//To Delay execution for 3 seconds
		Thread.sleep(3000);


		
		
		
		 
		
	
	

	}

}












