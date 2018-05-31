import java.util.Scanner;
public class CheckaDie{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int die;
        do {
            System.out.println("Please give in the value of the die:");
            die = scan.nextInt();
            if (die < 1 || die > 6) {
                System.out.println("The value of the die is bad.");
            }
        } while (die < 1 || die > 6);
    }
    
}
