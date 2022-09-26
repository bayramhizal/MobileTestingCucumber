package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class PopupMenuScreen {
    public PopupMenuScreen(){
        PageFactory.initElements( new AppiumFieldDecorator( Driver.getAppiumDriver() ),this );
    }
    @AndroidFindBy(className = "android.widget.Button")
    public MobileElement popupButton;
    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    public MobileElement popupMessage;


}
