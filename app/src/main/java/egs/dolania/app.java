package egs.dolania;

import android.app.Application;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by hosein on 6/7/16.
 */
public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setLocale("en");
    }
    public void setLocale(String lang) {
//        Locale locale = new Locale(lang);
//        Locale.setDefault(locale);
//        Configuration config = new Configuration();
//        config.locale = locale;
//        getApplicationContext().getResources().updateConfiguration(config, null);
        String languageToLoad  = lang; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

    }
}
