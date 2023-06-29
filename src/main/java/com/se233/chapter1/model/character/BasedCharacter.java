package com.se233.chapter1.model.character;

import com.se233.chapter1.model.DamageType;
import com.se233.chapter1.model.item.Armor;
import com.se233.chapter1.model.item.Weapon;

public class BasedCharacter {
    protected String name, imgpath;
    protected DamageType type;

    protected Integer fullHp, basedPow, basedDef, basedRes;
    protected Integer hp, power, defense, resistance;
    protected Weapon weapon;
    protected Armor armor;

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imgpath;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getFullHp() {
        return fullHp;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }

    @Override
    public String toString() {
        return name;
    }

    public DamageType getType() {
        return type;
    }
}
