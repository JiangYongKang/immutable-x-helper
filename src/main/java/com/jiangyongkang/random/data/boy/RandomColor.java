package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.Color;

/**
 * Author: vincent
 * Date: 2018-10-19 13:09:00
 * Comment:
 */

public class RandomColor extends RandomBase {

    private static final Color color = YamlConverter.doConvert("color.yml", Color.class);

    public static String name() {
        return nextElement(color.getNames());
    }

}
