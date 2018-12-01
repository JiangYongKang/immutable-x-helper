package com.jiangyongkang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-12-01 23:46:00
 * Comment:
 */

public class Cat {

    private List<String> name = new ArrayList<>();

    private List<String> breed = new ArrayList<>();

    private List<String> registry = new ArrayList<>();

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getBreed() {
        return breed;
    }

    public void setBreed(List<String> breed) {
        this.breed = breed;
    }

    public List<String> getRegistry() {
        return registry;
    }

    public void setRegistry(List<String> registry) {
        this.registry = registry;
    }
}
