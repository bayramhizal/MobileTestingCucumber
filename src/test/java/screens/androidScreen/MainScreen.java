package screens.androidScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class MainScreen {
    public MainScreen(){
        PageFactory.initElements( new AppiumFieldDecorator( Driver.getAppiumDriver(), Duration.ofSeconds( 30 ) ),this );
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public MobileElement homePageTitle;
    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    public MobileElement apiDemos;



    }





