package OOP_simpleGame;

public class Warrior extends Hero {

    public Warrior() {
        super (String.format("Hero_Warrior #%d", ++Knight.id), 130);
    }
}
