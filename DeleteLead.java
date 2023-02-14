package homeWorkAssignm01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7094931002");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text01=driver.findElement(By.xpath("//a[text()='10738']")).getText();
		System.out.println(text01);
		driver.findElement(By.xpath("//a[text()='10738']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10738");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text02=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text02);
		driver.close();
		
		
		
		
		
		
	}
	
	

}
