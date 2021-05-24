package queue;
import java.util.*;

public class OperationOnQueue {

	Queue<Integer> q = new LinkedList<Integer>();
	
	void enqueue(int x)
	{
	   q.add(x);       
	}
	   
	void dequeue()
    {
	   q.poll();     
	}
	    
	int front()
	{
	   return q.peek();     
	}
	    
	String find(int x)
	{
	     for(int i:q)
	     {
	    	 if(i == x)return "Yes";
	     }
	     return "No";
	}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 OperationOnQueue test = new OperationOnQueue();
		 test.enqueue(2);
		 test.enqueue(4);
		 test.enqueue(3);
		 test.enqueue(5);
		 
		 
	}

}
/* SOLVE THIS PROBLEM found in DP section
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

Constraints:
1<= N <=84

*/