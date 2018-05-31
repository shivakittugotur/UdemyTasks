import java.util.Random;
import java.util.Scanner;
public class Fighting2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String monsterName;
        
        int yourAttack = rand.nextInt(6)+5;
        System.out.println("Your Attack Points: " + yourAttack);
        int yourDefense = rand.nextInt(10)+6;
        System.out.println("Your Defense Points: " + yourDefense);
        int yourDamage = rand.nextInt(3)+2;
        System.out.println("Your Damage: " + yourDamage);
        int yourLife = rand.nextInt(20)+25;
        System.out.println("Your Life Points: " + yourLife);
        for (int i = 0; i < 3; i++) {
            int num = rand.nextInt(5);
            switch (num) {
                case 0: monsterName = "Black Daemon"; break;
                case 1: monsterName = "The Rabbit"; break;
                case 2: monsterName = "Silver Dragon"; break;
                case 3: monsterName = "Mountain Troll"; break;
                case 4: monsterName = "Alien"; break;
                default: monsterName = "Sphinx"; break;
            }

            int monsterAttack = rand.nextInt(8)+1;
            System.out.println("Attack Points of "+monsterName+": " + monsterAttack);
            int monsterDefense = rand.nextInt(15)+3;
            System.out.println("Defense Points of "+monsterName+": " + monsterDefense);
            int monsterDamage = rand.nextInt(3)+1;
            System.out.println("Damage of "+monsterName+": " + monsterDamage);
            int monsterLife = rand.nextInt(20)+15;
            System.out.println("Life Points of "+monsterName+":" + monsterLife);
            boolean runaway = false;
        
            do {
                boolean attacker = rand.nextBoolean();
                if (attacker) {
                    System.out.println("You attack");
                    int dice = rand.nextInt(6)+1 + rand.nextInt(6)+1;
                    int attackValue = yourAttack + dice;
                    System.out.println("Rolled values: "+dice);
                    System.out.println("Your attack value: " + attackValue);
                    if (attackValue > monsterDefense) {
                        System.out.println("Your attack was successful.");
                        monsterLife = monsterLife - yourDamage;
                        System.out.println(monsterName+"'s remaining Life Points: " + monsterLife);
                    } else {
                        System.out.println("Your attack was not successful.");
                    }
                } else {
                    System.out.println(monsterName+" attacks.");
                    int dice = rand.nextInt(6)+1 + rand.nextInt(6)+1;
                    int attackValue = monsterAttack + dice;
                    System.out.println("Rolled values:"+dice);
                    System.out.println(monsterName+"'s attack value: " + attackValue);
                    if (attackValue > yourDefense) {
                        System.out.println(monsterName+"'s attack was successful.");
                        yourLife = yourLife - monsterDamage;
                        System.out.println("Your remaining Life Points: " + yourLife);
                    } else {
                        System.out.println(monsterName+"'s attack was not successful.");
                    }
                }
                System.out.println("Please press ENTER! (Or type in 'run' to run away)");
                String command = scan.nextLine();
                switch (command) {
                    case "run":
                        System.out.println("You ran away. You coward! -4 Life Points!");
                        yourLife -= 4;
                        runaway = true;
                        break;
                    default:
                }
            } while (yourLife > 0 && monsterLife > 0 && !runaway);
            if (yourLife <= 0) {
                System.out.println("You are dead. Your advanture finishes here. R.I.P.");
                break; 
				}
            if (monsterLife <= 0) {
                System.out.println("You defeated the "+monsterName+". Congratulations!");
            }
        }
    }
    
}
