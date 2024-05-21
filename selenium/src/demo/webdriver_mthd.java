package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class webdriver_mthd {
 
	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String text1=driver.getTitle();
		System.out.println("return title of web page"+text1);
		
		String text2=driver.getCurrentUrl();;
		System.out.println("Returns Current URL of webpage"+text2);
		
		String text3=driver.getPageSource();
		System.out.println("Returns HTML code of webpage"+text3);
		
		// TODO Auto-generated method stub

	}

}
