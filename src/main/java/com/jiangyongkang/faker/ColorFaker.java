package com.jiangyongkang.faker;

import com.jiangyongkang.model.Color;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:49:00
 * Comment:
 */

public class ColorFaker {

    private final static Color color = YamlLoader.read("color", Color.class);

    public static String name() {
        return RandomUtil.nextElement(color.getName());
    }

}
