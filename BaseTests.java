package base;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import pages.HomePage;

public class BaseTests {
	
	private static WebDriver driver;
	protected HomePage homePage;
	
	
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\ChromeDriver\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://www.apinfo.com/apinfo/");
		homePage = new HomePage(driver);
	}
	
	
		
	@AfterAll
	public static void finalizar() {
		driver.quit();
	}

}
