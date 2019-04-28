package com.example.ashleyshorter.yuka;

import android.app.Application;

import com.example.ashleyshorter.yuka.fragments.ProfileFragment;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(com.example.ashleyshorter.yuka.Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jam-d-yuka")
                .clientKey("Tango150")
                .server("https://jam-d-yuka.herokuapp.com/parse").build());
    }
}
