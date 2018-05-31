import java.util.Scanner;

public class BoilingAndFreezing{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Give in the temperature:");
        int temperature = sc.nextInt();
        if (temperature  >= 100) {
            System.out.println("The water is boiling.");
        }
        else if (temperature  <= 0) {
            System.out.println("The water is freezing.");
        }
        else{
            System.out.println("The water is in normal state.");
        }
    }
    
}
