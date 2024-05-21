package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chatgpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdeiver.chrome.driver","driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement element=findElement(By.className("M6CB1c rr4y5c"));
		element.click();
		
		WebElement element1=findElement(By.name("q"));
		element1.sendKeys("chat gpt");
		element1.submit();
		
		

	}

	private static WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}

}
