package com.example.activity.chapter11_gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by Tien on 20-Jan-16.
 */
public class ImageAdapter extends BaseAdapter {
    int mGalleryItemBackground;
    private Context mContect;
    private Integer[] mImageIds;

    public ImageAdapter(Context c, Integer[] imageIds){
        mImageIds = imageIds;
        mContect = c;
        TypedArray attr = mContect.obtainStyledAttributes(R.styleable.GalleryDemo);
        mGalleryItemBackground = attr.getResourceId(R.styleable.GalleryDemo_android_galleryItemBackground, 0);
        attr.recycle();
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContect);

        imageView.setImageResource(mImageIds[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(mGalleryItemBackground);
        return imageView;
    }
}
