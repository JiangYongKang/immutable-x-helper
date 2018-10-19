package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.Coffer;

/**
 * Author: vincent
 * Date: 2018-10-19 11:29:00
 * Comment:
 */

public class RandomCoffer extends RandomBase {

    private static final Coffer coffer = YamlConverter.doConvert("coffer.yml", Coffer.class);

    public static String variety() {
        return nextElement(coffer.getVarieties());
    }
}
