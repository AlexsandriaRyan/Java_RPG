package Classes;

public class Rogue extends Player {
    final int hpMod = -2;
    final int atkMod = 5;
    final int defMod = -1;
    final int agilMod = 4;
    static String description = "Rogues are quick, sharp, and calculated. Rogues do not trust and it would be wise to distrust them. Proficient with blades and arrows, they are capable of battling in ranged or melee environments. Although they are powerful, Rogues do not last long in battle.";

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Rogue() {
        // empty params
    }

    public Rogue(int hp, int atk, int def, int agil, String charType, String charName, Weapon weapon) {
        super(hp, atk, def, agil, charType, charName, weapon);
    }

// ---------- SETTERS ------------------------------------------------------------

    @Override
    public void setCharType(String charType) {
        this.charType = "Rogue";
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