package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;

import screens.androidScreen.AppWifi;
import utils.Driver;
import utils.ReusableMethods;

public class apiDemoTest extends ReusableMethods {
    Screens screens=new Screens();
    @Given("App should install")
    public void app_should_install() {

        Driver.getAppiumDriver();
    }

    @Given("users go on homepage")
    public void users_go_on_homepage() throws InterruptedException {
        Assert.assertTrue(screens.mainScreen().isMainScreenDisplayed() );

    }

    @Given("user should click button api demos")
    public void user_should_click_button_api_demos()  {

   // mainScreen.apiDemos.click();
        tapOn( screens.mainScreen().apiDemos );
    }

    @Then("user on api demos page")
    public void user_on_api_demos_page() throws InterruptedException{
       // Assert.assertTrue( apiDemoScreen.isApiDemoDisplayed() );
        Assert.assertTrue( isElementPresent( screens.apiDemosScreen().preference));
    }

    @Then("user click preferences button")
    public void user_click_preferences_button() {

       // apiDemoScreen.preference.click();
        tapOn( screens.apiDemosScreen().preference );
    }

    @Then("user on preferences page")
    public void user_on_preferences_page() throws InterruptedException {

     // Assert.assertTrue( apiDemoScreen.isPreferenceDisplayed() );
        Assert.assertTrue( isElementPresent( screens.apiDemosScreen().preferenceHome ));
    }

    @Then("user click preferences dependecies")
    public void user_click_preferences_dependecies() {
       // apiDemoScreen.preDependcies.click();
        tapOn( screens.apiDemosScreen().preDependcies );

    }

    @Then("user check wifi")
    public void user_check_wifi() {
      //  if(appWifi.checkWifiBox.getAttribute( "checked" ).equals( "false" )){
        //    appWifi.checkWifiBox.click();
        if (screens.appWifi().checkWifiBox.getAttribute( "checked" ).equals( "false" )){
            tapOn( screens.appWifi().checkWifiBox );
        }
        }



    @Then("user click wifi settings")
    public void user_click_wifi_settings() {
      //  appWifi.wifiSettingsBox.click();
        tapOn( screens.appWifi().wifiSettingsBox );

    }

    @Then("user sees wifi settings popup")
    public void user_sees_wifi_settings_popup() {
       // Assert.assertTrue( appWifi.getWifiSettingsText.isDisplayed() );
        Assert.assertTrue( isElementPresent( screens.appWifi().getWifiSettingsText ) );

    }

    @And("user write test {string}")
    public void userWriteTest(String string ){
        //appWifi.getWifiSettingsText.sendKeys( string );
        enterText( screens.appWifi().getWifiSettingsText,string );
    }



    @Then("user click ok button")
    public void user_click_ok_button() {
       // appWifi.wifiSetOkButton.click();
        tapOn( screens.appWifi().wifiSetOkButton );

    }


    @And("user click switch")
    public void userClickSwitch() {
     tapOn(screens.apiDemosScreen().switchButton );


    }


    @And("user click checkbox")
    public void userClickCheckbox() {

        tapOn( screens.apiDemosScreen().checkbox);
    }

    @Then("user click switch button")
    public void userClickSwitchButton() {
        tapOn( screens.apiDemosScreen().switchSecond );
    }

    @And("appiumclose")
    public void appiumclose() {
       Driver.quitAppiumDriver();
    }

    @And("checkbox should checked")
    public void checkboxShouldChecked() {
        if(screens.apiDemosScreen().checkbox.getAttribute( "checked" ).equals( "false" )){
            tapOn( screens.apiDemosScreen().checkbox );
        }
    }

    @And("first switchbutton should close")
    public void firstSwitchbuttonShouldClose() {
        if(screens.apiDemosScreen().switchfirst.getAttribute( "checked" ).equals( "true" )){
            tapOn( screens.apiDemosScreen().switchfirst );
        }
    }

    @And("second switchbutton should be opened")
    public void secondSwitchbuttonShouldBeOpened() {
        if(screens.apiDemosScreen().switchSecond.getAttribute( "checked" ).equals( "false" )){
            tapOn( screens.apiDemosScreen().switchSecond );
        }
    }

}
