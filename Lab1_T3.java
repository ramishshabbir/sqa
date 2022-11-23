package lab1_t3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lab1_T3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\4426\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String baseurl0="https://sso.teachable.com/secure/673/identity/login";
		driver.get(baseurl0);

		driver.findElement(By.linkText("Sign Up")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_name']")));
		  
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Ramish Shabbir");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("ramishshabbir@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("round123");
		driver.findElement(By.xpath("//input[(@type='checkbox' )and (@id='allow_marketing_emails')]")).click();
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);

	}

}











