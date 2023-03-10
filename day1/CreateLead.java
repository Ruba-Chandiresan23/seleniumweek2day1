package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source1=new Select(source);
	source1.selectByVisibleText("Employee");
	WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select market1=new Select(market);
	market1.selectByValue("9001");
	WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select own1=new Select(own);
	own1.selectByIndex(5);
	WebElement mom = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select mom1=new Select(mom);
	mom1.selectByVisibleText("India");
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	driver.close();
	
	
	
	
	
	
			
			
	
	
	
	
	
	

	}

	
	}


