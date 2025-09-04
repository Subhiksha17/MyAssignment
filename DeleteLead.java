package homeAssignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		
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
		tl.findElement(By.linkText("Find Leads")).click();
		tl.findElement(By.linkText("Phone")).click();
		tl.findElement(By.name("phoneCountryCode")).sendKeys("+");
		tl.findElement(By.name("phoneAreaCode")).sendKeys("91");
		tl.findElement(By.name("phoneNumber")).sendKeys("7464636363");
		tl.findElement(By.linkText("Find Leads")).click();
		tl.close();
		

	}

}
