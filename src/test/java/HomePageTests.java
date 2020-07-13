package home;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import base.BaseTests;

public class HomePageTests extends BaseTests {
	
	
		
	@Test
	public void testProcurarVagas_QA() {
		homePage.procurarVagas();
		homePage.validarResultadoVagas();
		assertThat(homePage.validarResultadoVagas(),is ("QA"));
	}
	
	

}
