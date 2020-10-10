package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabEjemplo {

	public static void main(String[] args) {
	
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
		WebDriver driver = new ChromeDriver(); // Inicializando el navegador
		driver.get("http://demo.guru99.com/popup.php");// Entrando al sitio web
		driver.manage().window().maximize();//Maximiza la ventana
		
		
		//obtener e imprimir el ID de la ventana / Tab original
		String originalTab = driver.getWindowHandle();
		System.out.println(originalTab);
		
		//Click en el link que abre otra ventana
		WebElement clickHere = driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]"));
		clickHere.click();
		Set<String> ventanasAbiertas = driver.getWindowHandles();//Set es una utileria
		System.out.println(ventanasAbiertas);
		
		for (String tabNueva : driver.getWindowHandles()) { //Estrucutra for
			if (!originalTab.contentEquals(tabNueva)) {
				driver.switchTo().window(tabNueva);
				break;
			}
		}
		
		
		//Escribir el email en la nueva ventana
		WebElement emailTxt = driver.findElement(By.name("emailid"));
		emailTxt.sendKeys("test@test.com");
		
		//regresar a la ventana original
		driver.switchTo().window(originalTab);
		
		
	
		

	}

}
