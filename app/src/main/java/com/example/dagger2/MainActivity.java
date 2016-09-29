package com.example.dagger2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Dagger2Application)getApplication()).getComponent().inject(this);
        if(prefs != null){
            Log.d("Dagger2", "Prefs is not equal to null");
        }
    }
}
