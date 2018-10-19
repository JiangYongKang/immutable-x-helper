package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.RandomColor;
import com.jiangyongkang.random.data.boy.YamlConverter;
import com.jiangyongkang.random.data.boy.model.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author: vincent
 * Date: 2018-10-19 13:08:00
 * Comment:
 */

public class RandomColorTests {

    private static final Color color = YamlConverter.doConvert("color.yml", Color.class);

    @Test
    public void nameTest() {
        Assertions.assertNotNull(RandomColor.name());
        Assertions.assertNotEquals(RandomColor.name(), "");
        Assertions.assertTrue(color.getNames().contains(RandomColor.name()));
    }

}
