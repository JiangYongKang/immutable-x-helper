package com.jiangyongkang.faker;

import com.jiangyongkang.model.Coffer;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:51:00
 * Comment:
 */

public class CofferFaker {

    private final static Coffer coffer = YamlLoader.read("coffer", Coffer.class);

    public static String variety() {
        return RandomUtil.nextElement(coffer.getVariety());
    }

}
