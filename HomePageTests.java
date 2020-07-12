package home;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import base.BaseTests;

public class HomePageTests extends BaseTests {
	
	private WebDriver driver;
		
	@Test
	public void testProcurarVagas() {
		homePage.procurarVagas();
	}
	
	@Test
	public void testvalidarResultadoVagas() {
		testProcurarVagas();
		assertThat(homePage.validarResultadoVagas(),is ("QA"));
		}

}
