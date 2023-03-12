package OOP_simpleGame;

public class Priest extends Hero {

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.id),100);
    }

    public String getInfo() {
        return String.format("%s Hp: %f", super.getName(), this.hp);
    }
    
}
