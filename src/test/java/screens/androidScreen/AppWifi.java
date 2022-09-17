package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class AppWifi {
    public AppWifi(){
        PageFactory.initElements( new AppiumFieldDecorator( Driver.getAppiumDriver(), Duration.ofSeconds( 30 ) ),this );
    }
    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkWifiBox;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    public MobileElement wifiSettingsBox;
    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement getWifiSettingsText;
    @AndroidFindBy(id="android:id/button1")
    public MobileElement wifiSetOkButton;

}
