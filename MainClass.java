import java.util.*;


public class MainClass {
	
	public static void main(String[] args) throws Exception{
		try {
			Queue<Integer> q = new LinkedList<>();
		
			//Primary List Check
			//Adds elements {0, 1, 2, 3, 4, 5} to the queue
			for (int i = 0; i < 6; i ++)
				q.add(i);
		
			System.out.println("List: " + q);
			
			//Getting minimum value using min() method
			int min = Collections.min(q);
			
			//Printing the min value
			System.out.println("Minimum value is: " + min);
			
			
		}
		catch (NoSuchElementException e) {
			System.out.println("Exception thrown: " + e);
		}

	}

}
