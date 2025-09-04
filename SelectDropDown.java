package homeAssignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

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
		tl.findElement(By.linkText("Accounts")).click();
		tl.findElement(By.linkText("Create Account")).click();
		tl.findElement(By.id("accountName")).sendKeys("Subhiksha");
		tl.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry= tl.findElement(By.name("industryEnumId"));
		Select software = new Select(industry);
		software.selectByIndex(3);
		WebElement ownership= tl.findElement(By.name("ownershipEnumId"));
		Select corp = new Select(ownership);
		corp.selectByVisibleText("S-Corporation");
		WebElement source= tl.findElement(By.id("dataSourceId"));
		Select employee = new Select(source);
	    employee.selectByValue("LEAD_EMPLOYEE");
		WebElement marketting= tl.findElement(By.id("marketingCampaignId"));
	Select campaign = new Select(marketting);
		campaign.selectByIndex(6);
		WebElement state= tl.findElement(By.id("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("TX");
		tl.findElement(By.className("smallSubmit")).click();
		WebElement x= tl.findElement(By.id("accountName"));
		System.out.println(x.getAttribute("value"));
		tl.close();
		
		
	}

}
