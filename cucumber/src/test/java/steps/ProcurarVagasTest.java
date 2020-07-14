package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.HomePage;

public class ProcurarVagasTest {
	
	private static WebDriver driver;
	HomePage homePage = new HomePage(driver);
	
	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\ChromeDriver\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Dado("que estou na pagina da ApInfo")
	public void que_estou_na_pagina_da_ap_info() {
	    homePage.carregarPaginaInicial();
	}

	@Quando("faco uma busca por vagas de QA")
	public void faco_uma_busca_por_vagas_de_qa() {
	    homePage.procurarVagas();
	}

	@Entao("visualizo vagas disponiveis")
	public void visualizo_vagas_disponiveis() {
	    homePage.validarResultadoVagas();
	}

	@Entao("valido a palavra QA encontrada no resultado")
	public void valido_a_palavra_qa_encontrada_no_resultado() {
		assertThat(homePage.validarResultadoVagas(),is ("QA"));
	}
	
	@After
	public static void finalizar() {
		driver.quit();
	}


}
