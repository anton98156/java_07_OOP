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
        else if (choise.matches("Knight")) {
            System.out.println("\nOnly warrior is free");
            System.out.println("If you want to play as a Magician, buy this game!\n");
            return null;
        }
        else if (choise.matches("Magician")) {
            System.out.println("\nOnly warrior is free");
            System.out.println("If you want to play as a Magician, buy this game!\n");
            return null;
        }
        else if (choise.matches("Priest")) {
            System.out.println("\nOnly warrior is free");
            System.out.println("If you want to play as a Priest, buy this game!\n");
            return null;
        }
        else {
            System.out.println("\nThere is no such hero\n");
            return null;
        }
    }

    private static Scanner Scanner() {
        return new Scanner(System.in);
    }

    protected static String getChoise() {

        System.out.println("\nHello Hero!");
        System.out.println("Survive to win!");
        System.out.println("There are 3 characters: ");
        System.out.println("Warrior has many health points and the highest damage");
        System.out.println("Knight has high damage the highest health points");
        System.out.println("Magician has 2 elixirs to heal himself");
        System.out.println("Priest has nothing, but miracles often happen with him");
        System.out.println("Priest can stay alive. You will achieve a victory in such case as well");
        System.out.println("Choose your character: \n");
        String choose = Scanner().nextLine();

        return choose;
    }

    protected static String getChoiseAttack() {
       
        System.out.println("\nAttack: ");
        String chooseAttack = Scanner().nextLine();

        return chooseAttack;
    }

}