package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demofirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");

		// System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// open the browser

		driver.get("https://www.google.com");
	}

}
