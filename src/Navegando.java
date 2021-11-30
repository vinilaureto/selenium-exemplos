import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegando {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:51612/forms.html");
        String titulo = driver.getTitle();
        if (titulo.compareTo("Página do form") == 0) {
            System.out.println("Título da página confere");
        }

        String urlDestino = "http://127.0.0.1:51612/voltar.html";
        WebElement link = driver.findElement(By.partialLinkText("Link para a pa"));
        link.click();

        String urlAtual = driver.getCurrentUrl();
        if (urlDestino.compareTo(urlAtual) == 0) {
            System.out.println("URL de destino bateu com a URL atual");
        } else {
            System.out.println("Algo errado aconteceu");
        }

        String codigoFonte = driver.getPageSource();
        System.out.println(codigoFonte);

    }
}
