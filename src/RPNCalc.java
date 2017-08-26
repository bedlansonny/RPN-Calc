import java.io.*;
import java.util.*;
public class RPNCalc
{
    public static void main(String args[]) throws FileNotFoundException
    {
        File file = new File(System.getProperty("user.dir") + "\\src\\input.txt");
        Scanner sc = new Scanner(file);

        //I chose 10 randomly. The most obvious flaw in this mini project is not changing size.
        ArrayStack stack = new ArrayStack(10);

        while(sc.hasNextDouble())
        {
            stack.push(sc.nextDouble());
        }

        while(sc.hasNext())
        {
            String oper = sc.next();
            double b = stack.pop();
            double a = stack.pop();

            if(oper.equals("+"))
            {
                stack.push(a + b);
            }
            else if(oper.equals("-"))
            {
                stack.push(a - b);
            }
            else if(oper.equals("*"))
            {
                stack.push(a * b);
            }
            else if(oper.equals("/"))
            {
                stack.push(a / b);
            }
        }

        if(stack.size() != 1)
        {
            System.out.println("ERROR: improper amount of numbers and operators.");
            System.out.println(stack);
        }
        else
        {
            System.out.println(stack.peek());
        }

    }
}
