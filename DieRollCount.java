﻿import java.util.Random;
import java.util.Scanner;
public class DieRollCount {
    public static void main(String[] args) {
        Random rand= new Random(); 
        int die = rand.nextInt(6)+1;
        int count = 0;
        while (die != 6) {
            System.out.println(die + " is rolled.");
            count++;
            die = rand.nextInt(6)+1;
        }
        System.out.println("You had to roll " + count + " times before getting a 6.");
    }
    
}
