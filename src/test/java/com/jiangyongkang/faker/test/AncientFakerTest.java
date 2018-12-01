package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.AncientFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-01 23:56:00
 * Comment:
 */

public class AncientFakerTest {

    @Test
    public void godTest() {
        Assert.assertNotNull(AncientFaker.god());
    }

    @Test
    public void primordialTest() {
        Assert.assertNotNull(AncientFaker.primordial());
    }

    @Test
    public void titanTest() {
        Assert.assertNotNull(AncientFaker.titan());
    }

    @Test
    public void heroTest() {
        Assert.assertNotNull(AncientFaker.hero());
    }

}
