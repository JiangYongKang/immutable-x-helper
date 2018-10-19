package com.jiangyongkang.random.data.boy;

import com.jiangyongkang.random.data.boy.model.Address;

/**
 * Author: vincent
 * Date: 2018-10-19 10:24:00
 * Comment:
 */

public class RandomAddress extends RandomBase {

    private static final Address address = YamlConverter.doConvert("address.yml", Address.class);

    public static String city() {
        return nextElement(address.getCity());
    }

}
