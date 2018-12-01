package com.jiangyongkang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-12-01 23:00:00
 * Comment:
 */

public class Address {

    private List<String> city = new ArrayList<>();

    private List<String> province = new ArrayList<>();

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public List<String> getProvince() {
        return province;
    }

    public void setProvince(List<String> province) {
        this.province = province;
    }
}
