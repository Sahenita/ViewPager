package com.example.testapp;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.testapp.Adapter.CustomPagerAdapter;
import com.example.testapp.TestDemo.TestDemo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;


public class FirstScreen extends AppCompatActivity {
    Gson gson;
    TestDemo testDemo=new TestDemo();
    TextView text_title,tv_des_text,tv_date_text;
    ImageView product_big_image;
    private ViewPager viewPager;
    ViewPager.OnPageChangeListener mPageChangeListener;
    boolean isSwipeActive = false;
    int selectedPageIndex = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        Utils.statusBarColor1(this);

        if(getResources().getBoolean(R.bool.portrait_only)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();

        initview();
        apicall();
    }

    private void initview() {
        text_title=findViewById(R.id.text_title);
        tv_des_text=findViewById(R.id.tv_des_text);
        tv_date_text=findViewById(R.id.tv_date_text);
        product_big_image=findViewById(R.id.product_big_image);
        viewPager=findViewById(R.id.viewPager);


    }

    public void apicall(){
        String tag_json_obj = "json_obj_req";
        String url = "https://www.addatimes.com/api/video-details/664.json";
        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("success", response.toString());
                        pDialog.hide();

                        testDemo.setData(gson.fromJson(response.toString(), TestDemo.class).getData());
                        text_title.setText(testDemo.getData().getTitle());
                        tv_des_text.setText(testDemo.getData().getDescription());
                        String imgUrl =testDemo.getData().getHorizontalImage();


                        Glide.with(FirstScreen.this).load(imgUrl)
                                .thumbnail(0.5f)
                                .crossFade()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                                .into(product_big_image);
                        //pageIndicatorView.setSelection(1);
                        viewPager.setAdapter(new CustomPagerAdapter(FirstScreen.this, testDemo));
                        String date=testDemo.getData().getVideoGenres().get(0).getCreatedAt();
                        tv_date_text.setText(date);
                        mPageChangeListener = new ViewPager.OnPageChangeListener() {

                            @Override
                            public void onPageScrollStateChanged(int arg0) {
                                // TODO Auto-generated method stub
                                if (arg0 == 0) {
                                    isSwipeActive = false;
                                } else if (arg0 == 1) {
                                    isSwipeActive = true;
                                }
                            }

                            @Override
                            public void onPageScrolled(int arg0, float arg1, int arg2) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void onPageSelected(int pos) {
                                selectedPageIndex = pos;
                                //pageIndicatorView.setSelection(pos);


                            }

                        };
                        viewPager.setOnPageChangeListener(mPageChangeListener);


                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("error", "Error: " + error.getMessage());
                // hide the progress dialog
                pDialog.hide();
            }
        });

        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);
    }



}

