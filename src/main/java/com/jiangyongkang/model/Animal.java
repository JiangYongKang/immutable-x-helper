package com.jiangyongkang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-12-01 23:38:00
 * Comment:
 */

public class Animal {

    private List<String> name = new ArrayList<>();

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }
}
