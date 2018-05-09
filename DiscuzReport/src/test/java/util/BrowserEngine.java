package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by delldell on 2018/5/8.
 */
public class BrowserEngine {
    public static String browserName;
    public static String serverURL;
    public WebDriver driver;


    public static void init()  {
        try {
            Properties pro = new Properties();
            //加载配置文件
            InputStream ips = new FileInputStream("./config.properties");
            pro.load(ips);

            browserName = pro.getProperty("browserName");
            serverURL = pro.getProperty("URL");

            ips.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
        static{
            try{
                BrowserEngine.init();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


//        if(browserName.equalsIgnoreCase("Firefox")){
//            System.setProperty("webdriver.","");
//        }
//        else if(browserName.equalsIgnoreCase("Chrome")){
//            System.setProperty("webdriver.chrome.driver","D:\\测试\\linux\\chrome&driver\\chromedriver.exe");
//            driver = new ChromeDriver();
//
//        }
//        driver.get(serverURL);
//        driver.manage().window().maximize();
//
//        //Thread.sleep(3000);
//        return driver;

}
