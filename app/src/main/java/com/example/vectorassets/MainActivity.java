package com.example.vectorassets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivBeach, ivMbeach, ivBuild, ivCake;
    Button btnChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBeach = findViewById(R.id.ivBeach);
        ivMbeach = findViewById(R.id.ivMbeach);
        ivBuild = findViewById(R.id.ivBuild);
        ivCake = findViewById(R.id.ivCake);
        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivBeach.setImageResource(R.drawable.build);
            }
        });

        ivMbeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
