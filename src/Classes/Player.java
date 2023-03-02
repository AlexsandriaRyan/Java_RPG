package Classes;

public class Player extends Character {
    public String charType;
    public String charName;
    public Weapon weapon = new Weapon();
    public String description;

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Player() {
        // empty params
    }

    public Player(int hp, int atk, int def, int agil, String charType, String charName, Weapon weapon) {
        super(hp, atk, def, agil);
        this.charType = charType;
        this.charName = charName;
        this.weapon = weapon;
    }

// ---------- SETTERS ------------------------------------------------------------
    public void setCharType(String charType) {
        this.charType = charType;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


// ---------- GETTERS ------------------------------------------------------------

    public String getCharType() {
        return charType;
    }

    public String getCharName() {
        return charName;
    }

    public String getDescription() {
        return description;
    }

}
