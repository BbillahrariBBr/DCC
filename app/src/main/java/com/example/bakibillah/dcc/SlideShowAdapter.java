package com.example.bakibillah.dcc;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

/**
 * Created by BakiBillah on 12/9/2017.
 */

public class SlideShowAdapter extends PagerAdapter {

    private Context context;
    LayoutInflater inflater;
    public int[] images = {
            R.drawable.dcc1,
            R.drawable.dcc2,
            R.drawable.dcc3

    };
    public SlideShowAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(LinearLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slideshow_layout,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.image_view_id);
        Glide.with(context).load(images[position]).into(imageView);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
