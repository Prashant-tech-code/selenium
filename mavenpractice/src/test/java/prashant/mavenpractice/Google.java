package prashant.mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Tital of the url is: " +driver.getTitle());
		driver.findElement(By.xpath(("/textarea[@id='APjFqb'])[1]"))).click();
		System.out.println("Click on search bar");
		driver.findElement(By.xpath(("/textarea[@id='APjFqb'])[1]"))).sendKeys("Prashant");
		System.out.println("Entered value");

	}

}
