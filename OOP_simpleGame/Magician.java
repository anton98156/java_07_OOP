package OOP_simpleGame;
 
public class Magician extends Player {

    private double mana;
    private double maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.id),
                Magician.rand.nextDouble(100, 200));
        this.maxMana = Magician.rand.nextDouble(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %f",super.getInfo(), this.mana);
    }
}