package com.example.jenistanaman;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();


    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("url_image") && getIntent().hasExtra("name_image") && getIntent().hasExtra("desc_image")){

            String GambarTanaman = getIntent().getStringExtra("url_image");
            String imageName = getIntent().getStringExtra("name_image");
            String ImageTanamansDesc = getIntent().getStringExtra("desc_image");

            setImage(GambarTanaman,imageName,ImageTanamansDesc);
        }

    }

    private void setImage(String GambarTanaman, String imageName, String ImageTanamansDesc){
        TextView name = findViewById(R.id.img_desc);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det);
        det.setText(ImageTanamansDesc);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(GambarTanaman)
                .into(image);
    }
}
