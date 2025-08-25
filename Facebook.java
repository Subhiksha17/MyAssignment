package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver facebook = new ChromeDriver();
facebook.get("https://www.facebook.com/");
facebook.manage().window().maximize();
String heading=facebook.getTitle();
System.out.println(heading);
facebook.close();


	}

}
