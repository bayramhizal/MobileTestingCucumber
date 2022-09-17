package screens;

import screens.androidScreen.*;
import screens.iosScreen.AlertViewScreen;

public class Screens {
    public Screens() {
    }
    private ApiDemoScreen apiDemosScreen;
    private MainScreen mainScreen;
    private AppWifi appwifi;



    public ApiDemoScreen apiDemosScreen() {
        if (apiDemosScreen == null) {
            apiDemosScreen = new ApiDemoScreen();
        }
        return apiDemosScreen;
    }

    public MainScreen mainScreen(){
        if (mainScreen == null) {
            mainScreen= new MainScreen();
        }
        return mainScreen;
    }

    public AppWifi appWifi(){
        if (appwifi == null) {
            appwifi =  new AppWifi();
        }
        return appwifi;
    }


}