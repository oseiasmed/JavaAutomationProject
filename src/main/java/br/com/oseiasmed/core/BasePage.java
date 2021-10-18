package br.com.oseiasmed.core;

import static br.com.oseiasmed.core.DriverFactory.getDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	/********* TextField ************/

	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	/********* Radio e Check ************/

	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}

	public boolean isRadioMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	public void clicarCheck(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public boolean isCheckMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	/********* Combo ************/

	public void selecionarCombo(String id_field, String text) {
		getDriver().findElement(By.id(id_field)).sendKeys(text);
	}

	public void selecionarCombos(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void deselecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.deselectByVisibleText(valor);
	}

	public String obterValorCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public List<String> obterValoresCombo(String id) {
		WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public int obterQuantidadeOpcoesCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public boolean verificarOpcaoCombo(String id, String opcao) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(opcao)) {
				return true;
			}
		}
		return false;
	}

	public void selecionarComboPrime(String radical, String valor) {
		clicarRadio(By.xpath("//*[@id='" + radical + "_input']/../..//span"));
		clicarRadio(By.xpath("//*[@id='" + radical + "_items']//li[.='" + valor + "']"));
	}

	/********* Botao ************/

	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}

	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//button[.='" + texto + "']"));
	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	/********* Obter Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}		
}


