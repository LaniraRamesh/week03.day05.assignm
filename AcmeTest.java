package homeWorkAssignm01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
		

	}

}
