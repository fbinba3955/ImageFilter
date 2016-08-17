package com.v2future.paladin.imagefilter;

import android.content.Context;
import android.widget.ImageView;

import com.v2future.paladin.imagefilter.filters.IImageFilter;
import com.v2future.paladin.imagefilter.filters.Image;

/**
 * 创建人：shijianting
 * 创建时间：2016/8/17 15:53
 * 修改人：shijianting
 * 修改时间：2016/8/17 15:53
 * 修改备注：
 */
public class ImageFilter {

    private Context mContext;

    private IImageFilter iImageFilter;

    public ImageFilter(Context context){
        mContext = context;
    }

    /**
     * 设置滤镜
     * @param imageFilter
     */
    public void setImageFilter(IImageFilter imageFilter){
        this.iImageFilter = imageFilter;
    }

    /**
     * 显示图片
     * @param iv
     * @param resourceId
     */
    public void showImageView(ImageView iv, int resourceId){
        Image image = Image.LoadImage(mContext, resourceId);
        if (null == iImageFilter) {
            iv.setImageBitmap(image.getImage());
        }
        else {
            image = iImageFilter.process(image);
            iv.setImageBitmap(image.getImage());
        }
    }

    /**
     * 显示图片
     * @param context
     * @param filter
     * @param iv
     * @param resourceId
     */
    public static void showImageView(Context context,
                                     IImageFilter filter,
                                     ImageView iv,
                                     int resourceId){
        Image image = Image.LoadImage(context, resourceId);
        if (null == filter) {
            iv.setImageBitmap(image.getImage());
        }
        else {
            image = filter.process(image);
            iv.setImageBitmap(image.getImage());
        }
    }
}
