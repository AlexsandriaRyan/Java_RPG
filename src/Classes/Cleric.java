package Classes;

public class Cleric extends Player {
    final int hpMod = 2;
    final int atkMod = 1;
    final int defMod = 2;
    final int agilMod = -3;
    static String description = "Clerics are known for their use of divine magic, often battling in the service of their god(s). Clerics are capable of magic and physical attacks, and are proficient in melee battle. Not only are they good for casting divine damage, clerics are also known for their ability to learn healing magic.";

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Cleric() {
        // empty params
    }

    public Cleric(int hp, int atk, int def, int agil, String charType, String charName, Weapon weapon) {
        super(hp, atk, def, agil, charType, charName, weapon);
    }

// ---------- SETTERS ------------------------------------------------------------

    @Override
    public void setCharType(String charType) {
        this.charType = "Cleric";
    }

    @Override
    public void modStats() {
        hp = getStat() + hpMod;
        atk = getStat() + atkMod;
        def = getStat() + defMod;
        agil = getStat() + agilMod;
    }

// ---------- GETTERS ------------------------------------------------------------

    @Override
    public String getDescription() {
        return description;
    }
}