package OOP_simpleGame;
import java.util.Random;
 
public class Hero {

    protected static Random rand;
    protected static long id;
    protected String name;
    protected double maxhp;
    protected double hp;

    static {
        Hero.id = 0;
        Hero.rand = new Random();
    }

    public Hero (String name, double hp) {
        this.name = name;
        this.maxhp = hp;
        this.hp = maxhp;
    }

    public String getName() {
        return String.format("%s", this.name);
    }

    public double checkHP() {
        return (this.hp);
    }

    public String getInfo() {
        return String.format("%s Hp: %f", this.name, this.hp);
    }

    public double getDamage(double damage) {
            return (this.hp = this.hp - damage);
        }

}