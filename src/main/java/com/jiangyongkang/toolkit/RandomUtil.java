package com.jiangyongkang.toolkit;

import java.util.List;
import java.util.Random;

/**
 * Author: vincent
 * Date: 2018-12-01 22:26:00
 * Comment:
 */

public class RandomUtil {

    private final static Random random = new Random();

    public static <T> T nextElement(List<T> list) {
        return list.get(nextInt(list.size()));
    }

    public static int nextInt(int n) {
        return random.nextInt(n);
    }

}
