package pageHelper;

import page.pageHuifu;
import util.SeleniumUtil;

/**
 * Created by delldell on 2018/5/8.
 */
public class HelperHuifu {
    public static void inputHuifu(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.sendKeys(pageHuifu.HUIFU_NEIRONG,"enen");
    }
    public static void clickHuifuBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(pageHuifu.HUIFU_BUTTON);
    }
    public static void Huifu(SeleniumUtil seleniumUtil,String neirong){
        inputHuifu(seleniumUtil,neirong);
        clickHuifuBtn(seleniumUtil);
    }
}
