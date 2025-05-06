package pages;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class CadastroPage {

	Elementos el = new Elementos();
	Metodos metodo = new Metodos();
	Executa executa = new Executa();

	public void cadastrar(String username, String email, String password, String day, String month, String year,
			String firstName, String lastName, String company, String adress, String adress2, String country,
			String state, String city, String zipcode, String number) {
		metodo.clicar(el.getPrimeiroBotão());
		metodo.escrever(el.getUsername(), username);
		metodo.escrever(el.getEmail(), email);
		metodo.clicar(el.getBtnNext());
		metodo.esperarElementoSerVisivel(el.getPassword(), 2);
		metodo.escrever(el.getPassword(), password);
		metodo.selectElement(el.getDay(), day);
		metodo.selectElement(el.getMonth(), month);
		metodo.selectElement(el.getYear(), year);
		metodo.escrever(el.getFirstName(), firstName);
		metodo.escrever(el.getLastName(), lastName);
		metodo.escrever(el.getCompany(), company);
		metodo.escrever(el.getAdress1(), adress);
		metodo.escrever(el.getAdress2(), adress2);
		metodo.selectElement(el.getCountry(), country);
		metodo.escrever(el.getState(), state);
		metodo.escrever(el.getCity(), city);
		metodo.escrever(el.getZipcode(), zipcode);
		metodo.escrever(el.getMobileNumber(), number);
		metodo.clicar(el.getBtnRegistrar());

	}
	
	public void primeiroFormCadastrar(String username, String email) {
		metodo.clicar(el.getPrimeiroBotão());
		metodo.escrever(el.getUsername(), username);
		metodo.escrever(el.getEmail(), email);
		metodo.clicar(el.getBtnNext());
		
	}
	
	

}
