package com.nbsoft.customtoast;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {

    public static class Builder {
        private final Context context;
        private String message;
        private int imageResourceId;
        private int backgroundColor = Color.BLACK; // Default color
        private ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP; // Default scale type
        private int imageWidth = 100; // Default width
        private int imageHeight = 100; // Default height
        private int textColor = Color.WHITE; // Default text color
        private String typefaceName = "sans-serif"; // Default typeface
        private int typefaceStyle = Typeface.NORMAL; // Default typeface style
        private int strokeColor = Color.TRANSPARENT; // Default stroke color
        private int strokeWidth = 0; // Default stroke width

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setImageResource(int imageResourceId) {
            this.imageResourceId = imageResourceId;
            return this;
        }

        public Builder setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder setScaleType(ImageView.ScaleType scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public Builder setImageWidth(int width) {
            this.imageWidth = width;
            return this;
        }

        public Builder setImageHeight(int height) {
            this.imageHeight = height;
            return this;
        }

        public Builder setTextColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        public Builder setTypefaceName(String typefaceName) {
            this.typefaceName = typefaceName;
            return this;
        }

        public Builder setTypefaceStyle(int typefaceStyle) {
            this.typefaceStyle = typefaceStyle;
            return this;
        }

        public Builder setStrokeColor(int strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        public Builder setStrokeWidth(int strokeWidth) {
            this.strokeWidth = strokeWidth;
            return this;
        }

        public void show() {
            // Create LinearLayout to hold ImageView and TextView
            LinearLayout toastLayout = new LinearLayout(context);
            toastLayout.setOrientation(LinearLayout.HORIZONTAL);
            toastLayout.setGravity(Gravity.CENTER_VERTICAL);
            toastLayout.setPadding(20, 20, 20, 20);

            // Create a background for the toast
            GradientDrawable background = new GradientDrawable();
            background.setColor(backgroundColor);
            background.setCornerRadius(30);
            background.setStroke(strokeWidth, strokeColor); // Set stroke width and color
            toastLayout.setBackground(background);

            // Create ImageView for icon
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageResourceId);
            imageView.setScaleType(scaleType);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(imageWidth, imageHeight));
            imageView.setPadding(10, 10, 10, 10);

            // Create TextView for message
            TextView textView = new TextView(context);
            textView.setText(message);
            textView.setTextColor(textColor);
            Typeface typeface = Typeface.create(typefaceName, typefaceStyle);
            textView.setTypeface(typeface);
            textView.setPadding(10, 10, 10, 10);

            // Add ImageView and TextView to LinearLayout
            toastLayout.addView(imageView);
            toastLayout.addView(textView);

            // Create and display the toast
            Toast toast = new Toast(context);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(toastLayout);
            toast.setGravity(Gravity.BOTTOM, 0, 100);
            toast.show();
        }
    }
}
