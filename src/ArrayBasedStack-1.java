import java.lang.reflect.Array;

/**
 * @author fhamid
 * @author John McIntosh
 * @date 08/30/2024
 * @param <T> a generic data type 
 */
class ArrayBasedStack<T extends Comparable<T>>{

    private T[] a;  // array-based stack
    private T myType;
    private int n;   // capacity of the stack
    private int top; // top position where the next element can be pushed
    
    public ArrayBasedStack(int n, T myType){
    	this.n = n;
    	this.myType = myType;
    	a = (T[]) Array.newInstance(myType.getClass(), n); 
    	       // constructing an array object
    	top = -1; //Stack underflow, no elements yet
    }
    
    public int allocatedSpace() {
        return n;
	}
    
    public int currentSize() {
    	return top+1;
    }
    
    public void add(T x) {
    	
        if (top == n - 1){
            resize();//stack overflow
        }
        a[++top] = x;
        
    }
    
    public T remove() {
        if (top == -1) throw new IndexOutOfBoundsException(); //stack underflow
       
        T x = a[top];
        top--;
        return x;
    }
    
    public void displayMyStackData() {
    	
    	
    	System.out.println("Currently, this is what I have in my stack:");
    	for(int i = 0; i<= top; i++)
    		System.out.print(a[i] + " ");
    	System.out.println();
    	
    }
    
     //To-Do 1:
     //define a method to pop/remove all the data from the stack.
     // the signature of the method may look like the following:
     public T[] popAll() {
         T[] temp = (T[]) Array.newInstance(myType.getClass(), n + 1);     // ----> O(1) also c for constant
         for (int i = 0; i <= top; i++) {  // -----> n + 1
             temp[i] = a[top - i];   // ---------> n
         }
         top = -1;  // ----------> 1
         return temp; //-------> 1
     }
     // The running time of popAll() = c + n + 1 + n + 1 + 1  = c + 2n + 3 or O(n)

     //What is the running time of popAll() ?
     // --> Add your answer in the source code as a comment right after the method.


    
    // To-Do 2:
     // define a method to resize the stack by doubling the space (n).
     //  the signature of the method may look like the following:

      void resize(){
          T[] b = (T[]) Array.newInstance(myType.getClass(), n * 2); // ----> O(1) constant 1
          System.arraycopy(a, 0, b, 0, n); // ------> c O(1)
          a = b; // ---> 1
          n++; // ----> 1
      }

      // The running time of resize is c + 1 + 1 = c + 2 or O(1)

     // To implement the method, you may take help from 2.1.2

     //  What is the running time of resize()?
     // --> Add your answer in the source code as a comment right after the method
     //  --> if any other methods runtime gets affected due to the resize(), add similar
     //  comments to the methods (I mean, add a line to that method and mention what its new running
     //  time is).

    
    // To-Do 3:

     //  Use the resize() method in add() so that when the stack is full, it
     //  grows/resizes itself so it can store more data. In that case, there is no need to
     //  throw Exceptions.

     // To implement the method, you may take help from 2.1.1
     //

}
