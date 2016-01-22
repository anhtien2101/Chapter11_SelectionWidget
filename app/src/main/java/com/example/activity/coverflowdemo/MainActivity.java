package com.example.activity.coverflowdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer[] listImageIds = {R.drawable.meo_1,R.drawable.meo_2, R.drawable.meo_3, R.drawable.meo_4,
            R.drawable.meo_5, R.drawable.meo_6, R.drawable.meo_7};
    ImageView imageView;
    TextView textView;
    int mPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imgView);
        textView = (TextView) findViewById(R.id.textview);
        CoverFlow coverFlow = (CoverFlow) findViewById(R.id.coverFlow);

        ImageAdapter adapter = new ImageAdapter(this, listImageIds);
        coverFlow.setAdapter(adapter);
        coverFlow.setSpacing(-25);
        coverFlow.setSelection(4, true);
        coverFlow.setAnimationDuration(1000);
        coverFlow.setGravity(Gravity.TOP);
        coverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                imageView.setImageResource(listImageIds[position]);
                textView.setText("Meo " + String.valueOf(position + 1));
                mPosition = position;
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CatDetailActivity.class);
                intent.putExtra("position", mPosition);
                startActivity(intent);
            }
        });

    }

}
