package br.com.oseiasmed.steps;

import br.com.oseiasmed.core.DriverFactory;
import br.com.oseiasmed.pages.TricentsFormOnePage;
import io.cucumber.java.pt.Dado;

public class CadastroTricentsFormSteps {
	
	
	// Aqui serão implementados os Steps
	
    @Dado("^que estou acessando a aplicação$")
	public void queDesejoAdicionarUmaConta() throws Throwable {
		DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}
}
