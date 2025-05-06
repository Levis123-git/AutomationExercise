package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
			throw new NotFoundException("Não foi possivel encontrar o Elemento: " + locator);
		}
	}

	public void apagar(By locator) {
		try {
			driver.findElement(locator).clear();
		} catch (Exception e) {
			throw new NotFoundException("Não foi possivel encontrar o Elemento: " + locator);
		}
	}

	public void clicar(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new NotFoundException("Não foi possivel encontrar o Elemento: " + locator);
		}

	}

	public void validarUrl(String urlEsperada) {
		try {
			String urlCapturada = driver.getCurrentUrl();
			assertEquals(urlCapturada, urlEsperada);
		} catch (Exception e) {
			throw new NotFoundException("Não foi possivel localizar a URL" + urlEsperada);
		}
	}

	public void validarAlert(int tempoEspera, String msgEsperada) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(tempoEspera));
		String msgCapturada = wait.until(driver -> driver.switchTo().alert()).getText();
		assertEquals(msgEsperada, msgCapturada);
	}

	public void aceitarAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			throw new NoAlertPresentException("Não foi possivel localizar o alert");
		}
	}

	public void validarTexto(By locator, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(locator).getText();
			assertEquals(textoCapturado, textoEsperado);
		} catch (Exception e) {
			throw new NoSuchElementException("Não foi possivel encontrar o Elemento" + locator);
		}
	}

	public void accAllAlerts() {
		while (true) {
			try {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				break;
			}
		}
	}

	public void esperarElementoSerVisivel(By elemento, int tempoDeEspera) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempoDeEspera));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

	public void contemTexto(By locator, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(locator).getText();
			if (textoCapturado.contains(textoEsperado)) {
			}
		} catch (Exception e) {
			throw new NoSuchElementException("Não foi possivel encontrar o Elemento" + locator);
		}
	}

	public void selectElement(By locator, String valor) {
		try {
			// Localize o elemento select
			WebElement dropdownMes = driver.findElement(locator); // ou By.name, By.cssSelector etc.
			// Crie o objeto Select
			Select selectElement = new Select(dropdownMes);
			// Selecione o valor desejado
			selectElement.selectByVisibleText(valor);
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento Não encontrado" + e.getMessage());
		}
	}
	
	public void validarMensagemRequired(WebElement campo, String mensagemEsperada) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Verifica se o campo está válido
	    boolean isValido = (Boolean) js.executeScript("return arguments[0].checkValidity();", campo);
	    assertFalse(isValido, "Esperava-se que o campo fosse inválido, mas está válido.");
	    // Captura a mensagem de validação do navegador
	    String mensagemValidacao = (String) js.executeScript("return arguments[0].validationMessage;", campo);
	    assertEquals(mensagemEsperada, mensagemValidacao);
	}
	
	public void contemMensagemRequired(WebElement campo, String mensagemEsperada) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Verifica se o campo está válido
	    boolean isValido = (Boolean) js.executeScript("return arguments[0].checkValidity();", campo);
	    assertFalse(isValido, "Esperava-se que o campo fosse inválido, mas está válido.");
	    // Captura a mensagem de validação do navegador
	    String mensagemValidacao = (String) js.executeScript("return arguments[0].validationMessage;", campo);
	    mensagemValidacao.contains(mensagemEsperada);
	}
	
	


}
