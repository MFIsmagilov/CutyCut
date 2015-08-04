package com.example.CutyCut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by MaRaT on 04.08.2015.
 */
public class MenuActivity extends Activity{

    Button btnHelp;
    Button btnStart;
    Button btnSetting;
    Button btnExit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnHelp = (Button) findViewById(R.id.btnHelp);
        btnSetting = (Button) findViewById(R.id.btnSetting);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
        btnHelp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        btnSetting.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //ебать хз
            }
        });
    }

}
