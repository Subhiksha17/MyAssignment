package homeAssignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver fb =new ChromeDriver();
		fb.get("https://en-gb.facebook.com/");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fb.findElement(By.linkText("Create new account")).click();
		fb.findElement(By.name("firstname")).sendKeys("Subhiksha");
		fb.findElement(By.name("lastname")).sendKeys("Vigneshwaran");
		fb.findElement(By.name("reg_email__")).sendKeys("subhikshavp@gmail.com");
		fb.findElement(By.id("password_step_input")).sendKeys("idontknow");
	
		WebElement day=fb.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByVisibleText("17");
		WebElement month=fb.findElement(By.id("month"));
		Select sept = new Select(month);
		sept.selectByIndex(9);
		WebElement year=fb.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByValue("2000");
		fb.findElement(By.xpath("//label[text()='Male']/input")).click();
		
	}

}
