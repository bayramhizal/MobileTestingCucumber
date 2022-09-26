package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.List;


public class ready extends ReusableMethods {
    Screens screens=new Screens();
    @And("user click {string}")
    public void userClick(String text) {
        wait(5);
        tapOnElementWithText(text);
    }

    @Then("user on {string} page")
    public void userOnPage(String text) {
        isElementPresent(text);
    }

    @And("user click switches screen")
    public void userClickSwitchesScreen() {
        List<MobileElement>list;
        do {
            list=screens.apiDemosScreen().switches;
            //if you do not find make a scroll
            Dimension dimension= Driver.getAppiumDriver().manage().window().getSize();
            int start_x= (int) (dimension.width*0.5);
            int start_y= (int) (dimension.height*0.8);
            int end_x= (int) (dimension.width*0.5);
            int end_y= (int) (dimension.height*0.2);
            TouchAction touchAction=new TouchAction(Driver.getAppiumDriver()  );
            touchAction.press( PointOption.point(start_x,start_y  ) ).waitAction( WaitOptions.waitOptions( Duration.ofSeconds( 1 ) )).
                    moveTo(PointOption.point( end_x,end_y )
                    ).release().perform();
        }while (list.size()==0);
      tapOn( screens.apiDemosScreen().switches.get( 0 ) );

    }

    @And("user click {string} button")
    public void userClickButton(String text) {
    scrollWithUiScrollable(text);
    }
    @And("user should click button {string}")
    public void userShouldClickButton(String text) {

        tapOnElementWithText(text);
    }


    @And("user click {string} buttons")
    public void userClickButtons(String text) {
        tapOnElementWithText(text);
    }


    // @And("user click switches button")
    //public void userClickSwitchesButton() {
      //  AndroidDriver driver= (AndroidDriver)Driver.getAppiumDriver();

       // driver.findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))" );
    //
        //    tapOn(( MobileElement)driver.findElementByAndroidUIAutomator( "UiSelector().className(\"android.widget.TextView\").text(\"Switches\")" ));

    }

