package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class ViewsDragandDown extends ReusableMethods {
    Screens screens=new Screens();
    TouchAction touchAction=new TouchAction( Driver.getAppiumDriver() );

    @And("user click views button")
    public void userClickViewsButton() {
        tapOn( screens.apiDemosScreen().view );
    }

    @Then("user on views screen")
    public void userOnViewsScreen() {

        Assert.assertTrue(isElementPresent( screens.apiDemosScreen().viewScreen ) );

    }

    @And("user click drag and drop button")
    public void userClickDragAndDropButton() {
        tapOn(screens.apiDemosScreen().dragandDown );
    }


    @When("user leave firstball on secondball")
    public void userLeaveFirstballOnSecondball() {
        TouchAction touchAction=new TouchAction( Driver.getAppiumDriver() );

        touchAction.longPress( ElementOption.element( screens.apiDemosScreen().firstball ) ).
                moveTo( ElementOption.element( screens.apiDemosScreen().secondball ) ).release().perform();

    }

    @Then("user sees forthball")
    public void userSeesForthball() {

        Assert.assertTrue( isElementPresent( screens.apiDemosScreen().fourthball ) );
    }

    @And("user click {int}")
    public void userClick(int hour) {
        tapOn( screens.dateWidgetsScreen().nine);

    }

    @And("user from {int} to {int} swipe")
    public void userFromToSwipe(int second1, int second2) {
        touchAction.longPress(ElementOption.element( screens.dateWidgetsScreen().fiveteen ) ).waitAction( WaitOptions.waitOptions( Duration.ofSeconds( 1 ) )).
                moveTo(ElementOption.element( screens.dateWidgetsScreen().num45 )  ).release().perform() ;
    }

    @And("user click {string} long")
    public void userClickLong(String text) {
        touchAction.longPress( LongPressOptions.longPressOptions().withElement(ElementOption.element(Driver.
                getAppiumDriver().  findElementByXPath("android.widget.TextView[@text='"+text+"']")))).
                waitAction(WaitOptions.waitOptions( Duration.ofSeconds( 3 ) )).release().perform();
    }
}
