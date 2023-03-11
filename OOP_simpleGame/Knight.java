package OOP_simpleGame;
 
public class Knight extends Hero {

    public Knight() {
        super (String.format("Hero_Knight #%d", ++Knight.id),150);
    }
}