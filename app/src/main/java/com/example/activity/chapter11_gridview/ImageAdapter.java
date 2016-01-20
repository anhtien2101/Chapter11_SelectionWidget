package com.example.activity.chapter11_gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Tien on 15-Jan-16.
 */
public class ImageAdapter extends BaseAdapter {
    Context mContext;
    public ImageAdapter(Context context){
        mContext = context;
    }

    private Integer[] mThumbIds = {
            R.drawable.meo_1, R.drawable.meo_2,
            R.drawable.meo_3, R.drawable.meo_4,
            R.drawable.meo_5, R.drawable.meo_6,
            R.drawable.meo_3, R.drawable.meo_7,
            R.drawable.meo_6, R.drawable.meo_2,
            R.drawable.meo_5, R.drawable.meo_1,
            R.drawable.meo_3, R.drawable.meo_7,
            R.drawable.meo_2, R.drawable.meo_4,
            R.drawable.meo_5, R.drawable.meo_1,
            R.drawable.meo_4, R.drawable.meo_1,
            R.drawable.meo_7 };
    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        ImageView imageView;
        if (convertview == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertview;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}
