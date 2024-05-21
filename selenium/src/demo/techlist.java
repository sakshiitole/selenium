package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	      
			WebDriver driver = new ChromeDriver();

	       driver.manage().window().maximize();
	       driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	       
	       WebElement firstname=findElement(By.name("firstname"));
	       firstname.sendKeys("Sakshi");
	       
	       WebElement lastname=findElement(By.name("lastname"));
	       lastname.sendKeys("Itole");
	       
	       WebElement id=findElement(By.id("sex-1"));
	       id.click();
	       
	       WebElement element=findElement(By.name("exp-0"));
	       element.click();
	       
	       WebElement date=findElement(By.name("datepicker"));
	       date.sendKeys("21/5/2024");
	       
	       WebElement element2=findElement(By.name("profession-1"));
	       element2.click();
	       
	       WebElement element3=findElement(By.name("tool-0"));
	       element3.click();
	       
	       WebElement continents=findElement(By.className("input-xlarge"));
	       continents.click();

	       
	       

	       
	       

 
	       
		
	}

	private static WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}

}
