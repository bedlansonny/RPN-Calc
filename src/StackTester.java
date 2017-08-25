
/**
 * Simple test calls for quick check of ArrayStack class.
 * 
 * @author Gerald Page
 * @version 2
 */
public class StackTester
{
    public static void main(String[] args)
    {
        // Test: Create stack
        ArrayStack stack = new ArrayStack(10);
        System.out.println("Stack has " + stack.size() + " items.");
        
        // Test: push to stack
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        System.out.println("\nPushed 3 items to stack.");
        // Prints memory reference w/o toString override
        System.out.println("Stack contents: " + stack);
        
        // Test: pop stack
        double d = stack.pop();
        System.out.println("\nPopped from top of stack: " + d);
        System.out.println("Stack contents: " + stack);
        
        // Test: clear stack
        stack.clear();
        System.out.println("\nStack was cleared.");
        System.out.println("Stack contents: " + stack);
        
        // Test: peek/pop to stack
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        System.out.println("\nPushed 3 items to stack.");
        System.out.println("Stack contents: " + stack);
        System.out.println("Peeked from top of stack: " + stack.peek());
        double d1 = stack.pop();
        double d2 = stack.pop();
        System.out.println("Popped from top of stack: " + d1);
        System.out.println("Popped again from top of stack: " + d2);
        System.out.println("\nPeeked from top of stack: " + stack.peek());
        System.out.println("Stack contents: " + stack);
    }
}
