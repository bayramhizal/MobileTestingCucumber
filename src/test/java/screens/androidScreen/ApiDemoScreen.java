package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

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
    public boolean isApiDemoDisplayed() throws InterruptedException {
        Thread.sleep( 5000 );
        return preferenceHome.isDisplayed();
    }
    public boolean isPreferenceDisplayed() throws InterruptedException {
        Thread.sleep( 5000 );
        return preferenceHome.isDisplayed();
    }
}
