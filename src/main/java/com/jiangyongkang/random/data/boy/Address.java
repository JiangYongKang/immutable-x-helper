package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.AddressData;

/**
 * Author: vincent
 * Date: 2018-10-19 10:24:00
 * Comment:
 */

public class Address extends RandomBase {

    private static final AddressData addressData = YamlConverter.doConvert("address.yml", AddressData.class);

    public static String city() {
        return nextElement(addressData.getCity());
    }

    public static String province() {
        return nextElement(addressData.getProvince());
    }

}
