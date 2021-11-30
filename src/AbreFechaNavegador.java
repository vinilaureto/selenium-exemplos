import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbreFechaNavegador {
    public static void main(String[] args) {

        // Caminho do motor 'chromedriver'
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");

        // Objeto do webdriver
        WebDriver driver = new ChromeDriver();

        // Instruções para o motor
        driver.get("https://www.google.com.br");
        driver.quit();
    }
}
