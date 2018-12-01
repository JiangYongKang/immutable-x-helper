package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.AnimalFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-01 23:58:00
 * Comment:
 */

public class AnimalFakerTest {

    @Test
    public void nameTest() {
        Assert.assertNotNull(AnimalFaker.name());
    }

}
