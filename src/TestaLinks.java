import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaLinks {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:51612/links.html");
        WebElement linkUol = driver.findElement(By.linkText("Link para o UOL"));
        linkUol.click();

        WebElement linkGoogle = driver.findElement(By.partialLinkText("Link para o G"));
        linkGoogle.click();

        WebElement linkGoogle2 = driver.findElement(By.xpath("/html/body/a[1]"));
        linkGoogle2.click();
    }
}
