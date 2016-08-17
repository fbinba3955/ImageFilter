package com.v2future.paladin.imagefilter.filtersnew;

import com.v2future.paladin.imagefilter.filters.BlackWhiteFilter;
import com.v2future.paladin.imagefilter.filters.IImageFilter;
import com.v2future.paladin.imagefilter.filters.Image;

/**
 * 创建人：shijianting
 * 创建时间：2016/8/17 15:26
 * 修改人：shijianting
 * 修改时间：2016/8/17 15:26
 * 修改备注：
 */
public class ChineseInkFilter implements IImageFilter {

    @Override
    public Image process(Image imageIn) {
        imageIn = new BlackWhiteFilter().process(imageIn);
        imageIn = new ColorReversalFilter().process(imageIn);
        return imageIn;
    }
}
