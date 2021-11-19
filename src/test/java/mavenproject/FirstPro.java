package mavenproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstPro {

	
	@Test
	public void openBrowser()
	{
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
	}
	
	
	@Test
	public void tableData()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String s;
		ArrayList <String> al=new ArrayList();
		for(int i=1;i<=5;i++)
		{
	WebElement td=	driver.findElement(By.xpath("//table [@id='customers']//tr//td["+i+"]"));
	al.add(td.getText());	
			
		}
	for(String t:al)
	{
		System.out.println(t+"");
		
		
	}
		
	}
	
}
