import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibilidade {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:51612/forms.html");

        WebElement input = driver.findElement(By.id("nome"));
        input.sendKeys("João");
        if (input.isDisplayed()) {
            System.out.println("Input de nome esta visivel");
        }

        Thread.sleep(2000);
        System.out.println(input.getAttribute("value"));
    }
}
