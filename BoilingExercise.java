import java.util.*;

public class BoilingExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give in the temperature:");
        int temperature = scan.nextInt();
        if (temperature >= 100)
            System.out.println("The water is boiling.");
        else
            System.out.println("The water is not boiling.");
    }
    
}