package Classes;

public class Sword extends Weapon {
    final int atkMod = 0;
    final int weightMod = 0;
    static String description = "Swords are melee weapons that are strong and sharp. They are a standard weapon for most adventurers.";
    static String type = "Sword";

    public Sword() {
        // empty params
    }

    public Sword(int atk, int weight) {
        super(atk, weight);
    }

// ---------- SETTERS ------------------------------------------------------------


// ---------- GETTERS ------------------------------------------------------------

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getAtk() {
        return atk + atkMod;
    }

    @Override
    public int getWeight() {
        return weight + weightMod;
    }
}
