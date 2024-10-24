package iterview;

import java.util.HashMap;


//all methods must have complexity O[1]
public class MyArray<T> {
 //TODO
 	private final int size;
	private T defaultValue;
	private HashMap<Integer, T> array;

	public void setAll(T value) {
		this.defaultValue = value;
		this.array = new HashMap<>();
	     //TODO
		//all array's elements should be set with a given value
		
	}
	public void set(int index, T value) {
        //TODO
		//set new value at a given index
		//throws ArrayIndexOutOfBoundsException for incorrect index
        		if (index < 0 || index >= size) {
				throw new ArrayIndexOutOfBoundsException();
			}
			array.put(index, value);
		}
	
	public T get(int index) {
		//returns a value at a given index
		//throws ArrayIndexOutOfBoundsException for incorrect index
        if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return array.getOrDefault(index, defaultValue);
	}
	public MyArray(int size) {
		//creates the Array object for a given size
		//with setting null's at each element
		this.size = size;
		this.defaultValue = null;
		this.array = new HashMap<>();
	}
}