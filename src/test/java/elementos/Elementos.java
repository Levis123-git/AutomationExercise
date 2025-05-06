package elementos;

import org.openqa.selenium.By;

import drivers.Drivers;
import lombok.Getter;




@Getter
public class Elementos extends Drivers {
    
    //#region
    /**
     * Elementos Formulário de cadastro
     */
    private By primeiroBotão = By.xpath("//i[@class='fa fa-lock']");
    //set the value on time test (Male - Felale)
    private By username = By.name("name");
    private By email = By.xpath("//input[@data-qa='signup-email']");
    private By btnNext = By.xpath("//button[text()='Signup']");
    //private By firstName = By.id("name");
    private By password = By.id("password");
    private By day = By.id("days");
    private By month = By.xpath("//select[@id='months']"); //option[text()='January']
    private By year = By.id("years"); //option[text()='2003']
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By adress1 = By.id("address1");
    private By adress2 = By.id("address2");
    private By country = By.id("country"); //option[text='United States']
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By btnRegistrar = By.xpath("//button[text()='Create Account']");
    private By textoContaCriada = By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']");

    //#endregion


    
    //#region
    /**
     * Elementos Formulário de Login
     */
    
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[text()='Login']");
    //#endregion




}
