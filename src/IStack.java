/**
 * Defines common Stack methods.
 * 
 * @author Gerald Page 
 * @version 1
 */
public interface IStack
{
    /**
     * The push method should verify there is space on the stack before
     *      taking action. If stack is full, push does nothing.
     *      
     * @param  y    the double value to be pushed on the stack
     */
    void push(double value);
    
    /**
     * The pop method should verify there is a valid value on the stack
     *      before taking action. 
     * Removes and returns the value on the top of the stack.
     * If stack is empty, pop returns zero.
     * 
     * @return  the value from the top of the stack 
     */
    double pop();
    
    /**
     * The peek method should verify there is a valid value on the stack
     *      before taking action. 
     * Returns the value on the top of the stack.
     * If the stack is empty, peek returns zero.
     * 
     * @return  the value from the top of the stack
     */
    double peek();
    
    /**
     * Returns the number of values on the stack.
     * 
     * @return    number of values on the stack 
     */
    int size();
    
    /**
     * Returns true if the stack is empty & false otherwise
     * 
     * @return     true if no values are stored on the stack,
     *             false otherwise
     */
    boolean isEmpty();
    
    /**
     * Returns true if the stack is full & false otherwise
     * 
     * @return     true if no more values will fit on the stack,
     *             false otherwise
     */
    public boolean isFull();
    
    /**
     * Places the stack in an empty condition 
     */
    void clear();
}
