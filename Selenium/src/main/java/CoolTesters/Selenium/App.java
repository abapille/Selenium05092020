package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Curso Septiembre 05-09-2020");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; // Tomando
																													// el
																													// Path
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");// Establecer la propiedad .exe
		WebDriver driver = new ChromeDriver(); // Inicializando el navegador
		driver.get("https://opensource-demo.orangehrmlive.com/");// Entrando al sitio web
		driver.manage().window();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit waith
		
		//WebElement txtUserName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));

		// Obteniendo elementos/ objetos de la pagina Login

		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnlogin = driver.findElement(By.id("btnLogin"));

		// Haciendo login

		userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnlogin.click();

		// Validar el login

		String urlDashboard = driver.getCurrentUrl();
		System.out.println("URL:" + urlDashboard);
		urlDashboard.contains("/dashboard"); // Verificando que la URL contenga /dashboard

		
		//Find Elements
		
		List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
		System.out.println("Numero de Elementos :" + firstLevelMenu.size());
		String primerMenu = firstLevelMenu.get(0).getText();
		System.out.println(primerMenu);
		String segundoMenu = firstLevelMenu.get(1).getText();
		System.out.println(segundoMenu);
		
		for (int i = 0; i<firstLevelMenu.size();i++) {
			
			System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
		}
			
		}
		
		
		
		// Metodos de Navegacion

//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//
//		String title = driver.getTitle();
//		System.out.println("Title is:" + title);

		// Click assignLeaveBtn

//		WebElement assignLeaveBtn = driver.findElement(By.className("quickLaunge"));
//		assignLeaveBtn.click();
//		Thread.sleep(1000);

		// Obtener Text de un webElement

//		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
//		boolean verifyWelcomeMsj = welcomeMsj.contains("Smith");
//		if (verifyWelcomeMsj) {
//			System.out.println("El mensaje contiene el nombre de Smith");
//
//		} else {
//			System.out.println("ERROR el mensaje no contiene el mensaje esperado");
//		}

		// Dropwowns

//		Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
//		oSelect.selectByVisibleText("Maternity US");

		// Cerrar Navegador
//
//		driver.close(); // Cierra la ventana actual
//		driver.quit(); // cierra todas las ventanas creadas por el web driver
}





