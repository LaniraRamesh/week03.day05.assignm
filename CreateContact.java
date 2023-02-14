package homeWorkAssignm01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Lanira");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("lan");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("ramesh");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Design");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("To create a new lead");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("lanira001@gmail.com");
		WebElement ele01=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select stateOrProvince=new Select(ele01);
		stateOrProvince.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("Important note: to create new lead");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
