package OOP_simpleGame;
 
public class Magician extends Hero {

    private double mana;
    private double maxMana;

    public Magician() {
        super (String.format("Hero_Magician #%d", ++Magician.id),100);
        this.maxMana = 100;
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %f", super.getInfo(), this.mana);
    }
}