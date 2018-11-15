package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.AddressData;
import com.jiangyongkang.random.data.boy.model.CatData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author: vincent
 * DateTime: 2018/11/15 23:22
 * Comment:
 */

public class CatTest {

    private static final CatData catData = YamlConverter.doConvert("cat.yml", CatData.class);

    @Test
    public void nameTest() {
        Assertions.assertNotNull(Cat.name());
        Assertions.assertTrue(catData.getName().contains(Cat.name()));
    }

    @Test
    public void breedTest() {
        Assertions.assertNotNull(Cat.breed());
        Assertions.assertTrue(catData.getBreed().contains(Cat.breed()));
    }

    @Test
    public void registryTest() {
        Assertions.assertNotNull(Cat.registry());
        Assertions.assertTrue(catData.getRegistry().contains(Cat.registry()));
    }

}
