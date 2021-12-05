import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public  static  void main(String[] args){
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://addressbook");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@value='Войти']")).click();

       

    }


}
