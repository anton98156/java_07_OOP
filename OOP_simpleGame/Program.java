package OOP_simpleGame;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    // private boolean start() {
        
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Hello hero!");
    //     System.out.println("There are 3 characters: ");
    //     System.out.println("Warrior - highest damage, high hp, but no elixir to heal");
    //     System.out.println("Magician - middle damage, lowest hp, but 3 elixirs to heal");
    //     System.out.println("Priest - middle damage, highest hp, but only 1 elixir to heal");
    //     System.out.println("Choose your character: ");
    //     String choose_1 = in.nextLine();
    //     in.close();

    //     if (choose_1 == "Warrior" || choose_1 == "Magician" || choose_1 == "Priest"){
            
    //         return true;
    //     }
    //     else {
    //         System.out.println("Try again!");
    //         return false;
    //     }
    // }
      
        Scanner in = new Scanner(System.in);
        System.out.println("Hello hero!");
        System.out.println("There are 3 characters: ");
        System.out.println("Warrior - highest damage, high hp, but no elixir to heal");
        System.out.println("Magician - middle damage, lowest hp, but 3 elixirs to heal");
        System.out.println("Priest - middle damage, highest hp, but only 1 elixir to heal");
        System.out.println("Choose your character: ");
        String choose_1 = in.nextLine();
        in.close();

        if (choose_1 != "Warrior" || choose_1 != "Magician" || choose_1 != "Priest"){
            System.out.println("Try again!");
        }
        // if (choose_1 == "Priest") {
        //     Player hero_1 = new Priest();
        //     System.out.println(hero_1.getInfo());
        // }
        // else if (choose_1 == "Magician") {
        //     Player hero_1 = new Magician();
        //     System.out.println(hero_1.getInfo());
        // }

        Player hero_1 = new Magician();
        System.out.println(hero_1.getInfo());

        Player hero_2 = new Priest();
        System.out.println(hero_2.getInfo());

        // #endregion

        // #region ex2 Attack
        System.out.println("------");
        System.out.println(hero_1.getInfo());
        System.out.println(hero_2.getInfo());

        hero_1.Attack(hero_2);
        
        hero_2.Attack(hero_1);
        System.out.println(hero_1.getInfo());
        System.out.println(hero_2.getInfo());

        double magicianCount = 0;
        double priestCount = 0;
 
        System.out.println();
        System.out.printf("magicalCount: %f priestCount: %f \n\n", magicianCount, priestCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}