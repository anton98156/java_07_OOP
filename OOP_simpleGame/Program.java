package OOP_simpleGame;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        
        Hero player = Initialization.assign(Initialization.choise);
        Hero bot_1 = new Warrior();
        Hero bot_2 = new Knight();
        Hero bot_3 = new Priest();
        Hero bot_4 = new Magician();

        Thread.sleep(700);
        
        while (player.checkHP() > 0) {
            Game.gamePlay(player, bot_1, bot_2, bot_3, bot_4);
            if (bot_1.checkHP() < 0 && bot_2.checkHP() < 0 && bot_4.checkHP() < 0) {
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