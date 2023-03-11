package OOP_simpleGame;

public class Game {

    protected static void gamePlay(Hero player, Hero bot_1, Hero bot_2, Hero bot_3) 
                                    throws InterruptedException {

        String separation = 
                ("........................................................"); 
                System.out.println(separation);
        
        
        String check = Initialization.getChoiseAttack();
    
        if (check.matches("Warrior")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_1.getName());
            bot_1.getDamage(Hero.rand.nextDouble(15, 30));
        }
        else if (check.matches("Magician")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_2.getName());
            bot_2.getDamage(Hero.rand.nextDouble(15, 30));
        }
        else if (check.matches("Priest")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_3.getName());
            bot_3.getDamage(Hero.rand.nextDouble(15, 30));
        }
        else {
            System.out.println("There is no such hero.");
            return;
        }


        int stage_1 = Hero.rand.nextInt(1, 4);
        Thread.sleep(700);

        if (bot_1.checkHP() > 0) {
            if (stage_1 == 1) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if (stage_1 == 2 && bot_2.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), bot_2.getName());
                bot_2.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if (stage_1 == 3 && bot_3.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), bot_3.getName());
                bot_3.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else {
                return;
            }
        }
        
        int stage_2 = Hero.rand.nextInt(1, 4);
        Thread.sleep(700);

        if (bot_2.checkHP() > 0) {
            if (stage_2 == 1) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if (stage_2 == 2 && bot_1.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), bot_1.getName());
                bot_1.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if ((stage_2 == 3 && bot_3.checkHP() > 0) ) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), bot_3.getName());
                bot_3.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else {
                return;
            }
        }
        

        int stage_3 = Hero.rand.nextInt(1, 4);
        Thread.sleep(700);

        if (bot_3.checkHP() > 0) {
            if (stage_3 == 1) {
                System.out.printf("%s attacks %s\n", bot_3.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if (stage_3 == 2 && bot_1.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_3.getName(), bot_1.getName());
                bot_1.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else if (stage_3 == 3 && bot_2.checkHP() > 0){
                System.out.printf("%s attacks %s\n", bot_3.getName(), bot_2.getName());
                bot_2.getDamage(Hero.rand.nextDouble(15, 30));
            }
            else {
                return;
            }
        }

        Thread.sleep(700);
        
        System.out.println(separation);
        System.out.println(player.getInfo());
        System.out.println(bot_1.getInfo());
        System.out.println(bot_2.getInfo());
        System.out.println(bot_3.getInfo());
    }
}
