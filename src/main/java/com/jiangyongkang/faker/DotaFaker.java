package com.jiangyongkang.faker;

import com.jiangyongkang.model.Dota;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-02 00:22:00
 * Comment:
 */

public class DotaFaker {

    private final static Dota dota = YamlLoader.read("dota", Dota.class);

    public static String hero() {
        return RandomUtil.nextElement(dota.getHero());
    }

    public static String player() {
        return RandomUtil.nextElement(dota.getPlayer());
    }

    public static String team() {
        return RandomUtil.nextElement(dota.getTeam());
    }

}
