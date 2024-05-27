package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https:///demoqa.com/buttons&quot");
		
		WebElement element=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Thread.sleep(100);
		Actions act=new Actions(driver);
		act.doubleClick(element).build().perform();;
		act.doubleClick(element).perform();
		Thread.sleep(2000);
		
		
		
	}

}
