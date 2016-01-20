package com.example.activity.chapter11_gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv = null;
    private ImageView imgView = null;
    int mPosition = 0;
    private Integer[] listImageIds = {R.drawable.meo_1,R.drawable.meo_2, R.drawable.meo_3, R.drawable.meo_4,
            R.drawable.meo_5, R.drawable.meo_6, R.drawable.meo_7};

    private String[] listName = {"Meo 1", "Meo 2", "Meo 3","Meo 4", "Meo 5", "Meo 6", "Meo 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        tv = (TextView) findViewById(R.id.texview);
        ImageAdapter adapter = new ImageAdapter(this, listImageIds);
        gallery.setAdapter(adapter);
        imgView = (ImageView) findViewById(R.id.imgView);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                imgView.setImageResource(listImageIds[position]);
                tv.setText(listName[position]);
                mPosition = position;
            }
        });

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CatDetailActivity.class);
                intent.putExtra("position",mPosition);
                startActivity(intent);
            }
        });
    }
}
