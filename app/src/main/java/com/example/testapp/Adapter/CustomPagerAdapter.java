package com.example.testapp.Adapter;

/**
 * Created by developer on 6/1/17.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.testapp.R;
import com.example.testapp.TestDemo.TestDemo;

public class CustomPagerAdapter extends PagerAdapter {

    private final LayoutInflater inflater;
    private Context mContext;
    TestDemo testDemo;

    public CustomPagerAdapter(Context context, TestDemo testDemo) {
        mContext = context;
        this.testDemo = testDemo;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public float getPageWidth(int position) {
        return (0.4f);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, final int position) {

        View itemView = inflater.inflate(R.layout.product_list_row_item, collection, false);
        final ImageView iv_im_hair_type = (ImageView) itemView.findViewById(R.id.iv_img);
        Glide.with(mContext).load(testDemo.getData().getVideoCategory().getVideos().get(position).getOgImage())
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv_im_hair_type);

        collection.addView(itemView);


        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return testDemo.getData().getVideoCategory().getVideos().size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return null;
    }

}
