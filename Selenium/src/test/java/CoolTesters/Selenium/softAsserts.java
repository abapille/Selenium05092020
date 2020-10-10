package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAsserts {
	
	SoftAssert softAssert = new SoftAssert();
	
	
  @Test
  
  

  public void softAssertEquas() {
	  
	  
	  int a = 5;
	  int b = 10;
	  int x = 8;
	  int y = 8;
	  
	  softAssert.assertEquals(a,b);
	  softAssert.assertEquals(x,y);
	  
	  softAssert.assertAll();
	  
  }
  @Test
  	  
  public void softAsserDriver() {
  
  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
	WebDriver driver = new ChromeDriver(); // Inicializando el navegador
	driver.get("https://opensource-demo.orangehrmlive.com/");// Entrando al sitio web
	driver.manage().window().maximize();//Maximiza la ventana
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
	String badTitle = "OrangeHR";
	
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualTitle, badTitle);
		softAssert.assertAll();
  
 
  
  }
  }
  
