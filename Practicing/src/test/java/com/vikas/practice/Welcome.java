package com.vikas.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
	}

}
