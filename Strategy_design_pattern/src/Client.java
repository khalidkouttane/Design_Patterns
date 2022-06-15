import java.util.Arrays;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		do {
			Context ctx = new Context (new BubbleSort());
			int length;
			System.out.println("Insert your array length :");
			length = clavier.nextInt();
			
			int[] array = new int[length];
			
			System.out.println("Insert your array elements (space-separeted) :");
			for(int i=0; i<length; i++) {  
				//reading array elements from the user   
				array[i]=clavier.nextInt();  
			}
			System.out.println("\nInserted array : " + Arrays.toString(array)+ "\n");
					
			System.out.println("Choose sort type:");
			System.out.println("1: Bubble sort");
			System.out.println("2: Insertion sort");
			System.out.println("3: Merge sort");
			System.out.println("4: Quick sort");
			System.out.println("5: Selection sort");
			System.out.println("0: Add another sort type.");
			
			int SortChoice = clavier.nextInt();
			
			switch(SortChoice)
	           {  
	             case 0:
	            	 System.out.println("This feature will be available soon.");
	                 break;
	            	
	             case 1:
	            	 ctx = new Context (new BubbleSort());
	            	 ctx.arrange(array); 
	                 break;
	                 
	              case 2:
	            	  ctx = new Context (new InsertionSort());
	            	  ctx.arrange(array);
	                 break;
	                 
	              case 3:
	            	  ctx = new Context (new MergeSort());
	            	  ctx.arrange(array);
	                 break;
	                 
	              case 4:
	            	  ctx = new Context (new QuickSort());
	            	  ctx.arrange(array);  
	                 break;
	                 
	              case 5: 
	            	  ctx = new Context (new SelectionSort());
	            	  ctx.arrange(array);
	            	  break;

	                 
	              default : 
	            	  System.out.println("Choix erroné");
	           } clavier.close();	
		}while(true);
	}

}
