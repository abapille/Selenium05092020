package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Curso Septiembre 05-09-2020" );
    	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Tomando el Path
    	System.setProperty("webdriver.chrome.driver" , exePath + "chromedriver");//Establecer la propiedad .exe
    	WebDriver driver = new ChromeDriver(); //Inicializando el navegador
    	driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//Entrando al sitio web
    	driver.close();//Cerrando el navegador.
    	
    	
    		
    }
}
