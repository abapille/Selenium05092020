package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait {

	public static void main(String[] args) {
		
		
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando																										// Path
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
		WebDriver driver = new ChromeDriver(); // Inicializando el navegador
		driver.get("https://opensource-demo.orangehrmlive.com/");// Entrando al sitio web
		driver.manage().window().maximize();//Maximiza la ventana
		
				
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);//Esto es lo que ignora nuestro WAIT durante 60 segundos

				 WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
				driver.navigate().refresh();
				return driver.findElement(By.id("txtUsername"));
				}
				});
		
		

	}

}
