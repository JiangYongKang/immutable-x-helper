package com.jiangyongkang.faker;

import com.jiangyongkang.model.Ancient;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:29:00
 * Comment:
 */

public class AncientFaker {

    private final static Ancient ancient = YamlLoader.read("ancient", Ancient.class);

    public static String god() {
        return RandomUtil.nextElement(ancient.getGod());
    }

    public static String primordial() {
        return RandomUtil.nextElement(ancient.getPrimordial());
    }

    public static String titan() {
        return RandomUtil.nextElement(ancient.getTitan());
    }

    public static String hero() {
        return RandomUtil.nextElement(ancient.getHero());
    }

}
