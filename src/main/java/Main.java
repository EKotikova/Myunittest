import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Main {
    public  static  void main(String[] args){
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://addressbook");
    }
}
