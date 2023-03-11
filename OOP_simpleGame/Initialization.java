package OOP_simpleGame;
import java.util.Scanner;

public class Initialization {

    protected static String choise;

    static {
        Initialization.choise = getChoise();
    }


    public static Hero assign (String choise) {
        if (choise.matches("Warrior")) {
            return new Warrior();
        }
        else if (choise.matches("Magician")) {
            return new Magician();
        }
        else if (choise.matches("Priest")) {
            return new Priest();
        }
        else {
            System.out.println("There is no such hero.");
            return null;
        }
    }

    private static Scanner Scanner() {
        return new Scanner(System.in);
    }

    protected static String getChoise() {

        System.out.println("Choose character: ");
        String choose = Scanner().nextLine();

        return choose;
    }

    protected static String getChoiseAttack() {
       
        System.out.println("Attack: ");
        String chooseAttack = Scanner().nextLine();

        return chooseAttack;
    }

}