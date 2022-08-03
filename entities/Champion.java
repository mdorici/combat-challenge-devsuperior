package entities;

public class Champion<champion> {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {
    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage;
        if(armor > other.attack) {
            damage = 1;
        }
        else {
            damage = other.attack - armor;
        }
        life = life - damage;
    }

    public String status() {
        if(life > 0) {
            return String.format(name + ": " + life + " life %n");
        }
        else {
            return String.format(name + ": 0 life (died)%n");
        }
    }
}