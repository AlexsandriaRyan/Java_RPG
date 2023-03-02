package Classes;
import java.util.Random;

public class Monster extends Character {
    final int minMod = -3;
    final int maxMod = 3;
    public String monsterName;

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Monster() {
        // empty params
    }

    public Monster(int hp, int atk, int def, int agil, String monsterName) {
        super(hp, atk, def, agil);
        this.monsterName = monsterName;
    }

// ---------- SETTERS ------------------------------------------------------------

    public void setMonsterName() {

        String[] names = {"Jeff Bezos", "Bill Gates", "Mark Zuckerberg"};
        Random rand = new Random();
        monsterName = names[rand.nextInt(0,3)];
        this.monsterName = monsterName;
    }

    @Override
    public void modStats() {

        Random rand = new Random();
        hp = getStat() + (rand.nextInt(maxMod-minMod) + minMod);
        atk = getStat() + (rand.nextInt(maxMod-minMod) + minMod);
        def = getStat() + (rand.nextInt(maxMod-minMod) + minMod);
        agil = getStat() + (rand.nextInt(maxMod-minMod) + minMod);
    }

// ---------- GETTERS ------------------------------------------------------------

    public String getMonsterName() {
        return monsterName;
    }
}

