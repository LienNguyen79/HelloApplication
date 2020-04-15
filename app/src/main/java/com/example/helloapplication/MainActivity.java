package com.example.helloapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        findViewById(R.id.button_change).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText(R.string.test);
            }
        });
        Log.v()
    }
}
