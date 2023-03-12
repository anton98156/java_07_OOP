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

    public static double areElixirsEmpty() {
        return Magician.elixir;
    }

    public double checkHP() {
        return (this.hp);
    }

    public String getInfo() {
        return String.format("%s ", this.name);
    }

    public double getDamage(double damage) {
            return (this.hp = this.hp - damage);
        }
    
    public double reincarnation () {
        return (this.hp = 110);
    }

    public double heal () {
        return (this.hp = 50);
    }

    static double removeElixir = 1;
    public double useElixir (double removeElixir) {
        return (Magician.elixir = Magician.elixir - removeElixir);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static String paint (String color) {
        return color;
    }
   
}