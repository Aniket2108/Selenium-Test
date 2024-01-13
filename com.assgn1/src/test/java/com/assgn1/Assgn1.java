package com.assgn1;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Assgn1 {

	@Test
	  public void launchChrome() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://justbooks.in/");
		  
		  driver.manage().window().maximize();
		  
		  
		  WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[5]/div[4]/a"));
		  
		  login.click();
		  
		  
		  WebElement signUp = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[2]/span/a"));
		  
		  signUp.click();
		  
		  WebElement firstName = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[1]/input"));
		  firstName.sendKeys("Aniket");
		  
		  WebElement lastName = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[2]/input"));
		  lastName.sendKeys("Aniket");
		  
		  WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[3]/input"));
		  email.sendKeys("xyz69696969@gmail.com");
		  
		  WebElement mobile = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[4]/input"));
		  mobile.sendKeys("8888888888");
		  
		  WebElement pin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[5]/input"));
		  pin.sendKeys("400092");
		  
		  WebElement next = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/form/div[6]"));
		  next.click();
		  			   
	  }

}

