/**
 * @ClassName SeleTest
 * @Description SeleTest
 * @Author Kevin Ge
 * @Date 2020/7/6 16:30
 * @Version 1.0
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.JavascriptExecutor;

public class SeleTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public Object exec() throws Exception {
        try{
//			IE
//			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//			driver = new InternetExplorerDriver(caps);
//			Firefox
//			driver = new FirefoxDriver();
//
//			Chrome
            System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");
            driver = new InternetExplorerDriver();
            //baseUrl = "${baseUrl}"; //传参数写法
            baseUrl = "http://10.45.70.63:8080/tms-web/login.html";

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(baseUrl);
            if(!isElementPresent(By.id("username"), 60, 1000)) {
                throw new Exception("Login Page Load Failed");
            }

           // driver.get("http://10.45.70.63:8080/tms-web/login.html");
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys("100006");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("111111");
            driver.findElement(By.id("isRemenber")).click();
            driver.findElement(By.name("submit")).click();

            //等待菜单加载完成
            if(!isElementPresent(By.xpath("//*[@title=\"Customer Profile Configuration\"]"), 60, 1000)) {
                throw new Exception("Can't find Customer Profile Configuration Menu");
            }

            //$字符需要加\转义!!!
//            String js = "var y = \$('[title=\"Customer Profile Configuration\"]'); y.click(); return y";

 //           Object o = ((JavascriptExecutor) driver).executeScript(js);

            try {
                //为了演示效果打开了菜单，等待
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // driver.findElement(By.xpath("//a[@title='Customer Profile Configuration']")).click();
            return "success";
        }finally {
            if(driver != null) {
                driver.quit();
            }
        }

    }

    /**
     * 判断元素是否存在
     * @param by
     * @return
     */
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isElementPresent(By by, Integer count, Integer sleep) {
        for (int second = 0;; second++) {
            if (second >= count)
                break;

            try {
                if (isElementPresent(by))
                    return true;
            } catch (Exception e) {
            }
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return false;
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public static void main(String[] args) {
        SeleTest t = new SeleTest();
        try {
            t.exec();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
