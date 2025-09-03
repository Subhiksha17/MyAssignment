package homeAssignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		tl.findElement(By.id("numberEmployees")).sendKeys("6");
	tl.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	tl.findElement(By.className("smallSubmit")).click();
	System.out.println(tl.getTitle()); 
	tl.close();
	
	
	
	
	}
}
