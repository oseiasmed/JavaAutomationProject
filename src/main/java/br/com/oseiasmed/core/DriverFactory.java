package br.com.oseiasmed.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {}

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:
				driver = new ChromeDriver();
				break;
			}

			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
