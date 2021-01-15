import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;

/**
 * @ClassName keys
 * @Description keys
 * @Author Kevin Ge
 * @Date 2020/6/29 16:56
 * @Version 1.0
 */
public class keys {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://www.baidu.com/");
        WebElement input = driver.findElement(By.id("kw"));
        //输入框输入内容
        input.sendKeys("seleniumm");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //删除多输入的一个 m
        input.sendKeys(Keys.BACK_SPACE);
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        //输入空格键+“教程”
        input.sendKeys(Keys.SPACE);
        input.sendKeys("教程");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
       //ctrl+a 全选输入框内容
        input.sendKeys(Keys.CONTROL,"a");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
       //ctrl+x 剪切输入框内容
        input.sendKeys(Keys.CONTROL,"x");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }

       //ctrl+v 粘贴内容到输入框
        input.sendKeys(Keys.CONTROL,"v");
       //通过回车键盘来代替点击操作
        input.sendKeys(Keys.ENTER);
        driver.quit();
    } }
