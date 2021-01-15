import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Set;

/**
 * @ClassName cookie
 * @Description cookie
 * @Author Kevin Ge
 * @Date 2020/7/15 11:47
 * @Version 1.0
 */
public class cookie {
    public static  void main(String[] args){
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.youdao.com");

        Cookie c1 = new Cookie("name","key-aaaaaa");
        Cookie c2 = new Cookie("vakue","value-bbbb");

        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);

        Set<Cookie> coo= driver.manage().getCookies();
        System.out.println(coo);
        driver.quit();

    }
}
