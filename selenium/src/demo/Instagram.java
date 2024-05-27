package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	     driver.manage().window().maximize();
	     driver.get("https://www.instagram.com/");
	       
	     WebElement username = driver.findElement(By.name("username"));
	     username.sendKeys("sakshi_itole");	  
	     
	     WebElement password = driver.findElement(By.name("password"));
	     password.sendKeys("sricrick");
	     
	     WebElement login=driver.findElement(By.xpath(" //*[@id=\"loginForm\"]/div/div[3]/button/div"));
	     login.click();
	    
	    
	     

	    // Thread.sleep(1000);
	     //Thread.sleep(1000);
	    
		
		
		//WebElement username=driver.findElement(By.name("username"));
		//username.sendKeys("sakshi_itole");
		//username.submit();
		
	//WebElement element1=driver.findElement(By.)
	
	}

}
