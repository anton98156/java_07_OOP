package OOP_simpleGame;

import java.util.Random;
 
public class Player {

    protected static Random rand;
    protected static long id;
    protected String name;
    protected volatile double hp;
    protected volatile double minHp;
    protected volatile double maxHp;

    static {
        Player.id = 0;
        Player.rand = new Random();
    }

    protected Player (String name) {
        this.name = name;
    }

    protected Player(String name, double hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    protected Player() {
        this(String.format("Hero_Priest #%f", ++Player.id), 
                Player.rand.nextDouble(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %f  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(double Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void getDamage(double damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(Player target) {
        double damage = Player.rand.nextDouble(10, 20);
        target.getDamage(damage);
    }
}