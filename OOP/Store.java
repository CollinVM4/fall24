/*
    Collin Van Meter
    OOP 3330, OOP
    Oct 20, 2024
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class Store 
{
    public static void main(String[] args) 
    {
        // linked list setup 
        LinkedList<Customer> checkoutLine = new LinkedList<>();
        LinkedList<Customer> returnLine = new LinkedList<>();

        // user input for file name 
        Scanner input = new Scanner(System.in);
        System.out.println("What file would you like to open?");
        String fileName = input.nextLine();

        // open file, load lists w/ customers
        try 
        {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int numCustomers = Integer.parseInt(fileScanner.nextLine().trim());

            for (int i = 0; i < numCustomers; i++) 
            {
                String line = fileScanner.nextLine();
                String[] data = line.split(" ");

                String name = data[0].trim();
                boolean isReturning = Boolean.parseBoolean(data[1].trim());

                checkoutLine.add(new Customer(name, isReturning));
            }
            fileScanner.close();
            
        } 

        catch (FileNotFoundException e) 
        {
            System.out.println("error w/ file");
            return;
        }

    
        while (!checkoutLine.isEmpty() || !returnLine.isEmpty()) 
        {
            // process 2 purchases for every 1 return 
            for (int i = 0; i < 2 && !checkoutLine.isEmpty(); i++) 
            {
                Customer cur = checkoutLine.removeFirst();

                // returns
                if (cur.getBusiness()) 
                {
                    System.out.println(cur.getName() + " was forwarded to return line.");
                    returnLine.add(cur); 
                }
                // checkouts
                else                            
                {
                    System.out.println(cur.getName() + " checked out");
                }
            }

            if (!returnLine.isEmpty()) 
            {
                Customer cur = returnLine.removeFirst();
                System.out.println(cur.getName() + " returned an item");
            }

        }
    }
}