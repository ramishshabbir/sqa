package requiz3;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class requiz3pom {
	WebDriver driver;
	List<String> ListOne;

	@FindBy(xpath = "//input[@id='vchLogin_Name']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='vchPassword']")
	WebElement passWord;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement Login;

	@FindBy(xpath = "//iframe[@id='fra_Menu_CureMD']")
	WebElement frameOne;

	@FindBy(xpath = "//iframe[@id='fraCureMD_Body']")
	WebElement frameTwo;

	@FindBy(xpath = "//i[@class='icon icon-patient']")
	WebElement Patient;

	@FindBy(id = "txtLast_Name")
	WebElement lastName;

	@FindBy(id = "txtFirst_Name")
	WebElement firstName;

	@FindBy(id = "txtDOB")
	WebElement DateofBirth;

	@FindBy(xpath = "//td[@title='Search Patient']")
	WebElement Search;

	@FindBy(xpath = "//a[@id='anchorPatientName136529']")
	WebElement patientDetails;

	@FindBy(id = "ddlCountry")
	WebElement Country;

	@FindBy(id = "cmbvstatus")
	WebElement dropDownTwo;

	public requiz3pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void login() throws Exception {
		
		Thread.sleep(2000);
		userName.sendKeys("LastVisit");
		Thread.sleep(2000);
		passWord.sendKeys("SuPPort.2014");
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(2000);

	}

	public void PatientButton() throws Exception {

		String parent = driver.getWindowHandle();
		java.util.Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(parent)) {
				driver.switchTo().window(handle);
				driver.switchTo().frame(frameOne);
				Patient.click();
			}
		}
	}

	public void Search()

	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frameTwo);
		lastName.sendKeys("Aaa");
		firstName.sendKeys("ZIXHEENOQK");
		DateofBirth.sendKeys("01/01/2002");
		Search.click();
		patientDetails.click();

	}

	public void dropdown() {
		Select se = new Select(Country);
		String selectedoption = se.getFirstSelectedOption().getText();
		System.out.println(selectedoption);
		
		Select se2= new Select(dropDownTwo);
		List<WebElement> list =se2.getOptions();
		ArrayList<String> text=new ArrayList<String>(); 
		for(WebElement dd:list) {
			String optionstext=dd.getText();
			text.add(optionstext);
		}
		ArrayList<String> listgiven=new ArrayList<String>();  
		listgiven.add("Single");
		listgiven.add("Married");
		listgiven.add("Separated");
		listgiven.add("Divorced");
		listgiven.add("Widowed");
		listgiven.add("Partnered");
		listgiven.add("Unknown");
		assertEquals(text, listgiven);

	}
	

}
