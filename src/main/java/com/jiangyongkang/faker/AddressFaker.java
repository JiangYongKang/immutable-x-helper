package com.jiangyongkang.faker;

import com.jiangyongkang.model.Address;
import com.jiangyongkang.toolkit.RandomUtil;
import com.jiangyongkang.toolkit.YamlLoader;

/**
 * Author: vincent
 * Date: 2018-12-01 23:02:00
 * Comment:
 */

public class AddressFaker {

    private final static Address address = YamlLoader.read("address", Address.class);

    public static String city() {
        return RandomUtil.nextElement(address.getCity());
    }

    public static String province() {
        return RandomUtil.nextElement(address.getProvince());
    }

}
