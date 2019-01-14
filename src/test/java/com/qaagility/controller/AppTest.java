package com.qaagility.controller;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.Calculator;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import java.util.logging.Logger;

public class AppTest {

WebDriver driver;
Calculator myCalc = new Calculator();

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }
	
	@Test	
      public void testCalc() {
	System.setProperty("webdriver.gecko.driver","/home/devops/Downloads/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://www.google.com");
     //driver.get("http://www.google.com");

      
      WebElement search_bar = driver.findElement(By.name("q"));
      search_bar.sendKeys("CPDOF");

       try 
 	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

      String search_text = "I'm Feeling Lucky";
// /html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/center/input[2]
// /html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/center/input[2]

      WebElement search_button = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div/center/input[2]"));
 
      String text = search_button.getAttribute("value");

	System.out.println("text =" + text);
     search_button.click();

	System.out.println("mycalc add =" + myCalc.add());
      assertEquals("Result", 9, myCalc.add());

      assertEquals("Comparision Result", text, search_text);

	//Logger log = Logger.getLogger(LoggingObject.class);
	//log.info("I'm starting");
	//log.info("mycalc add =" + myCalc.add());
	//log.info("text =" + text);

// adding a comment before quit
	driver.quit();





      }



}
