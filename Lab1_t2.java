package lab1_t2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1_t2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\4426\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		
		String baseurl1="https://www.way2automation.com/way2auto_jquery/frames-and-windows.php";
		driver.get(baseurl1);
		
		String winHan = driver.getWindowHandle();

		WebElement tab1 = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult1.html\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(tab1);
		driver.findElement(By.linkText("New Browser Tab")).click();
		

		Thread.sleep(2000);
		//driver.quit();
		
		driver.switchTo().window(winHan);
		driver.findElement(By.xpath("//a[@href='#example-1-tab-2']")).click();
		
		
		WebElement tab2 = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult2.html\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(tab2);
		driver.findElement(By.linkText("Open New Seprate Window")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(winHan);
		driver.findElement(By.xpath("//a[@href='#example-1-tab-3']")).click();
		//driver.close();
		WebElement tab3 = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult3.html\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(tab3);
		driver.findElement(By.linkText("Open Frameset Window")).click();
		Thread.sleep(2000);


		driver.switchTo().window(winHan);
		driver.findElement(By.xpath("//a[@href='#example-1-tab-4']")).click();
		WebElement tab4 = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult4.html\"]"));
		Thread.sleep(1000);
		driver.switchTo().frame(tab4);
		driver.findElement(By.linkText("Open multiple pages")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(winHan);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Frames and Windows")).click();
		Thread.sleep(3000);
		driver.quit();			
				
	}

}


