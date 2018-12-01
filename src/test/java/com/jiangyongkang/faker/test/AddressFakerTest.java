package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.AddressFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-01 23:53:00
 * Comment:
 */

public class AddressFakerTest {

    @Test
    public void cityTest() {
        Assert.assertNotNull(AddressFaker.city());
    }

    @Test
    public void provinceTest() {
        Assert.assertNotNull(AddressFaker.province());
    }

}
