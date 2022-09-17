package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class ViewsDragandDown extends ReusableMethods {
    Screens screens=new Screens();

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
}
