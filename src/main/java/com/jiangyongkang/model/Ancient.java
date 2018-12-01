package com.jiangyongkang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-12-01 23:23:00
 * Comment:
 */

public class Ancient {

    private List<String> god = new ArrayList<>();

    private List<String> primordial = new ArrayList<>();

    private List<String> titan = new ArrayList<>();

    private List<String> hero = new ArrayList<>();

    public List<String> getGod() {
        return god;
    }

    public void setGod(List<String> god) {
        this.god = god;
    }

    public List<String> getPrimordial() {
        return primordial;
    }

    public void setPrimordial(List<String> primordial) {
        this.primordial = primordial;
    }

    public List<String> getTitan() {
        return titan;
    }

    public void setTitan(List<String> titan) {
        this.titan = titan;
    }

    public List<String> getHero() {
        return hero;
    }

    public void setHero(List<String> hero) {
        this.hero = hero;
    }
}
