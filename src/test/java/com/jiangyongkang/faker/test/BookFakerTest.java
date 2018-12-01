package com.jiangyongkang.faker.test;

import com.jiangyongkang.faker.BookFaker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Author: vincent
 * Date: 2018-12-01 23:59:00
 * Comment:
 */

public class BookFakerTest {

    @Test
    public void nameTest() {
        Assert.assertNotNull(BookFaker.title());
    }

}
