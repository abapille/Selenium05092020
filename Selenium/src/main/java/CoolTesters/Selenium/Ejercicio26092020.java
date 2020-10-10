package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio26092020 {

	public static void main(String[] args) throws InterruptedException {
		
    	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Tomando el Path
    	System.setProperty("webdriver.chrome.driver" , exePath + "chromedriver");//Establecer la propiedad .exe
    	WebDriver driver = new ChromeDriver(); //Inicializando el navegador
    	driver.get("https://opensource-demo.orangehrmlive.com/");//Entrando al sitio web
    	driver.manage().window();
		
		
		//Realizar busqueda en Directory
//		Ejercicio
//		1. log in en OrangeHR
		WebElement userName = driver.findElement(By.id("txtUsername"));
    	WebElement password = driver.findElement(By.id("txtPassword"));
    	WebElement btnlogin = driver.findElement(By.id("btnLogin"));
    	userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		btnlogin.click();
		
		
//		2. Click en Directory
		
		WebElement Directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		Directory.click();
		
//		3. Buscar por "Robert"
		
		WebElement searchDirectory = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		searchDirectory.sendKeys("Robert");
		Thread.sleep(1000);
		
		
//		4. Job title: "Sales Manager"
		
		WebElement jobTitle = driver.findElement(By.id("searchDirectory_job_title"));
		jobTitle.sendKeys("Sales Manager");
		Thread.sleep(1000);
		
		
		
//		5. Location: "Unided States"
		WebElement location = driver.findElement(By.id("searchDirectory_location"));
		location.sendKeys("Unided States");
		Thread.sleep(1000);
	
		
		
//		6. Click Search
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		Thread.sleep(3000);

		
//		Verificar el nombre completo de la persona
		
		String resultTable = driver.findElement(By.id("resultTable")).getText();
		resultTable.contains("Robert Craig");
		if(resultTable.contains("Robert Craig")) {
			System.out.println("La busqueda contiene el nombre esperado");

		} else {
			System.out.println("ERROR la busqueda no contiene el nombre esperado");
		} 
		
	
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.id("welcome-menu")).click();
		driver.close();
		driver.quit();
	}

}
