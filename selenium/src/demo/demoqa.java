package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("Sakshi");
		
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("Itole");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("sakshiitole049@gmail.com");
		
		WebElement radiobtn=driver.findElement(By.xpath("//div[text()='Gender']/../div/div[2]"));
		radiobtn.click();
		
		WebElement num=driver.findElement(By.xpath("//input[@id='userNumber']"));
		num.sendKeys("8446816199");
		
		//WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		//Select selectmonth=new Select(month);
		//selectmonth.selectByValue("7");
		//date.sendKeys("08-08-2001");
		
		WebElement subject=driver.findElement(By.className("subjects-auto-complete__control css-yk16xz-control"));
		subject.sendKeys("Automation","Manual");
		
		//WebElement states=driver.findElement(By.className(" css-1hwfws3"));
		//Select selectstate=new Select(states);
		
		//selecting by visible text
	//	selectstate.selectByVisibleText(Uttarpr)
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
