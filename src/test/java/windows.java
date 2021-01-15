import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName windows
 * @Description windows
 * @Author Kevin Ge
 * @Date 2020/7/6 19:04
 * @Version 1.0
 */
public class windows {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.baidu.com");
        //获得当前窗口句柄
        String sreach_handle = driver.getWindowHandle();
        //打开百度注册窗口
        System.out.println(sreach_handle);
        driver.findElement(By.linkText("登录")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("立即注册")).click();
        //获得所有窗口句柄
        Set<String> handles = driver.getWindowHandles();
        //判断是否为注册窗口，并操作注册窗口上的元素
        for (String handle : handles) {
            if (handle.equals(sreach_handle) == false) {
                //切换到注册页面
                driver.switchTo().window(handle);
                System.out.println("now register window!");
                Thread.sleep(2000);
                driver.findElement(By.name("userName")).clear();
                driver.findElement(By.name("userName")).sendKeys("kevinge23345");
                driver.findElement(By.name("phone")).sendKeys("13770802866");
                //使用tab 键，跳到密码处  密码元素不可见
                driver.findElement(By.name("phone")).sendKeys(Keys.TAB,"Geqku1234");
                Thread.sleep(2000);
                //......
                //关闭当前窗口
                driver.close();
            }
        }
        //判断是否为百度首页，并操作首页上的元素
        for (String handle : handles) {
            if (handle.equals(sreach_handle)) {
                //切换到注册页面
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                driver.findElement(By.className("close-btn")).click();
                System.out.println("now baidu sreach page!");
                driver.findElement(By.id("kw")).sendKeys("webdriver");
                driver.findElement(By.id("su")).click();
                Thread.sleep(2000);
            }
        }
        driver.quit();
    }
}
