import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\lib\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:51612/forms.html");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("fiat");
        Thread.sleep(2000);
        select.selectByVisibleText("honda");
        Thread.sleep(2000);
        System.out.println(dropdown.getAttribute("value"));
    }
}
