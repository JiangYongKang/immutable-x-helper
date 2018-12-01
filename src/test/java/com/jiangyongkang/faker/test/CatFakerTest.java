package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.CatFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-02 00:01:00
 * Comment:
 */

public class CatFakerTest {

    @Test
    public void nameTest() {
        Assert.assertNotNull(CatFaker.name());
    }

    @Test
    public void breedTest() {
        Assert.assertNotNull(CatFaker.breed());
    }

    @Test
    public void registryTest() {
        Assert.assertNotNull(CatFaker.registry());
    }

}
