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
import pages.LoginPage;
import runner.Executa;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest extends Drivers{
    
    Metodos metodo = new Metodos();
    LoginPage login = new LoginPage();
    Executa executa = new Executa();
    Elementos el = new Elementos();
    
     //#region Setup
    @BeforeEach
    void setup(){
        executa.antesDosTestes();
    }
    @AfterEach
    void tearDown(){
        executa.depoisDosTestes();
    }
    //#endregion
    
    @Order(1)
    @Test
    void loginSucesso(){
        login.logar("usuario189@teste.com", "teste@123");
        metodo.contemTexto(By.xpath("//i[@class='fa fa-user']"), " Logged in as ");
    }
    
    @Order(2)
    @Test
    void naoDeveRealizarLoginEmailInvalido(){
        login.logar("usuario189teste.com", "teste@123");
        WebElement campoEmail = driver.findElement(el.getEmailField());
        metodo.contemMensagemRequired(campoEmail, "Inclua um");
    }
    
    @Order(3)
    @Test
    void naoDeveRealizarLoginSenhaInvalida(){
        login.logar("usuario189@teste.com", "tes@123");
        metodo.validarTexto(By.xpath("//p[text()='Your email or password is incorrect!']"), "Your email or password is incorrect!");
    }
    
    @Order(4)
    @Test
    void naoDeveRealizarLoginEmailEmBranco(){
        login.logar("", "teste@123");
        WebElement campoEmail = driver.findElement(el.getEmailField());
        metodo.validarMensagemRequired(campoEmail, "Preencha este campo.");
    }
    
    @Order(5)
    @Test
    void naoDeveRealizarLoginSenhaEmailEmBranco(){
        login.logar("usuario189@teste.com", "");
        WebElement campoSenha = driver.findElement(el.getPasswordField());
        metodo.validarMensagemRequired(campoSenha, "Preencha este campo.");
    }
    
    @Order(6)
    @Test
    void naoDeveRealizarLoginEmailInexistente(){
        login.logar("emeiu@teste.com", "tes@123");
        metodo.validarTexto(By.xpath("//p[text()='Your email or password is incorrect!']"), "Your email or password is incorrect!");
    }
    
    




}
