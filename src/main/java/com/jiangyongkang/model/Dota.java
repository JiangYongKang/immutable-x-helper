package com.jiangyongkang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vincent
 * Date: 2018-12-02 00:21:00
 * Comment:
 */

public class Dota {

    private List<String> hero = new ArrayList<>();

    private List<String> player = new ArrayList<>();

    private List<String> team = new ArrayList<>();

    public List<String> getHero() {
        return hero;
    }

    public void setHero(List<String> hero) {
        this.hero = hero;
    }

    public List<String> getPlayer() {
        return player;
    }

    public void setPlayer(List<String> player) {
        this.player = player;
    }

    public List<String> getTeam() {
        return team;
    }

    public void setTeam(List<String> team) {
        this.team = team;
    }
}
