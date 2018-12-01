package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.DotaFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-02 00:24:00
 * Comment:
 */

public class DotaFakerTest {

    @Test
    public void heroTest() {
        Assert.assertNotNull(DotaFaker.hero());
    }

    @Test
    public void playerTest() {
        Assert.assertNotNull(DotaFaker.player());
    }

    @Test
    public void teamTest() {
        Assert.assertNotNull(DotaFaker.team());
    }

}
