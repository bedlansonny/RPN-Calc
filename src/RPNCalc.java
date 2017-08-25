import java.io.*;
import java.util.*;
public class RPNCalc
{
    public static void main(String args[]) throws FileNotFoundException
    {
        File file = new File("H:\\CS\\RPNCalc\\src\\input.txt");
        Scanner sc = new Scanner(file);

        ArrayStack stack = new ArrayStack(10);

        while(sc.hasNextDouble())
        {
            stack.push(sc.nextDouble());
        }

        while(sc.hasNext())
        {
            String operator = sc.next();
        }

    }
}
