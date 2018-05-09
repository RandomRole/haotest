package pageHelper;

import page.pageFabiao;
import util.SeleniumUtil;

/**
 * Created by delldell on 2018/5/8.
 */
public class HelperFabiao {
    public static void clickMorenBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(pageFabiao.HDABIAO_MOREM);
    }

    public static void inputTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(pageFabiao.FABIAO_TITLE,"hello world");
    }

    public static void inputNeirong(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.sendKeys(pageFabiao.FABIAO_NEIRONG,"hello");
    }

    public static void clickFabiaoBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(pageFabiao.FABIAO_BUTTON);
    }
    public static void FaBiao(SeleniumUtil seleniumUtil,String title,String neirong){
        clickMorenBtn(seleniumUtil);
        inputTitle(seleniumUtil,title);
        inputNeirong(seleniumUtil,neirong);
        clickFabiaoBtn(seleniumUtil);
    }
}
