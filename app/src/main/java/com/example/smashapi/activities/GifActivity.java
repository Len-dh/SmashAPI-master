package com.example.smashapi.activities;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.smashapi.R;
import com.example.smashapi.model.Fighters;

import java.util.List;

public class GifActivity extends Activity {
    private ImageView imgif;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gif_layout);

        imgif = (ImageView) findViewById(R.id.imaGif);
        Glide.with(this).asGif().load("https://media.giphy.com/media/UtiwNokthANEY/giphy.gif").into(imgif);



    }

}
