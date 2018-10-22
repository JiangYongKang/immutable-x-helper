package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.AddressData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author: vincent
 * DateTime: 2018/10/22 23:35
 * Comment:
 */

public class AddressTest {

    private static final AddressData addressData = YamlConverter.doConvert("address.yml", AddressData.class);

    @Test
    public void cityTest() {
        Assertions.assertNotNull(Address.city());
        Assertions.assertTrue(addressData.getCity().contains(Address.city()));
    }

    @Test
    public void provinceTest() {
        Assertions.assertNotNull(Address.province());
        Assertions.assertTrue(addressData.getProvince().contains(Address.province()));
    }

}
