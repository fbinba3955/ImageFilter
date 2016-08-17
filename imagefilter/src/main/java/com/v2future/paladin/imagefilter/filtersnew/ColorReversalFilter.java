package com.v2future.paladin.imagefilter.filtersnew;

import com.v2future.paladin.imagefilter.filters.IImageFilter;
import com.v2future.paladin.imagefilter.filters.Image;

/**
 * 颜色颠倒
 * 创建人：shijianting
 * 创建时间：2016/8/17 15:40
 * 修改人：shijianting
 * 修改时间：2016/8/17 15:40
 * 修改备注：
 */
public class ColorReversalFilter implements IImageFilter{

    @Override
    public Image process(Image imageIn) {
        int r,g,b;
        for (int x = 0; x < imageIn.getWidth(); x++) {
            for (int y = 0; y < imageIn.getHeight(); y++) {
                r = imageIn.getRComponent(x, y);
                g = imageIn.getGComponent(x, y);
                b = imageIn.getBComponent(x, y);
                r = 255 -r;
                g = 255 - g;
                b = 255 - b;
                imageIn.setPixelColor(x,y,r,g,b);
            }
        }
        return imageIn;
    }
}
