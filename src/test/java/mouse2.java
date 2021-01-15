import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @ClassName mouse2
 * @Description mouse2
 * @Author Kevin Ge
 * @Date 2020/7/6 15:16
 * @Version 1.0
 */
public class mouse2 {

     WebDriver driver;

    public void exec() {
         System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");
         driver = new InternetExplorerDriver();
         driver.get("http://10.45.70.63:8080/tms-web/login.html");
         driver.findElement(By.id("username")).clear();
         driver.findElement(By.id("username")).clear();
         driver.findElement(By.id("username")).sendKeys("100006");
         driver.findElement(By.id("password")).clear();
         driver.findElement(By.id("password")).sendKeys("111111");
         driver.findElement(By.id("isRemenber")).click();
         driver.findElement(By.name("submit")).click();

     }





    public static void main(String[] args) {

        mouse2 t = new mouse2();
        t.exec();
    }

}
