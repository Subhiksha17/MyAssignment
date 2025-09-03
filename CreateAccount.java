package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver create = new ChromeDriver(options);
		create.get("http://leaftaps.com/opentaps/");
		create.manage().window().maximize();
		create.findElement(By.id("username")).sendKeys("demosalesmanager");
		create.findElement(By.id("password")).sendKeys("crmsfa");
		create.findElement(By.className("decorativeSubmit")).click();
		
		create.findElement(By.partialLinkText("CRM")).click();
		create.findElement(By.linkText("Leads")).click();
		create.findElement(By.linkText("Create Lead")).click();
		create.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		create.findElement(By.id("createLeadForm_firstName")).sendKeys("Subhiksha");
		create.findElement(By.id("createLeadForm_lastName")).sendKeys("Vigneshwaran");
		WebElement source= create.findElement(By.id("createLeadForm_dataSourceId"));
		Select employee= new Select(source);
		employee.selectByIndex(4);
		WebElement marketing = create.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select automobile = new Select(marketing);
		automobile.selectByVisibleText("Automobile");
		WebElement ownership = create.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select corporation = new Select(ownership);
		corporation.selectByValue("OWN_SCORP");
		
		create.findElement(By.className("smallSubmit")).click();
		String title=create.getTitle();
		System.out.println(title);
		create.close();		
	}

}
