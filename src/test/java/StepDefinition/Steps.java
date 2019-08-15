package StepDefinition;

import org.openqa.selenium.By;

public class Steps {
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.setProperty("webdriber.chrome.driver", "C:\\Users\\EDUARDO\\Documents\\IPLACEX\\Bimestre 8\\Integracion Continua\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
