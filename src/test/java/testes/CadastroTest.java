package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;
import pages.CadastroPage;
import runner.Executa;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CadastroTest extends Drivers {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	CadastroPage cadastro = new CadastroPage();
	Executa executa = new Executa();

	@BeforeEach
	void setup() {
		executa.antesDosTestes();
	}

	@AfterEach
	void tearDown() {
		executa.depoisDosTestes();
	}

	/**
	 * Variável para Guardar massa email gerado automaticamente.
	 */
	String emailGerado = "usuario" + (int) Math.floor(Math.random() * 1000) + "@teste.com";
	

	@Order(1)
	@Test
	void cadastroSucesso() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "Rua testando, 622", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260",
				"11934125767");
		metodo.validarTexto(el.getTextoContaCriada(),
				"Congratulations! Your new account has been successfully created!");
		System.out.println(emailGerado);
		
	}

	@Order(2)
	@Test
	void naoDeveCadastrarEmailCadastrado() {
		cadastro.primeiroFormCadastrar("userTest", "email@teste.com");
		metodo.validarTexto(By.xpath("//p[text()='Email Address already exist!']"), "Email Address already exist!");

	}

	@Order(3)
	@Test
	void naoDeveCadastrarNomeEmBranco() {
		cadastro.primeiroFormCadastrar("", "");
		WebElement campoNome = driver.findElement(el.getUsername());
		metodo.validarMensagemRequired(campoNome, "Preencha este campo.");

	}

	@Order(4)
	@Test
	void naoDeveCadastrarEmailEmBranco() {
		cadastro.primeiroFormCadastrar("userTest", "");
		WebElement campoNome = driver.findElement(el.getEmail());
		metodo.validarMensagemRequired(campoNome, "Preencha este campo.");

	}

	@Order(5)
	@Test
	void naoDeveCadastrarSenhaEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "", "29", "January", "2003", "Levi", "Alves", "E2E Coders",
				"Rua testando, 622", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260",
				"11934125767");
		WebElement campoPassword = driver.findElement(el.getPassword());
		metodo.validarMensagemRequired(campoPassword, "Preencha este campo.");
	}

	@Order(6)
	@Test
	void naoDeveCadastrarFirstNameEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "", "Alves", "E2E Coders",
				"Rua testando, 622", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260",
				"11934125767");
		WebElement campoFirstName = driver.findElement(el.getFirstName());
		metodo.validarMensagemRequired(campoFirstName, "Preencha este campo.");
	}

	@Order(7)
	@Test
	void naoDeveCadastrarLastNameEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "", "E2E Coders",
				"Rua testando, 622", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260",
				"11934125767");
		WebElement campoLastName = driver.findElement(el.getLastName());
		metodo.validarMensagemRequired(campoLastName, "Preencha este campo.");
	}

	@Order(8)
	@Test
	void naoDeveCadastrarAdressEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260", "11934125767");
		WebElement campoAdress = driver.findElement(el.getAdress1());
		metodo.validarMensagemRequired(campoAdress, "Preencha este campo.");
	}

	@Order(9)
	@Test
	void naoDeveCadastrarStateEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "Rua testando 550", "Rua testada", "United States", "", "Barueri", "06463-260",
				"11934125767");
		WebElement campoState = driver.findElement(el.getState());
		metodo.validarMensagemRequired(campoState, "Preencha este campo.");
	}

	@Order(10)
	@Test
	void naoDeveCadastrarCityEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "Rua testando 550", "Rua testada", "United States", "São Paulo", "", "06463-260",
				"11934125767");
		WebElement campoCity = driver.findElement(el.getCity());
		metodo.validarMensagemRequired(campoCity, "Preencha este campo.");
	}

	@Order(11)
	@Test
	void naoDeveCadastrarZipEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "Rua testando 550", "Rua testada", "United States", "São Paulo", "Barueri", "",
				"11934125767");
		WebElement campoZip = driver.findElement(el.getZipcode());
		metodo.validarMensagemRequired(campoZip, "Preencha este campo.");
	}

	@Order(12)
	@Test
	void naoDeveCadastrarMBEmBranco() {
		cadastro.cadastrar("userTeste", emailGerado, "teste@123", "29", "January", "2003", "Levi", "Alves",
				"E2E Coders", "Rua testando 550", "Rua testada", "United States", "São Paulo", "Barueri", "06463-260",
				"");
		WebElement campoMb = driver.findElement(el.getMobileNumber());
		metodo.validarMensagemRequired(campoMb, "Preencha este campo.");
	}

}
