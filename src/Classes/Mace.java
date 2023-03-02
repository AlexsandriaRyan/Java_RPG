package Classes;

public class Mace extends Weapon {
    final int atkMod = 2;
    final int weightMod = 2;
    static String description = "Maces are blunt weapons, similar to a club. They are hard, heavy, and spiked for maximum damage.";
    static String type = "Mace";

    public Mace() {
        // empty params
    }

    public Mace(int atk, int weight) {
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
