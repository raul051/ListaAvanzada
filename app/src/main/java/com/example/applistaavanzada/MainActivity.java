package com.example.applistaavanzada;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends WearableActivity {

    Button  btnAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Enables Always-on
        setAmbientEnabled();
        btnAdvanced = (Button) findViewById(R.id.btnAdvanced);
    }

    public void btnAdvancedClick(View view){
        Intent intent = new Intent(this,AdvanceListActivity.class);
        startActivity(intent);
    }
}