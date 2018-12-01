package com.jiangyongkang.faker;

import com.jiangyongkang.model.Cat;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:47:00
 * Comment:
 */

public class CatFaker {

    private final static Cat cat = YamlLoader.read("cat", Cat.class);

    public static String name() {
        return RandomUtil.nextElement(cat.getName());
    }

    public static String breed() {
        return RandomUtil.nextElement(cat.getBreed());
    }

    public static String registry() {
        return RandomUtil.nextElement(cat.getRegistry());
    }

}
