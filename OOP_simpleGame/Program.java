package OOP_simpleGame;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello Hero!");
        System.out.println("Survive to win!");
        System.out.println("There are 3 characters: ");
        System.out.println("Warrior has highest hp");
        System.out.println("Magician has 3 elixirs to heal");
        System.out.println("Priest has nothing, but miracles often happen with him");

        Scanner in = new Scanner(System.in);
        
        Hero player = Initialization.assign(Initialization.choise);
        Hero bot_1 = new Warrior();
        Hero bot_2 = new Magician();
        Hero bot_3 = new Priest();
        
        Thread.sleep(700);


        System.out.println(player.getInfo());
        System.out.println(bot_1.getInfo());
        System.out.println(bot_2.getInfo());
        System.out.println(bot_3.getInfo());

        Thread.sleep(700);
        
        while (player.checkHP() > 0) {
            Game.gamePlay(player, bot_1, bot_2, bot_3);
            if (bot_1.checkHP() < 0 && bot_2.checkHP() < 0 && bot_3.checkHP() < 0) {
                System.out.println("Congratulations! You have won!");
                break;
            }
        }
        if (player.checkHP() < 0) {
            System.out.println("You are dead, try again!");
        }

        in.close();
    }
}