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
        //����������
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://www.baidu.com/");
        WebElement input = driver.findElement(By.id("kw"));
        //�������������
        input.sendKeys("seleniumm");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //ɾ���������һ�� m
        input.sendKeys(Keys.BACK_SPACE);
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        //����ո��+���̡̳�
        input.sendKeys(Keys.SPACE);
        input.sendKeys("�̳�");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
       //ctrl+a ȫѡ���������
        input.sendKeys(Keys.CONTROL,"a");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
       //ctrl+x �������������
        input.sendKeys(Keys.CONTROL,"x");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }

       //ctrl+v ճ�����ݵ������
        input.sendKeys(Keys.CONTROL,"v");
       //ͨ���س�����������������
        input.sendKeys(Keys.ENTER);
        driver.quit();
    } }
