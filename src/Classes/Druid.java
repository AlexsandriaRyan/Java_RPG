package Classes;

public class Druid extends Player {
    final int hpMod = 3;
    final int atkMod = 0;
    final int defMod = 3;
    final int agilMod = -2;
    static String description = "Druids are one with nature. Capable of shape shifting into wildlife, Druids are magical beings with a big heart. They are large in stature, making for great tanks that last long in battle. Druids can be relied on to preserve balance in the world, as their decisions are often just and well-thought.";

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Druid() {
        // empty params
    }

    public Druid(int hp, int atk, int def, int agil, String charType, String charName, Weapon weapon) {
        super(hp, atk, def, agil, charType, charName, weapon);
    }

// ---------- SETTERS ------------------------------------------------------------

    @Override
    public void setCharType(String charType) {
        this.charType = "Druid";
    }

    @Override
    public void modStats() {
        hp = getStat() + hpMod;
        atk = getStat() + atkMod;
        def = getStat() + defMod;
        agil = getStat() + agilMod;
    }

// ---------- GETTERS ------------------------------------------------------------

    public String getDescription() {
        return description;
    }
}