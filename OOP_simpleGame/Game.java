package OOP_simpleGame;

public class Game {

    protected static void gamePlay(Hero player, Hero bot_1, Hero bot_2, Hero bot_3, Hero bot_4) 
                                    throws InterruptedException {

        String separation = ("........................................................"); 
        
        System.out.println(separation);
        System.out.println(player.getInfo());
        System.out.println(bot_1.getInfo());
        System.out.println(bot_2.getInfo());
        System.out.println(bot_3.getInfo());
        System.out.println(bot_4.getInfo());

        String check = Initialization.getChoiseAttack();
    
        if (check.matches("Warrior")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_1.getName());
            bot_1.getDamage(Hero.rand.nextDouble(20, 35));
        }
        else if (check.matches("Knight")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_2.getName());
            bot_2.getDamage(Hero.rand.nextDouble(20, 35));
        }
        else if (check.matches("Priest")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_3.getName());
            bot_3.getDamage(Hero.rand.nextDouble(20, 35));
        }
        else if (check.matches("Magician")) {
            System.out.printf("%s attacks %s\n", player.getName(), bot_4.getName());
            bot_4.getDamage(Hero.rand.nextDouble(20, 35));
        }
        else {
            System.out.println("\nThere is no such hero.");
            return;
        }


        int stage_1 = Hero.rand.nextInt(1, 5);
        Thread.sleep(700);

        if (bot_1.checkHP() > 0) {
            if (stage_1 == 1) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(20, 35));
            }
            else if (stage_1 == 2 && bot_2.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), bot_2.getName());
                bot_2.getDamage(Hero.rand.nextDouble(20, 35));
            }
            else if (stage_1 == 3 && bot_3.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), bot_3.getName());
                bot_3.getDamage(Hero.rand.nextDouble(20, 35));
            }
            else if (stage_1 == 4 && bot_4.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_1.getName(), bot_4.getName());
                bot_4.getDamage(Hero.rand.nextDouble(20, 35));
            }
            else {
                return;
            }
        }
        
        int stage_2 = Hero.rand.nextInt(1, 5);
        Thread.sleep(700);

        if (bot_2.checkHP() > 0) {
            if (stage_2 == 1) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(12, 20));
            }
            else if (stage_2 == 2 && bot_1.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), bot_1.getName());
                bot_1.getDamage(Hero.rand.nextDouble(12, 20));
            }
            else if ((stage_2 == 3 && bot_3.checkHP() > 0) ) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), bot_3.getName());
                bot_3.getDamage(Hero.rand.nextDouble(12, 20));
            }
            else if ((stage_2 == 4 && bot_4.checkHP() > 0) ) {
                System.out.printf("%s attacks %s\n", bot_2.getName(), bot_4.getName());
                bot_4.getDamage(Hero.rand.nextDouble(12, 20));
            }
            else {
                return;
            }
        }
        

        int stage_3 = Hero.rand.nextInt(1, 5);
        Thread.sleep(700);

        double checkHeal = 22;

        if (bot_3.checkHP() < checkHeal) {
            bot_3.reincarnation();
            System.out.println("Miracle just happened!");
            System.out.println("Priest is alive, well and healthier than ever");
        }
        
        if (bot_3.checkHP() > 0) {
            if (stage_3 == 1) {
                System.out.printf("%s attacks %s\n", bot_3.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_3 == 2 && bot_1.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_3.getName(), bot_1.getName());
                bot_1.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_3 == 3 && bot_2.checkHP() > 0){
                System.out.printf("%s attacks %s\n", bot_3.getName(), bot_2.getName());
                bot_2.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_3 == 4 && bot_4.checkHP() > 0){
                System.out.printf("%s attacks %s\n", bot_3.getName(), bot_4.getName());
                bot_4.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else {
                return;
            }
        }

        int stage_4 = Hero.rand.nextInt(1, 5);
        Thread.sleep(700);

        if (bot_4.checkHP() < checkHeal && Hero.areElixirsEmpty() > 0) {
            System.out.println("Magician is using 1 elixir to heal himself");
            bot_4.useElixir(Magician.removeElixir);
            bot_4.heal();
        }
        
        if (bot_4.checkHP() > 0) {
            if (stage_4 == 1) {
                System.out.printf("%s attacks %s\n", bot_4.getName(), player.getName());
                player.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_4 == 2 && bot_1.checkHP() > 0) {
                System.out.printf("%s attacks %s\n", bot_4.getName(), bot_1.getName());
                bot_1.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_4 == 3 && bot_2.checkHP() > 0){
                System.out.printf("%s attacks %s\n", bot_4.getName(), bot_2.getName());
                bot_2.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else if (stage_4 == 4 && bot_3.checkHP() > 0){
                System.out.printf("%s attacks %s\n", bot_4.getName(), bot_3.getName());
                bot_3.getDamage(Hero.rand.nextDouble(10, 20));
            }
            else {
                return;
            }
        }

        Thread.sleep(700);
        
    }

}
