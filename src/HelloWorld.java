import java.io.*;
import java.util.*;
public class HelloWorld
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while(true)
        {
            System.out.print("Would you like to add a name? (y/n)  ");
            String response = kb.nextLine();
            if(response.equalsIgnoreCase("n"))
                break;

        }
    }
}