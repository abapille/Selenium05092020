package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dasboarPage {
	
	
	public dasboarPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	//DashBoard page objet
	@FindBy(id = "welcome")
	private WebElement welcomeDrpDwn;
	@FindBy (xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement logOutBtn;
	
	public void logOut() {
		welcomeDrpDwn.click();
		logOutBtn.click();
	}

}
