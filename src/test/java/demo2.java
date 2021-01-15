/**
 * @ClassName demo2
 * @Description demo2
 * @Author Kevin Ge
 * @Date 2020/6/22 14:24
 * @Version 1.0
 */


        import java.util.concurrent.TimeUnit;
        import org.junit.*;
        import static org.junit.Assert.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.ie.InternetExplorerDriver;


public class demo2 {
    public WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testDemo4() throws Exception {
        driver.get("https://start.firefoxchina.cn/");
        driver.findElement(By.id("search-key")).click();
        driver.findElement(By.id("search-key")).clear();
        driver.findElement(By.id("search-key")).sendKeys("杨超越");
        driver.findElement(By.id("search-form")).submit();
        driver.findElement(By.linkText("杨超越_百度百科")).click();
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
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
}
