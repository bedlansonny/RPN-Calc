public class ArrayStack implements IStack
{
    int top;
    private double[] arr;

    public ArrayStack(int size)
    {
        arr = new double[size];
        top = -1;
    }

    public void push(double value)
    {
        if(!isFull())
        {
            top++;
            arr[top] = value;
        }
    }

    public double pop()
    {
        if(top != -1)
        {
            top--;
            return arr[top + 1];
        }
        else
        {
            return 0;
        }
    }

    public double peek()
    {
        if(top != -1)
        {
            return arr[top];
        }
        else
        {
            return 0;
        }
    }

    public int size()
    {
        return top + 1;
    }

    public boolean isEmpty()
    {
        return top == - 1;
    }

    public boolean isFull()
    {
        return top == arr.length  - 1;
    }

    public void clear()
    {
        top = -1;
    }

    public String toString()
    {
        if(top == -1)
        {
            return "[]";
        }

        String output = "[";
        for (int i = 0; i < top; i++)
        {
            output += arr[i] + ", ";
        }
        output += arr[top] + "]";

        return output;
    }


}
