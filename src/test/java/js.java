import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @ClassName js
 * @Description js
 * @Author Kevin Ge
 * @Date 2020/7/15 13:51
 * @Version 1.0
 */
public class js {
    public static void main(String[] args) throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        WebDriver driver = new ChromeDriver(options);

        System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");

        WebDriver driver = new InternetExplorerDriver();



        driver.get("http://www.baidu.com");

        driver.findElement(By.id("kw")).sendKeys("webdriver api");
        driver.findElement(By.id("su")).click();




//        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(8000);

        ((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=10000");

        Thread.sleep(3000);

        ((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=0");

        Thread.sleep(3000);

        System.out.println("end");

        driver.quit();
    }
}

/*
JS 滚动条的效果没能展现出来，后期有时间可以查一下原因*/