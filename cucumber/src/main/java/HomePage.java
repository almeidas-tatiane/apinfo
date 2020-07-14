package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HomePage {
	
	private static WebDriver driver;
	
	private By formBusca = By.id("i-busca");
	private By btnBusca = By.id("btn-busca");
	String vaga = "QA";
	private By descricaoVagas = By.cssSelector("div.cargo span.highlight");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void carregarPaginaInicial() {
		driver.get("https://www.apinfo.com/apinfo/");
		driver.manage().window().maximize();
	}
	
	public void procurarVagas() {
		driver.findElement(formBusca).clear();
		driver.findElement(formBusca).sendKeys(vaga);
		driver.findElement(btnBusca).click();
		
	}
	
	public String validarResultadoVagas() {
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(descricaoVagas));
		
		return(driver.findElement(descricaoVagas).getText());
	}
	

}
