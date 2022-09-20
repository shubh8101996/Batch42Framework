package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import com.Uitility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	ReadConfig read=new ReadConfig();
	
	
   public String mainUrl=read.BaseUrl();
   public String mainUsername=read.username();
   public String mainPass=read.password();
   public String mainHeadlessKey=read.headless();

	@Parameters({"browser"})
	@BeforeTest(alwaysRun = true)
	public void BrowserSet(@Optional("chrome") String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			if(mainHeadlessKey.equalsIgnoreCase("true")) {
				
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);

			}else {
				
				driver=new ChromeDriver();
			}
			
//			options.addArguments("incognito");
			

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("opera")) {

			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {

			throw new RuntimeException("Browser value invalid");

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}

	@AfterTest(alwaysRun = true)
	public void BrowserClose() {

		driver.quit();

	}

}
