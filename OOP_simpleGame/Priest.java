package OOP_simpleGame;
 
public class Priest extends Hero {

    private double elixir;
    private double maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.id),100);
        this.maxElixir = 100;
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %f", super.getInfo(), this.elixir);
    }
}
