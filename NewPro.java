package New;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First_Run {
    public static void main(String[]args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

    }

}