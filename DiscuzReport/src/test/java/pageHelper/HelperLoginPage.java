package pageHelper;

import page.pageFabiao;
import page.pageLogin;
import util.SeleniumUtil;

/**
 * Created by delldell on 2018/5/8.
 */
public class HelperLoginPage {

    public static void inputUsername(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendKeys(pageLogin.LOGIN_EDITVIEW_ACCOUNT,"admin");
    }

    public static void inputPassword(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(pageLogin.LOGIN_EDITVIEW_PWD,"123456");
    }

    public static void clickLoginBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(pageLogin.LOGIN_EDITVIEW_BUTTON);
    }


    public static void login(SeleniumUtil seleniumUtil,String name,String pwd){
        inputUsername(seleniumUtil,name);
        inputPassword(seleniumUtil,pwd);
        clickLoginBtn(seleniumUtil);
    }
}
