package OOP_simpleGame;
 
public class Priest extends Player {

    private double elixir;
    private double maxElixir;

    protected Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.id),
                Magician.rand.nextDouble(100, 200));
        this.maxElixir = Magician.rand.nextDouble(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %f", super.getInfo(), this.elixir);
    }
}
