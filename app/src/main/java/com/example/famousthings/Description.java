package com.example.famousthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {
    public static final String EXTRA_PLACES = "extra_places";
   // int image;
  //  String name,Desc;

    ImageView imgSrc;
    TextView imgTitle;
    TextView imgPlace;
    TextView imgFamousFor;
    TextView imgDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        imgSrc = findViewById(R.id.imageDetail);
        imgTitle = findViewById(R.id.imageTitle);
        imgPlace = findViewById(R.id.place);
        imgFamousFor = findViewById(R.id.famousFor);
        imgDesc = findViewById(R.id.imageDesc);

        Image mountain = getIntent().getParcelableExtra(EXTRA_PLACES);

      //  Bundle i = getIntent().getExtras();


     //  image =i.getInt("imagee");
     //   name = i.getString("namee");
       // Desc = i.getString()

        imgSrc.setImageResource(mountain.getImageSrc());
        imgTitle.setText(mountain.getImageTitle());
        imgPlace.setText(mountain.getPlace());
        imgFamousFor.setText(mountain.getFamousFor());
        imgDesc.setText(mountain.getImageDesc());
    }
}