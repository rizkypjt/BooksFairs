package rizky.rizky.app.booksfairs;

import android.app.Application;

import java.security.KeyPairGenerator;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class App extends Application {


    @Override public void onCreate() {
        super.onCreate();
        Rak.initialize(this);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/cc-regular.ttf")
                .setFontAttrId(android.R.attr.fontPath)
                .build());
    }

}
