package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchPage(View view){
        //if user click button, go to other page
        if(view.getId() == R.id.switchButton){
            Intent intent = new Intent(this, SecondPage.class);
            startActivity(intent);
        }
    }
}