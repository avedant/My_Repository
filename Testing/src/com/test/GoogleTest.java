package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;

@BeforeMethod

public void setUP() {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.google.com");

}

@Test(priority=1,groups="Title")

public void googleTitleTest() {
	String Title= driver.getTitle();
	System.out.println(Title);
}

@Test(priority=2,groups="Logo")

public void googleLogoTest() {
	driver.findElement(By.xpath("//*[@id='one-google']")).isDisplayed();
	
	
}



@Test(priority=3,groups="Link Test")

public void mailLinkTest() {
	boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
	
	
}

@Test(priority=4,groups="Test")
public void test1() {
	System.out.println("test1");
}

@Test(priority=5,groups="Test")
public void test2() {
	System.out.println("test2");
}

@Test(priority=6,groups="Test")
public void test3() {
	System.out.println("test3");
}




@AfterMethod

public void tearDown() {
	driver.quit();
}

}
