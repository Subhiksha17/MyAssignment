package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateLogin {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		ChromeDriver fb= new ChromeDriver();
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();
		fb.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		fb.findElement(By.name("pass")).sendKeys("Tuna@321");
		fb.findElement(By.name("login")).click();
		String title = fb.getTitle();
		System.out.println(title);
	}

}
