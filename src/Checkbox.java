import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:51612/forms.html");

        WebElement checkboxIbate = driver.findElement(By.xpath("/html/body/form/input[4]"));
        if (checkboxIbate.isDisplayed()) {
            System.out.println("O checkbox Ibate esta visivel");
        }

        Thread.sleep(2000);
        if (checkboxIbate.isSelected()) {
            System.out.println("O checkbox Ibate esta marcado");
            String value = checkboxIbate.getAttribute("value");
            System.out.println("O valor é " + value);
        }

        Thread.sleep(2000);
        WebElement checkboxSaoCarlos = driver.findElement(By.xpath("/html/body/form/input[3]"));
        if (!checkboxSaoCarlos.isEnabled()) {
            System.out.println("O checkbox de São Carlos esta desabilitado");
        }
    }
}
