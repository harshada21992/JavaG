package Javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	  public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Title Display111999: " + driver.getTitle());
	        driver.quit();
	    }
	}

