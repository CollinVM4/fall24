import java.util.Stack;

public class StackExamples
{
    public static void main(String[] args) throws Exception
    {
        Stack<String> pancakes = new Stack<String>();

        String taste = "";
        StringBuilder str = new StringBuilder();

        pancakes.add("pancake");
        pancakes.add("butter");
        pancakes.add("pancake");
        pancakes.add("syrup");

        while (!pancakes.isEmpty())
        {
            str.append(pancakes.peek());
            taste += (pancakes.pop());
        }
        System.out.println(taste);
        System.out.println(str.toString());
    }
}