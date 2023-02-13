package homeWorkAssignm01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
	//launch the broswer
	ChromeDriver browser=new ChromeDriver();
	//load the url
	browser.get("http://leaftaps.com/opentaps/control/main");
	//maximize the window
	browser.manage().window().maximize();
	//enter username 
	browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
	browser.findElement(By.id("password")).sendKeys("crmsfa");
	browser.findElement(By.className("decorativeSubmit")).click();
	String title=browser.findElement(By.tagName("h2")).getText();
	System.out.println(title);
	browser.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	browser.findElement(By.xpath("//a[text()='Leads']")).click();
	browser.findElement(By.xpath("//a[text()='Create Lead']")).click();
	browser.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ACC");
	browser.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	browser.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
	browser.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
	browser.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Raj");
	browser.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
	browser.findElement(By.id("createLeadForm_departmentName")).sendKeys("Design architect");
    browser.findElement(By.id("createLeadForm_description")).sendKeys("To Create a new Lead");
	browser.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	browser.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7094931002");
	browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya01@gmail.com");
	WebElement stateOrProvince=browser.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	Select selectingState=new Select(stateOrProvince);
	selectingState.selectByVisibleText("Hawaii");
	
	browser.findElement(By.xpath("//input[@name='submitButton']")).click();
	
	System.out.println(browser.getTitle());
	
	
	
	
	
	
}
}
