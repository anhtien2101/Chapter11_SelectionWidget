package com.example.activity.chapter11_gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CatDetailActivity extends AppCompatActivity {
    private TextView tvID, tvWeigh, tvPrice;
    private ImageView imgCat;
    private String[] prices = {"50$", "120$", "70$", "90$", "300$", "220$", "170$"};
    private double[] weighs = {1.2, 1.4, 1.7, 0.8, 2.1, 2.5, 2.0};
    private Integer[] listImageIds = {R.drawable.meo_1,R.drawable.meo_2, R.drawable.meo_3, R.drawable.meo_4,
            R.drawable.meo_5, R.drawable.meo_6, R.drawable.meo_7};
    private String[] IDs = {"001", "002", "003", "004", "005", "006", "007"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        tvID = (TextView) findViewById(R.id.tvID);
        tvWeigh = (TextView) findViewById(R.id.tvWeigh);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        imgCat = (ImageView) findViewById(R.id.imgDetail);

        Bundle b = getIntent().getExtras();
        int position = b.getInt("position");

        tvID.setText("ID: " + IDs[position]);
        tvWeigh.setText("Weigh: " + String.valueOf(weighs[position]));
        tvPrice.setText("Price: " + prices[position]);
        imgCat.setImageResource(listImageIds[position]);
    }
}
