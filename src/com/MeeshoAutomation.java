package com;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeeshoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\reade\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver(); 
	    driver.get("https://meesho.com/");
	   driver.findElement(By.xpath("//span[text()='Women Ethnic']")).click();
	   WebElement category= driver.findElement(By.xpath("//span[text()='Sarees']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(category);
	   
	   List<WebElement> al= driver.findElements(By.xpath("//span[text()='Sarees']/../following-sibling::a[@class=\"sub-list-item pointer\"]/p"));
	   for(WebElement i:al) {
		System.out.println(i.getText() );
		     
	   
	   }
	   
        
		
		
		
	}

}
