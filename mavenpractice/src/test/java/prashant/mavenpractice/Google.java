package prashant.mavenpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Maximize window");
		driver.get("https://www.google.com");
		System.out.println("Tital of the url is: " +driver.getTitle());
		System.out.println("Click on search bar");
		driver.findElement(By.xpath(("//a[@data-pid=\"23\"]"))).click();
		System.out.println("Click on Gmail Button");
		driver.quit();
		System.out.println("Driver closed");
		
		
	}

}
