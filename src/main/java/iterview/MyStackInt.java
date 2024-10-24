package iterview;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyStackInt {
	private final LinkedList<Integer> stack;
    private final LinkedList<Integer> maxStack;
	public MyStackInt() {
        stack = new LinkedList<>();
        maxStack = new LinkedList<>();
    }
	public void push(int num) {
        //TODO
		//adds num into top of stack (last element)
		stack.addLast(num);
        if (maxStack.isEmpty() || num >= maxStack.getLast()) {
            maxStack.addLast(num);
        }
	}
	public int pop() {
        //TODO
		//removes element from top of stack (last element)
		//returns being removed number
		//throws exception if the stack is empty
		if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        int num = stack.removeLast();
        if (num == maxStack.getLast()) {
            maxStack.removeLast();
        }
        return num;
	}
	public int peek() {
        //TODO
		//returns last number
		//throws exception if the stack is empty
		if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
	}
	public boolean isEmpty() {
        //TODO
		//returns true if the stack is empty, otherwise false
		return stack.isEmpty();
	}
	public int getMaxElement() {
        //TODO
		//returns the max number from the stack
		//throws exception if the stack is empty
		if (maxStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return maxStack.getLast();
    
	}
}