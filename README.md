=========CustomToastView======


![CustomToastView](https://raw.githubusercontent.com/nbsoftdev/CustomToast/refs/heads/master/picture_toast.png)

[![](https://jitpack.io/v/nbsoftdev/CustomToast.svg)](https://jitpack.io/#nbsoftdev/CustomToast)



Step 1. Add the JitPack repository to your build file.
Add it in your root build.gradle at the end of repositories:
------
```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 ```

Gradle
------
```
dependencies {
    ...
     implementation 'com.github.nbsoftdev:CustomToast:$LatestVersion'
}
```

Features :
-----
1. Layout Creation: Both implementations use a LinearLayout to combine an ImageView (for the icon) and a TextView (for the message).
2. Styling: Programmatically we define the background using GradientDrawable and set its color and corner radius for a custom look.
3. Toast Creation: The Toast is created and the view is set to the custom layout. The gravity is set to appear at the bottom of the screen.
4. Add an Image: Place the image (e.g., your_image.png) in the res/drawable folder of your project.
5. Image Resizing: You can choose different scale types like CENTER_CROP, FIT_CENTER, etc., based on your preference.
6. Background Color: You can use Color constants (like Color.BLUE) or create custom colors using Color.parseColor("#RRGGBB").
7. Image Dimensions: The width and height parameters are in pixels. Adjust these values according to your design requirements.
8. Scale Type Options: Common options for ImageView.ScaleType include:
   → CENTER_CROP
   → FIT_CENTER
   → FIT_XY
   → CENTER_INSIDE
9. Message Color: The textColor parameter allows you to specify any color for the message text using Color constants or custom colors.
10. Font Type: The typeface parameter allows you to set the font style. You can use the Typeface.create() method to create a typeface. Options for font styles include:
   → Typeface.NORMAL
   → Typeface.BOLD
   → Typeface.ITALIC
   → Typeface.BOLD_ITALIC
11. Typeface Name: You can specify any standard Android typeface name such as "sans-serif", "serif", or "monospace". You can also use custom font files placed in the assets/fonts directory, but you'll need to load them differently.
12. Typeface Style: Users can choose from styles like Typeface.NORMAL, Typeface.BOLD, Typeface.ITALIC, and Typeface.BOLD_ITALIC.
    


Usage For Java
-----
```Java
            // Call the custom toast using the builder pattern
        new CustomToast.Builder(this)
                .setMessage("Hello, this is a custom toast!")
                .setImageResource(R.drawable.image_icon)  // Your image resource
                .setBackgroundColor(Color.BLUE)  // Background color
                .setScaleType(ImageView.ScaleType.CENTER_CROP) // Image scaling option
                .setImageWidth(100)  // Image width in pixels
                .setImageHeight(100)  // Image height in pixels
                .setTextColor(Color.WHITE) // Message text color
                .setTypefaceName("sans-serif") // Typeface name
                .setTypefaceStyle(Typeface.NORMAL) // Typeface style
                .setStrokeColor(Color.RED) // Stroke color
                .setStrokeWidth(4) // Stroke width
                .show();

```



Changelog
---------
* **1.0.6**
    * Initial release
      


License
-------

    Copyright 2014 - 2020 Henning Dodenhof

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
