package com_jenkins_serires;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void runTest1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		System.out.println("We miss you ratan tata");
		driver.quit();
	}
	
	@Test
	public void runTest2() {
		System.out.println("TATA MOTORS");
	}
}
