package homeAssignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions pop= new ChromeOptions();
		pop.addArguments("guest");
		ChromeDriver tl= new ChromeDriver(pop);
		tl.get("http://leaftaps.com/opentaps/");
		tl.manage().window().maximize();
		tl.findElement(By.id("username")).sendKeys("demosalesmanager");
		tl.findElement(By.id("password")).sendKeys("crmsfa");
		tl.findElement(By.className("decorativeSubmit")).click();
		tl.findElement(By.partialLinkText("CRM")).click();
		tl.findElement(By.linkText("Leads")).click();
		tl.findElement(By.linkText("Create Lead")).click();
		tl.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		tl.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Subhiksha");
		tl.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vigneshwaran");
		tl.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Subi");
		tl.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		tl.findElement(By.id("createLeadForm_description")).sendKeys("I am a non IT personal");
		tl.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subhikshavp@gmail.com");
		WebElement province= tl.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state= new Select(province);
		state.selectByVisibleText("New York");
		tl.findElement(By.name("submitButton")).click();		
		tl.findElement(By.linkText("Edit")).click();
		tl.findElement(By.id("updateLeadForm_description")).clear();
		tl.findElement(By.id("updateLeadForm_importantNote")).sendKeys("i dont know");
		tl.findElement(By.className("smallSubmit")).click();
		System.out.println(tl.getTitle());
		tl.close();
		
	}

}
