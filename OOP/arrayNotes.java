/*



*/

import java.util.*; // includes a lot of common commands ex. scanner, arrays





public class arrayNotes
{
    // this is a static method
    public static void function1(int x)
    {
        x = x + 2;
    }

    public static void main(String[] args) throws Exception
    {

        int x = 5;
        function1(x);
        System.out.println(x);

        int[] arrayName = new int[5]; // when making a datatype/object use keyword new

        Arrays.fill(arrayName, 42); // replaces array values with target


        // by default integer arrays will default to the value 0.
        for(int i=0; i < arrayName.length; i++)
        {
            System.out.println(arrayName[i]);
        }


    }
}

