package com.example.travelassist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class setting extends AppCompatActivity {
    SharedPreferences preferences;
    Button whiteBtn, purpleBtn, yellowBtn, blueBtn, greenBtn;
    LinearLayout changeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);
        whiteBtn = (Button) findViewById(R.id.whiteBtn);
        purpleBtn = (Button) findViewById(R.id.purpleBtn);
        yellowBtn = (Button) findViewById(R.id.yellowBtn);
        blueBtn = (Button) findViewById(R.id.blueBtn);
        greenBtn = (Button) findViewById(R.id.greenBtn);
        changeColor = (LinearLayout) findViewById(R.id.changeColor);
        preferences = getSharedPreferences("value", MODE_PRIVATE);
    }

    public void handler2(View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
    public void whiteBackground(View view){
        changeColor.setBackgroundResource(R.color.backColor);
        whiteBtn.setBackgroundResource(R.color.buttonColor1);
        preferences.edit().putInt("theme", 1).apply();
    }
    public void yellowBackground(View view){
        changeColor.setBackgroundResource(R.color.backColor2);
        yellowBtn.setBackgroundResource(R.color.buttonColor2);
        preferences.edit().putInt("theme", 2).apply();
    }
    public void greenBackground(View view){
        changeColor.setBackgroundResource(R.color.backColor3);
        greenBtn.setBackgroundResource(R.color.buttonColor3);
        preferences.edit().putInt("theme", 3).apply();
    }
    public void blueBackground(View view){
        changeColor.setBackgroundResource(R.color.backColor4);
        blueBtn.setBackgroundResource(R.color.buttonColor4);
        preferences.edit().putInt("theme", 4).apply();
    }
    public void purpleBackground(View view){
        changeColor.setBackgroundResource(R.color.backColor5);
        purpleBtn.setBackgroundResource(R.color.buttonColor5);
        preferences.edit().putInt("theme", 5).apply();
    }
}
