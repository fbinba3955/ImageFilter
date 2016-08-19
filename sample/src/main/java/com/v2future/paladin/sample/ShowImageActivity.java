package com.v2future.paladin.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.v2future.paladin.imagefilter.ImageFilter;
import com.v2future.paladin.imagefilter.filters.AutoAdjustFilter;
import com.v2future.paladin.imagefilter.filters.CleanGlassFilter;
import com.v2future.paladin.imagefilter.filters.ColorQuantizeFilter;
import com.v2future.paladin.imagefilter.filters.ColorToneFilter;
import com.v2future.paladin.imagefilter.filters.ComicFilter;
import com.v2future.paladin.imagefilter.filters.GaussianBlurFilter;
import com.v2future.paladin.imagefilter.filters.HistogramEqualFilter;
import com.v2future.paladin.imagefilter.filters.IllusionFilter;
import com.v2future.paladin.imagefilter.filters.Image;
import com.v2future.paladin.imagefilter.filters.LomoFilter;
import com.v2future.paladin.imagefilter.filters.NoiseFilter;
import com.v2future.paladin.imagefilter.filters.OilPaintFilter;
import com.v2future.paladin.imagefilter.filters.OldPhotoFilter;
import com.v2future.paladin.imagefilter.filters.RainBowFilter;
import com.v2future.paladin.imagefilter.filtersnew.ChineseInkFilter;
import com.v2future.paladin.imagefilter.filtersnew.ColorReversalFilter;

/**
 * demo
 * @author perfectpaladin
 * @time 2016/8/17 13:52
 */
public class ShowImageActivity extends BaseActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5;
    private ImageView orignIv, filterIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        orignIv = (ImageView) findViewById(R.id.origniv);
        filterIv = (ImageView) findViewById(R.id.filteriv);
        initImage(1);
    }

    private void initImage(int id){
        RainBowFilter filter = new RainBowFilter();
        int resourceId = R.mipmap.img1;
        switch (id) {
            case 1:
                resourceId = R.mipmap.img1;
                break;
            case 2:
                resourceId = R.mipmap.img2;
                break;
            case 3:
                resourceId = R.mipmap.img3;
                break;
            case 4:
                resourceId = R.mipmap.img4;
                break;
            case 5:
                resourceId = R.mipmap.img5;
                break;
            default:
                resourceId = R.mipmap.img1;
                break;
        }
        ImageFilter.showImageView(this, null, orignIv, resourceId);
        ImageFilter.showImageView(this, filter, filterIv, resourceId);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                initImage(1);
                break;
            case R.id.btn2:
                initImage(2);
                break;
            case R.id.btn3:
                initImage(3);
                break;
            case R.id.btn4:
                initImage(4);
                break;
            case R.id.btn5:
                initImage(5);
                break;
        }
    }
}
