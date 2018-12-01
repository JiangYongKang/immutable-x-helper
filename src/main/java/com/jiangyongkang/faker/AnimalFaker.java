package com.jiangyongkang.faker;

import com.jiangyongkang.model.Animal;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:39:00
 * Comment:
 */

public class AnimalFaker {

    private final static Animal animal = YamlLoader.read("animal", Animal.class);

    public static String name() {
        return RandomUtil.nextElement(animal.getName());
    }

}
