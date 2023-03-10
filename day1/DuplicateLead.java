package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id ("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads"));
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ruba Rani");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandiresan");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ruby");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello, how can i help you");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rnvkruba@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NVK");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NVK Ltd");
	driver.findElement(By.linkText("Create Lead")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.close();
	
	
		
	

	}

}
