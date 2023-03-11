package OOP_simpleGame;

public class Warrior extends Hero {
    private double armor;
    private double maxArmor;

    public Warrior() {
        super (String.format("Hero_Warrior #%d", ++Magician.id),200);
        this.maxArmor = 100;
        this.armor = maxArmor;
    }

    public String getInfo() {
        return String.format("%s  Armor: %f", super.getInfo(), this.armor);
    }
}
