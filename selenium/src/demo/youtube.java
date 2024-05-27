package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class youtube {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//Enter Username
		WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("sakshi_itole");	  
	    
	    //Enter Password
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("sricrick");
	    
	    //Click on Login Button
	    WebElement login=driver.findElement(By.xpath(" //*[@id=\"loginForm\"]/div/div[3]/button/div"));
	    login.click();
	    
	     
	     
		
	    //Taking a screenshot
	    TakesScreenshot ts =(TakesScreenshot) driver ;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File des=new File("C:\\screenshots2//a.png");
	       
	       
	    FileHandler.copy(src, des);
		
		
		
	}

}
