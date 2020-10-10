package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
		public void assertEquals() {
		int a = 10;
		int b = 10;
		Assert.assertEquals(a,b,"Los Numeros no son Iguales");
		}
		@Test
		public void assertNoEquals() {
		int a = 10;
		int b = 19;
		Assert.assertNotEquals(a, b , "Los numeros iguales");
		}
		@Test
		public void assertTrue() {
		int a = 10;
		int b = 10;
		Assert.assertTrue(a==b);
		}
		@Test
		public void assertfalse() {
		int a = 10;
		int b = 5;
		Assert.assertFalse(a==b);
		}


	
		@Test
		
	public void verificarElTituloDePagina(String[] args) {

	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
	WebDriver driver = new ChromeDriver(); // Inicializando el navegador
	driver.get("https://opensource-demo.orangehrmlive.com/");// Entrando al sitio web
	driver.manage().window().maximize();//Maximiza la ventana
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
	
	Assert.assertEquals(actualTitle, expectedTitle );
	
	
	
		}
	
	
	
	@Test
	
	public void verificarElTituloDePaginaBoolean(String[] args) {

	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
	WebDriver driver = new ChromeDriver(); // Inicializando el navegador
	driver.get("https://opensource-demo.orangehrmlive.com/");// Entrando al sitio web
	driver.manage().window().maximize();//Maximiza la ventana
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
	
	boolean titulo = actualTitle.contains(expectedTitle);
	
	Assert.assertTrue(titulo);
	
}
}

