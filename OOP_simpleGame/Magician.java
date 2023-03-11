package OOP_simpleGame;
 
public class Magician extends Hero {

    protected static double elixir;
    protected double maxElixir;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.id), 80);
        this.maxElixir = 2;
        Magician.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %f", super.getInfo(), Magician.elixir);
    }
    
}
