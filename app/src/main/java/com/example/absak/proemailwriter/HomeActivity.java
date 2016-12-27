package com.example.absak.proemailwriter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    // this method takes from home activity to the learning steps
    // of Professional Email
    public void goToLearn(View view){
        Intent intent = new Intent(this, LearnStepsActivity.class);
        startActivity(intent);
    }

    // takes from home activity to actually writing an actual Email
    // by following the steps in the learning activity
    public void goToWrite(View view){

    }
}
