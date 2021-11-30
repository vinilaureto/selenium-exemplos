import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegando2 {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:51612/forms.html");
        WebElement link = driver.findElement(By.partialLinkText("Link para a pa"));
        link.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().to("https://google.com.br");
        Thread.sleep(3000);
        driver.quit();
    }
}
