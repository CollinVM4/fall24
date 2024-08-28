/*
    - Collin Van Meter
    - COP3330 OOP
    - Aug 30, 2024
    - Assignment 0 
*/

import java.util.Scanner;

public class Daytona 
{
    public static void main(String[] args) throws Exception 
    {

        // opening text
        System.out.println("Welcome to Daytona Beach!");

        
        // setup and init vars/scanner
        Scanner scan = new Scanner(System.in);
        int optionSelected = 0;

        // main while statement to read input and deal with cases
        while (optionSelected != 4) 
        {
            // print menu
            System.out.println("What would you like to do?");
            System.out.println("1. Drive on the Beach");
            System.out.println("2. Play Disc Golf");
            System.out.println("3. See the race.");
            System.out.println("4. Exit");

            // scan user input
            optionSelected = scan.nextInt();

            // if statements to deal with cases 1,2,3
            if (optionSelected == 1)
            {
                // beach case
                System.out.println("What time did Knightro get to the beach?");
                int timeInput = scan.nextInt();
                if (timeInput <= 18 && timeInput >= 9)
                {
                    System.out.println("Yay! The beach is open.");
                } 
                else 
                {
                    System.out.println("Oh no! The beach is closed.");
                }
            }
            else if (optionSelected == 2)
            {
                // disc golf case
                System.out.println("Welcome to the park!");
                int primeNum = 401;
                while (primeNum != 0)
                {
                    System.out.println("There are " + primeNum + " feet left until the basket.");
                    System.out.println("How far did you throw?");
                    int distanceThrown = scan.nextInt();
                    primeNum -= distanceThrown;
                    primeNum = Math.abs(primeNum);
                }

                System.out.println("You made it in!");
            }
            else if (optionSelected == 3)
            {
                // race case
                System.out.println("How many laps are left?");
                int lapsLeft = scan.nextInt();
                while (lapsLeft > 0)
                {
                    System.out.println("There are " + lapsLeft + " laps left.");
                    lapsLeft--;
                }
            } 
            else 
            {
                // non valid input
            }
        }

        System.out.println("Goodbye");

        scan.close(); // close scanner
    }
}