package OOP_simpleGame;

public class Priest extends Hero {

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.id),80);
    }
    
}
