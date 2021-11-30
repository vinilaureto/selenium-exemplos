import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seletores {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:51612/forms.html");
        WebElement inputNome = driver.findElement(By.cssSelector("input[name='nome'"));
        inputNome.sendKeys("João");

        WebElement inputSobrenome = driver.findElement(By.className("input")); // retorna o primeiro
        inputSobrenome.sendKeys("Silva");

        WebElement div = driver.findElement(By.tagName("div")); // retorna o primeiro
        div.findElement(By.id("dataNascimento")).sendKeys("27/10/1993");
    }
}
