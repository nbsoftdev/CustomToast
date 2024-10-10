package com.nbsoft.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call the custom toast using the builder pattern
        new CustomToast.Builder(this)
                .setMessage("Hello, this is a custom toast!")
                .setImageResource(R.drawable.image_icon)  // Your image resource
                .setBackgroundColor(Color.BLACK)  // Background color
                .setScaleType(ImageView.ScaleType.CENTER_CROP) // Image scaling option
                .setImageWidth(100)  // Image width in pixels
                .setImageHeight(100)  // Image height in pixels
                .setTextColor(Color.WHITE) // Message text color
                .setTypefaceName("sans-serif") // Typeface name
                .setTypefaceStyle(Typeface.NORMAL) // Typeface style
                .setStrokeColor(Color.RED) // Stroke color
                .setStrokeWidth(4) // Stroke width
                .show();

    }
}