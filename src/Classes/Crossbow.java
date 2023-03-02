package Classes;

public class Crossbow extends Weapon {
    final int atkMod = -1;
    final int weightMod = -3;
    static String description = "Crossbows are ranged weapons that use arrows as projectiles. They are lightweight, making them easy to carry.";
    static String type = "Crossbow";

    public Crossbow() {
        // empty params
    }

    public Crossbow(int atk, int weight) {
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
