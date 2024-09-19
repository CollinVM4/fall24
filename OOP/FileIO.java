import java.io.File;
import java.util.*;  // Import the File class

public class FileIO
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What file would you like to open?");
        String filename = scan.nextLine();

        scan.close();

        try
        {
            Scanner fileInput = new Scanner(new File(filename));
            int tests = fileInput.nextInt();
            for (int i=0; i<tests; i++)
            {
                int a = fileInput.nextInt();
                int b = fileInput.nextInt();
                System.out.println(+a);
            }
        }
        catch(Exception e) 
        {
            System.out.println("error w/ file");
        }


        scan.close();

    }
}