package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();// open the browser
		
		driver.get("https://www.google.co.in/");//launch the URL
		driver.manage().window().maximize();//maximize the window
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
	}

	}



