package homeWorkAssignm01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Priya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='10710']")).click();
		String text02=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text02);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("KVC");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
