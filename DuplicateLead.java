package homeWorkAssignm01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

		public static void main(String[] args) {
			//launch the broswer
			ChromeDriver browser=new ChromeDriver();
			//load the url
			browser.get("http://leaftaps.com/opentaps/control/main");
			//maximize the window
			browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			browser.manage().window().maximize();
			//enter username 
			browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
			browser.findElement(By.id("password")).sendKeys("crmsfa");
			browser.findElement(By.className("decorativeSubmit")).click();
			String title=browser.findElement(By.tagName("h2")).getText();
			System.out.println(title);
			browser.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			browser.findElement(By.xpath("//a[text()='Leads']")).click();
			browser.findElement(By.xpath("//a[text()='Find Leads']")).click();
			browser.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
			browser.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("priya01@gmail.com");
			browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String name01=browser.findElement(By.xpath("//a[(text()='Priya')]")).getText();
			System.out.println(name01);
			browser.findElement(By.xpath("//a[(text()='Priya')]")).click();
			browser.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			System.out.println(browser.getTitle());
			browser.findElement(By.xpath("//input[@name='submitButton']")).click();
			
			
}
}
