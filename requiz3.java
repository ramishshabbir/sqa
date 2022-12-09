package requiz3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class requiz3 {
	WebDriver driver;
	requiz3pom obj;

	@BeforeMethod
	public void before() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");

	}

	

	@Test
	public void main() throws Exception {
		obj=new requiz3pom(driver);
		obj.login();
		obj.PatientButton();
		obj.Search();
		obj.dropdown();
	}

	@AfterMethod
	public void end() {
		driver.quit();

	}
}
