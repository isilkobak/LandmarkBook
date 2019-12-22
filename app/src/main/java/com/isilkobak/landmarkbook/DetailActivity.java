package com.isilkobak.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landMarkName = findViewById(R.id.landmarkName);
        TextView countryNameText = findViewById(R.id.countryName);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        landMarkName.setText(landmarkName);
        String countryName = intent.getStringExtra("countryName");
        countryNameText.setText(countryName);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChoosenImage());
    }
}
