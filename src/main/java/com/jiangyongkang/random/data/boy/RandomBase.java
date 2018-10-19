package com.jiangyongkang.random.data.boy;

import java.util.List;
import java.util.Random;

/**
 * Author: vincent
 * Date: 2018-10-19 11:00:00
 * Comment:
 */

public class RandomBase {

    private static final Random random = new Random();

    static <T> T nextElement(List<T> collection) {
        int randomIndex = random.nextInt(collection.size());
        return collection.get(randomIndex);
    }

}
