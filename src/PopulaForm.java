import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopulaForm {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:51612/forms.html");
        driver.manage().window().maximize(); // maximiza a janela

        WebElement inputNome = driver.findElement(By.id("nome"));
        inputNome.sendKeys("José");

        WebElement inputSobrenome = driver.findElement(By.name("sobrenome"));
        inputSobrenome.sendKeys("Silva");
    }
}
