package Classes;
import java.util.Random;

public abstract class Character {
    public int hp;
    public int atk;
    public int def;
    public int agil;

// ---------- CONSTRUCTOR ------------------------------------------------------------

    public Character() {
        // empty params
    }

    public Character(int hp, int atk, int def, int agil) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.agil = agil;
    }

// ---------- SETTERS ------------------------------------------------------------

    public void modStats() {
        // empty; to be overridden
    }

// ---------- GETTERS ------------------------------------------------------------

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getAgil() {
        return agil;
    }

    public int getStat() {
        int min = 10;
        int max = 15;
        Random rand = new Random();

        return rand.nextInt(max-min) + min;
    }
}