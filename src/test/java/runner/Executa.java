package runner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;

import drivers.Drivers;

public class Executa extends Drivers {

    
    public void antesDosTestes() {
        try {
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--headless");
            driver = new ChromeDriver(option);
            driver.get("https://www.automationexercise.com/");
            driver.manage().window().maximize();
        } catch (Exception e) {
            throw new UnreachableBrowserException("Não foi possível abrir o Navegador" + e.getCause() + e.getMessage());
        }

    }

   
    public void depoisDosTestes(){
            if (driver != null) {
                driver.quit();
            }
         

}
}
