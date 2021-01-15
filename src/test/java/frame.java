import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * @ClassName frame
 * @Description frame
 * @Author Kevin Ge
 * @Date 2020/7/6 18:22
 * @Version 1.0
 */
public class frame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        File file = new File("F:\\frame.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);
//切换到 iframe（id = "if"）
        driver.switchTo().frame("if");
        driver.findElement(By.id("kw")).sendKeys("webdriver");
        driver.findElement(By.id("su")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}