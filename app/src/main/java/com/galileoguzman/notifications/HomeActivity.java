package com.galileoguzman.notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        // REGISTER TO A TOPIC
        FirebaseMessaging.getInstance().subscribeToTopic("news");

    }
}
