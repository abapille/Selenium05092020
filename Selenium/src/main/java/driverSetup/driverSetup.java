package driverSetup;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
	
	public static WebDriver setupDriver() {
	
	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
	WebDriver driver = new ChromeDriver(); // Inicializando el navegador

	return driver; 
	}
	

}
