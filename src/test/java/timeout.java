import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName timeout
 * @Description timeout
 * @Author Kevin Ge
 * @Date 2020/6/30 16:15
 * @Version 1.0
 */
public class timeout {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com/");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.findElement(By.id("kw33")).sendKeys("selenium");
    }
}
