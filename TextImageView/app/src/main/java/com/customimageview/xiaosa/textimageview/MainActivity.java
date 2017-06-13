package com.customimageview.xiaosa.textimageview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextImageView textImageView = (TextImageView) findViewById(R.id.textImageView);
        textImageView.setText("hexiaosa");
        textImageView.setTextColor(Color.BLUE);
        textImageView.setTextSize(50);
        Log.e("MainActivity", textImageView.getText());
    }
}
