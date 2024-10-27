/*
    - Collin Van Meter
    - COP3330 - OOP
    - Assignment 5: Stacks
    - oct, 27th 2024
*/


import java.util.Stack;

public class WordScramble 
{
    // declare and init stack object
    private static Stack<Character> stk = new Stack<>();

    // encode method
    public static String encode(String s)
    {

        StringBuilder output = new StringBuilder();

        // iterate over string
        for(int i = 0; i < s.length(); i++)
        {
            // get char
            char curChar;
            curChar = s.charAt(i);

            // vowels 
            if ("aeiou".indexOf(curChar) != -1) 
            {
                // add to stack 
                stk.push(curChar);
            }

            // consonants
            if ("bcdfghjklmnpqrstvwxyz".indexOf(curChar) != -1) 
            {
                // place directly into output variable
                output.append(curChar);
            }

            // ending
            if (curChar == '2')
            {
                // pop stk
                output.append(stk.pop());
            }

        }

        return output.toString();
    }

    // for graders :)
    public static void main(String[] args) 
    {
        System.out.println(encode("1top2"));
        System.out.println(encode("11top2e1cat22"));
        System.out.println(encode("111tom2op2it2"));
        System.out.println(encode("11top2i1tom22"));
    }

}
