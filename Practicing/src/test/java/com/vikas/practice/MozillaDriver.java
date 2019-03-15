package com.vikas.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaDriver {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

	}

}

