import java.util.Random;
import java.util.Scanner;
public class Fighting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Attack Points of Monster:");
        int monsterAttack = scan.nextInt();
        System.out.println("Defense Points of Monster:");
        int monsterDefense = scan.nextInt();
        System.out.println("Damage of Monster:");
        int monsterDamage = scan.nextInt();
        System.out.println("Life Points of Monster:");
        int monsterLife = scan.nextInt();
        
        System.out.println("Your Attack Points:");
        int yourAttack = scan.nextInt();
        System.out.println("Your Defense Points:");
        int yourDefense = scan.nextInt();
        System.out.println("Your Damage:");
        int yourDamage = scan.nextInt();
        System.out.println("Your Life Points:");
        int yourLife = scan.nextInt();
        
        Random rand= new Random();
        boolean attacker = rand.nextBoolean();
        if (attacker) {
            System.out.println("You attack");
            int dice = rand.nextInt(6)+ rand.nextInt(6)+ 2;
            int attackValue = yourAttack + dice;
            System.out.println("Rolled values: "+dice);
            System.out.println("Your attack value: " + attackValue);
            if (attackValue > monsterDefense) {
                System.out.println("Your attack was successful.");
                monsterLife = monsterLife - yourDamage;
                System.out.println("Monster's remaining Life Points: " + monsterLife);
            } else {
                System.out.println("Your attack was not successful.");
            }
        } else {
            System.out.println("Monster attacks.");
            int dice = rand.nextInt(6) + rand.nextInt(6)+2;
            int attackValue = monsterAttack + dice;
            System.out.println("Rolled values:"+dice);
            System.out.println("Monster's attack value: " + attackValue);
            if (attackValue > yourDefense) {
                System.out.println("Monster's attack was successful.");
                yourLife = yourLife - monsterDamage;
                System.out.println("Your remaining Life Points: " + yourLife);
            } else {
                System.out.println("Monster's attack was not successful.");
            }
        }
    }
    
}
