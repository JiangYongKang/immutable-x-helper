package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.CatData;

/**
 * Author: vincent
 * DateTime: 2018/11/15 23:21
 * Comment:
 */

public class Cat extends RandomBase {

    private static final CatData catData = YamlConverter.doConvert("cat.yml", CatData.class);

    public static String name() {
        return nextElement(catData.getName());
    }

    public static String breed() {
        return nextElement(catData.getBreed());
    }

    public static String registry() {
        return nextElement(catData.getRegistry());
    }
}
