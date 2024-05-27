package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class devmozila {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver,chrome.driver","driver.chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
		driver.manage().window().maximize();
		
		WebElement pet=driver.findElement(By.id("pet-select"));
		Select selectpet=new Select(pet);
		
		// selecting by visible text
        selectpet.selectByVisibleText("Hamster");
        Thread.sleep(100);
        selectpet.selectByVisibleText("dog");
        Thread.sleep(2000);
        
      //Selecting multiple values by index
        selectpet.selectByIndex(4);
        selectpet.selectByIndex(5);
        
        
	}

}
