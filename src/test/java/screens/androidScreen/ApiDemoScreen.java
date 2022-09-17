package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import javax.xml.xpath.XPath;
import java.security.cert.X509Certificate;
import java.time.Duration;

public class ApiDemoScreen {
    public ApiDemoScreen(){
        PageFactory.initElements( new AppiumFieldDecorator( Driver.getAppiumDriver(), Duration.ofSeconds( 30 ) ),this );
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preference;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preferenceHome;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public MobileElement preDependcies;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public MobileElement switchButton;
    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public MobileElement checkbox;
    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public MobileElement switchfirst;
    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public MobileElement switchSecond;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement view;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement viewScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public MobileElement dragandDown;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_1")
    public MobileElement firstball;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_2")
    public MobileElement secondball;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_hidden")
    public MobileElement fourthball;











  /*  public boolean isApiDemoDisplayed() throws InterruptedException {
        Thread.sleep( 5000 );
        return preferenceHome.isDisplayed();
    }
    public boolean isPreferenceDisplayed() throws InterruptedException {
        Thread.sleep( 5000 );
        return preferenceHome.isDisplayed();
    }
*/
}
