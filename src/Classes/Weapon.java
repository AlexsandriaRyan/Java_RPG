package Classes;

public class Weapon {
    static String description;
    static String type;
    int atk = 5;
    int weight = 5;

    public Weapon() {
        // empty params
    }

    public Weapon(int atk, int weight) {
        this.atk = atk;
        this.weight = weight;
    }

// ---------- SETTERS ------------------------------------------------------------


// ---------- GETTERS ------------------------------------------------------------

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getAtk() {
        return atk;
    }

    public int getWeight() {
        return weight;
    }

}
