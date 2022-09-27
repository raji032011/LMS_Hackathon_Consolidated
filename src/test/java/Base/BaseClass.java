package Base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	static ReadConfig config = new ReadConfig();
	Logger log = LogManager.getLogger("BaseClass.java");
	public String baseurl = config.getApplicationURL();
	public String browser = config.getBrowserName();
	
	public void setUpDriver() {
		log.info("---------- Base Class - SetUpDriver Started ----------");

		log.info("Browser Type is: " + browser);
		log.info("Base URL is: " + baseurl);
		//log.info("Screenshot Directory is: "+screenshotdir);
		//System.out.println(browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseurl);
		
		log.info("---------- Base Class - SetUpDriver Completed ----------");
	}

	public void tearDown() {
		log.info("---------- Base Class - teadDown Started ----------");
		driver.quit();
		log.info("---------- Base Class - teadDown Completed ----------");
	}

}
