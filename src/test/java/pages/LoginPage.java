package pages;



 
import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class LoginPage extends Drivers {
    
    Metodos metodo = new Metodos();
    Elementos el = new Elementos();
    

   

    public void logar(String user, String password){
    	metodo.esperarElementoSerVisivel(el.getPrimeiroBotão(), 2);
        metodo.clicar(el.getPrimeiroBotão());
        metodo.escrever(el.getEmailField(), user);
        metodo.escrever(el.getPasswordField(), password);
        metodo.clicar(el.getLoginButton());

    }

}
