package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features	=	"src\\test\\resources\\features\\procurar_vagas.feature",
		glue		=	"steps",
		tags		=	"@fluxoprincipal",
		plugin		=	{"pretty", "html:target/procurar_vagas.html", "json:target/procurar_vagas.json", "junit:target/procurar_vagas.xml"},
		monochrome	=	true
		
		
		)


public class Runner {
	
	

}
