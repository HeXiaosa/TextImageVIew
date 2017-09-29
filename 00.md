# TextImageVIew
Custom TextImageView can add text above the image, which extends ImageView.
usage:
```
  TextImageView textImageView = (TextImageView) findViewById(R.id.textImageView);
  textImageView.setText("hexiaosa");
  textImageView.setTextColor(Color.BLUE);
  textImageView.setTextSize(50);
  Log.e("MainActivity", textImageView.getText());
```
While in the xml file:
```
<com.customimageview.xiaosa.textimageview.TextImageView
        android:id="@+id/textImageView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@mipmap/ic_launcher"
        app:text="Hello World!"
        app:textSize="18sp"
        app:textColor="#000000"
        app:textX="100dp"
        app:textY="100dp" />
```
It would be easy to understand and use.
