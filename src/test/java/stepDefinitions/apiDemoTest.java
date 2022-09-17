package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.androidScreen.ApiDemoScreen;
import screens.androidScreen.AppWifi;
import screens.androidScreen.MainScreen;
import utils.Driver;

public class apiDemoTest {
    ApiDemoScreen apiDemoScreen=new ApiDemoScreen();
    AppWifi appWifi=new AppWifi();
    MainScreen mainScreen=new MainScreen();
    @Given("App should install")
    public void app_should_install() {

        Driver.getAppiumDriver();
    }

    @Given("users go on homepage")
    public void users_go_on_homepage() throws InterruptedException {
        Assert.assertTrue(mainScreen.isMainScreenDisplayed() );

    }

    @Given("user should click button api demos")
    public void user_should_click_button_api_demos()  {

     mainScreen.apiDemos.click();
    }

    @Then("user on api demos page")
    public void user_on_api_demos_page() throws InterruptedException{
        Assert.assertTrue( apiDemoScreen.isApiDemoDisplayed() );
    }

    @Then("user click preferences button")
    public void user_click_preferences_button() {

        apiDemoScreen.preference.click();
    }

    @Then("user on preferences page")
    public void user_on_preferences_page() throws InterruptedException {

      Assert.assertTrue( apiDemoScreen.isPreferenceDisplayed() );
    }

    @Then("user click preferences dependecies")
    public void user_click_preferences_dependecies() {
        apiDemoScreen.preDependcies.click();

    }

    @Then("user check wifi")
    public void user_check_wifi() {
        if(appWifi.checkWifiBox.getAttribute( "checked" ).equals( "false" )){
            appWifi.checkWifiBox.click();
        }

    }

    @Then("user click wifi settings")
    public void user_click_wifi_settings() {
        appWifi.wifiSettingsBox.click();

    }

    @Then("user sees wifi settings popup")
    public void user_sees_wifi_settings_popup() {
        Assert.assertTrue( appWifi.getWifiSettingsText.isDisplayed() );

    }

    @And("user write test {string}")
    public void userWriteTest(String string ){
        appWifi.getWifiSettingsText.sendKeys( string );

    }



    @Then("user click ok button")
    public void user_click_ok_button() {
        appWifi.wifiSetOkButton.click();

    }



}
